package jacamoide.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import jacamo.util.Config;
import jacamoide.ui.ErrorDialog;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewResourceWizard;

public class Utils {
	public static String removeFileExtension(String s){
		int index = s.lastIndexOf(".");
		
		if (index > -1){
			return s.substring(0, index);
		} else {
			return s;
		}
	}
	 
	public static String getFileExtensionWithDot(String s){
		int index = s.lastIndexOf(".");
		
		if (index > -1 && index < s.length()){
			return s.substring(index);
		} else {
			return "";
		}
	}
	
	public static String getDirectoryOfFile(String s){
		int index = s.lastIndexOf(File.separatorChar);
		
		if (index > -1 && index < s.length()){
			return s.substring(0,index);
		} else {
			index = s.lastIndexOf("/");
			if (index > -1 && index < s.length()){
				return s.substring(0,index);
			} else {
				index = s.lastIndexOf("\\");
				if (index > -1 && index < s.length()){
					return s.substring(0,index);
				} else {
					return "";
				}
			}
		}
	}
	
	public static void selectAndReveal(Shell shell, final IResource resource) {
		shell.getDisplay().asyncExec(new Runnable() {
            public void run() {
                IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                BasicNewResourceWizard.selectAndReveal(resource, window);
            }
        });
	}
	
	public static void openResource(final Shell shell, final IFile resource) {
		shell.getDisplay().asyncExec(new Runnable() {
            public void run() {
                IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                
                try {
                    IDE.openEditor(page, resource, true);
                } catch (PartInitException e) {
                	e.printStackTrace();
                    ErrorDialog.open(e);
                }
            }
        });
	}
	
	public static boolean checkErrorsInProject(IProject project, String action){
		PlatformUI.getWorkbench().saveAllEditors(true);
		
		try {
			IMarker[] markers = project.findMarkers("org.eclipse.core.resources.problemmarker", true, IResource.DEPTH_INFINITE);
			boolean errors = false;
			
			for (IMarker marker: markers){
				if (marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO) == IMarker.SEVERITY_ERROR){
					errors = true;
					break;
				}
			}
			
			if (errors){
				ErrorDialog.open("Errors found in project " + project.getName() + 
						", cant' "+ action + " JaCaMo application.\nPlease check Problems view or error markers");
				return false;
			}
		} catch (CoreException e) {
			e.printStackTrace();
			ErrorDialog.open(e);
			return false;
		}
		return true;
	}
	
    public static void saveFile(String archive, String content, boolean append)
    throws IOException {

        FileWriter fw = new FileWriter(archive, append);

        fw.write(content);
        fw.close();
    }
    
    public static String loadFile(String archive)
    	throws FileNotFoundException, IOException {

        File file = new File(archive);

        if (!file.exists()) {
            return null;
        }

        BufferedReader br = new BufferedReader(new FileReader(archive));
        StringBuffer outputBuf = new StringBuffer();

        String line;
        while( (line = br.readLine()) != null ){
        	outputBuf.append(line + "\n");
        }
        br.close();
        return outputBuf.toString().trim();
    }
    
    public static void updateUserLibrary() {
    	
    	if (Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jacamo" ) == null) {
    		System.out.println("The JaCaMo library is not correctly configured. Please execute java -jar jacamo*.jar in the directy where you have the JaCaMo installation.");
    		return;
    	}
    	
    	ClasspathContainerInitializer initializer= JavaCore.getClasspathContainerInitializer(JavaCore.USER_LIBRARY_CONTAINER_ID);
    	final String libraryName = "JaCaMo";
    	IPath containerPath = new Path(JavaCore.USER_LIBRARY_CONTAINER_ID);
    	try {
			initializer.requestClasspathContainerUpdate(containerPath.append(libraryName), null, new IClasspathContainer() {
				public IPath getPath() {
					return new Path(JavaCore.USER_LIBRARY_CONTAINER_ID).append(libraryName) ;
				}
				public int getKind() {
					return IClasspathContainer.K_APPLICATION;
				}
				public String getDescription() {
					return libraryName;
				}
				public IClasspathEntry[] getClasspathEntries() {
					List<IClasspathEntry> tmpEntry = new LinkedList<IClasspathEntry>();
					tmpEntry.add(JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jacamo" )), null, null));
					
					String path;
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jason" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jade" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "cartago" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "c4jason" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "moise" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "intmas" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					path = Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "npl" );
					if (path != null)
						tmpEntry.add(JavaCore.newLibraryEntry(new Path(path), null, null));
					
					IClasspathEntry[] resultCSEntry = new IClasspathEntry[tmpEntry.size()];
					int i = 0;
					for (IClasspathEntry t : tmpEntry) {
						resultCSEntry[i++] = t;
					}
					
					return resultCSEntry;
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}  	
    }
    
    public static void updateUserLibrary2() {
    	
    	if (Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jacamo" ) == null) {
    		System.out.println("The JaCaMo library is not correctly configured. Please execute java -jar jacamo*.jar in the directy where you have the JaCaMo installation.");
    		return;
    	}
    	
    	ClasspathContainerInitializer initializer= JavaCore.getClasspathContainerInitializer(JavaCore.USER_LIBRARY_CONTAINER_ID);
    	final String libraryName = "JaCaMo";
    	IPath containerPath = new Path(JavaCore.USER_LIBRARY_CONTAINER_ID);
    	try {
			initializer.requestClasspathContainerUpdate(containerPath.append(libraryName), null, new IClasspathContainer() {
				public IPath getPath() {
					return new Path(JavaCore.USER_LIBRARY_CONTAINER_ID).append(libraryName) ;
				}
				public int getKind() {
					return IClasspathContainer.K_APPLICATION;
				}
				public String getDescription() {
					return libraryName;
				}
				public IClasspathEntry[] getClasspathEntries() {
					return new IClasspathEntry[] {
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jason" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jade" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "jacamo" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "cartago" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "c4jason" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "moise" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "intmas" )), null, null),
							JavaCore.newLibraryEntry(new Path(Config.findJarInDirectory(new File(Config.get().getJaCaMoHome()+"/libs"), "npl" )), null, null),
							
							/*JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/jason.jar"), null, null),
							JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/jade.jar"), null, null),
							JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/jacamo.jar"), null, null),
							JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/cartago.jar"), null, null),
							JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/c4jason.jar"), null, null),
							JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/moise.jar"), null, null),
							JavaCore.newLibraryEntry(new Path(Config.get().getJaCaMoHome() + "/lib/intmas.jar"), null, null),*/
					};
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}  	
    }
    
    public static void createUserLibrary() {    	
    	updateUserLibrary();
    }
    
    
}
