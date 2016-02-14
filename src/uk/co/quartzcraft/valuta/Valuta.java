package uk.co.quartzcraft.valuta;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

import uk.co.quartzcraft.valuta.util.YAMLManager;

public class Valuta extends JavaPlugin {
	
	public static File dataFolder, configFile, playerFolder;
	public static String currencySymbol;
	public static Boolean beforeText;
	public static YAMLManager configYAML;
	
	public void onEnable() {
		dataFolder = getDataFolder();
		configFile = new File(dataFolder, "config.yml");
		playerFolder = new File(dataFolder, "/playerdata/");
		if(!dataFolder.exists()) {
			dataFolder.mkdirs();
		}
		if(!playerFolder.exists()) {
			playerFolder.mkdirs();
		}
		saveDefaultConfig();
		currencySymbol = getConfig().getString("settings.currency symbol");
		beforeText = getConfig().getBoolean("settings.symbol before");
		
		configYAML = new YAMLManager(configFile);
	}
	
	public void onDisable()	{
		
	}

}