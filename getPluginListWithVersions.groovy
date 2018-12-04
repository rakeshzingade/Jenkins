//run this code into jenkins script console
//https://jenkins-url.com/script
import hudson.PluginWrapper
Jenkins.instance.pluginManager.plugins.each {
  plugin-> 
  if(plugin.getUpdateInfo() != null) {
     println("${plugin.getDisplayName()}, ${plugin.getShortName()}, ${plugin.getVersion()}, ${plugin.getUpdateInfo().version} ") 
  }
}
