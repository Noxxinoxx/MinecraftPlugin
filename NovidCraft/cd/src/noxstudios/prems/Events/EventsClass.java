package noxstudios.prems.Events;
import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.json.simple.JSONObject;

import com.mongodb.MongoClientURI;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.event.Listener;

public class EventsClass implements  Listener{
	
	@SuppressWarnings("unchecked")
	@EventHandler
	public void onJoin(PlayerJoinEvent event){

		event.setJoinMessage(null);
		
		Player player = event.getPlayer(); 
		
		
		
		if(player.getName().contains("Nixity") == true) {
			player.sendMessage(ChatColor.DARK_PURPLE + "Welcome " + player.getName());
			ItemStack item = new ItemStack(Material.BOOK, 1);
			Inventory inv = player.getInventory();
			inv.addItem(item);
		}
		
		
		
		
		
		
	}
	@EventHandler
	public void onQuit(PlayerQuitEvent event) {
		event.setQuitMessage(null);
	}
	
	public void CheckDataBase() {

		

	}
	
}
