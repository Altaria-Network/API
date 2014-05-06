package pl.dyrtcraft;

import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.bukkit.Location;
import org.bukkit.World;

public interface PortalsManager {
	
	void create(@Nonnull String id, @Nonnull World world, @Nonnull Location locMax, @Nonnull Location locMin, @Nullable Server destination);
	
	boolean isPortal(@Nonnull Location loc);
	
	boolean isPortal(@Nonnull World world, @Nonnull int x, @Nonnull int y, @Nonnull int z);
	
	Server getDestination(@Nonnull String id);
	
	String getPortal(@Nonnull Location loc);
	
	String getPortal(@Nonnull World world, @Nonnull int x, @Nonnull int y, @Nonnull int z);
	
	List<String> getPortals();
	
	boolean remove(@Nonnull String id);
	
}
