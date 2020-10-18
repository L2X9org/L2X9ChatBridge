package org.l2x9.betachatbridge.bukkitevents;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.TextChannel;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.l2x9.betachatbridge.BetaChatBridge;

import java.awt.*;

public class PlayerJoin implements Listener {
    BetaChatBridge plugin;

    public PlayerJoin(BetaChatBridge betaChatBridge) {
        plugin = betaChatBridge;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        sendEmbed(event.getPlayer().getName(), plugin.getChannel());
    }

    private void sendEmbed(String playerName, TextChannel channel) {
        EmbedBuilder embedBuilder = new EmbedBuilder();
        embedBuilder.setDescription(":heavy_plus_sign: " + playerName);
        embedBuilder.setColor(Color.GREEN);
        channel.sendMessage(embedBuilder.build()).queue();
    }
}
