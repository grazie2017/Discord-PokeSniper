# Discord PokeSniper v3.4.1 - Working! 
<b>support both 0.55.0, 0.45.0</b>


<B>Discord PokeSniper</B> is a bot that was based on the <B><i>Discord 100IV auto Sniper</i></B> of <B>CandyBuns</B> and inspired by it.
In the past, it used 2 different programs to snipe and loot. 
But today, this bot is Stand alone cross platform bot. 
Support the new hash server of the BossLand team 0.55.0 and the 0.45.0 api


Download: http://discordps.com/downloads.php 


# Source code notification

Due to fake versions that published over the web, some major and important updates in v2+, I will no longer publish source code for Discord-PokeSniper, I will, however, uploaded antivirus check:
https://www.virustotal.com/en/file/bfb0187f5c769d877ac06335e9e41f5a5481d45607d15caf182bc491110a6a18/analysis/1478567923/
Virus check for DPS v2.1

# Discord PokeSniper Website
http://discordps.com

Download only from this site! nowhere else!

there are fake versions out there. BE AWARE!


# Updates

Version 3 is out with major updates!

See changelog below until v2.5
V3 changlog TBD .


# About Discord PokeSniper (DPS)

TBD
---------------------------------------------------------------

<B><h1>Please make a donation if you can afford to</h1></B>
https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=WNDFMD6MVL4KN

Thanks for the donations until now. I really appreciate all the donations. :)

---------------------------------------------------------------


![alt tag](http://discordps.com/img/images/1.png)

![alt tag](http://discordps.com/img/images/2.png)

![alt tag](http://discordps.com/img/images/3.png)

![alt tag](http://discordps.com/img/images/4.png)

![alt tag](http://discordps.com/img/images/5.png)

![alt tag](http://discordps.com/img/images/6.png)

![alt tag](http://discordps.com/img/images/7.png)

![alt tag](http://discordps.com/img/images/8.png)

![alt tag](http://discordps.com/img/images/9.png)

![alt tag](http://discordps.com/img/images/10.png)

![alt_tag](http://dps.cmshai.com/img/gif/g.gif)

---------------------------------------------------------------

<B><h1>How to use:</h1></B>
TBD
---------------------------------------------------------------

<B><h1>How to get Discord Token (by Candybuns)</h1></B>
- Open discord app on Chrome (application on the web! not the web version)
- CTRL + Shift + I (OR F12)
- Open console tab.
- Type 'localStorage.token' (no quotes) in the text box at the bottom of white window.
- It will echo your token back to you.
- Paste WITHOUT quotes surrounding, 
- An example of what to paste in app window is: MjI6OEk5Nzk1NjM2NZAyNTI4.Cr_xig.JoRe-r65JJ7SJGxB-6ptn7GgQJI

---------------------------------------------------------------

<B><h1>CHANGES:</h1></B>

Changes from v2.3 to v2.4:

	* Few important bug fix
	* Safe sniper now supports "Catching tries" like regular sniper.
---------------------------------------------------------------
Changes from v2.2 to v2.3:

	* User interface has been changed a lot! must of the settings are now in new settings window.
	* Save password is now for all users.
	* Add the ability to choose between regular sniper and safer sniper.
	* For regular sniping - this data can be changed:
		[x] Waiting time between snipes
		[x] Speed for masterball (default: 50)
		[x] Latitude and Longitude.
		[x] Catching tries.
	* for safer sniping - this data can be changed:
		[x] Speed for masterball (default: 50)
		[x] Latitude and Longitude.
	* Fix bug that caused donators to receive an error message when tring to connect as a donators.
---------------------------------------------------------------
Changes from v2.1 to v2.2:

	* Fix problem that caused an error for some user
	* Improved the new sniping algorithm
	* Now shows which pokemon has been enter to the waiting list of pokemons.
	* Saving last sniping time and coordinates for safer sniping.
---------------------------------------------------------------
Changes from v2.0 to v2.1:

	* Fix problem that prevent user from catching some pokemons with different IV than 100.
	* Remove location (lat/lng) and radius from UI.
	* Add account details entering in UI window, auto create user.xml file.
	* Now use a better and smarter algorithm to snipe pokemons, no need to enter coordinates or radius.
	* Due to those changes, the User Interface has been changed a bit.
	* More bugs fixing.
--------------------------------------------------------------- 
Changes from v1.5.2 to v2.0:

	* Code will be NOT be publish for security reasons.
	* Better UI.
	* Icon for DPS :-)
	* Logo for DPS ;-)
	* Lots of bug has been fixed.
	* Lots of code has been re-write.
	* Adjust to the new api
	* Donators Privileges has beed add.
	* Auto notify user of available updates and shows what the changes are.
	* Support catching pokemons with IV's from x->y (example: between 90-95) - donators only!
	* Support auto start DPS on launch - donators only!
	* Only one login per donator will work.
	* Can now put pokesniper2 files in the pokesniper2 directory next to the jar file
	* Check whether pokesniper.exe exists - won't start if not! 
	* Check whether masterball.exe exists - auto farm will not be available if not!
	* Sniping is not good anymore, only local sniping are allowed
		I add location from which you want to snipe, and raduis to snipe from.
--------------------------------------------------------------- 
Changes from v1.5.1 to 1.5.2:

	* Fix a bug that caused bot to stop catching after reading duplicates pokemons
	* Add another discord 100% 
--------------------------------------------------------------- 
Changes from v1.5.0 to 1.5.1:

	* Fix a small issue that cause Doduo display wrong name in gui window
--------------------------------------------------------------- 
Changes from v1.4.2 to 1.5.0:

	* Now shows CP of caught pokemon in log
	* Can change time of waiting between snipes
	* When pokemon not caught waiting time is 5-8s which is enough.
	* Creating a stack of pokemons that the bot found with 100% and not tried to caught yet,
		so now even if no more pokeballs left, the list of 100% pokemons we found will not delete.
	* Changed lots of code so it will now work better and faster
	* Change UI a bit.
	* If setting.json file was not found, or data is missing, create new settings.json file.
	* settings.json IS NOt INCLUDE IN ZIP FILE!!! auto create if missing!!
	* Fix more pokemons name for some pokemons.
	* Fix bug with changing "catching limitation" field, caused runtime error whan entering no digit char.
	* Fix bug that caused some settings not to be saved on bot closing.
	* Safe closing the bot -> disconnect from discord.
---------------------------------------------------------------
Changes from v1.4.1 to 1.4.2:

	* Fix nidoran female and male snipping problem
	* Change background color to log
	* Add text color for defferent type of messages
	* Add message about the caught pokemon IV. 
		sometimes someone post a fake 100% pokemon and we catch it,
		now, we will know if it was 100 or not, and if not, what iv we caught.
	* Fix problem that caused few pokemons to be considered as not valid.
	* Fix bug that whan the pokemon name is in the end of the message, the bot not recognize it.
---------------------------------------------------------------
Changes from v1.4.0 to 1.4.1:

	* Fix a bug that caused some users to get a runtime error.
	* Fix settings.json machamp showing twice.
	* Add pokemon number next to his name.
	* Fixing some more problems
---------------------------------------------------------------
Changes from v1.3.2 to 1.4.0:

	* Fix some bugs.
	* Add support to run Masterball bot to farm pokestops and get pokeballs
	* Limit pokestops robs to 1700.
	* Fix a little problem in GUI
---------------------------------------------------------------

Changes from v1.3.1 to 1.3.2:

	* Fix problem that caused many people not receiving messages from Discord
---------------------------------------------------------------

Changes from v1.3.0 to 1.3.1:

	* Fix problem that caused 100% iv pokemon not to get caught
	* change time in log to 24h
	* few more discord 100% writing add
	* debug window (bat file) now shows all the pokemons (even not with 100% iv)
		if you find any 100% that was not caught please let me know.
		or if somehow you don't see any pokemons there (also a problem)
---------------------------------------------------------------
Changes from v1.2.0 to 1.3.0:

	* Important update!!
	* add waiting time between snipes, random time between 10-15 seconds
	* fix trying to catch same pokemon with shorter lan/lat
	* creating the base to integrate masterball bot to farm pokeballs
---------------------------------------------------------------
from v1.1.4 to 1.2.0:

	* add Select all / Deselect all
	* now shows how many pokemons were caught
	* limit how many pokemon to catch (Default: 995) 
	* auto stop bot when limit reached
	* reset pokemon caught number to 0.
	* fix bug that delete some names in settings.json
	* more bugs were fixed
---------------------------------------------------------------
<B>from V1.1.3 to V1.1.4:</B>

	* add support for the 💯 icon of discord
	* add support for the %100
	* fix small bug
---------------------------------------------------------------
<B>from v1.1.1 to v1.1.2:</B>

	* add error for log - No pokesniper2.exe file found
	* add seconds to log. [mm:hh:ss] 
---------------------------------------------------------------
<B>from v1.1.0 to v1.1.1:</B>

	* add auto stop bot when no more pokeballs left in bag
	* fix some bugs
---------------------------------------------------------------
<B>from v1.0.2 to v1.1.0:</B>

	* GUI is now dynamic - resizeable window!
	* fixed connection didn't success with token but still said "success"
	* fix Candybuns name
---------------------------------------------------------------
<B>from v1.0.1 to v1.0.2:</B>

	* fix bat file
	* rename jar file
---------------------------------------------------------------
<B>from v1.0.0 to v1.0.1:</B>

	* Delete 10MB of garbage
	* fix empty token still tring to connect
