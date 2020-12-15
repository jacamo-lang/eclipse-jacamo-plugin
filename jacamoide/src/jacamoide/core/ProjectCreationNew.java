package jacamoide.core;

import jacamoide.ui.ErrorDialog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import jacamo.util.CreateNewProject;

public class ProjectCreationNew {
	private Shell shell;
	private IProject project;
	
	public ProjectCreationNew(Shell shell) {
		this.shell = shell;
	}
	
	public Shell getShell() {
		return this.shell;
	}
	
	public void createProject(String projectRootDir, String projectName, String infrastructure, String environment) {
		try {
			CreateNewProject.main(new String[] {projectRootDir});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	public void createProjectDirs(String projectRootDir) {
		new File(projectRootDir + File.separator + "src").mkdir();
		new File(projectRootDir + File.separator + "src" + File.separator + "agt").mkdir();
		new File(projectRootDir + File.separator + "src" + File.separator + "agt" + File.separator + "inc").mkdir();
		new File(projectRootDir + File.separator + "src" + File.separator + "agt" + File.separator + "jia").mkdir();
		new File(projectRootDir + File.separator + "src" + File.separator + "env").mkdir();
		new File(projectRootDir + File.separator + "src" + File.separator + "org").mkdir();
		new File(projectRootDir + File.separator + "src" + File.separator + "int").mkdir();
		//new File(projectRootDir + File.separator + "src" + File.separator + "ont").mkdir();
		new File(projectRootDir + File.separator + "doc").mkdir();
		new File(projectRootDir + File.separator + "lib").mkdir();
		new File(projectRootDir + File.separator + "log").mkdir();
		//new File(projectRootDir + File.separator + "test").mkdir();
	}

	public void importJaCaMoLibraries(IProgressMonitor monitor){
		try {
			project.open(monitor);
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(getShell(), "Error", e.getMessage());
		}
	}

    public void configureProjectEnvironment(IProgressMonitor monitor) {
    	try {
            IProjectDescription pd = project.getDescription();
            pd.setNatureIds(new String[] {"org.eclipse.jdt.core.javanature", 
            								"org.eclipse.xtext.ui.shared.xtextNature",
            								"jacamoide.jacamoNature",
            								"org.eclipse.buildship.core.gradleprojectnature"});
        
            project.setDescription(pd, monitor);
        } catch (CoreException e) {
        	e.printStackTrace();
        	ErrorDialog.open(e);
        }
    }
    
    /**
     * Creates the .classpath file for JaCaMo Project.
     */
    public void createClassPathFile(String projectRootDir, String projectName, boolean cartagoEnvironment, String infrastructure) {
        String classPathContent = PluginTemplates.getProjectClasspathContents2(projectName, cartagoEnvironment, infrastructure);
        
        try {
            FileWriter fw = new FileWriter(new File(projectRootDir + File.separator + ".classpath"));
            fw.write(classPathContent);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            MessageDialog.openError(getShell(), "Error", e.getMessage());
        }
    }
    
    /**
     * Creates the JaCaMo file. This file represents a JaCaMo project.
     * @param projectRootDir
     * @param projectName
     * @param infrastructure
     */
    public void createJaCaMoFile(String projectRootDir, String projectName, String infrastructure, String environment) {
        try {
            File f = new File(projectRootDir + File.separator + projectName + "." + PluginConstants.MASJACAMO_EXT);
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            fw.write(PluginTemplates.getJaCaMoFileContents(projectName, infrastructure, environment));
            fw.flush();
            fw.close();
        } catch (IOException e) {
            MessageDialog.openError(getShell(), "Error", e.getMessage());
        }
    }
    
    /**
     * Creates the .settings directory for JaCaMo Project.
     */
    public void createSettingsDir(String projectRootDir) {
        String corePrefsContent = PluginTemplates.getProjectCorePrefsContents();
        String uiPrefsContent = PluginTemplates.getProjectBuildshipPrefsContents();

        try {
            // make .settings folder
            new File(projectRootDir + File.separator + ".settings").mkdir();
            
            // core prefs           
            FileWriter fw = new FileWriter(new File(projectRootDir + File.separator + ".settings" + File.separator + PluginTemplates.CORE_PREFS));
            fw.write(corePrefsContent);
            fw.flush();
            fw.close();
            
            // ui prefs
            fw = new FileWriter(new File(projectRootDir + File.separator + ".settings" + File.separator + PluginTemplates.UI_PREFS));
            fw.write(uiPrefsContent);
            fw.flush();
            fw.close();
        } catch (IOException e) {
            MessageDialog.openError(getShell(), "Error", e.getMessage());
        }
    }

    
	public void createSampleAgentFile(String projectRootDir, String projectName) {
		String agentName = "sample_agent." + PluginConstants.AGENT_EXT;
        String containerName = "/" + project.getName() + "/src/agt";
		IResource agentsFolder = project.findMember("src/agt");
		
		IContainer container = (IContainer)agentsFolder;
        IFile file = container.getFile(new Path(agentName));
        
        try {
            InputStream stream = PluginTemplates.openContentStreamAgent(containerName, agentName);
            file.create(stream, true, null);
            stream.close();
        } catch (Exception e) {
        	e.printStackTrace();
            ErrorDialog.open(e);
        }
	}
	
	public void createIncMoiseFile(String projectRootDir, String projectName) {
		String agentName = "common-moise." + PluginConstants.AGENT_EXT;
        String containerName = "/" + project.getName() + "/src/agt/inc";
		IResource agentsFolder = project.findMember("src/agt/inc");
		
		IContainer container = (IContainer)agentsFolder;
        IFile file = container.getFile(new Path(agentName));
        
        try {
            InputStream stream = PluginTemplates.openContentStreamIncMoise(containerName);
            file.create(stream, true, null);
            stream.close();
        } catch (Exception e) {
        	e.printStackTrace();
            ErrorDialog.open(e);
        }
	}
	
    public void createLoggingFile(String projectRootDir, String projectName) {
        try {
            File f = new File(projectRootDir + File.separator + "logging.properties");
            f.createNewFile();
            FileWriter fw = new FileWriter(f);
            fw.write(PluginTemplates.getLoggingFileContents());
            fw.flush();
            fw.close();
        } catch (IOException e) {
            MessageDialog.openError(getShell(), "Error", e.getMessage());
        }
    }

	
	public void createIncCartagoFile(String projectRootDir, String projectName) {
		String agentName = "common-cartago." + PluginConstants.AGENT_EXT;
        String containerName = "/" + project.getName() + "/src/agt/inc";
		IResource agentsFolder = project.findMember("src/agt/inc");
		
		IContainer container = (IContainer)agentsFolder;
        IFile file = container.getFile(new Path(agentName));
        
        try {
            InputStream stream = PluginTemplates.openContentStreamIncCartago(containerName);
            file.create(stream, true, null);
            stream.close();
        } catch (Exception e) {
        	e.printStackTrace();
            ErrorDialog.open(e);
        }
	}
	
	public void createJasonEnvironmentFile(String projectRootDir, String mas2jFile, String environmentName) {
		String fileContent = PluginTemplates.getContentJasonEnvironment(mas2jFile, environmentName);
		
        try {
            FileWriter fw = new FileWriter(new File(
            		projectRootDir + File.separator + "src" + File.separator + "env" + File.separator + environmentName + ".java"));
            fw.write(fileContent);
            fw.flush();
            fw.close();
        } catch (IOException e) {
        	e.printStackTrace();
            ErrorDialog.open(e);
        }
	}
	
	public void setProject(IProject newProject) {
		project = newProject;
	}
}
