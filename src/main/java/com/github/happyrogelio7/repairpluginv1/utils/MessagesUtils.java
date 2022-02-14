package com.github.happyrogelio7.repairpluginv1.utils;

import net.md_5.bungee.api.ChatColor;

public class MessagesUtils {
    public static String getMsgColor(String text) {
        return ChatColor.translateAlternateColorCodes('&', text);
    }
}
