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
1. Download the latest version from [here](https://github.com/sildein/JeepersCreepers/releases/latest).
2. Drop it in `/plugins`.
3. ???
4. Profit.

### How It Works
When you first start the server or the last player logs off, the plugin will
save the time and difficulty, and disable the day/night cycle. When a player
logs in, these settings are restored.

### License
```
####################### Sildein's Free Software License #######################

Copyright (c) 2017-present Jesse Jones.

This license exists because I believe the mainstream free software licenses all
suck. The GNU GPL is a communist tumor, and the more permissive licenses allow
developers to get ramrodded.
-------------------------------------------------------------------------------

Please read this license before running, modifying, or redistributing the
software. Doing so constitutes agreement to the terms of this license. If you
do not agree to this license, please remove the software from your machine(s).

You may use this license for your own software, but changing it is disallowed.
-------------------------------------------------------------------------------

Usage:

You may use this software for any imaginable purpose, without restriction. This
includes commercial purposes, with or without financial gain.
-------------------------------------------------------------------------------

Disclaimer:

This software is provided to you free of charge. As such, it does not carry any
kind of warranty whatsoever, express or implied.

You are solely responsible for any undesirable things that happen as a
result of your use of this software, including (but not limited to) data loss,
hardware/software damage, acts of God, hurt feelings, and theft by a meth
junkie. Under no circumstances shall the developer(s) be held liable for any
damages.
-------------------------------------------------------------------------------

Redistribution:

You may redistribute this application in source or binary form, as long as the
following conditions are met:

The origin of the software must not be misrepresented. You may not claim to
have written the original software, or claim to be affiliated with the project.

Unmodified copies of the software must include this license and all copyright
notices must be left intact.

You may not redistribute this software for the sole purpose of throwing ads
around it. URL shorteners are especially unacceptable.

The host must not restrict users' access to the software through any means.
This includes paywalls, registration walls, and freemium limitations such as
throttling and wait times. This does not apply to private cloud storage
accounts.
-------------------------------------------------------------------------------

Derivative Works:

You may create derivative software packages based on this software and release
them under any license you wish, as long as the following conditions are met:

The derivative work must include a notice somewhere easily accessible to the
user that acknowledges the use of this software, such as an "about" section or
the license document.

Rebranding and/or renaming the software does not constitute modification. There
must be moderate changes made to the application logic, or it must be used as
part of a larger project. If neither of those statements apply, all of the
statements under "Redistribution" remain in effect.
-------------------------------------------------------------------------------

```
