package fr.saifthepenguin.mbwibabams;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Mcbmain extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[minecraft but]: Plugin enabled");
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new Events(), this);
    }
}
