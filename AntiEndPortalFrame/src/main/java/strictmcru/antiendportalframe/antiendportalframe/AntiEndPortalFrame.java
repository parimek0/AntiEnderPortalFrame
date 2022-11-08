package strictmcru.antiendportalframe.antiendportalframe;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEndPortalFrame extends JavaPlugin {

    private static AntiEndPortalFrame instance;


    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static AntiEndPortalFrame getInstance() { return instance; }
}
