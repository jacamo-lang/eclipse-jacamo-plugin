package jacamoide.core;

import jacamoide.ui.ErrorDialog;
import jacamo.util.Config;
//import jason.jeditplugin.Config;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLClassLoader;

public class PluginTemplates {
	public static final String CORE_PREFS = "org.eclipse.jdt.core.prefs";
	public static final String UI_PREFS = "org.eclipse.buildship.core.prefs";
	
	public static String getProjectClasspathContents(String projectName, boolean cartagoEnvironment, String infrastructure) {
        return
        "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
        "<classpath>\n" +
        	"\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER\"/>\n"+
        	"\t<classpathentry excluding=\"**/*.asl\" kind=\"src\" path=\"src/agt\" />\n" +
        	//"\t<classpathentry excluding=\"*.asl\" kind=\"src\" path=\"src/agt/inc\" />\n" +
        	//"\t<classpathentry kind=\"src\" path=\"src/agt/jia\" />\n" +
        	"\t<classpathentry excluding=\"*.ptl\" kind=\"src\" path=\"src/int\" />\n" +
        	"\t<classpathentry excluding=\"*.xml\" kind=\"src\" path=\"src/org\" />\n" +
        	//"\t<classpathentry excluding=\"*.owl\" kind=\"src\" path=\"src/ont\" />\n" +
        	"\t<classpathentry kind=\"src\" path=\"src/env\" />\n" +
        	//"\t<classpathentry kind=\"lib\" path=\""+ Config.get().getJasonJar() +"\"/>\n" +
        	//cartagoLib +
        	//c4jasonLib +
        	//jadeLib +
        	//moiseLib +
        	//jacamoLib +
        	//protocolLib +
        	"\t<classpathentry kind=\"con\" path=\"org.eclipse.jdt.USER_LIBRARY/JaCaMo\"/>" +
        	"\t<classpathentry kind=\"output\" path=\"bin/classes\"/>" +
        "</classpath>\n";
    } 
	
	
	public static String getProjectClasspathContents2(String projectName, boolean cartagoEnvironment, String infrastructure) {
        return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + 
        		"<classpath>\n" + 
        		"	<classpathentry kind=\"src\" output=\"bin/main\" path=\"src/env\">\n" + 
        		"		<attributes>\n" + 
        		"			<attribute name=\"gradle_scope\" value=\"main\"/>\n" + 
        		"			<attribute name=\"gradle_used_by_scope\" value=\"main,test\"/>\n" + 
        		"		</attributes>\n" + 
        		"	</classpathentry>\n" + 
        		"	<classpathentry kind=\"src\" output=\"bin/main\" path=\"src/agt\">\n" + 
        		"		<attributes>\n" + 
        		"			<attribute name=\"gradle_scope\" value=\"main\"/>\n" + 
        		"			<attribute name=\"gradle_used_by_scope\" value=\"main,test\"/>\n" + 
        		"		</attributes>\n" + 
        		"	</classpathentry>\n" + 
        		"	<classpathentry kind=\"src\" output=\"bin/main\" path=\"src/org\">\n" + 
        		"		<attributes>\n" + 
        		"			<attribute name=\"gradle_scope\" value=\"main\"/>\n" + 
        		"			<attribute name=\"gradle_used_by_scope\" value=\"main,test\"/>\n" + 
        		"		</attributes>\n" + 
        		"	</classpathentry>\n" + 
        		"	<classpathentry kind=\"src\" output=\"bin/main\" path=\"src/int\">\n" + 
        		"		<attributes>\n" + 
        		"			<attribute name=\"gradle_scope\" value=\"main\"/>\n" + 
        		"			<attribute name=\"gradle_used_by_scope\" value=\"main,test\"/>\n" + 
        		"		</attributes>\n" + 
        		"	</classpathentry>\n" + 
        		"	<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8/\"/>\n" + 
        		"	<classpathentry kind=\"con\" path=\"org.eclipse.buildship.core.gradleclasspathcontainer\"/>\n" + 
        		"	<classpathentry kind=\"output\" path=\"bin/default\"/>\n" + 
        		"</classpath>";
    } 

	
	public static String getProjectCorePrefsContents() {
        return "eclipse.preferences.version=1\n" + 
        		"org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.8\n" + 
        		"org.eclipse.jdt.core.compiler.compliance=1.8\n" + 
        		"org.eclipse.jdt.core.compiler.source=1.8\n";
    }
    
    public static String getProjectUiPrefsContents() {
        return "#Tue Aug 28 09:21:02 BRT 2007\n" + // TODO: put actual date
               "eclipse.preferences.version=1\n" +
               "internal.default.compliance=default\n";
    }
    
    public static String getProjectBuildshipPrefsContents() {
        return "connection.project.dir=\n" + 
        		"eclipse.preferences.version=1\n";
    }
    
    public static String getJaCaMoFileContents(String projectName, String infrastructure, String environment){
        try {
            String agentFileContents = getTemplate("project");
            
        	String ag = "agent sample_agent";
        	String platform = null;
        	if (environment.equals("Distributed")) {
        		platform = "cartago(\"infrastructure\")";
        	}
        	
        	if (infrastructure.equals("Distributed")) {
        		if (platform == null)
        			platform = "jade()";
        		else
        			platform = platform + ", " + "jade()";
        	} else {
        	}

            if (agentFileContents != null && !agentFileContents.equals("")) {
	            agentFileContents = agentFileContents.replace("<PROJECT_NAME>", projectName);
	            if (platform != null) 
	            	agentFileContents = agentFileContents.replace("<PLATFORM>", "platform: " + platform);
	            else
	            	agentFileContents = agentFileContents.replace("<PLATFORM>", "");
	            agentFileContents = agentFileContents.replace("<DEFAULT_AGENT>", ag);
            }
            
            return agentFileContents;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String getLoggingFileContents(){
        try {            
            return getTemplate("logging.properties");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
	public static String getArtifactContents(String mas2jFile, String artifactName, String packageName, String superClass) {
		
		String pkg = "";
		if (packageName != null && !packageName.trim().equals("")) {
			pkg = "package "+packageName+";\n\n";
		}
		
		return  "//CArtAgO artifact code for project "+mas2jFile+"\n\n" +
				pkg +
				"import cartago.*;\n\n" +
				"public class " + artifactName + " extends "+superClass+" {\n" +
				"\tvoid init(int initialValue) {\n" +
				"\t\tdefineObsProperty(\"count\", initialValue);\n" +
				"\t}\n\n" +
				"\t@OPERATION\n" +
				"\tvoid inc() {\n" +
				"\t\tObsProperty prop = getObsProperty(\"count\");\n" +
				"\t\tprop.updateValue(prop.intValue()+1);\n" +
				"\t\tsignal(\"tick\");\n" +
				"\t}\n" +
				"}\n";
	}
	
	public static String getContentCArtAgOArtifact(String mas2jFile, String artifactName, String packageName, String superClass) {
        try {
            String agentFileContents = getTemplate("CArtAgOartifact");

            if (agentFileContents != null && !agentFileContents.equals("")) {
            	if (packageName == null || packageName.trim().equals("")) {
            		agentFileContents = agentFileContents.replace("package <PCK>;", "");
            		agentFileContents = agentFileContents.replace("\n\n\n\n", "\n\n");
            	} else {
            		agentFileContents = agentFileContents.replace("<PCK>", packageName);
            	}
	            agentFileContents = agentFileContents.replace("<PROJECT_NAME>", mas2jFile);
	            agentFileContents = agentFileContents.replace("<ARTIFACT_NAME>", artifactName);
	            agentFileContents = agentFileContents.replace("<SUPER_CLASS>", superClass);
            } else {
            	return getArtifactContents(mas2jFile, artifactName, packageName, superClass);
            }
            
            return agentFileContents;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
	
	public static String getContentJasonEnvironment(String mas2jFile, String environmentName) {
        try {
            String agentFileContents = getTemplate("environment");
            
            agentFileContents = agentFileContents.replace("<ENV_NAME>", environmentName);
            agentFileContents = agentFileContents.replace("<PROJECT_NAME>", mas2jFile);
            
            return agentFileContents;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
	
	public static String getContentInternalAction(String mas2jFile, String internalActionName, String packageName, String superClass) {
        try {
            String agentFileContents = getTemplate("ia");
            
        	if (packageName == null || packageName.trim().equals("")) {
        		agentFileContents = agentFileContents.replace("package <PCK>;", "");
        		agentFileContents = agentFileContents.replace("\n\n\n\n", "\n\n");
        	} else {
        		agentFileContents = agentFileContents.replace("<PCK>", packageName);
        	}
            agentFileContents = agentFileContents.replace("<IA_NAME>", internalActionName);
            agentFileContents = agentFileContents.replace("<SUPER_CLASS>", superClass);
            agentFileContents = agentFileContents.replace("<PROJECT_NAME>", mas2jFile);
            
            return agentFileContents;
        } catch (Exception e) {
        	e.printStackTrace();
            return "";
        }
    }
	
	public static InputStream openContentStreamInternalAction(String containerName, String fileName, String packageName, String superClass) {
        try {
            String iaFileContents = getTemplate("ia");

            fileName = fileName.replace(".", ">");
            String iaName = fileName.split(">")[0];
            String projectName = containerName.split("/")[1];
            
        	if (packageName == null || packageName.trim().equals("")) {
        		iaFileContents = iaFileContents.replace("package <PCK>;", "");
        		iaFileContents = iaFileContents.replace("\n\n\n\n", "\n\n");
        	} else {
        		iaFileContents = iaFileContents.replace("<PCK>", packageName);
        	}
        	
        	if (superClass == null || superClass.trim().equals("")) {
        		iaFileContents = iaFileContents.replace("<SUPER_CLASS>", "DefaultInternalAction");
        	} else {
        		iaFileContents = iaFileContents.replace("<SUPER_CLASS>", superClass);
        	}
        	
        	iaFileContents = iaFileContents.replace("<IA_NAME>", iaName);
        	iaFileContents = iaFileContents.replace("<PROJECT_NAME>", projectName);
            
            return new ByteArrayInputStream(iaFileContents.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            ErrorDialog.open(e);
            return null;
        }
    }
	
	
	public static InputStream openContentStreamAgent(String containerName, String fileName) {
        try {
            String agentFileContents = getTemplate("agent");

            fileName = fileName.replace(".", ">");
            String agentName = fileName.split(">")[0];
            String projectName = containerName.split("/")[1];
            
            agentFileContents = agentFileContents.replace("<AG_NAME>", agentName);
            agentFileContents = agentFileContents.replace("<PROJECT_NAME>", projectName);
            
            return new ByteArrayInputStream(agentFileContents.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            ErrorDialog.open(e);
            return null;
        }
    }
	
	
	public static InputStream openContentStreamIncMoise(String containerName) {
        try {
            String agentFileContents = getTemplate("common-moise.asl");
            return new ByteArrayInputStream(agentFileContents.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            ErrorDialog.open(e);
            return null;
        }
    }
	
	public static InputStream openContentStreamIncCartago(String containerName) {
        try {
            String agentFileContents = getTemplate("common-cartago.asl");
            return new ByteArrayInputStream(agentFileContents.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            ErrorDialog.open(e);
            return null;
        }
    }
	
	public static InputStream openContentStreamOrganization(String containerName, String fileName) {
        try {
            String organizationFileContents = getTemplate("organization");

            fileName = fileName.replace(".", ">");
            String organizationName = fileName.split(">")[0];
            
            organizationFileContents = organizationFileContents.replace("<ORGANIZATION_NAME>", organizationName);
            
            return new ByteArrayInputStream(organizationFileContents.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            ErrorDialog.open(e);
            return null;
        }
    }
	
	public static InputStream openContentStreamProtocol(String containerName, String fileName) {
        try {
            String agentFileContents = getTemplate("protocol");

            fileName = fileName.replace(".", ">");
            String protocolName = fileName.split(">")[0];
            String projectName = containerName.split("/")[1];
            
            agentFileContents = agentFileContents.replace("<PROTOCOL_NAME>", protocolName);
            agentFileContents = agentFileContents.replace("<PROJECT_NAME>", projectName);
            
            return new ByteArrayInputStream(agentFileContents.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
            ErrorDialog.open(e);
            return null;
        }
    }
	
	
    public static String getTemplate(String templateName) {
        try {
        	return Config.get().getTemplate(templateName);
        	/*String strTemplate =  Config.get().getTemplate(templateName);
        	
        	System.out.println(strTemplate);*/
        	//System.out.println("###\n" + getTemplateJar(templateName));
        	
        	/*if (strTemplate == null || strTemplate.equals("")) {
        		return getTemplateJar(templateName);
        	}*/
        	//return strTemplate;
        } catch (Exception e) {
            System.err.println("Error reading template: " + templateName);
            e.printStackTrace();
            return null;
        }
    }
    
	public static String getTemplateJar(String templateName) {
		URL[] urls = new URL[]{Thread.currentThread().getContextClassLoader().getResource("jacamo.jar")};
		
		System.out.println("#1" + urls);
		
		for (URL u : urls) {
			System.out.println(u.getPath() + " ## " + u.getFile() + " ### ");
		}
		
		URLClassLoader urlClassLoader = new URLClassLoader(urls);
		
		System.out.println("#2" + urlClassLoader);
		
		InputStream in = urlClassLoader.getResourceAsStream("templates/" + templateName);
		//InputStream in = urlClassLoader.getResourceAsStream(templateName);
		
		System.out.println("#3" + in);
		
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		StringBuffer sb = new StringBuffer();
		String line;
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line + "\n");
			}
		
			br.close();
			isr.close();
			in.close();
	    } catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
