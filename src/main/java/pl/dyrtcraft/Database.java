package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

public interface Database {
	
	public void createNew(@Nonnull Player player);
	
	public void createNew(@Nonnull String name);
	
}
