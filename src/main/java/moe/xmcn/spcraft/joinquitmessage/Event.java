package moe.xmcn.spcraft.joinquitmessage;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

import java.util.Objects;

public class Event implements Listener {

    Plugin plugin = Main.getPlugin(Main.class);

    @EventHandler
    public void onJoin(PlayerJoinEvent pje) {
        String joinmessage = ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("message.join"))
                .replace("%player%", pje.getPlayer().getDisplayName()));
        pje.setJoinMessage(joinmessage);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent pqe) {
        String quitmessage = ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("message.quit"))
                .replace("%player%", pqe.getPlayer().getDisplayName()));
        pqe.setQuitMessage(quitmessage);
    }

}
