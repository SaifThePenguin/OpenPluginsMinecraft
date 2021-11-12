package fr.saifthepenguin.mbwibabams;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Random;

public class Events implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage("Hello i'm §l§nSaifThePenguin§r the creator of the plugin \n §1§kt §rthe concept is: minecraft but when you §nbreak a block§r a §nmob is spawning§r §1§kt§r \n §n§l§bEnjoy this plugin ( my github is github.com/SaifThePenguin)");
    }
    @EventHandler
    public void onBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        Random random = new Random();
        int alea = random.nextInt(2);
        if (alea == 1){
            return;
        }
    }
}