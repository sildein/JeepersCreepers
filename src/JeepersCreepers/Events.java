/*
 * Events.java
 * This file is a part of JeepersCreepers.
 * Copyright (c) 2018 Jesse Jones.
 *
 * This is free software under the terms of Sildein's Free Software License.
 */
package JeepersCreepers;


import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerQuitEvent;


public class Events implements Listener
{
    @EventHandler
    public void OnLogout(PlayerQuitEvent event)
    {
        if (Bukkit.getOnlinePlayers().size() == 1)
        {
            Shared.Log.info("Last player logging off.");
            Shared.Idle();
        }
    }


    @EventHandler
    public void OnLogin(PlayerLoginEvent event)
    {
        if (Shared.Enabled)
        {
            Shared.Log.info("Restoring settings.");
            Shared.PlayerOnline();
        }
    }
}
