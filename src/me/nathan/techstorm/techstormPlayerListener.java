package me.nathan.techstorm;

import org.bukkit.Server;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerListener;

public class techstormPlayerListener {
	public void onPlayerFish(PlayerFishEvent event) {
		Player player = event.getPlayer();
		Server server = player.getServer();
		String playername = player.getName();
		server.broadcastMessage(playername + "has gone fishin");
	}
	public void onEntityDeath(EntityDeathEvent event) {
		Player player = monster.getKiller();
		Monster monster = event.getEntityId();
		Server server = player.getServer();
		String playername = player.getName();
		String monstername = monster.getEntityId();
		server.broadcastMessage(playername + "has killed a" + monstername);
		
	}

}
