package com.github.happyrogelio7.repairpluginv1;

import com.github.happyrogelio7.repairpluginv1.commands.RepairCMD;
import com.github.happyrogelio7.repairpluginv1.utils.MessagesUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public final class RepairPluginV1 extends JavaPlugin {


    PluginDescriptionFile pdffile = getDescription();

    public String version = this.pdffile.getVersion();

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a================================="));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a ON RepairPluginV1"));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a Version: &f" + this.version));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a Version Server:&f " + Bukkit.getVersion()));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a Created BY: &fHappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a GitHub: &fhttps://github.com/HappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a================================="));
        registercommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&c================================="));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&c OFF RepairPluginV1"));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&c Version: &f" + this.version));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&c Version Server:&f " + Bukkit.getVersion()));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&r "));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&c Created BY: &fHappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&c GitHub: &fhttps://github.com/HappyRogelio7"));
        Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&a================================="));
    }

    public void registercommands() {
        getCommand("repair").setExecutor((CommandExecutor)new RepairCMD(this));
    }
}
