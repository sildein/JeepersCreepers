/*
 * Shared.java
 * This file is a part of JeepersCreepers.
 * Copyright (c) 2018 Jesse Jones.
 *
 * This is free software under the terms of Sildein's Free Software License.
 */

package JeepersCreepers;


import java.util.logging.Logger;
import org.bukkit.World;
import org.bukkit.Difficulty;


public class Shared
{
    // We restore these values when players are online
    public static World Overworld;
    public static Difficulty Diff;
    public static long Time;

    public static Logger Log;
    public static Boolean Enabled;


    public static void PlayerOnline()
    {
        if (!Shared.Enabled) return; // Safeguard against being run twice

        Shared.Overworld.setDifficulty(Shared.Diff);
        Shared.Overworld.setTime(Shared.Time);
        Shared.Overworld.setGameRuleValue("doDaylightCycle", "true");

        Shared.Enabled = false;
    }


    public static void Idle()
    {
        // Preserve values so they can be restored after players come back
        Shared.Diff = Shared.Overworld.getDifficulty();
        Shared.Log.info(String.format("Saving difficulty: %s",
                Shared.Overworld.getDifficulty().name()));

        Shared.Time = Shared.Overworld.getTime();
        Shared.Log.info(String.format("Saving time: %d",
                Shared.Time));

        Shared.Overworld.setGameRuleValue("doDaylightCycle", "false");
        Shared.Overworld.setTime(1000);
        Shared.Enabled = true;
    }
}
