package me.nathan.techstorm;

import java.util.logging.Logger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.Event;

public class Techstorm extends JavaPlugin {
	
	Logger log = Logger.getLogger("Minecraft");
	private final techstormPlayerListener playerListener = new techstormPlayerListener();
	
	public void onEnable(){
		log.info("Techstorm has been enabled!");
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.PLAYER_FISH, playerListener, Event.Priority.Normal, this);
		pm.registerEvent(Event.Type.ENTITY_DEATH, playerListener, Event.Priority.Normal, this);
	}
	
	public void onDisable(){
		log.info("Techstorm has been disabled");
	}
}
