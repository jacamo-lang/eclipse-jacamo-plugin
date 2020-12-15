package jacamoide.ui.wizards;

import jacamoide.core.PluginConstants;
import jacamoide.core.ProjectCreation;
import jacamoide.core.Utils;
import jacamoide.ui.ErrorDialog;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

public class NewJaCaMoProjectWizard_backup extends BasicNewProjectResourceWizard implements INewWizard, IExecutableExtension {
	private NewJaCaMoProjectWizardPage page;
	//private ISelection selection;
	private ProjectCreation projectCreation;
	private IConfigurationElement config;
	
	public NewJaCaMoProjectWizard_backup() {
		super();
		setNeedsProgressMonitor(true);
		setWindowTitle("New JaCaMo Project");
		projectCreation = new ProjectCreation(getShell());
	}
	
	public void addPages() {
		page = new NewJaCaMoProjectWizardPage();
		addPage(page);
    }
	 
	@Override
	public boolean performFinish() {
		final IProject newProject = page.getProjectHandle();
		projectCreation.setProject(newProject);
		
		final String infrastructure = page.getInfrastructure();
		final String environment = page.getEnvironment();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) throws InvocationTargetException {
                try {
                    doFinish(newProject, monitor, infrastructure, environment);
                } catch (CoreException e) {
                    throw new InvocationTargetException(e);
                } finally {
                    monitor.done();
                }
            }
        };
        
        try {
            getContainer().run(true, false, op);
        } catch (InterruptedException e) {
            return false;
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), "Error", realException.getMessage());
            return false;
        }
        BasicNewProjectResourceWizard.updatePerspective(config);
        return true;
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
	
	private void doFinish(IProject newProject, IProgressMonitor monitor, String infrastructure, String environment) throws CoreException {
		String projectName = newProject.getName();
		monitor.beginTask("Creating the project " + projectName, 2);
		
		try{
			// create a new jacamo project.
			newProject.create(monitor);
			String projectRootDir = newProject.getLocation().toString();
			
			// create the project directories for sources.
			projectCreation.createProjectDirs(projectRootDir);
			
			projectCreation.importJaCaMoLibraries(monitor);
			
			// create the settings directory and core/ui prefs.
			projectCreation.createSettingsDir(projectRootDir);
			
            // create .classpath file
            projectCreation.createClassPathFile(projectRootDir, projectName, environment.equals("CArtAgO"), infrastructure);
			
			projectCreation.createSampleAgentFile(projectRootDir, projectName);
			//projectCreation.createIncCartagoFile(projectRootDir, projectName);
			//projectCreation.createIncMoiseFile(projectRootDir, projectName);
			projectCreation.createLoggingFile(projectRootDir, projectName);
			
            projectCreation.createJaCaMoFile(projectRootDir, projectName, infrastructure, environment);
            
            // open project and refesh local.
			newProject.open(monitor);
			
			// configure the .project file.
			projectCreation.configureProjectEnvironment(monitor);
			
			// refresh the project after all these changes.
			newProject.getWorkspace().getRoot().refreshLocal(IWorkspaceRoot.DEPTH_INFINITE, monitor);
			IResource jacamoFile = newProject.findMember(projectName+"."+PluginConstants.MASJACAMO_EXT);
			Utils.selectAndReveal(getShell(), jacamoFile);
			//Utils.openResource(getShell(), (IFile)jasonFile);
			monitor.beginTask("Project created in current workspace", 2);
			
			//Create user library for JaCaMo
			Utils.createUserLibrary();
		} catch (Exception e) {
			e.printStackTrace();
			ErrorDialog.open(e);
        }
	}
	
	/*
	 * Stores the configuration element for the wizard.  The config element will be used
	 * in <code>performFinish</code> to set the result perspective.
	 */
	public void setInitializationData(IConfigurationElement config, String propertyName, Object data){
		this.config = config;
	}
}
