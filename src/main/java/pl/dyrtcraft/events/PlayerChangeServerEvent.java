package pl.dyrtcraft.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import pl.dyrtcraft.DyrtCraft;
import pl.dyrtcraft.Server;

public class PlayerChangeServerEvent extends Event implements Cancellable {

	private static final HandlerList handlers = new HandlerList();
	private boolean cancel;
	private Player player;
	private Server server;
	private String message;
	
	public PlayerChangeServerEvent(Player player, Server server) {
		this.player = player;
		this.server = server;
		this.message = ChatColor.GRAY + "Przelaczanie na serwer " + ChatColor.GOLD + DyrtCraft.getProxy().getServerName(server) + ChatColor.GRAY + "...";
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}
	
	public String getMessage() {
		return message;
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public Server getServer() {
		return server;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setServer(Server server) {
		this.server = server;
	}
	
}
