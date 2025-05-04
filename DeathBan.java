package me.jmorey;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DeathBan extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("DeathBan enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("DeathBan disabled.");
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        String reason = "You're dead!";
        Bukkit.getBanList(org.bukkit.BanList.Type.NAME).addBan(player.getName(), reason, null, "DeathBan");
        player.kickPlayer(reason);
    }
}

