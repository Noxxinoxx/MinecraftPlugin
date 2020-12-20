package noxstudios.prems;

import org.bukkit.plugin.java.JavaPlugin;

import noxstudios.prems.Events.EventsClass;

public class Prems extends JavaPlugin{
	
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		
	}
	
	
	
	
}
