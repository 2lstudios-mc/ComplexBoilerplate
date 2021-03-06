package dev._2lstudios.complexboilerplate.players;

import org.bukkit.entity.Player;

import dev._2lstudios.complexboilerplate.ComplexBoilerplate;

public class OfflinePlayer extends ComplexPlayer {
    private String username;

    public OfflinePlayer(ComplexBoilerplate plugin, Player bukkitPlayer, String username) {
        super(plugin, bukkitPlayer);
        this.username = username.toLowerCase();
    }

    @Override
    public String getLowerName() {
        return this.username;
    }
}