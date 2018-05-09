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

	public static final String CERSEI = "\n" + 
			" hssssyyyyyyyyydmdyssyys+oyyyyys+:+syyyyy+-.-hmmmdh+++syyyyyy+..-yhhhhh+-:shdmmmhoyddddddddddddNNNNNd\n" + 
			"hyyyhhhhhhhhhhdmmhyyhhh/:ohhhhho:/shhhhhy:--ydhshysoyyssoosy:../yyhyhs:-:shhmmdo+yhhhhhhyhhyyhNNNNmh\n" + 
			"NNNNNNNNNNNNNNmhhdddmNmo:/dNNNms::ommNNmd:-:/osyhssyshysssos:-.+mmmNms--/hdmNmy+odmmmmmdyhdddmNNNNNm\n" + 
			"mmmmmmmmdddddmmysyhhdmmy/:odmmmy:-:ymmmmh+oosssyhysyhssyhdhdh/-ommmmd+--/hdmmd++smNNNNmysdmmmmNNNNmm\n" + 
			"mmddddhhhhhhhhdhsosyyyys+//oysss:--+yyyyosyyysyyyyddhdyyhdddhh+shyhhs:-:+yhdms++ydddmmyssddddmNNNNNm\n" + 
			"mmmddddhhhhdhhdhsosyhyyyo/:/yyyy+--/syyysossssssssyyyyhyyddhdddddyyy+:-:oyhhd++oyhhhdhsoyddddmNNNNNm\n" + 
			"mmmddddddddddhddyooyhhhhy+::ohhhs:-:oysssosoossssyyyhyhhhdddmddddhyy/--:shhhs//+hhhhhyooyddddmNNNNNm\n" + 
			"mmddddhhhhdddhdmhsosyhyyho///syys/--/++ssssoooososyyyhyhhdddddmhhhys:--/yyhy/::ohhhhho+ohdddmNNmyymm\n" + 
			"mmmddddsydddhhdmdsooyhhhhy+/:+yyy+:-/osssoo/////++osssyyhdddmdmmdhyo:-:+hhho::/yhddhy++oddmmmNdo+dmm\n" + 
			"mmdddddhoshhhhdmdyo+oyyyyyo/:/osso:-+ossso+++++/+++oossyhhhddmddmdh/--:shhs/-:/hdddh+//sddmmmh+/ymmm\n" + 
			"mdddddddyosyhhdmdho++osysyy/::+sss/:sosso+//osso+++osyhhdddddmmdddy:-:/syh+:-:ohhhhs//+hdddmh//smNmm\n" + 
			"mhyyyhhhhyosyhdmdhs+++ssssh+/:/oos+:ssss/+osyhyo//+yhhhhddhdddmdmmh::/+yys:--/hhhhy+//sddddy+/odNNmm\n" + 
			"dssssssssysooydmdhy+++oooohs///+oys/ssso//+/osoo//oyhhyyddddhdmdmmd::/shs+-::odhhyo//+ddyys+/odNNmhy\n" + 
			"dhhysyyyyyyooshmdhds+++ssshd+//+oyh+ooy+/::://////oyhhysyyyhhddmmmh///hhs/::/ydhys///ymyso//odNNNms+\n" + 
			"mdhhyyhhhhhyoosddhdhooossshms//++ydooos+/::://////oyhhyyysyhhdmmmdo//+hyo://oddhyo//odmdo//+hNNNNNds\n" + 
			"mdhhhyyyhhhdyooshyhdsoo+osyhh+++oshs++s+///://++s+shhhyyyyhhhdmmds+/+shs//++hmhys+++yNdo//ohNNNNNdso\n" + 
			"mdhhhhysyhhhdso+oyhmhoo+ossyhs+++smho+oo/////////+osyhyyyyhhddmdhos++yho++osmmhyo++odms++ohNNNNNdsss\n" + 
			"ddhhhhhyyyyydds++ohmdsoo+osshyo++ohmsssy+/////++oosyhhhhhhhhddmmssyoosyo+ooymddy++oyms/+oyNNmNmhssyd\n" + 
			"dhhhhhhdhhhyhmh+//ohmyo++ooyyhs+++sdysss+/////++osyyhddhhhhddhmdssysoyyo+osdhdms++ody/+oymNmdmyssydm\n" + 
			"dhyhhhhhddhhhmNho++smdso+++syyyo++odhyyso+//////+osyyhhhhhdddhdyssyyyhs+ooyhydhoooyy++oymNmyyyssymNm\n" + 
			"mdhyyddmmddhyhmmhsoohmyo+++syyy+/+oydyssdd+/////++osyhhhhddmNdhhssyyys++ooyyhdsoosyo+osdNdyyssshmNmm\n" + 
			"NNmhyydmmmdhyydmmhhyydhsoosyhyso+oosdyyymm+////++osyhddddddNNsyhhyyhy/:/+syyhyoosssooydmdyyssyhmNNNm\n" + 
			"mmNmhyyhmmmmdyydmmdhhddhyyhdhyyhho++yyyshmhso+//+ossyhddddNNdssyddhhs/:/+oyhysosssssydmdyyssyhhmmNmh\n" + 
			"mmdmNdhhyddmmhyhhddddhddhhhhhyhdyoooshysymmhhhys+++oyhdmNNNNhhdddddhs++oosyhs+/+ssyhhmmhyyyyyhdmmhyy\n" + 
			"mmmdmNmhdhhdddddyssyhhhhyoo///sdysssshhohmdddhhhhdsydmNNNNNNddddyhhdsoossyhho//oyyhdmmdhyhhhhddmhyyy\n" + 
			"dmmmmmNmdmddmddmdysosyyy+/+/:/+o+:::/::ohmddmddmmmhhmNNNNNNNms//+/+oo+++oshhhyhmmdddhyyhhhhdddyyyhyy\n" + 
			"mmmmmmdmmmmmdmddddyssoo/+oos/-//-.:/oooydmmddmmmdmmmNNNNNNNNNhoo++::oo///ossosyhmddhssyhhdddhyyhhyhh\n" + 
			"mmmmdyhdmNmmhshddhhyyso++ssyyooyssyyyyhhmmmmmddmmmmNNNNmNNNNNdddyso+ssoyyyysoooydhmhyhhhdddhhhhhhhdd\n" + 
			"NmmdmdmmmNNmhyhddhhhhhhddhyyyhhhhddddhhhmNdmmdmmmmmmNNNNNNNNNNddddhhddhhhhhyhhhdddddddhyo++syydhhdmm\n" + 
			"mdmmmmmmNNMmdhdddhmddddhhyhhhhhhhddhhyyddNNmNmNmmNNNNmNNNNNNNNNddddddddddddddddmmmmdmmdyso+syymmmmmN\n" + 
			"hhmmmmmdmNNdddddyydhdhhddhyyhhhyyhssyyhhNNmmmdmNNNmmNNNNmNNNNNNmmmhdddhhhhhdddmmmmmmmmmdmmmmmmNmmNNN\n" + 
			"mNNNmmmmmmmdhyhddmdddhdddhddhydyohhhmdmmdNNmNmNNdNNNNmmNNNNmNNNNmmhmdyhmmmdhdhmmmmmmmNNNNNmNNNmmNNNM\n" + 
			"NNNNNmmmmmdysysyhhdddddmNdsddhddhydmmhdNNNmmNmNNNNNNNNNNNNNNNNNNmNmNmmmNNdmhNNmmmmmdmNNNmNNNmmmNMMMM\n" + 
			"NmmNNNNmmmhyysssoydddmmNmddyhmdmmhddhdmmdNNNNdmNmNNNNNNNNNNNNNmNNNNmmmNmddmmmNMNdhyddmNNdmNmmmNNNMNN\n" + 
			"NNmmNMNNmmhh+-:/oydmNNNmdmNmyydmmmmmmdNNNNmdNNNNmNNNNNNNNNNmNNNNmmNNmNdhmmNNmNNNNmmmNNNNNmNmNNNNMNmd\n" + 
			"NNNmmmNNNdddhhhNmmNNmmNdmNdmNdhyhmddNNNmdNNNNdmNNNNNNNNNmmNNNNmNNNmmmmhmNMNNNmNMNNNNNNNNNNNmNNNNNmmm";

	public static final String JOFFREY = "oooooooooooooooooooooooooooooossssssssooo+++///////+++osssso+/:-----------::/+osyyyys/:::::/+ooooso+\n" + 
			"ooooooooooooooooooooooooooooooosss+osooooo+++++///////++ooo++/::----------:://+syyyoo/::::/+ossssyys\n" + 
			"oooooooooooooooo++o//oo++oooooooooo+++ooo+oooo++////////++++/o+:----------:://+syy/:://:::/+ssssssso\n" + 
			"ooooooooo++o++++o++:////++++++++++++o/+o++sssoo++///:::///+s/o+:------/:--:://+os/..-/s/::/+oooooo+/\n" + 
			"+++++++++++++++syo+o::/++oooo+++//+++so+o++oso+++//:::/::/os/+:/++:---+----::/+o+-...+ys/-:/+ooooo+/\n" + 
			"+++++++///++/++++::o/+osssoo+++o+oosssys+:://o//////::/+::/y+/:/+y+---/:::-::/+o+-..:shhs/::/+ooo+/:\n" + 
			"+//////::+oo+///+o+sh+yyyyyys:yysysyo/so::+s++//+++/:+:/-:/+-::/+yo/:::----:/+oys:::+hdmmh+/:/+oo+/:\n" + 
			"//////://oo////o+yhssssyhyoyy+++hs/yyyooooos++sssyysssyo---..../-/s/:--::/+sshdmdo+ohmmNNNdyoosssso/\n" + 
			"/////:/oso/////+sooyyssyhhyoo//+yyo/+ooysyyhyooossyhhyyo-/ss+..:.:/:/::/hdmNNNNNNdddmNNNNNNNmddmmdhh\n" + 
			"////::/+:-:/++osyso+shhsyhhh+sho/sysoooooshdddyysooyss+/hdyso+yh:++++o-oNNNNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"+//:://-.-/+ssyysyhsydyyhhyys+o/-++:+soshdddddy+oo+oho-/soos++/:+::+sysNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"+//:/s/../oyhhhyssyosyyhdhsyh+yo:oo::::/+osyyysssysoso+o+///:/::+/+++ysNNNNNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"+//:+o:-:oyhhhhyys+--shddyoso+/:::/::----:/+osyyyyso+//+/--.....-::--//mNNNNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"///::--/syhddhyys/-..:+syyoo/////++///++/+ssyyyyyyysoooo+ooo+:////::.::/dNNNNNNNNNNNNNNNNNNNNNNNmmmN\n" + 
			"///:--:oyhdhyyhyo+/..+syyyyysyyyyyyssssssssoooo+oooossyyyhhmyshddyyysoo+oNNNNNNNNNNNNNNNNNNNNNNNmmmm\n" + 
			"//:-.-+hddhssyhyo+:`+yhddddhyss++//::::::::::::::::///++o+ysoshhdhyhyyyyyNNNNNNNNNNNNNNNNNNNNNNNNNmm\n" + 
			"//---/yhhys+shho+/::ohmdhs+/::::::----:::::::---:::////::/o/+syshshdysoosmNNNNNNNNNNNNNNNNNNNNNNNNNm\n" + 
			"//::/+syyyo/shy+///:sds/--:::::::----------:-:::::/::/:::/-:/:++h+oyyoo++ohmmmmNNNNNNNNNNNNNNNNNNNNN\n" + 
			"////::/+o+//oys+///-.-``.-:::::::---------:::::::::::::/:::/:-:/s//++o+///+shdhhdmNNNNNNNNNNNNNNNNNN\n" + 
			"///::---:-::+oo///:`..`..-:::::::::----:::::::::::::://///o+::::+-://+/::///ydhyyhmNNNNNNNNNNNNNNNNN\n" + 
			"///::-....:/+++++/:`--`..:::::::::::::::::::::::::::::/://+++/:::::+:/::-:::+ssoosdNNNNNNNNNNNNNNNNN\n" + 
			"////:-...-:+o++o++:.--`.-:::::::::::::::::::::::::----::/:+oo+//:/:///::::--:+//+sdNNNNNNNNNNmmmNNNN\n" + 
			"/////:----:+o++o++/.-:+ooo+///::::::////++++///::--.---://+oo++/:/::y:::::---/+/+sdNNNNNNNNNNNmmNNNN\n" + 
			"/////::---:+o//+++/--/shdddhso+////+osyhdddhhyyso/-...--:/+ooo/:://+y:/:/:::-oyyyydmmNNNNNNNNNNNNNNN\n" + 
			"++////:::::/+:://+/..-ohdddddhs+///+oyhdddhysoo++//-...-:++++/::/++o+///o/:/:ymmmmdddmmNNNNNNNNNNNNN\n" + 
			"+////////:::/--///:..-yddds+osso/::/+shhhddmmdhys+:--..-:////::/oo/o//++o+:/:hNNNNNmmmmmNNNNNNNNNNNN\n" + 
			"////////:-:::::///-...-+os+++++/::::/+o+ososso+ooo+/::----::::/++///:/soss-:+dNNNNNNNNmmmNNNNNNNNNNN\n" + 
			"///////:--://:/+++/:.`-/++++///:::::://///++++//:------...-::://::-::/sso+-/hmNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"///////:--/s+//+oo+:..::/::::/:::::-:::::::::::::-----....---::--.-:ooos+/-omNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"///////::-/s+::+sso-`-::::::/-::::-::://:::::::::---........--...--oyyso/:-ymmNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"///:::::::/o/--/oso:.::://+/-:::::-:::/s+/::::::---..............-oyso+/:-sNNNNmNNNNNNNNNNNNNNNNNNNN\n" + 
			"::::::::--:+/--:ooo:-///+oo////::////:ohoo+//::::--.............-:+/:::-:+dNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			":-------::+o+::/oo+/-/+oyo+/+osoosyyyyso+++o+///::--......--.---+:::-:/o+hNNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"-------:+syhs//+oo//-:/so++////+sso///:://+ooo+//::---....-----:/:+osysymNMNNNNNNNNNNNNNNNNNNNNNNNNN\n" + 
			"-------/sssyy+/++++/:-:++oshdhyssssssso++oooooo+/:::---......----:ssyshmMMMMMMMMMMMNNNNNNNNNNNNNNNNM\n" + 
			":::---:oysssyyo++++/:-:////+ydys////+os/hdmhoo+//:::-------------++o+sNNMMMMMMMMMMMMMNNNNNNNNNNNNNNM\n" + 
			"dyyo::oyhhhyyys+++++/:-://////+++++++++++//:////:::-------------/+++:oNMMMMMMMMMMMMMMMMNNNNNNNNNNNMM\n" + 
			"Nmds::+yhdhyssso++++//:-://///::/:::::::::::::/:::--------------/++::hNMMMMMMMMMMMMMMMMMNNNNNNNNNMMM\n" + 
			"my+///+oyhhysoooo+/////:-:-:///////:::::::---::--------------..-/+/:hNMMMMMMMMMMMMMMMMMMMNNNNNNNNMMM\n" + 
			"o+++++//shhhso++ss+///:::-.-/////::::::::-------------------...--:/smNMMMMMMMMMMMMMMMMMMMMMNNNNNNMMM\n" + 
			"o++++//+yhhyss+/oyso//:::---//::/:::::::----------:::-------...+o/smNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\n" + 
			"+++++///+ssssso++syyyo///::/++++////////////////::::---------.-hhNNNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNN\n" + 
			"++++++++//oyyssooosyys+//+sohdhyyyyssosssoo+////::::---------.:msmMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNmm\n" + 
			"+++oooo+++sdddyss++yho/ooydhyhNmhhhhdddhyso+//::::------------sNsodMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNNN\n" + 
			"/++oooo+++sdmddysooo/ossyshmdyymNmddddmddhhso/::------------/sNd+++ymNNMMMMMNMMMMMMMMMMMMMMMMMMMMMMM\n" + 
			"::/+ooo++/sddhyysydoshhdyssydmdhhmNmdddddddyso/:---------/+ydNmoo//oohhhhdmdhdmmdmmNMMMMMMMMMMMMMMMM\n" + 
			"-::/+ooo+//oosyhyshdhyyyhysosyhyoydmNmddhhhyso/:----:/osyhmNNh/o+:+++hddmmyhhhhdysooyhmNMMMMMMMMMMMM\n" + 
			"-:://+o++ooosydmdyyhdhysshhyso+ohdmmdmmNmdhyso++++syhhdmNNNdso/::/+/yNNNmmmdhdddy+shhys+yddmNMMMMMMM\n" + 
			"::/++o+oydhyyhdmdhdhhhhssshyooosdmmmNmddmNNmmmmmmmNNNNNMNmysss+:/o:+mNNmmmdhmddhyyssyyhssysyymMMMMMM\n" + 
			"sossossyhhysssshdhddhhhhsooysooydmmmmmmdyyhmmNNNNNNMMMNmyosso+//://dNNNmmmdmmmhyyyyyyyyyhdhhddNMMMMM\n" + 
			"ysssyhhyysyssssydhyhdhhsysooyhddddddhhhhhhdhsNNNMMMMMmhs+++++o++/:hNNNNNmdmNNNmddhyyyyyyhNmdssydmNMM\n" + 
			"hyyhhhhssyyssyyyhyhhhyhhyyyyshddddddddddddddyNMMMMNNNhso++++o++++hNNNNNmmmNNNNNNdddhhhhhmNNmso/+shhd\n" + 
			"yyshyhhhhhyysyyyhhsyhshhhyshhddhdddddddmddddhmMMMMNNhsooo++oo+oydmNNNNmmNNNNNMMNdmmmdNmmNNNmsss/:os/\n" + 
			"hhyhhshhhhyyssyyyhysyysysyyhhhdhhddddddddddmNdNMMMmhyo+ooooosohdmmNNNNmmNNNNMNNmmmmmmNmmNNNmyso+:++:\n" + 
			"dyyhhyhyysyysyyysshsyhsyyhyyyshhhhhyhhhdmmmmNmdNMddyyssyossoyhdmNNNNNNmNNNNMMNNNNNmmNmmmNNNdhho//+++\n" + 
			"hhyhhhhhsyhssyyhyshsyhsyssyysyyyyyysyyyhhhhdmmdmdhyssosyosyoydmNNNNNNNmNNNMMNNNNNNmNNmmNNNNdhyo///o+\n" + 
			"hhhhhhhhsyhsyyyyyyyyysyyysyyyyyhhyhhyyyyysosyyhhyo+o+/+oosyydmNNNNNNNNNNNNMNNNNNNNmNmmmNNNNdyys/:/++\n" + 
			"hhhhhyyyyyhyyyyyyyyyshyshsyyssyyhhyhyyhho+/+ohyhdsos/::+yhhdmNmNNNNNNNNNNMNNNNNNNmNNmmNNNNmhys+::/oo\n" + 
			"hdhhhyyyyyyhyyyyyyysyhshsyyyyysyyhyhyhho+/:/ooosmys+--./yddmmmNNNNNNNMNNNMNNNNNmmNNNNmNNNNmhys/::/sy\n" + 
			"dhyhhhhhhhhyyyyyhyyshyyhsyysyssyyhyhyyhsoosssosymdo/:-:ohhdmmmNNNNNNMMNNMNNNNNNmmNNNNmNNNNms+o/::/yy\n" + 
			"dyyhhyyhhyhyyyysyyysyyshysyyyssysyhysyyyyyyyysyydhs++oshdddmmNNNNNNNMNNNMNNNNmmmNNNNNNNNNNmoo+/::+ys\n" + 
			"hhyyhyyyhhyyyyyssyyyshyyyyysyssyyyyyyyyyhyssssysyyooosyhddmmNNNNNNNMMNNNNNNNmmmNMNmmNNNNNmdo++:::sys\n" + 
			"hhyyhhhhyhysyhyyyyyyysyysyhyyssyyyyyyyyhyyyssysyyhoyyyhhhdmNNNNNNNMMMNNMNNNNNmmNNNNmNNNNNmdy+/::/hs+\n" + 
			"ddyhhhyysyhyyhhyyysshysyyyyyyssyyyyyyyyyyyyyyysssdyysyhhhdmNNNNNNMMMNNNNNNNNNmNMNNNmNNNNNmhs/:::sms+\n" + 
			"mhyyhyyhhhsyhyyyhyyyyyyhyyyyyysyysyyyhyyyyyyysoosmyyhhddmmNNNNNNNMMMNNMNNNNNNmNMNNNmNNNNmmsoo::/hmyo\n" + 
			"ddhyyssyhhyyhyyyhyyyhyyyhhyyyysyyyyyyyyyhhyyyyyssmyhdmmmmmNNNNNMMMMNNNNNNNNNNNMNNmmNNNNNmdo+//:/ddo+\n" + 
			"mddyyhhyyhhhhhydhyyhshhyyhhyyyhyyyyyyhhhyyyyhhysymhdmmmmmmNNNNMMMMMNNMNNNNNNNMMNNmmNNNNNmh/+:::/mdoo\n" + 
			"mmhhyyyhyyhhhyyhhyhhhyhyyyhhsysyyyhyyhyyyyhhyyhhsNddmmNmNNNNNMMMMMNNNNNNNNNNNMNNNNNNNNNNmo+//:/+mdoh\n" + 
			"mmdhhhyyhyyhhyyhhhhhyhhyyyyhysyyyyyysyhhhyyyhyyhyNdmNNNNNNNNNMMMMMNNNNNNNNNNMMNNNNNNNNNmh+++:+oomdsh\n" + 
			"mddddhhyyyyhdyshdhyyhhshhhyhyhysyhyyyyyhyhhyyysyhNmNmNNNNNNNMMMMMNNNNNNNNNNMMNNNNNNNNNNmo+oo/s/odddm\n" + 
			"mmmddddhshyyyysyhhhyhhsyhhyyhysyhhyyshhdyhyhyyyhdNmNNmNNNNMMMMMMNNNNNNNNNNNMMNNNNNNNNNNd+/oso//sNNMM";

	public static final String KHAL_DRAGO = null;

	public static final String RAMSAY_BOLTON = "\n" + 
			"              ``-oooo+////////::-----:::::/+oosoo+//::::/+ooo+//////:--:/+//////////////:::://///////\n" + 
			"             ``-+ooo++/////:::::-:----::::///+++++/:::-:/+oo++/////:::/++///////////////////////////\n" + 
			"             ``-ooooo++////:::::::://:/++/::/:::+//+++//oso////++//////+//////////:::///////////////\n" + 
			"             ``-osssoo++++//:::::///+ooooosyos+ososssys+oss/////+++/+++///////////:::///////////////\n" + 
			"             ``-+ooooo++++//:--:/+ssyysyyhyysyyyyysyyysssohy++++//+/++o+++////////////::::::////////\n" + 
			"             ``.+oooo+++//:::++ossyyyyhhhdhyssyyhyhyydhysshhyoo++++/++ooo++//:::://///:::::::::::///\n" + 
			"             ``.+ooo+++//ossyyyhdddhyydhyhdhhyhhhyhhdhyyyyyhdhysoosssyssoo++/::::::///:::::::::::///\n" + 
			"              `.+oo++//:+yyhyhmmdhyydmmNmmddddddhhhdmmdhhhsyhddhyyyssyyyssoo+////////::://////:::///\n" + 
			"              `./oo+//::oyhdhhdhhyhmNNmNNmmmdddhdddmmNNmddhyhdmmdhhyyyhyoooso++/////:::////////:::::\n" + 
			"              `./oo+/::+hdmdsyyyhdmmmNNmNmNmmmmmddhddddmmdddhddmddhhhhyyso+sooo++//:::::///++///////\n" + 
			"              `./so+::/dmddhssssyhdddmmmmNNNmdmmNNNmddddddddmdhddhyyyhhyhyysysoo+//::::::///+///////\n" + 
			"              `./++/:+smdhdhdhhdhddmmmmmmmmmmmddmmmmmmNmdmmdmmmdmmddyddhddhysyooo+///::::////////+++\n" + 
			"              `.//++oohdyshhddddddddddddddddmNNmmmmmdmmmmmmmNNNNmNNmdddddmdyyho/ooo++//////////////+\n" + 
			"              `.:+oooohmdhhdmdddddhhhhddmmmmNmNNmmmmmNNNNNmmmNNNNNNNmdmNmdmdhyyoosso++//////////////\n" + 
			"              `.:o+oosyddddhysshhyhhhdddmmmNmdmmmmmmNNNNNNNNmNNNMMNNNmNNNmdmdyhy+ossoo++/////:::////\n" + 
			"              ``:o/+//yddmmy/:/syssoshdmmdddmmmmmmmmNNNNMMNNNNNNMMMNNNNNNNmddyhh++ossoo+++///::::///\n" + 
			"              ``/+/o:oddmhm+-.-:/::/::/osyysyyyhdddmmmNNNMNNNNMNNNNNNNNNNNNdddhs:/+ossoo++////::::::\n" + 
			"              ``:++++yhddsy-....--:---:://///++ossydmmmmNNNmmNMMMNNNNNNmmdyhdhy:-:/+ossso++///::::::\n" + 
			"              `.-///osyhh+:.....--:--:::/osyssssyyyyhhddmmmmmNNMNNNNNNNmddddyhy---:/+ossso++//////::\n" + 
			"               `-+/++hdmm+::/+/////:/+oshddddhyyyhhhhhyhddmmNNNNNNNNNmmmmhmmyy+-----:/+osso+++//////\n" + 
			"               `-++++ohmm+:/+syyss+-:/shdddmdhddhdddhysyyhmmNNNNmmNmmdmmdhshsy:-:-...-:/ossoo+++////\n" + 
			"               `-+o+++sdmh:ohhhhyys-.-+yhhsyoossyyysoo+ooosydmNNmmmmhdmmddsyyy--::-.`..-/ossso++////\n" + 
			"               `-+oo+++yyd/+o+++oo/..:+oooo++ooo++////////+oydmNNmddysmddysohs--:::-....-/ossso++///\n" + 
			"               `-+ooo++oos/..-/++/-`.-/++++/::::---::::///++ssydmhyhydhoos+sd/--/////:---:/+ossoo+++\n" + 
			"               `-+oo+++//+/...---.``.-://+o+:-....--:///+/////++o+oysss+::odo:+/++++/:::---:/oosoo++\n" + 
			"               `.+o+++/////.....```.-::::/+y+:-...-::/+++++//:////+soo+/+ymh+++oo++//::------://++++\n" + 
			"               `.+o+++/////-..`..-:/oyyhdhhh+::---:///++++++//:::/odhhhdmNmyosossoo+///::----..-:/++\n" + 
			"               `.+ooo++//++:....-:++shhdddy+:---::/++++++++++//::/odmNNNNmhsyyyyyso++++//:::---.-/++\n" + 
			"               `.+oooo++++++......-:/++oo+///::::/+++o+++oooo++//+sdmNNNmddyyyyysss++++++/::--...-:/\n" + 
			"               `.+oooo++++++-....-.--::/+++oosoooo+/+ooooososssooohdmNNNmdhhyssys+yoooo+/++/:---...-\n" + 
			"               `.+ooo+++++++:..-:-/ossyhhyyyyys+oo+/+ooossssyyyyhhddmmmmdhhhyyyhysysooo++o+++/::--..\n" + 
			"               `.+ooo+++++++/-.-+oo+:/+//++///:////+oossssyhhddmmmddmmddhsyhdhhhhhhyossooo+/////::-.\n" + 
			"               `./ooo++///:::-----.-:++o++++////++/+ossyyyhdmmNNmdddddhyyyhddmdddmmdyyyyyyoooo++++:-\n" + 
			"               `./oo++//:::--.----.--:/:::////////+osyhhddmmNNNmdddddhysyyyddmmmmNNmdhhdhyyysoooo+/:\n" + 
			"               `.+so++///-----:/:--.--.....---://+oyhdmmNNNNNNmmdddddhyyyhyhdmmmNNNmmdmdddhhyysoooo+\n" + 
			"               `-oso+//:---::/+os+........-:/++osydmmNNNNNNNNmmddmmmhhhyhhydmmmmNNmmmmmmmdyyhysssooo\n" + 
			"               `-oo+:----::/+osys/o----::/osyhhdmmNNNNNNNNNNNmdmmmdhyyyyyhdmmNmNNmmmmmmmmdhhssosssso\n" + 
			"               `-++:---:://osyhs/ymms+ossyhdmmmmmmNNNNNNNmmNNNdhhssssssyhdmNNNNNNNNNmmmmddhysysssyss\n" + 
			"            ``.-:::---:://oyyhy/ymNNdddosyyhddmdmmNNNNNNNmddNmyssossyyhddmNNNNNNNNNmmmmmdhyhyhyosyss\n" + 
			"         `.-:/:::---::/+osyhhh:sdNMmsdNo////osyyydmNNNNNdhysyyoosyhhhdmmmNNNNNNNNNNddmddhdhhysssyssh\n" + 
			"       `.:/+++/+ooooosyyyhhdd+/hmNMNyymmo/::/++odNNNNNNmysooossshddmmNNNNNNNNNNNNmddmdhhhhysysyyyyhd\n" + 
			"    ``-::/osyyyyyhdhhdddddmmd:ohmNMMdymmho+//+oyNNNNNNmhyssyyhddmmNNNNNNNNNNNNmmmmddddddmdddhhhhhddm\n" + 
			"``.--:::+oshhhhhddmmmmmmmmNNs:shmNMMNdmmdooyhhddNNNNNdhysyhddmmmNmNNNNNNNNNNNmmhmmddmmdhhdhddhyhdddd\n" + 
			"-::::::+osyhhhdmmmmmNNmmNNNm//shmNMMNNmmNNdyyhhmNMNNdyyyhhhdddmmmmmmmNNNNNNNNNmmddmddyhdhdhhhhhdmdmm\n" + 
			"/+++/:/oyhdhdmmmmmmNNNNNNNNh:+shmNMMNNmmmNNmdddmNNdyyyyyyyhhhddmmmmmNNmNNmmmmmdmhhdhdmdhhddddddmmmmm\n" + 
			"ssso++oshddmmmNNNNNNNNNNNNNs/syhmNNMNNmmmmNmhhhmdsshdmhssyyhdmmmmmmmmmmmddddddhdddhhdhddddddddmmNNNN\n" + 
			"yhhyo+oydmNNmNNNNNNmdmmmmNNs+yhhdmNNNNmmmmNNhhhsoydmmmhsshdddmmmmmNNmmdmmddhhddhddddhhddddmmmmmNNmdd\n" + 
			"hhyo//+sdmNNNNNNNNmhhddmmmNmdyhddmNNMMNmmmmNhsoshdmmmdssyddddmmmmmmmdyhdddhhdddmdhydddmmmmmmdmNmmddd\n" + 
			"dyso+++oyhdmmmmmmmdyyddddmNmddhhdmNNNMNNmmmyooyhdmmmdhyyhddmmddddmmmhyyhhhyhhhdhhddddmmmmdmmNNmmmmmm\n" + 
			"dhyssoosdddddmmmmmhyshddddmdhhyyhdmNNMNmddhhdmNNNNNNdhyyhdddmmdmmmmhyhhhhddddddmmNmNmmmNmmmmNmdhddhd\n" + 
			"ddhhsoydmmyhhddmmdhhydmmhhmdhysssydmNMNdmNMMMMMNNNNNdyssyhhyyhhhddddhyyhmmddhmmmdmdmmdmmdmmddyyhysyh\n" + 
			"mmdyyyhmNNyyyddmmdhdmNdyydNdyyssyyymNMmNMNNNNmNmmmdhyssysssoo+osyyyyyysyhhyyhmddmdmmmmdmmmmmdhhshssy\n" + 
			"mdhhhhdmNNdhhdmmmdmNmdyyysyddhssyyhhNMmNmmddddddddhyyyyyooso+++oooooyhyhhhdhhdddddmmmmmmmhmddhdhhdhs\n" + 
			"dddhhdmNNNmdddmddmmdhhhyysosmmhssyddmNmmhyyyyyhyysoosyhyoooooossoyyhdhddmhdhdmddmmmNmmNmdmdmhyhyohhy\n" + 
			"mdhddmNNmmmddhhdmdhhhhyyyyhyydhyyhmNdNhhhhysysyss+ooyyysssssssoosyosshyyhydddddmmmmNNNmdddhddhyssyhy\n" + 
			"mdddmNmmmmdhhhdhhhhhhyyyyhsooohhyhmhhNhhmNdhhsoo//++shyyhyyssyssohyyyhsyhhhhdmmmmdmNMmmdmhdhhddyhyhd\n" + 
			"mddNNmddmdhhdhyyhhhhyhsdyso++o+shdmdhmNNNNdsssso///+syhyysyhhsyyhddddhdhhhyhydhydymmNdmmdmdyhhhysysy\n" + 
			"mmNmddddhhhhyyyhhhhhyyhho+++++++oydmddmNmdsoyyyo://+oyhhysyyy+yhyhdmddNdmmdmdyshddmmmdhddmdyyyyhysss\n" + 
			"mNmhhmdyhdyosyhddyhdddds++//++++++ohddmmdsoyyso////osyhyhhhhhyhdhddhdmmddmddhhdmmddddmdhhhmdhyyyhhhy\n" + 
			"NdhhmhhhmhshmNMMNNNNdssso+///+++++++sydso++ssoo++++osoyyhdddddmdmmmdddhyydysyhddhddmhmhyddhddhhhddhh\n" + 
			"dhhdhhdmddhNMMMMNNNmooo+oo+//++/+++++++++oossso+/+osyyyhddhyyhddmmmdmddhdsyhdddhhddmshysdmdddddhyddd\n" + 
			"dhdhhdmdddmMMNNNmmds++++++oo+//+/+++++++ooosso+++osyyhhdmmdddddmmdhhhdddyhydmmmdddmmyyhddmhyshddhhhh\n" + 
			"hdhhhmmmmhNNmddddhy+++++++++oo/////++++oooossssooosyhdmNNNNmmmmNNmddhhhhhhdddmdmmdmhhdhmmmddhhmdddhh\n" + 
			"dydhNNmmddmhyyyyyso++++++++++oo///++++ooooshddsooyhhdmNMMNNmmmNMNmmmhhddhddddddmmmmmmmdNddmdmddmddmm\n" + 
			"yddmNmmdddsoossssooooooooooo+////+++oossyddho++shhhdmNMMMMNmNNMMmmmmmmmmddmmmdmmmmmmNNmNNNmmdddmmdmm\n" + 
			"ymdNNNmddyoosssooosssssssoo+//+++++ooshddysso+oshddmmNNNNNNNNNNNNMNNNNNNNmmdNmdmNmmNMNNNmmmmmmddmmmm\n" + 
			"mdmNNNmmhyssyssyyysyyyyyso+++++++oosdmdyssso+/+shmmmmmNMNNNMMMNMMMMMMMMMNNmmmmdmNmNNMNNNmmmNmNNmddmm\n" + 
			"mmNNNNMNdhyyhsyyyhhhyyysooooooooosdmNNhssso+++oyddmdhdmNNNNMMMNNMNNNNMMMNNNmNmmNMMMMMNNMNNmNmNNNmddd\n" + 
			"mmNMNMMMNdhhyyydddhhhyoossooooosddddMmhhhysssooshyhhdhddNMMMMMNNNNdyyyymNNmNMMMMMMNNNNNNNNNNNNNNmmmd\n" + 
			"mNMNNMMMMdhdddddddhyyso+o-``-:/+shdMmhysNdhyyysshhsyhhhddNNMMNmNNNdysyhmNNNMMMNNNNNNNNNNMNMNMNNNmmdd\n" + 
			"mNNNMMMMMdhyhddmmmhssys+-`..--::shmmhyssNdddhhhsyhhhhdhddddmNNmNNmmmNNmmNNmmmmmmmmmNmNNMMMNNNNNNNmmm";

	public static final String WALDER_FREY = null;

	public static final String DEAD_ARMY = "                  `.-:---.`                       \n" + 
			"                `--...---:::                      \n" + 
			"                .--.-:::/:::.                     \n" + 
			"                ods/+mmh//::.                     \n" + 
			"                :o+h/://-:+/                      \n" + 
			"                `-:::-/so/:                       \n" + 
			"                 `+osoos/-                        \n" + 
			"                  --::::-`                        \n" + 
			"                   ``./+:`                        \n" + 
			"                 ````-+/+/..```                   \n" + 
			"         ``-.```-:/--:o+os:--o:.```.-.```         \n" + 
			"        .-:::-/ss+-//+-:--+://+o+/--+-::/         \n" + 
			"        --:.:o+/+ss+:-/--/::+oo+/+:---/:-         \n" + 
			"        --`  `++++//:::--+::+/++/+-   -:.         \n" + 
			"        -:   `.oo//:--::-:-:///+/--   -:`         \n" + 
			"       `-:   -:-/---..::/:-:::-:-:-   --.         \n" + 
			"       `:/    :/.`::`-:-://-/-..-/`   -:.         \n" + 
			"       `//    ..+-.-::s/oy/::.--..    ::`         \n" + 
			"       `/+    .-:-.:::o/++:-:.-/--    ::`         \n" + 
			"       .+o    `::---:.:+o/ .-.:/:.    /-`         \n" + 
			"       -yh:    .:--`  :+/-   ``::    `::`         \n" + 
			"     `-/os/     .     .//.      .    -//-`        \n" + 
			"      +y+             -:::          -:o+//`       \n" + 
			"      ./-             .---          `.o//:        \n" + 
			"      .+-             .:/.            `:+-        \n" + 
			"      -::             ./:-             `/-.       \n" + 
			"      :-:             .--:`             :`.       \n" + 
			"      :::       ``   .---:-`  ..        .-.`      \n" + 
			"      :+-      ./::+::+//+/:o--:.       `-.-      \n" + 
			"     `/h:`     `:::+d+yo/ssys---.        ///.     \n" + 
			"     `+ooo:`    -////.++-++`::-:`       `:/:-     \n" + 
			"      -:/:./     ://`  -:-` .-:.       ..--:-     \n" + 
			"    `/./o-//`    .//.   -   :oo/.     .`-`..-`    \n" + 
			"    -`.::`:    `-///:.     :os+++``. ..--.:---    \n" + 
			"            `--:+o-+s-::.-/:so`:::+o.``- .`.`:    \n" + 
			"            `:::+.  -/:-``..`  -//o/  .``:`:`.    \n" + 
			"             `::/-             -:+:     `         \n" + 
			"              --/              .:/`               \n" + 
			"              .-:              .-:                \n" + 
			"              .-:              -:-                \n" + 
			"              `::              ::`                \n" + 
			"              `::             `:/                 \n" + 
			"               -:`            -::                 \n" + 
			"               ::`            -:.                 \n" + 
			"               --`            :/`                 \n" + 
			"               --.           .:/                  \n" + 
			"               -:-           ::-          ";
	
	public static final String ELLARIA_SAND="soooossssyyyyysssssssssssssssssssssyyyyyhyhyhyyhhhhhhhyyyyyyyyhhhhhhhhhhhhhhhhyyysssssssssssooo++++/\n" + 
			"ooosssssyyyyyysssssssssssssssssssssyyyyyhyyhysyshy/+/+ssssyyyyyyhhhhhhhhhhhyyyyyysssssssssssoooo++++\n" + 
			"++oosssyyyyyyysssssssssssssssssssssyyyysyyooso+:/:-:///ooo+++oyyyhhhhhhhyyyyyyyyysssssssssssooo++++/\n" + 
			"++++osssyyyyyyssssssysssssssssssssssssssysyyyhhoy++ososhhyoo/::o+syhyyyyyyyyyyyyyssssssssssooo++++//\n" + 
			"//++oosssyyyyssssssyyyyyyyyyssssossoyyhdddmdyyyoyyyddhhdhmddhhyys+sosssyyhyyyyyyysssssssssooo++++///\n" + 
			"///++osssysyysyyyyyyyyyysyyyssssohhdmmmmmmddhoyhmmNNNNmmmmNmddhyyy+/+::syhhhhhhhhsssossssoooo++++//:\n" + 
			"//+++ooossssssssyyyhhhhhyyyyssydmNNNNNNmmyydmmmmmmmmmmdmNNmmdhhhhhdo/++:+ohysyhhhyssssssooooo++++//:\n" + 
			"///+++ooosssssssyyyhhhhyyyyshdmmNNNmmmmmNNmNNNNNNNNmmdhyyddmdhdhhyyho////:/o++yhhyssssssooooo+++//::\n" + 
			"///+++oooossssssyyyyhhhyyyhmNNNmNmmmdddmNNNNNNNNNNNNmmmdhsoydhyhdyhyhy///++++:/oyysoossssoooo+++//::\n" + 
			"/+++++++ooossssyyyyyyysssmNNNNNNNNmmmmmNmNmNNNNNNNNNNmNNNmdoodmhsdhyhho/+++o+++:++oooossssooo+++//::\n" + 
			"++++++o+oooooossssyyyysshNNNNNNNNNmmmdmmmmmdmmmNNNNNNNmmNNmdssmNmhddhssysyyyhyoo://++osssoooo+++//::\n" + 
			"ooooooooooooosssssyyysyhdNNNNNNNmmmddddddddhdddddmmmNNdmNmNhhsdmNdhddddydsyssss+/+::/-+ssooo++++///:\n" + 
			"ssssssssssssssssssyyyyyddmNNNNNmddhhhhhhhhyyyysssyhhdmmmNNmmhhmdNmdmmhmmmdo+yo+o:-:-://+oooo++++///:\n" + 
			"syyyyyssssssssssyyyyyyhmNNNNNmdhhhyyysyyyssooo+++++syydmmNmmmNmmdNNNmdmmddh//hyy:/:+:/o+oooo++++///:\n" + 
			"sssyyyyyyyyyysyyyyyhdmNNNNNNNdyyyyysssssssooo+++++/++oyhmmNNNNmmdmmmmmmddhss/:sso:-///o/++oo+++++//:\n" + 
			"++ooosyyyyyyyyyyyymmmNNNNNNNdyysssssoosssoo+++++++/+++oshmmNNNNNmmdmmmmhhyhoy+/o+so+ooo//:/o++++//::\n" + 
			"//+++ooyyyyyyyysymdNmNNNNNNmhyyyssssoossooo++++/////++oyyhdmNNNNmNmdmdNdddhyyhysooo//yo++:/o++++///:\n" + 
			":://++osysyyyyysymmmmmmmNNNmyyysssoooosooo++++++////:/+yyyhdmmNNNNmdmmNdhdmmhmmmddmy//+ss/:++++///::\n" + 
			"::///+osssssssssymmNmmmNNNNmhyssssooooooooosssyyyss+/:/+syhddmNNNNNddmNmddmNmmmmdhhy///+o+++++++//::\n" + 
			"--:/++oosossssssshmNmmNNNNNdhhhdhhyoooo+oosssyysso+++//++syhddNNmNmmddmNmmmNmddhdyhhos+s+::/++++//::\n" + 
			"-//+++oooooooosssyhmmNNNNNNdssyhhhysso++++osydmmmhhhyoo++osyhdmNNmmmNmmdNmmmmmhdmmmdsyss+o-:++++//::\n" + 
			"++oooooooooooosyysymmNNNNNNNddmmmhydhyo/+oosdddmdsshoo+//+oyhdmNmmmdmmmsdmhmdmdmmdhhsyys:+/++++//:::\n" + 
			"+ooooooooooooosyhhddmmNNNNNNNyddmhhddy+:/+oyhhdhhyso+//::/oyhhdmmmmmmmmddmdmmmmmmdhhoss/+oos++++//::\n" + 
			"+ooossssossssyhyyhdmmNNNNNNNmyyyyyhhyo/-::/+ossso+++//::/+oyhhmmNmNmNdmmmmdmmmhNmdyhho+/o+oh++++//::\n" + 
			"+oossssssssssdyssymmmddNNNNmmyssyyyhs/-----:+++oo++///:/++oyhdmNmdmNNdmmdhsmmdhNmh+os+o/s/yoo+++//::\n" + 
			"ooossssssssssyhyyymmmmNNmNNNmsssysyyo:..---:/+++++//////+oosdmmddddddmmmmdmddmhdhs+/os/:+od/o++//:::\n" + 
			"oooossssyyyyyyssyydmddmmNNmmNyssssss+:-----/++++///////++oooymhhdmddmmmdmddhmmmmhsyohyosooo++++//:::\n" + 
			"oooooosssyyyysssssshdhdhddmNNNsoooso+/:os+/++oo+///////+++ooshdddmmmmdmmdddhhyymyysooyyysoo+++///:::\n" + 
			"+oooooosssssssssssssssyysymmmdmoossyso+++////+++///////+++oooohdmmmmmmdmmdhdmddmho/+osooooo+++////::\n" + 
			"+++oooooossssssssssssssyyydmNdNysssyysoso/////+///::///++++++osymdmmmddddhddhyhhyo+sssssooo++++///::\n" + 
			"+++++++ooooosssssssooooohyhhdmdhosssyyyysssoooo+//::////++++++oshhmmdmdhmhdysyhhooosssssooo+++///:::\n" + 
			"++++++++ooooooooooooooooosssssosoosydhhhyysoo+++++/:////////++oooomhhhdhyoossss+ooosssssooo++////:::\n" + 
			"++++++++++++oooooooooooooooooooooossssssso++/////+///////////+++/:yoossoosssoossoooossssoooo+////:::\n" + 
			"o++++++++++++++ooooooooooooooooooosssssssoo++///////////////////--o+osssssssssssooooosssoooo+////:::\n" + 
			"o+++++++++++++++oooo+++oooooooooooosssssoo++////://++++///:://:-`:oosssssssssyyyyoooossooo+++///::::\n" + 
			"++++++++++++++++++++++++oooooooooo+osssooo++/+/+++ooo++//:::::-``+ssssyyyyyyyyyhyoooossooo+++/////::\n" + 
			"++++++++++///+++++++++++oooooosoooodNhsssssosssssssooo+//:--:-.` sssssyyyyhhhhhhysooossoooo++/////::\n" + 
			"+++++++++++++++++++++++++ooooososymNmhyysssssssssoooo++//:---.```yssyyyhhhhhhhhhhsooosssoooo++////::\n" + 
			"////++++++++ooooo++++++++oooosydmNmNdhyyssooooooooooo+//::::-.``.yyyyyhhhhddhhhhysoossssoooo++//:/::\n" + 
			"///+++++oooooooooo+++++++ooosdmmNmmmdhysssoooo+++o++++/:::::.````oyyyyhhddddhhhhysoosssooooo++////::\n" + 
			"//+++++oooossosoooo++++oooydmmmmmmmmmhssoooo+++++++++//:::::.`````/yyhhhddddddhhysooosssoooo+++///::\n" + 
			"/++++ooosssssssssoosyhyoydmmmmmmmmmmmmysoo+++++++++++///:::-````-` -yhhddddddddhhsooossooooo++++///:\n" + 
			"hhyyyyossssssssssyhdmmmmdNNmmmmmmmmmdmdyo+++++++++++++///:-...`.y`` `ohdddddddddhsoooooooooo+++/////\n" + 
			"mmhdmddddshsys+sydddmmmmmNNNmmmmmmddddddy+++++++++++++///:..-.-+h``   :yyhdddddddsooooooo+++++/////:\n" + 
			"dmdmmmmmmhdhddmddNmmmNmmmmmNNmmmddddddhhhs+/+++///+++++/:.---:+do..``` .shyysssys+syoosoo+s++::-///:\n" + 
			"mmmmdmmdmdmdddddmmdmmNmNddmNNmmdddddhhhysys///+/:::/+++/-.--:/hm:--`````yosdhs+ooshhsy:syos+/+o:://:\n" + 
			"mmmmdmdddmmmddddmddmmmdNddmmNmNdddhhhysysoso/////--:/++:--.-:odd---.``.`sdy+sdsosssyyss+ysho::ss:///\n" + 
			"mmmmdmmddmddddhdddddmmdNhhddmNNdhhhhyssossoso//:----:+/--...-sds:--....`oymds/hhooyysyosss/o+:/:+://\n" + 
			"mmdmmmmdhmddddhdddddmdmmhhdmdNmmdyyhyoos+os+yo/:...---:..--.:sm/.--.-.--+ohmmh+smooydhoosho+////:--/\n" + 
			"mmdmdddddddddddddddmddNdyhmdhNmNhyhyys/o++ssoso:-...--...---/hd------:-+/h-dmmdysmy+shhososo///oo:::\n" + 
			"dmmmmdmmdddddddddddddmmhhhNhhNdNhsohyoo/oooos+so/-.......--:sdy.:-.----s:y:/dmmmdyNhoydd++sso+//o::+\n" + 
			"mmmdmmmdhdddddddddddmmdhhmmhdNmmmy+sssso+os++yoyso-....---:+hm/-:.-:--/h-h+-sddmmmyNdoydds/so//yo+:+\n" + 
			"dmddmmmdmddddddddddmNdhddNhdmmmmhyy/sosooo+s+ohssos:..----/ydy-:--:/:-yd+dy.oymhmmmyNhoyhdy/o+/+y:.y\n" + 
			"mmmmmmmmdddddddddmmNdddhmdhdmmmmmshsos+o+oooosssssoy/----:odd/---/:/-/yNhdm.+shmhmNdyNyyyddsoso:/+//\n" + 
			"mmmmmmmmddddddddmmNdddddmhdmdmmmmdoyh+/o:+soysssyossy+---/ydo:::://:::sddym+-yommhNNymNshdmdy+h//:/s\n" + 
			"mmmmmmmdddhddddmmNmdddhmhdmNdddmmmd+yyo:+:syssssoyosoyo:/shs+//////:+.hydsdd.+ssmdhNmsNmohmmd+sy-s+-\n" + 
			"mmmmNmmdddddddmmNmddmddddmNNddddddmhoyy:/::yyyossososoysyhsoo/+:/+//::dsNshN+-s/hmhdNydNd+hddh+m:oo:\n" + 
			"mmmmNmdddddddmmNmdmmddddmmNNdhdddddmyoyy:/::syyoosoossshhssyoo+++//o.sydNyyMo::++mmyNmyNmd/hddods-:-\n" + 
			"mmmNmdddddddmmNNdmmmdmdmmmNNdhddddddmsoho:/:-yshoosssyhyosyoo+++++/o-y+dNshNos./+smhhNhmNmd/shhom:::\n" + 
			"mmNmmddddddmmNNmdmmdmddmmmNmdhhddmdddmssy//++oosys+sdhssososooooo/++/h:sNhddsh/-s/dmoNmyNNmh/sd+Ns-:\n" + 
			"mNmmddddddmNNNmdmdddmdmmmmNmddddmmmmddmsyo+:+:s/oyyyyoy:--.:+ooo/s-:sss/mdNyyho.s/ymydNymNNmy:yohd-:\n" + 
			"NNmmdddddmNNNmmmdddmddmmmNmmddddmmmmmmmmsy//oyy+:omy+do`.::.`oo/s:::hoyoddmsyhh-/++ddoNdhNNmds:ssm+/\n" + 
			"NmmdddddmNNNmmmmddmmdmmmmmmmdddmmmmmmmmmmyo+shmo+oy:/yy::-/:.++s/+-+hs/+dNyyshd:-o:sh/NmyNNNmh/++Ny:\n" + 
			"mmdddddmNNNmmmmddmmdmmmmmmmmmmmmmmmmmmmmmmd/soy:od/:/+ys::-+./+o+s/yysydNmyyshd+-//:s/hNhdNNmmy:/dm/\n" + 
			"mdddddmNNNNmmmddmNmdmmmmmmmmmmmmmmmmmmmmmmmh-hs//o:::/+d//-+:ooosoyhyhhdmdhyyhhs///://sNmyNNNmd+:ymo\n" + 
			"mdddmmNNNNmmmmdmNmdmmmmmmmmmmmmmmmmmmmmmmmmhhys/s/:/+:+ohoo/ooyosysyhydmmddhyhhyo//::/+NmsNNNmmh:+Nh\n" + 
			"ddddmmNNNmmmdddNmmdmmmmmmmmmmmmmmmmmmmmmmmmdss+h/-+//+:o+osoossyyyyyshdmmddhhhhhy///://dNydNNNmdo:md\n" + 
			"dddmmNNNmmmdddNNmdmmmmmmmmmmmmmmmmmmmmmmmmmdhsh+:+//++o+oo+sysssyhyyyshdmddddhhhho+/:::sNdyNNNmmh-dm\n" + 
			"";

	public static final Places FIRST_PLACE = Places.DORNE;
	
	public static final String THANK_YOU="\n" + 
			"--              )             )      )       )    )          \n" + 
			"--    *   )  ( /(   (      ( /(   ( /(    ( /( ( /(          \n" + 
			"--  ` )  /(  )\\())  )\\     )\\())  )\\())   )\\()))\\())     (   \n" + 
			"--   ( )(_))((_)\\((((_)(  ((_)\\ |((_)\\   ((_)\\((_)\\      )\\  \n" + 
			"--  (_(_())  _((_))\\ _ )\\  _((_)|_ ((_) __ ((_) ((_)  _ ((_) \n" + 
			"--  |_   _| | || |(_)_\\(_)| \\| || |/ /  \\ \\ / // _ \\ | | | | \n" + 
			"--    | |   | __ | / _ \\  | .` |  ' <    \\ V /| (_) || |_| | \n" + 
			"--    |_|   |_||_|/_/ \\_\\ |_|\\_| _|\\_\\    |_|  \\___/  \\___/  \n" + 
			"--                                                           \n" + 
			"";

}
