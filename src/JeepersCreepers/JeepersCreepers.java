/*
 * ColdStorage.java
 * This file is a part of JeepersCreepers.
 * Copyright (c) 2018 Jesse Jones.
 *
 * This is free software under the terms of Sildein's Free Software License.
 */

package JeepersCreepers;


import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;


public class JeepersCreepers extends JavaPlugin implements Listener
{
    @EventHandler
    public void OnLogout(PlayerQuitEvent event)
    {
        this.getLogger().info("Firing logout event.");
        if (Bukkit.getOnlinePlayers().isEmpty() && !Shared.Enabled)
        {
            this.getLogger().info("No players online.");
            Shared.Idle();
        }
    }


    @EventHandler
    public void OnLogin(PlayerLoginEvent event)
    {
        this.getLogger().info("Firing login event.");
        if (Shared.Enabled)
        {
            this.getLogger().info("Restoring settings.");
            Shared.PlayerOnline();
        }
    }


    @Override
    public void onEnable()
    {
        //Logging!
        Shared.Log = this.getLogger();

        // Make World object
        Shared.Overworld = Bukkit.getWorld("world");

        // Register listener class
        getServer().getPluginManager().registerEvents(new Events(), this);

        // It's safe to assume no one is online right after the server starts
        this.getLogger().info("Assuming no one is online.");
        Shared.Idle();
    }


    @Override
    public void onDisable()
    {
        Shared.PlayerOnline();
    }
}
