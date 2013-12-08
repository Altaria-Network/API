package pl.dyrtcraft.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerGetXPEvent extends Event {

	private static final HandlerList handlers = new HandlerList();
	private Player player;
	private String reason;
	private int xp;
	
	public PlayerGetXPEvent(Player player, String reason, int xp) {
		this.player = player;
		this.reason = reason;
		this.xp = xp;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public String getReason() {
		return reason;
	}
	
	public int getAmount() {
		return xp;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
	
	public void setAmount(int xp) {
		this.xp = xp;
	}
	
}
