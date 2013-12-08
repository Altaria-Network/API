package pl.dyrtcraft;

import java.text.SimpleDateFormat;

import javax.annotation.Nonnull;

public interface Member {
	
	public void addXp(@Nonnull int amount, @Nonnull String reason);
	
	public void connect(@Nonnull Server server);
	
	public boolean delXp(@Nonnull int amount, @Nonnull String reason);
	
	public int getDeads();
	
	public int getKills();
	
	public SimpleDateFormat getLastLogoutTime();
	
	public String getLastServer();
	
	public int getXp();
	
	public boolean hasDragonBar();
	
	public void removeDragon();
	
	public void setDragonLevel(@Nonnull float percent);
	
	public void setDragonMessage(String message);
	
	public void setDragonMessage(String message, @Nonnull float percent);
	
	public void setDragonMessage(String message, @Nonnull int seconds);
	
	public void setDeads(int deads);
	
	public void setKills(int kills);
	
	public void setLastLogoutTime(@Nonnull SimpleDateFormat time);
	
	public void setLastServer(@Nonnull Server server);
	
	public String showXp();
	
}
