package com.github.happyrogelio7.repairpluginv1.utils;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class EventsUtils {

    public static boolean itemCheck(ItemStack w) {
        if (w.getType().getId() == 256 || w.getType().getId() == 257 ||
                w.getType().getId() == 258 || w.getType().getId() == 259 ||
                w.getType().getId() == 261 || w.getType().getId() == 267 ||
                w.getType().getId() == 268 || w.getType().getId() == 269 ||
                w.getType().getId() == 270 || w.getType().getId() == 271 ||
                w.getType().getId() == 272 || w.getType().getId() == 273 ||
                w.getType().getId() == 274 || w.getType().getId() == 275 ||
                w.getType().getId() == 276 || w.getType().getId() == 277 ||
                w.getType().getId() == 278 || w.getType().getId() == 279 ||
                w.getType().getId() == 283 || w.getType().getId() == 284 ||
                w.getType().getId() == 285 || w.getType().getId() == 286 ||
                w.getType().getId() == 290 || w.getType().getId() == 291 ||
                w.getType().getId() == 292 || w.getType().getId() == 293 ||
                w.getType().getId() == 294 || w.getType().getId() == 298 ||
                w.getType().getId() == 299 || w.getType().getId() == 300 ||
                w.getType().getId() == 301 || w.getType().getId() == 302 ||
                w.getType().getId() == 303 || w.getType().getId() == 304 ||
                w.getType().getId() == 305 || w.getType().getId() == 306 ||
                w.getType().getId() == 307 || w.getType().getId() == 308 ||
                w.getType().getId() == 309 || w.getType().getId() == 310 ||
                w.getType().getId() == 311 || w.getType().getId() == 312 ||
                w.getType().getId() == 313 || w.getType().getId() == 314 ||
                w.getType().getId() == 315 || w.getType().getId() == 316 ||
                w.getType().getId() == 317 || w.getType().getId() == 346 ||
                w.getType().getId() == 359)
            return true;
        return false;
    }

    public static void repair(Player p) {
        for (int i = 0; i <= 36; i++) {
            try {
                ItemStack w = p.getInventory().getItem(i);
                if (itemCheck(w))
                    p.getInventory().getItem(i).setDurability((short)0);
            } catch (Exception exception) {}
        }
    }


    public static void repair(ItemStack i) {
        try {
            if (itemCheck(i))
                i.setDurability((short)0);
        } catch (Exception exception) {}
    }
}
