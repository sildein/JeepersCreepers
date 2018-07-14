## JeepersCreepers
A simple Minecraft server plugin that prevents "creeper hell" from happening
while your server is idle. While zombies, endermen, and skeletons will spawn
at night and burn in sunlight, creepers aren't subject to this rule, so if you
leave your server idle for even a few hours, you might come back to a
destructive and seemingly endless onslaught of creepers.

If your server is public and active, you shouldn't need this plugin. This is
primarily for people with private servers that run 24/7, only have a few
players, and spend a fair amount of time idle.

It has the bare minimum functionality to be useful right now, and I can already
see a few things I'll be adding to it for usability's sake.

### Usage
1. Download the latest version from
[here](https://github.com/sildein/JeepersCreepers/releases/latest).
2. Drop it in `/plugins`.
3. ???
4. Profit.

### How It Works
When you first start the server or the last player logs off, the plugin will
save the time and difficulty, set the time to 1000 and the difficulty to
Peaceful, and disable the day/night cycle. When a player logs in, these
settings are restored.

### License
This is free software under the GNU General Public License, version 3.
