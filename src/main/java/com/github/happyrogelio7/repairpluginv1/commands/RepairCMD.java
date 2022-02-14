package com.github.happyrogelio7.repairpluginv1.commands;

import com.github.happyrogelio7.repairpluginv1.RepairPluginV1;
import com.github.happyrogelio7.repairpluginv1.utils.EventsUtils;
import com.github.happyrogelio7.repairpluginv1.utils.MessagesUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class RepairCMD implements CommandExecutor {

    private RepairPluginV1 plugin;

    public RepairCMD(RepairPluginV1 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)){
            Bukkit.getConsoleSender().sendMessage(MessagesUtils.getMsgColor("&cThis command can only be executed by a player."));
            return true;
        }else{

            Player p = (Player) sender;

            if (args.length == 0){
                p.sendMessage(MessagesUtils.getMsgColor("&r "));
                p.sendMessage(MessagesUtils.getMsgColor("&a RepairPluginV1 &7| &3Help:"));
                p.sendMessage(MessagesUtils.getMsgColor("&r "));
                p.sendMessage(MessagesUtils.getMsgColor("&7  <> Required &7&l|&r&7 [] Optional"));
                p.sendMessage(MessagesUtils.getMsgColor("&r "));
                p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair help"));
                p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair info"));
                p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair all"));
                p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair hand"));
                p.sendMessage(MessagesUtils.getMsgColor("&f * &a/fix all"));
                p.sendMessage(MessagesUtils.getMsgColor("&f * &a/fix hand"));
                p.sendMessage(MessagesUtils.getMsgColor("&r "));
                return true;
            }

            if (args.length > 1){

                if (args[0].equalsIgnoreCase("help")){

                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    p.sendMessage(MessagesUtils.getMsgColor("&a RepairPluginV1 &7| &3Help:"));
                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    p.sendMessage(MessagesUtils.getMsgColor("&7  <> Required &7&l|&r&7 [] Optional"));
                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair help"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair info"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair all"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &a/repair hand"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &a/fix all"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &a/fix hand"));
                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    return true;

                } else if (args[0].equalsIgnoreCase("info")){
                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    p.sendMessage(MessagesUtils.getMsgColor("&a RepairPluginV1 &7| &3Help:"));
                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &9version: &f"+plugin.version));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &aCreated: &fHappyRogelio7"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &dGitHub: &fhttps://github.com/HappyRogelio7"));
                    p.sendMessage(MessagesUtils.getMsgColor("&f * &6Website: &fhttps://happyrogelio7.github.io/en/index.html"));
                    p.sendMessage(MessagesUtils.getMsgColor("&r "));
                    return true;

                } else if (args[0].equalsIgnoreCase("all")){

                    if (p.hasPermission("repairpluginv1.fix.all")){
                        p.sendMessage(MessagesUtils.getMsgColor("&cNo Permission."));
                        return true;
                    }

                    EventsUtils.repair(p);
                    ItemStack[] arrayOfItemStack;
                    int localItemStack1 = (arrayOfItemStack = p
                            .getInventory().getArmorContents()).length;
                    for (int ix = 0; ix < localItemStack1; ix++) {
                        ItemStack i = arrayOfItemStack[ix];
                        EventsUtils.repair(i);
                    }

                    p.sendMessage(MessagesUtils.getMsgColor("&8[&aRepair&8]&r &aAll your items have been repaired."));
                    return true;
                } else if (args[0].equalsIgnoreCase("hand")){

                    if (p.hasPermission("repairpluginv1.fix.hand")){
                        p.sendMessage(MessagesUtils.getMsgColor("&cNo Permission."));
                        return true;
                    }

                    p.getItemInHand().setDurability((short)0);

                    p.sendMessage(MessagesUtils.getMsgColor("&8[&aRepair&8]&r &aYour items have been repaired."));
                    return true;
                }


            }

        }
        return true;
    }
}
