package me._2818.nocolDetect;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;
import org.jetbrains.annotations.NotNull;

public final class NocolDetect extends JavaPlugin implements PluginMessageListener {

    @Override
    public void onEnable() {
        this.getServer().getMessenger().registerIncomingPluginChannel(this, "nocol:version", this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public void onPluginMessageReceived(@NotNull String s, @NotNull Player player, @NotNull byte[] bytes) {
        if (s.equalsIgnoreCase("nocol:version")){
            getLogger().warning("Player " + player.getName() + " joined with the nocol mod!");
        }
    }
}
