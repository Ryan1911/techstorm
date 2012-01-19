package me.nathan.techstorm;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Techstorm extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	private final techstormPlayerListener playerListener = new techstormPlayerListener(this);
	
	public void onEnable(){
		log.info("Techstorm has been enabled!");
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type., playerListener, Event.Priority.Normal, this);
	}
	
	public void onDisable(){
		log.info("Techstorm has been disabled");
	}
}
