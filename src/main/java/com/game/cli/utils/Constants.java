package com.game.cli.utils;

import com.game.places.Places;

public class Constants {

	public static final String startupMsg = "\n"
			+ "--                                 __       __  ________  __         ______    ______   __       __  ________                                        \n"
			+ "--                                /  |  _  /  |/        |/  |       /      \\  /      \\ /  \\     /  |/        |                                       \n"
			+ "--                                $$ | / \\ $$ |$$$$$$$$/ $$ |      /$$$$$$  |/$$$$$$  |$$  \\   /$$ |$$$$$$$$/                                        \n"
			+ "--                                $$ |/$  \\$$ |$$ |__    $$ |      $$ |  $$/ $$ |  $$ |$$$  \\ /$$$ |$$ |__                                           \n"
			+ "--                                $$ /$$$  $$ |$$    |   $$ |      $$ |      $$ |  $$ |$$$$  /$$$$ |$$    |                                          \n"
			+ "--                                $$ $$/$$ $$ |$$$$$/    $$ |      $$ |   __ $$ |  $$ |$$ $$ $$/$$ |$$$$$/                                           \n"
			+ "--                                $$$$/  $$$$ |$$ |_____ $$ |_____ $$ \\__/  |$$ \\__$$ |$$ |$$$/ $$ |$$ |_____                                        \n"
			+ "--                                $$$/    $$$ |$$       |$$       |$$    $$/ $$    $$/ $$ | $/  $$ |$$       |                                       \n"
			+ "--                                $$/      $$/ $$$$$$$$/ $$$$$$$$/  $$$$$$/   $$$$$$/  $$/      $$/ $$$$$$$$/                                        \n"
			+ "--                                                                     ________  ______                                                              \n"
			+ "--                                                                    /        |/      \\                                                             \n"
			+ "--                                                                    $$$$$$$$//$$$$$$  |                                                            \n"
			+ "--                                                                       $$ |  $$ |  $$ |                                                            \n"
			+ "--                                                                       $$ |  $$ |  $$ |                                                            \n"
			+ "--                                                                       $$ |  $$ |  $$ |                                                            \n"
			+ "--                                                                       $$ |  $$ \\__$$ |                                                            \n"
			+ "--                                                                       $$ |  $$    $$/                                                             \n"
			+ "--                                                                       $$/    $$$$$$/                                                              \n"
			+ "--    ______    ______   __       __  ________         ______   ________        ________  __    __  _______    ______   __    __  ________   ______  \n"
			+ "--   /      \\  /      \\ /  \\     /  |/        |       /      \\ /        |      /        |/  |  /  |/       \\  /      \\ /  \\  /  |/        | /      \\ \n"
			+ "--  /$$$$$$  |/$$$$$$  |$$  \\   /$$ |$$$$$$$$/       /$$$$$$  |$$$$$$$$/       $$$$$$$$/ $$ |  $$ |$$$$$$$  |/$$$$$$  |$$  \\ $$ |$$$$$$$$/ /$$$$$$  |\n"
			+ "--  $$ | _$$/ $$ |__$$ |$$$  \\ /$$$ |$$ |__          $$ |  $$ |$$ |__             $$ |   $$ |__$$ |$$ |__$$ |$$ |  $$ |$$$  \\$$ |$$ |__    $$ \\__$$/ \n"
			+ "--  $$ |/    |$$    $$ |$$$$  /$$$$ |$$    |         $$ |  $$ |$$    |            $$ |   $$    $$ |$$    $$< $$ |  $$ |$$$$  $$ |$$    |   $$      \\ \n"
			+ "--  $$ |$$$$ |$$$$$$$$ |$$ $$ $$/$$ |$$$$$/          $$ |  $$ |$$$$$/             $$ |   $$$$$$$$ |$$$$$$$  |$$ |  $$ |$$ $$ $$ |$$$$$/     $$$$$$  |\n"
			+ "--  $$ \\__$$ |$$ |  $$ |$$ |$$$/ $$ |$$ |_____       $$ \\__$$ |$$ |               $$ |   $$ |  $$ |$$ |  $$ |$$ \\__$$ |$$ |$$$$ |$$ |_____ /  \\__$$ |\n"
			+ "--  $$    $$/ $$ |  $$ |$$ | $/  $$ |$$       |      $$    $$/ $$ |               $$ |   $$ |  $$ |$$ |  $$ |$$    $$/ $$ | $$$ |$$       |$$    $$/ \n"
			+ "--   $$$$$$/  $$/   $$/ $$/      $$/ $$$$$$$$/        $$$$$$/  $$/                $$/    $$/   $$/ $$/   $$/  $$$$$$/  $$/   $$/ $$$$$$$$/  $$$$$$/  \n"
			+ "--                                                                                                                                                   \n"
			+ "--                                                                                                                                                   \n"
			+ "--                                                                                                                                                   \n"
			+ "";

	public static final String MOUNTAIN = "\n"
			+ " :::::::///:::::::::::::::::::----------------------.--------:::::::::::::::::----::::::::::-::::::::\n"
			+ ":::::::::::::::-::::::-----:--::------------:+osyyyo+/-------------::::-::-------::::::::::--:::---:\n"
			+ "::::::::::::::::--:----------------------/+ooosyyhhhhys::--------------....------:::::::::::::::::::\n"
			+ ":::::::::::::::::::------:::-----------+s+:--:://++++/:--//:-----------....-------::://:::::///////:\n"
			+ ":::::::::::::::--::------:::--:------+yh+-----------------:+/----------....------::::://:::::///+//:\n"
			+ ":::::::::::::-------------:::-----.-sdho:----------------:--+o-------.-...-------::::////::::://++/:\n"
			+ ":::::::::::---------------------...oddo/----------------:::::s/-----......--:------::::::::::::://::\n"
			+ ":::::::--::-------------------.....hmds/------------:-::/+o+//s-:---..------:::----:::::::::::::::::\n"
			+ ":::::::::::-------------------....-dmds/---:/+oossoo+/oshhyso++:::----------::----:::::::-::::::::/:\n"
			+ "::::::::::-----:---------------..--hmds:--://++syys+::oys+sso+:+----------:::-----::::::-::::::::///\n"
			+ "::::::::::-----:-------------------smms:---::::/+//---://///:-:o------------------::::--:::::::::///\n"
			+ "::-::::::::----------------------.-/shh/------:::-::--::+/:-:///----------:------------:::::::::::::\n"
			+ "::::::::::------------------------//:oho::-------:+/oooyyo/////+:---::---::--------:--::::::::::::::\n"
			+ "::::::::::----------------------..--:oshs/:::---:++/syyyhoo++++s+-----------------::--:--:::::://:::\n"
			+ "::::::::::---:------------........--:-:hdhs////:/osyhyyhhhyyosyh+:--------....----::-:::------:////:\n"
			+ "::::::::::--::--------------....-----++hdddysoo/+yso+/+ooosyyhdd/-----........---:--:::::-----://:::\n"
			+ ":::::::::::::------------------------+/+ddddhyyosyo//+yyo+oydhdd:------------::::::///::::---:://::/\n"
			+ "::::::::::::::-------.----------.....//:oddmdhhddddhyyyysshdmmmy------------------:://:::::::://///+\n"
			+ ":::::::::::::----.--..--....---......:/:/ymmmmNNmmmddddmdmmmNNm+:::::::-------....-:::-----::::///+/\n"
			+ "::::::::::-:-------------..----......-:::/sdmNNNNmmNNNNNNNNNmm+::::::--:::----....:::---..-:::--:///\n"
			+ "::::::::::----------------.----....-::::://+ydmmNNNNNNNNNNNNmy:::------::::----...-:-----.--::--:::/\n"
			+ ":::::::::::------------------------::::::://+oyhdmmNNNNNNNmdyo:::----:-:://:::-----:::-----::://::::\n"
			+ "---::::::----------------...----::::::::-::////+osyhdmmmmdhso+:---:::---://///:::::/::----:///++//::\n"
			+ "---:::::----...------....-----::::::::::--::::///+oossyyyssso+/::-----::--::::::::///:--..-:://+++++\n"
			+ ":-:::::::----.------..------::::::::::::---::://+osssssooosso+///:::-------:::----:/+/:-------://:::\n"
			+ "-:::::::----.-----........--://::::::::::::-::://ossoo++oosooo+//////::----:::::--://///:--:-:/+/:::\n"
			+ ":::/:------.....-........----:://::::////////////+so/////+++++///:://:::---::::::-:////:---:::///::-\n"
			+ ":::/:------...------.--------:::::::::://////////+oo+/////:::-::-------------------:::::-----::::///\n"
			+ ":::/:------------------------:-:-::::///////////////++////:::---:----------:-----..-::::::::----:/++\n"
			+ ":::/:----------------------------::::://///////////////::/::::::::::--------::::----..-://::////:///\n"
			+ "::/::------------------------::--::::/://////:::://////:::::::::::::::-:------:::::::----:////////:/\n"
			+ "::::------------------------:::::::::::/://:::::::////+//::::::::::::::::::---:::::::::::::://////::\n"
			+ "-::::-----------:------::----:::::::::::::/://:/::://////:::::::::::::::/:::::::::::///////:::::::::\n"
			+ "--:::-------:::::::::::::::-::::::::/::::::://:/:/://////::::::::/:::::::///////:///////+++//:-:://+\n"
			+ "::::::--::::::////////:::----:::::::://////::://///::////////::::::::::::///++//////+++oo++++/:://++\n"
			+ ":::::::::::::///++++o+/:------:::::::////////////:////////////::::::::://://+++++++++ooooooo++/:://+\n"
			+ "::::::::::////+++++oss/:--------:::::///////////////+/+++///////:::::://////+++++++ooooooosoo+/:--:/\n"
			+ ":::::::::////++++++oyy/:::::::::::::::///////////+++++++//////://////://////+++++++oossssyssso+/::::\n"
			+ "::::::::::://///++++yy+////::::::::::::////++///++++++ooo+//////////////////++++oooooshhhysssoo/::::\n"
			+ "--::::::::::://////+sho++++////:/:::/+++////++++++oooosso+///////////++/+++++++oooosoydhyyssooo/::::\n"
			+ "---::::::::::///+++oshyso++++//////++soss///+++oooossssso+++//////++++++++ooooossosyyysossooo++///+/\n"
			+ "--::::::::::://+++oshdyo+++++++++++++osso++ooooossssyyyso+++++++++oooosoosssyyyssyhhys+++o+o+++///++\n"
			+ "---:::::::::://+ooshmhs+//////++++++++ooooosssssyyyyyssoo++++++ooosossssssyyhhhhyhddysoo++++++++////\n"
			+ ":-::::::::::://+osyddyo++////+++++++ooosssssoosooooooo++++++//++++ossyyyyyyhhhhhdmmdhysooo+++++/////\n"
			+ "--:::::::::://+osymmhysoo+++++++++++++ooo++++++//+///////////////++oosyyhhhhhhhhdmmddhysoo+++++++//:\n"
			+ "::::::::::://++osmmmdhyssooo+++++///////////////:///////////:////++++oossyhhhdhhmmmmddhysoo++++++///\n"
			+ ":::::::::///++osdmmmddhssoo++//////:::/::::::/:::////://////////////++oossyyhhhdmmmmmddhysoo+++++///\n"
			+ "::::/:::////+osydmmmddysoo+/////:/::::::-:::::::/://://////////::///++oossyyyyhdmmmddddhhysoo+++++++\n"
			+ ":::///////++oso/ohdddhso++//::::::::::::--::::::::::://///////::////++ooosyyyyyydmmddddhhyysoo++++++\n"
			+ ":////+++ooooso:::/yhhyso+//::::::::::::::-:::::::::::////+/////////+++ooosyyyys-+hdddddhhhyysoooo+oo\n"
			+ "://+ossssssyo-----:sysso+//:::::::::::::::::::::::::////++////////++++oossyyyso--:ohdddhhhhyssooooos\n"
			+ ":/+syyyssyy/-------:sso++//:::::::::::::::::::::::///////++//////++++ooosssssso-:--/hddhhhhyyyssssss\n"
			+ ":/+oysyyys/---------+oo++//::::::::::::::::::/::://:///+/++///+/++++ooossssoooo-----:shhhhhyyyyssso+\n"
			+ "::/+ossys::::-----../oo++//:::::::::::::::::::::::://///+/+/////+/+++oooooooooo-------+hhhhyysoo+++/\n"
			+ ":://ooss::::--:-----/oo++//:::::::::::--::--:::::/://///+/+///+///++++ooooooooo:://::-:/shhyyso++++/\n"
			+ ":://+sy/::::---::---/o+++///::::::::::::::--:::::://///+++++/+//+++++oooooooooo+///::::/+oyhhysso+//\n"
			+ ":::/+oo::::---------+oo++///::::::::::::::::/:///////+/++++++++++++ooossssssooo+--::--::///+shhyyso+\n"
			+ ":::/+o////:::-------+o+++///::::::::::://///////////+/+++++/+/++++oosssyyyysssoo-----::::::::/oyhyso\n"
			+ "yyo++o++//::-------:oo+++////:::::::::///////:://////++++++///++ooossyyyyyysssss:::://+//////+++oyyy\n"
			+ "mmNhoo+++/::::::::-/ooo+//////:::::::://////////////+++osyo+///++oossyyyyyysssss/////+////:///++++oy";

	public static final String CERSEI = null;

	public static final String JOFFREY = null;

	public static final String KHAL_DRAGO = null;

	public static final String RAMSAY_BOLTON = null;

	public static final String WALDER_FREY = null;

	public static final String DEAD_ARMY = null;

	public static final Places FIRST_PLACE = Places.DORNE;

}