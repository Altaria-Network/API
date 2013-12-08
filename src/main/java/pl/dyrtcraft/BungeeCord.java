package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.inventory.Inventory;

public interface BungeeCord {
	
	public Server getServer(@Nonnull String address);
	
	public String getServerAddress(@Nonnull Server server);
	
	public Inventory getServerChooserInventory();
	
	public String getServerName(@Nonnull Server server);
	
}
