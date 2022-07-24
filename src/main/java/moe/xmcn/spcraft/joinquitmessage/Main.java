package moe.xmcn.spcraft.joinquitmessage;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onLoad() {
        System.out.println("Loading SPCraft Plugin-0 Name: JoinQuitMessage");
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling SPCraft Plugin-0 Name: JoinQuitMessage");
    }

}