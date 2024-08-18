package com.gmail.goosius.siegewar.events;

import com.gmail.goosius.siegewar.objects.Siege;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class SiegeZoneExitEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final Siege siege;

    public SiegeZoneExitEvent(Player player, Siege siege) {
        this.player = player;
        this.siege = siege;
    }

    public Player getPlayer() {
        return player;
    }

    public Siege getSiege() {
        return siege;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }
}
