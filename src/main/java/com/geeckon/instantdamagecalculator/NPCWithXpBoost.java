package com.geeckon.instantdamagecalculator;

import com.google.common.collect.Sets;
import net.runelite.api.NpcID;

import java.util.Set;

public enum NPCWithXpBoost {
    //Bosses and boss minions
    CERBERUS(NpcID.CERBERUS, NpcID.CERBERUS_5863, NpcID.CERBERUS_5866),
    ABYSSAL_SIRE(NpcID.ABYSSAL_SIRE, NpcID.ABYSSAL_SIRE_5887, NpcID.ABYSSAL_SIRE_5888, NpcID.ABYSSAL_SIRE_5889, NpcID.ABYSSAL_SIRE_5890, NpcID.ABYSSAL_SIRE_5891, NpcID.ABYSSAL_SIRE_5908),
    ALCHEMICAL_HYDRA(NpcID.ALCHEMICAL_HYDRA, NpcID.ALCHEMICAL_HYDRA_8616, NpcID.ALCHEMICAL_HYDRA_8617, NpcID.ALCHEMICAL_HYDRA_8618, NpcID.ALCHEMICAL_HYDRA_8619, NpcID.ALCHEMICAL_HYDRA_8620, NpcID.ALCHEMICAL_HYDRA_8621, NpcID.ALCHEMICAL_HYDRA_8622, NpcID.ALCHEMICAL_HYDRA_8634),
    CHAOS_FANATIC(NpcID.CHAOS_FANATIC),
    CRAZY_ARCHAEOLOGIST(NpcID.CRAZY_ARCHAEOLOGIST),
    SCORPIA(NpcID.SCORPIA),
    KING_BLACK_DRAGON(NpcID.KING_BLACK_DRAGON, NpcID.KING_BLACK_DRAGON_2642, NpcID.KING_BLACK_DRAGON_6502),
    CHAOS_ELEMENTAL(NpcID.CHAOS_ELEMENTAL, NpcID.CHAOS_ELEMENTAL_6505),
    VETION(NpcID.VETION, NpcID.VETION_6612),
    SKELETON_HELLHOUND(NpcID.SKELETON_HELLHOUND, NpcID.SKELETON_HELLHOUND_6613),
    GREATER_SKELETON_HELLHOUND(NpcID.GREATER_SKELETON_HELLHOUND),
    VENENATIS(NpcID.VENENATIS, NpcID.VENENATIS_6610),
    CALLISTO(NpcID.CALLISTO, NpcID.CALLISTO_6609),
    OBOR(NpcID.OBOR),
    BRYOPHYTA(NpcID.BRYOPHYTA),
    THE_MIMIC(NpcID.THE_MIMIC, NpcID.THE_MIMIC_8633),
    THIRD_AGE_WARRIOR(NpcID.THIRD_AGE_WARRIOR),
    SKOTIZO(NpcID.SKOTIZO),
    TZKAL_ZUK(NpcID.TZKALZUK),
    JAL_AK(NpcID.JALAK),
    JAL_IMKOT(NpcID.JALIMKOT),
    RABBIT(NpcID.RABBIT_9118),
    AHRIM_THE_BLIGHTED(NpcID.AHRIM_THE_BLIGHTED),
    DHAROK_THE_WRETCHED(NpcID.DHAROK_THE_WRETCHED),
    GUTHAN_THE_INFESTED(NpcID.GUTHAN_THE_INFESTED),
    TORAG_THE_CORRUPTED(NpcID.TORAG_THE_CORRUPTED),
    VERAC_THE_DEFILED(NpcID.VERAC_THE_DEFILED),
    GIANT_MOLE(NpcID.GIANT_MOLE, NpcID.GIANT_MOLE_6499),
    DERANGED_ARCHAEOLOGIST(NpcID.DERANGED_ARCHAEOLOGIST),
    DAGANNOTH_REX(NpcID.DAGANNOTH_REX, NpcID.DAGANNOTH_REX_6498),
    DAGANNOTH_PRIME(NpcID.DAGANNOTH_PRIME, NpcID.DAGANNOTH_PRIME_6497),
    SARACHNIS(NpcID.SARACHNIS),
    SPAWN_OF_SARACHNIS(NpcID.SPAWN_OF_SARACHNIS),
    KALPHITE_QUEEN_CRAWLING(NpcID.KALPHITE_QUEEN, NpcID.KALPHITE_QUEEN_963, NpcID.KALPHITE_QUEEN_4303, NpcID.KALPHITE_QUEEN_6500),
    KALPHITE_QUEEN_AIRBORNE(NpcID.KALPHITE_QUEEN_965, NpcID.KALPHITE_QUEEN_4304, NpcID.KALPHITE_QUEEN_6501),
    KREE_ARRA(NpcID.KREEARRA, NpcID.KREEARRA_6492),
    WINGMAN_SKREE(NpcID.WINGMAN_SKREE),
    COMMANDER_ZILYANA(NpcID.COMMANDER_ZILYANA, NpcID.COMMANDER_ZILYANA_6493),
    STARLIGHT(NpcID.STARLIGHT),
    GENERAL_GRAARDOR(NpcID.GENERAL_GRAARDOR, NpcID.GENERAL_GRAARDOR_6494),
    KRIL_TSUTSAROTH(NpcID.KRIL_TSUTSAROTH, NpcID.KRIL_TSUTSAROTH_6495),
    SNAKELING(NpcID.SNAKELING),
    PHANTOM_MUSPAH(NpcID.PHANTOM_MUSPAH, NpcID.PHANTOM_MUSPAH_12078, NpcID.PHANTOM_MUSPAH_12079, NpcID.PHANTOM_MUSPAH_12080),
    CORPOREAL_BEAST(NpcID.CORPOREAL_BEAST),
    NEX(NpcID.NEX, NpcID.NEX_11279, NpcID.NEX_11280, NpcID.NEX_11281, NpcID.NEX_11282),
    UMBRA(NpcID.UMBRA),
    CRUOR(NpcID.CRUOR),
    GLACIES(NpcID.GLACIES),
    DUKE_SUCELLUS(NpcID.DUKE_SUCELLUS_12191),
    VARDORVIS(NpcID.VARDORVIS),
    LEVIATHAN(NpcID.THE_LEVIATHAN),

    //Slayer tasks (Krystilia, Duradel, Nieve, Konar) and related Npcs
    BANDIT_130(NpcID.BANDIT_6605),
    BLACK_DRAGON(NpcID.BLACK_DRAGON, NpcID.BLACK_DRAGON_253, NpcID.BLACK_DRAGON_254, NpcID.BLACK_DRAGON_255, NpcID.BLACK_DRAGON_256, NpcID.BLACK_DRAGON_257, NpcID.BLACK_DRAGON_258, NpcID.BLACK_DRAGON_259, NpcID.BLACK_DRAGON_8084, NpcID.BLACK_DRAGON_8085, NpcID.BLACK_DRAGON_7861, NpcID.BLACK_DRAGON_7862, NpcID.BLACK_DRAGON_7863),
    BRUTAL_BLACK_DRAGON(NpcID.BRUTAL_BLACK_DRAGON, NpcID.BRUTAL_BLACK_DRAGON_8092, NpcID.BRUTAL_BLACK_DRAGON_8093),
    DARK_WARRIOR_145(NpcID.DARK_WARRIOR_6606),
    ENT_WILDERNESS(NpcID.ENT),
    ENT_WC_GUILD(NpcID.ENT_7234),
    FIRE_GIANT_104_109(NpcID.FIRE_GIANT_7252, NpcID.FIRE_GIANT_7251),
    BRUTAL_GREEN_DRAGON(NpcID.BRUTAL_GREEN_DRAGON),
    LAVA_DRAGON(NpcID.LAVA_DRAGON),
    MOSS_GIANT_84(NpcID.MOSS_GIANT_8736),
    GREATER_NECHRYAEL(NpcID.GREATER_NECHRYAEL, NpcID.GREATER_NECHRYAEL_11240),
    REVENANT_HOBGOBLIN(NpcID.REVENANT_HOBGOBLIN),
    REVENANT_CYCLOPS(NpcID.REVENANT_CYCLOPS),
    REVENANT_HELLHOUND(NpcID.REVENANT_HELLHOUND),
    REVENANT_DEMON(NpcID.REVENANT_DEMON),
    REVENANT_ORK(NpcID.REVENANT_ORK),
    REVENANT_DARK_BEAST(NpcID.REVENANT_DARK_BEAST),
    REVENANT_KNIGHT(NpcID.REVENANT_KNIGHT),
    REVENANT_DRAGON(NpcID.REVENANT_DRAGON),
    REVENANT_MALEDICTUS(NpcID.REVENANT_MALEDICTUS),
    SPIRITUAL_WARRIOR_BANDOS(NpcID.SPIRITUAL_WARRIOR_2243),
    DEVIANT_SPECTRE(NpcID.DEVIANT_SPECTRE),
    ADAMANT_DRAGON(NpcID.ADAMANT_DRAGON, NpcID.ADAMANT_DRAGON_8090),
    DEMONIC_GORILLA(NpcID.DEMONIC_GORILLA, NpcID.DEMONIC_GORILLA_7145, NpcID.DEMONIC_GORILLA_7146, NpcID.DEMONIC_GORILLA_7147, NpcID.DEMONIC_GORILLA_7148, NpcID.DEMONIC_GORILLA_7149, NpcID.DEMONIC_GORILLA_7152),
    TORTURED_GORILLA(NpcID.TORTURED_GORILLA, NpcID.TORTURED_GORILLA_7096, NpcID.TORTURED_GORILLA_7097, NpcID.TORTURED_GORILLA_7150, NpcID.TORTURED_GORILLA_7151, NpcID.TORTURED_GORILLA_7153),
    BLUE_DRAGON(NpcID.BLUE_DRAGON, NpcID.BLUE_DRAGON_266, NpcID.BLUE_DRAGON_267, NpcID.BLUE_DRAGON_268, NpcID.BLUE_DRAGON_269, NpcID.BLUE_DRAGON_5878, NpcID.BLUE_DRAGON_5879, NpcID.BLUE_DRAGON_5880, NpcID.BLUE_DRAGON_5881, NpcID.BLUE_DRAGON_5882),
    BRUTAL_BLUE_DRAGON(NpcID.BRUTAL_BLUE_DRAGON),
    DARK_BEAST(NpcID.DARK_BEAST, NpcID.DARK_BEAST_7250),
    DRAKE(NpcID.DRAKE_8612, NpcID.DRAKE_8613),
    ELVES(NpcID.IORWERTH_WARRIOR, NpcID.IORWERTH_WARRIOR_8759, NpcID.IORWERTH_WARRIOR_9502, NpcID.IORWERTH_WARRIOR_9503,
            NpcID.ELF_WARRIOR, NpcID.ELF_WARRIOR_5294,
            NpcID.MOURNER_9017,
            NpcID.GUARD_9182, NpcID.GUARD_9183, NpcID.GUARD_9184, NpcID.GUARD_9185, NpcID.GUARD_9186, NpcID.GUARD_9187, NpcID.GUARD_9188, NpcID.GUARD_9189, NpcID.GUARD_9190, NpcID.GUARD_9191),
    SPITTING_WYVERN(NpcID.SPITTING_WYVERN),
    TALONED_WYVERN(NpcID.TALONED_WYVERN),
    LONGTAILED_WYVERN(NpcID.LONGTAILED_WYVERN),
    ANCIENT_WYVERN(NpcID.ANCIENT_WYVERN),
    IRON_DRAGON(NpcID.IRON_DRAGON, NpcID.IRON_DRAGON_273, NpcID.IRON_DRAGON_8080, NpcID.IRON_DRAGON_7254),
    LIZARDMAN_SHAMAN_OVERWORLD(NpcID.LIZARDMAN_SHAMAN, NpcID.LIZARDMAN_SHAMAN_6767, NpcID.LIZARDMAN_SHAMAN_7744, NpcID.LIZARDMAN_SHAMAN_7745, NpcID.LIZARDMAN_SHAMAN_8565),
    MITHRIL_DRAGON(NpcID.MITHRIL_DRAGON, NpcID.MITHRIL_DRAGON_8088, NpcID.MITHRIL_DRAGON_8089),
    RED_DRAGON(NpcID.RED_DRAGON, NpcID.RED_DRAGON_248, NpcID.RED_DRAGON_8075, NpcID.RED_DRAGON_8078, NpcID.RED_DRAGON_8079, NpcID.RED_DRAGON_249, NpcID.RED_DRAGON_250, NpcID.RED_DRAGON_251),
    BRUTAL_RED_DRAGON(NpcID.BRUTAL_RED_DRAGON, NpcID.BRUTAL_RED_DRAGON_8087),
    RUNE_DRAGON(NpcID.RUNE_DRAGON_8031, NpcID.RUNE_DRAGON_8091),
    SKELETAL_WYVERN(NpcID.SKELETAL_WYVERN, NpcID.SKELETAL_WYVERN_466, NpcID.SKELETAL_WYVERN_467, NpcID.SKELETAL_WYVERN_468),
    STEEL_DRAGON(NpcID.STEEL_DRAGON_274, NpcID.STEEL_DRAGON_275, NpcID.STEEL_DRAGON_7255),
    SUQAH(NpcID.SUQAH, NpcID.SUQAH_788, NpcID.SUQAH_789, NpcID.SUQAH_790, NpcID.SUQAH_791, NpcID.SUQAH_792, NpcID.SUQAH_793),
    BRONZE_DRAGON(NpcID.BRONZE_DRAGON,NpcID.BRONZE_DRAGON_271, NpcID.BRONZE_DRAGON_7253),
    ICE_TROLLS(NpcID.ICE_TROLL_RUNT, NpcID.FRENZIED_ICE_TROLL_RUNT, NpcID.ICE_TROLL_RUNT_5828,
            NpcID.ICE_TROLL_MALE, NpcID.FRENZIED_ICE_TROLL_MALE, NpcID.ICE_TROLL_MALE_5829,
            NpcID.ICE_TROLL_FEMALE, NpcID.FRENZIED_ICE_TROLL_FEMALE, NpcID.ICE_TROLL_FEMALE_5830,
            NpcID.ICE_TROLL_GRUNT, NpcID.ICE_TROLL_GRUNT_5831, NpcID.FRENZIED_ICE_TROLL_GRUNT),
    TROLL_GENERAL(NpcID.TROLL_GENERAL, NpcID.TROLL_GENERAL_4121, NpcID.TROLL_GENERAL_4122),
    WYRM(NpcID.WYRM, NpcID.WYRM_8611),
    LOCUST_RIDER(NpcID.LOCUST_RIDER, NpcID.LOCUST_RIDER_796),
    SCARAB_MAGE(NpcID.SCARAB_MAGE),
    HYDRA(NpcID.HYDRA),

    //Superior Slayer monsters
    REPUGNANT_SPECTRE(NpcID.REPUGNANT_SPECTRE),
    BASILISK_SENTINEL(NpcID.BASILISK_SENTINEL),
    KING_KURASK(NpcID.KING_KURASK),
    MARBLE_GARGOYLE(NpcID.MARBLE_GARGOYLE, NpcID.MARBLE_GARGOYLE_7408),
    NECHRYARCH(NpcID.NECHRYARCH),
    GREATER_ABYSSAL_DEMON(NpcID.GREATER_ABYSSAL_DEMON),
    NIGHT_BEAST(NpcID.NIGHT_BEAST),

    //NMZ
    CORRUPT_LIZARDMAN_NMZ(NpcID.CORRUPT_LIZARDMAN_HARD),
    ELVARG_NMZ(NpcID.ELVARG_HARD),
    MOSS_GUARDIAN_NMZ(NpcID.MOSS_GUARDIAN_6386),
    MOSS_GUARDIAN_HARD_NMZ(NpcID.MOSS_GUARDIAN_HARD),
    SLAGILITH_NMZ(NpcID.SLAGILITH, NpcID.SLAGILITH_1364,NpcID.SLAGILITH_6385),
    SLAGILITH_HARD_NMZ(NpcID.SLAGILITH_HARD),
    DAGANNOTH_MOTHER_NMZ(NpcID.DAGANNOTH_MOTHER, NpcID.DAGANNOTH_MOTHER_981, NpcID.DAGANNOTH_MOTHER_982, NpcID.DAGANNOTH_MOTHER_983, NpcID.DAGANNOTH_MOTHER_984, NpcID.DAGANNOTH_MOTHER_985, NpcID.DAGANNOTH_MOTHER_986, NpcID.DAGANNOTH_MOTHER_987, NpcID.DAGANNOTH_MOTHER_988, NpcID.DAGANNOTH_MOTHER_6361, NpcID.DAGANNOTH_MOTHER_6362, NpcID.DAGANNOTH_MOTHER_6363, NpcID.DAGANNOTH_MOTHER_6364, NpcID.DAGANNOTH_MOTHER_6365, NpcID.DAGANNOTH_MOTHER_6366),
    DAGANNOTH_MOTHER_HARD_NMZ(NpcID.DAGANNOTH_MOTHER_HARD, NpcID.DAGANNOTH_MOTHER_HARD_6301, NpcID.DAGANNOTH_MOTHER_HARD_6302, NpcID.DAGANNOTH_MOTHER_HARD_6303, NpcID.DAGANNOTH_MOTHER_HARD_6304, NpcID.DAGANNOTH_MOTHER_HARD_6305),
    DAD_NMZ(NpcID.DAD, NpcID.DAD_6391),
    DAD_HARD_NMZ(NpcID.DAD_HARD),
    ARRG_NMZ(NpcID.ARRG_6392),
    ARRG_HARD_NMZ(NpcID.ARRG_HARD),
    BLACK_KNIGHT_TITAN_NMZ(NpcID.BLACK_KNIGHT_TITAN_6360),
    BLACK_KNIGHT_TITAN_HARD_NMZ(NpcID.BLACK_KNIGHT_TITAN_HARD),
    ICE_TROLL_KING_NMZ(NpcID.ICE_TROLL_KING, NpcID.ICE_TROLL_KING_6356),
    ICE_TROLL_KING_HARD_NMZ(NpcID.ICE_TROLL_KING_HARD),
    GLOD_NMZ(NpcID.GLOD, NpcID.GLOD_6358),
    GLOD_HARD_NMZ(NpcID.GLOD_HARD),
    EVIL_CHICKEN_NMZ(NpcID.EVIL_CHICKEN, NpcID.EVIL_CHICKEN_6367, NpcID.EVIL_CHICKEN_HARD),
    AGRITHNANA_NMZ(NpcID.AGRITHNANA_6369),
    AGRITHNANA_HARD_NMZ(NpcID.AGRITHNANA_HARD),
    FLAMBEED_NMZ(NpcID.FLAMBEED, NpcID.FLAMBEED_6370),
    FLAMBEED_HARD_NMZ(NpcID.FLAMBEED_HARD),
    KARAMEL_NMZ(NpcID.KARAMEL, NpcID.KARAMEL_6371, NpcID.KARAMEL_HARD),
    DESSOURT_NMZ(NpcID.DESSOURT, NpcID.DESSOURT_6372),
    DESSOURT_HARD_NMZ(NpcID.DESSOURT_HARD),
    GELATINNOTH_MOTHER_NMZ(NpcID.GELATINNOTH_MOTHER, NpcID.GELATINNOTH_MOTHER_4885, NpcID.GELATINNOTH_MOTHER_4886, NpcID.GELATINNOTH_MOTHER_4887, NpcID.GELATINNOTH_MOTHER_4888, NpcID.GELATINNOTH_MOTHER_4889, NpcID.GELATINNOTH_MOTHER_6373, NpcID.GELATINNOTH_MOTHER_6374, NpcID.GELATINNOTH_MOTHER_6375, NpcID.GELATINNOTH_MOTHER_6376, NpcID.GELATINNOTH_MOTHER_6377, NpcID.GELATINNOTH_MOTHER_6378),
    GELATINNOTH_MOTHER_HARD_NMZ(NpcID.GELATINNOTH_MOTHER_HARD, NpcID.GELATINNOTH_MOTHER_HARD_6313, NpcID.GELATINNOTH_MOTHER_HARD_6314, NpcID.GELATINNOTH_MOTHER_HARD_6315, NpcID.GELATINNOTH_MOTHER_HARD_6316, NpcID.GELATINNOTH_MOTHER_HARD_6317),
    CHRONOZON_NMZ(NpcID.CHRONOZON, NpcID.CHRONOZON_6354, NpcID.CHRONOZON_HARD),
    DESSOUS_NMZ(NpcID.DESSOUS, NpcID.DESSOUS_3460, NpcID.DESSOUS_6344),
    DESSOUS_HARD_NMZ(NpcID.DESSOUS_HARD),
    DAMIS_FIRST_NMZ(NpcID.DAMIS, NpcID.DAMIS_6346),
    DAMIS_SECOND_NMZ(NpcID.DAMIS_683, NpcID.DAMIS_6347),
    DAMIS_FIRST_HARD_NMZ(NpcID.DAMIS_HARD),
    DAMIS_SECOND_HARD_NMZ(NpcID.DAMIS_HARD_1135),
    FAREED_NMZ(NpcID.FAREED, NpcID.FAREED_6348),
    FAREED_HARD_NMZ(NpcID.FAREED_HARD),
    KAMIL_NMZ(NpcID.KAMIL, NpcID.KAMIL_6345),
    KAMIL_HARD_NMZ(NpcID.KAMIL_HARD),
    BARRELCHEST_NMZ(NpcID.BARRELCHEST, NpcID.BARRELCHEST_6342),
    BARRELCHEST_HARD_NMZ(NpcID.BARRELCHEST_HARD),
    GIANT_SCARAB_NMZ(NpcID.GIANT_SCARAB, NpcID.GIANT_SCARAB_798, NpcID.GIANT_SCARAB_6343),
    GIANT_SCARAB_HARD_NMZ(NpcID.GIANT_SCARAB_HARD),
    JUNGLE_DEMON_NMZ(NpcID.JUNGLE_DEMON, NpcID.JUNGLE_DEMON_6382),
    JUNGLE_DEMON_HARD_NMZ(NpcID.JUNGLE_DEMON_HARD),
    ARIANWYN_NMZ(NpcID.ARIANWYN_8865, NpcID.ARIANWYN_9248, NpcID.ARIANWYN_HARD),
    ESSYLLT_NMZ(NpcID.ESSYLLT_8847, NpcID.ESSYLLT_8871, NpcID.ESSYLLT_8872, NpcID.ESSYLLT_8950, NpcID.ESSYLLT_9016),
    ESSYLLT_HARD_NMZ(NpcID.ESSYLLT_HARD, NpcID.ESSYLLT_9249),

    //Waterbirth npcs
    DAGANNOTH_WATERBIRTH_MELEE(NpcID.DAGANNOTH_3185, NpcID.DAGANNOTH_5943),
    GIANT_ROCK_CRAB(NpcID.GIANT_ROCK_CRAB, NpcID.GIANT_ROCK_CRAB_5940),
    WALLASALKI(NpcID.WALLASALKI, NpcID.WALLASALKI_5939),
    ROCK_LOBSTER(NpcID.ROCK_LOBSTER),

    //MA2 bosses and CA bosses
    JUSTICIAR_ZACHARIAH(NpcID.JUSTICIAR_ZACHARIAH, NpcID.JUSTICIAR_ZACHARIAH_7858),
    DERWEN(NpcID.DERWEN, NpcID.DERWEN_7859),
    PORAZDIR(NpcID.PORAZDIR, NpcID.PORAZDIR_7860),
    GALVEK(NpcID.GALVEK, NpcID.GALVEK_8095, NpcID.GALVEK_8177, NpcID.GALVEK_8097, NpcID.GALVEK_8096, NpcID.GALVEK_8098, NpcID.GALVEK_8178, NpcID.GALVEK_8179),
    FRAGMENT_OF_SEREN(NpcID.FRAGMENT_OF_SEREN, NpcID.FRAGMENT_OF_SEREN_8918, NpcID.FRAGMENT_OF_SEREN_8919, NpcID.FRAGMENT_OF_SEREN_8920),
    GLOUGH(NpcID.GLOUGH_7101, NpcID.GLOUGH_7102, NpcID.GLOUGH_7103),

    //Monkeys
    MONKEY_GUARD(NpcID.MONKEY_GUARD_5275, NpcID.MONKEY_GUARD_5276),
    MONKEY_SKELETON(NpcID.SKELETON_5237),

    //Clue Npcs
    DOUBLE_AGENT_108(NpcID.DOUBLE_AGENT_1778),
    DOUBLE_AGENT_141(NpcID.DOUBLE_AGENT_7312),
    SARADOMIN_WIZARD(NpcID.SARADOMIN_WIZARD),
    ANCIENT_WIZARD_MELEE(NpcID.ANCIENT_WIZARD_7309),

    //Misc
    UNDEAD_DRUID(NpcID.UNDEAD_DRUID),
    FEROCIOUS_BARBARIAN_SPIRIT(NpcID.FEROCIOUS_BARBARIAN_SPIRIT),

    //CoX
    TEKTON(NpcID.TEKTON, NpcID.TEKTON_7541, NpcID.TEKTON_7542, NpcID.TEKTON_7545),
    TEKTON_ENRAGED(NpcID.TEKTON_ENRAGED, NpcID.TEKTON_ENRAGED_7544),
    ICE_DEMON(NpcID.ICE_DEMON, NpcID.ICE_DEMON_7585),
    LIZARDMAN_SHAMAN(NpcID.LIZARDMAN_SHAMAN, NpcID.LIZARDMAN_SHAMAN_6767, NpcID.LIZARDMAN_SHAMAN_7573, NpcID.LIZARDMAN_SHAMAN_7574, NpcID.LIZARDMAN_SHAMAN_7744, NpcID.LIZARDMAN_SHAMAN_7745, NpcID.LIZARDMAN_SHAMAN_8565),
    VANGUARD_MELEE(NpcID.VANGUARD_7527),
    VANGUARD_RANGED(NpcID.VANGUARD_7528),
    VANGUARD_MAGIC(NpcID.VANGUARD_7529),
    GUARDIAN(NpcID.GUARDIAN, NpcID.GUARDIAN_7570, NpcID.GUARDIAN_7571, NpcID.GUARDIAN_7572),
    VASA_NISTIRIO(NpcID.VASA_NISTIRIO, NpcID.VASA_NISTIRIO_7567),
    VASA_CRYSTALS(NpcID.GLOWING_CRYSTAL),
    SKELETAL_MYSTIC(NpcID.SKELETAL_MYSTIC, NpcID.SKELETAL_MYSTIC_7605, NpcID.SKELETAL_MYSTIC_7606),
    MUTTADILE_SMALL(NpcID.MUTTADILE_7562),
    MUTTADILE_LARGE(NpcID.MUTTADILE_7563),

    //ToB
    PESTILENT_BLOAT(NpcID.PESTILENT_BLOAT, NpcID.PESTILENT_BLOAT_10813, NpcID.PESTILENT_BLOAT_10812),
    NYLOCAS_VASILIAS(NpcID.NYLOCAS_VASILIAS, NpcID.NYLOCAS_VASILIAS_8355, NpcID.NYLOCAS_VASILIAS_8356, NpcID.NYLOCAS_VASILIAS_8357, NpcID.NYLOCAS_VASILIAS_10807, NpcID.NYLOCAS_VASILIAS_10808, NpcID.NYLOCAS_VASILIAS_10809, NpcID.NYLOCAS_VASILIAS_10810, NpcID.NYLOCAS_VASILIAS_10786, NpcID.NYLOCAS_VASILIAS_10787, NpcID.NYLOCAS_VASILIAS_10788, NpcID.NYLOCAS_VASILIAS_10789),
    SOTETSEG(NpcID.SOTETSEG, NpcID.SOTETSEG_8388, NpcID.SOTETSEG_10867, NpcID.SOTETSEG_10868, NpcID.SOTETSEG_10864, NpcID.SOTETSEG_10865),
    VERZIK_VITUR_P1(NpcID.VERZIK_VITUR, NpcID.VERZIK_VITUR_8369, NpcID.VERZIK_VITUR_8370, NpcID.VERZIK_VITUR_10847, NpcID.VERZIK_VITUR_10848, NpcID.VERZIK_VITUR_10830, NpcID.VERZIK_VITUR_10831),
    VERZIK_VITUR_P2(NpcID.VERZIK_VITUR_8371, NpcID.VERZIK_VITUR_8372, NpcID.VERZIK_VITUR_10849, NpcID.VERZIK_VITUR_10850, NpcID.VERZIK_VITUR_10832, NpcID.VERZIK_VITUR_10833),
    VERZIK_VITUR_P3(NpcID.VERZIK_VITUR_8373, NpcID.VERZIK_VITUR_8374, NpcID.VERZIK_VITUR_8375, NpcID.VERZIK_VITUR_10851, NpcID.VERZIK_VITUR_10852, NpcID.VERZIK_VITUR_10853, NpcID.VERZIK_VITUR_10834, NpcID.VERZIK_VITUR_10835, NpcID.VERZIK_VITUR_10836),

    //ToA
    KEPHRI(NpcID.KEPHRI, NpcID.KEPHRI_11720, NpcID.KEPHRI_11721, NpcID.KEPHRI_11722),
    SOLDIER_SCARAB(NpcID.SOLDIER_SCARAB),
    SPITTING_SCARAB(NpcID.SPITTING_SCARAB),
    ARCANE_SCARAB(NpcID.ARCANE_SCARAB),
    AGILE_SCARAB(NpcID.AGILE_SCARAB),
    SCARAB_TOA(NpcID.SCARAB),
    AKKHA(NpcID.AKKHA, NpcID.AKKHA_11790, NpcID.AKKHA_11791, NpcID.AKKHA_11792, NpcID.AKKHA_11793, NpcID.AKKHA_11794, NpcID.AKKHA_11795, NpcID.AKKHA_11796),
    AKKHAS_SHADOW(NpcID.AKKHAS_SHADOW, NpcID.AKKHAS_SHADOW_11798, NpcID.AKKHAS_SHADOW_11799),
    BABA(NpcID.BABA, NpcID.BABA_11779, NpcID.BABA_11780),
    BABOON_TOA(NpcID.BABOON),
    BABOON_BRAWLER_SMALL(NpcID.BABOON_BRAWLER),
    BABOON_BRAWLER_LARGE(NpcID.BABOON_BRAWLER),
    BABOON_THROWER_SMALL(NpcID.BABOON_THROWER),
    BABOON_THROWER_LARGE(NpcID.BABOON_THROWER_11713),
    BABOON_MAGE_SMALL(NpcID.BABOON_MAGE),
    BABOON_MAGE_LARGE(NpcID.BABOON_MAGE_11714),
    BABOON_SHAMAN(NpcID.BABOON_SHAMAN),
    CURSED_BABOON(NpcID.CURSED_BABOON),
    VOLATILE_BABOON(NpcID.VOLATILE_BABOON),
    BABOON_THRALL(NpcID.BABOON_THRALL),
    ZEBAK(NpcID.ZEBAK, NpcID.ZEBAK_11730, NpcID.ZEBAK_11732, NpcID.ZEBAK_11733),
    CROCODILE_TOA(NpcID.CROCODILE_11705),
    OBELISK(NpcID.OBELISK_11751),
    CORE(NpcID.CORE_11771),
    ELIDINIS_WARDEN_P2(NpcID.ELIDINIS_WARDEN_11753, NpcID.ELIDINIS_WARDEN_11754),
    TUMEKENS_WARDEN_P2(NpcID.TUMEKENS_WARDEN_11756, NpcID.TUMEKENS_WARDEN_11757),
    WARDENS_P3(NpcID.ELIDINIS_WARDEN_11761, NpcID.TUMEKENS_WARDEN_11762);




    private final Set<Integer> ids;

    NPCWithXpBoost(Integer... ids)
    {
        this.ids = Sets.newHashSet(ids);
    }

    static NPCWithXpBoost getNpc(int id)
    {
        for (NPCWithXpBoost npc : values())
        {
            if (npc.ids.contains(id))
            {
                return npc;
            }
        }

        return null;
    }
    
}
