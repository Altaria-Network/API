package pl.dyrtcraft;

import java.text.SimpleDateFormat;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

import pl.dyrtcraft.xp.DyrtCraftXP;

/**
 * Zarzadzanie {@link Player} w API {@link DyrtCraftXP}
 * @author confuser
 * @author TheMolkaPL
 * @since 1.0
 * @see #addXp(int, String)
 * @see #connect(Server)
 * @see #delXp(int, String)
 * @see #getDeads()
 * @see #getKills()
 * @see #getLastLogoutTime()
 * @see #getLastServer()
 * @see #getXp()
 * @see #hasDragonBar()
 * @see #removeDragon()
 * @see #setDeads(int)
 * @see #setDragonLevel(float)
 * @see #setDragonMessage(String)
 * @see #setDragonMessage(String, float)
 * @see #setDragonMessage(String, int)
 * @see #setKills(int)
 * @see #setLastLogoutTime(SimpleDateFormat)
 * @see #setLastServer(Server)
 * @see #showXp()
 */
public interface Member {
	
	/**
	 * Dodaj punkty XP dla {@link Member}
	 * Jezeli chcesz dodac punkty XP dla {@link Member}, uzyj tej metody
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * DyrtCraft.getMember("Notch").addXp(10, "You have now " + DyrtCraft.getMember("Notch").getXp() + 10 + " XP");
	 * </code>
	 * <br>
	 * Powyzszy kod dodaje {@link Player} o nicku "Notch" 10 punktow XP z powodem "You have now Y XP"
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @param amount {@link Integer} Ilosc punktow XP do dodania
	 * @param reason {@link String} Powod dodania punktow XP (nie zalecane uzywanie na koncu kropek, wykrzyknikow, itd.)
	 * @see #delXp(int, String)
	 * @see #getXp()
	 * @see #showXp()
	 */
	public void addXp(@Nonnull int amount, @Nonnull String reason);
	
	/**
	 * Laczy {@link Member} na inny serwer z {@link Enum} {@link Server}
	 * Jezeli chcesz polaczyc {@link Member} z innym serwerem, uzyj tej metody
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * DyrtCraft.getMember("Notch").connect(Server.LOBBY);
	 * </code>
	 * <br>
	 * Powyzszy kod laczy {@link Player} o nicku "Notch" na serwer "LOBBY"
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @param server {@link Server} Serwer z ktorym chcesz polaczyc {@link Member}
	 * @see BungeeCord#getServer(String)
	 * @see BungeeCord#getServerAddress(Server)
	 * @see BungeeCord#getServerChooserInventory()
	 * @see BungeeCord#getServerName(Server)
	 */
	public void connect(@Nonnull Server server);
	
	/**
	 * Usun punkty XP dla {@link Member}
	 * Jezeli chcesz usunac punkty XP graczowi, uzyj tej metody
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * DyrtCraft.getMember("Notch").delXp(10, "You have now " + DyrtCraft.getMember("Notch").getXp() - 10 + " XP")
	 * </code>
	 * <br>
	 * Powyzszy kod usuwa {@link Player} o nicku "Notch" 10 punktow XP z powodem "You have now Y XP"
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @param amount {@link Integer} Ilosc punktow XP do usuniecia
	 * @param reason {@link String} Powod dodania punktow XP (nie zalecane uzywanie na koncu kropek, wykrzyknikow, itd.)
	 * @return <code>true</code> Jezeli operacja sie udala.
	 * <code>false</code> Jezeli wystapil blad z baza danych lub/i gracz nie posiada wystarczajacej ilosci punktow XP.
	 * @see #addXp(int, String)
	 * @see #getXp()
	 * @see #showXp()
	 */
	public boolean delXp(@Nonnull int amount, @Nonnull String reason);
	
	@Deprecated
	public int getDeads();
	
	@Deprecated
	public int getKills();
	
	@Deprecated
	public SimpleDateFormat getLastLogoutTime();
	
	/**
	 * Zdobadz {@link Server} gracza {@link Member}
	 * Jezeli chcesz pobrac typ serwera na ktorym znajduje sie obecnie/znajdywal sie {@link Member}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.sendMessage("Notch" + " was on " + DyrtCraft.getProxy().getServerName(DyrtCraft.getMember("Notch").getLastServer()) + ".");
	 * </code>
	 * <br>
	 * Powyzszy kod wysyla wiadomosc na chacie do {@link Player} o tresci "Notch was on Server."
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @return {@link Server} Typ serwera na ktorym byl/jest {@link Member}
	 * @see #setLastServer(Server)
	 */
	public Server getLastServer();
	
	/**
	 * Zdobadz ilosc XP gracza {@link Member}
	 * Jezeli chcesz pobrac ilosc punktow gracza XP, uzyj tej metody
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.sendMessage("You have " + DyrtCraft.getMember(Player.getName).getXp() + " XP.");
	 * </code>
	 * <br>
	 * Powyzszy kod wysyla wiadomosc do {@link Player} o tresci "You have Y XP."
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @return {@link Integer} Ilosc punktow XP gracza {@link Member}
	 * @see #addXp(int, String)
	 * @see #delXp(int, String)
	 * @see #showXp()
	 */
	public int getXp();
	
	/**
	 * Sprawdz czy {@link Member} posiada pasek Enderdragona
	 * Jezeli chcesz sprawdzic czy gracz {@link Member} posiada pasek Enderdragon na swoim ekranie, uzyj tej metody!
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * if(DyrtCraft.getMember("Notch").hasDragonBar());
	 * Bukkit.getPlayer("Notch").sendMessage("You have a DragonBar!");
	 * </code>
	 * <br>
	 * Powyzszy kod wysyla do gracza "Notch" wiadomosc "You have DragonBar!"
	 * 
	 * @author confuser
	 * @since 1.0
	 * @return <code>true</code> Jezeli gracz {@link Member} posiada na ekranie DragonBar.
	 * <code>false</code> Jezeli gracz {@link Member} nie posiada na ekranie DragonBar.
	 * @see #removeDragon()
	 * @see #setDragonLevel(float)
	 * @see #setDragonMessage(String)
	 * @see #setDragonMessage(String, float)
	 * @see #setDragonMessage(String, int)
	 */
	public boolean hasDragonBar();
	
	/**
	 * Usun DragonBar graczowi {@link Member}
	 * Jezeli chcesz usunac DragonBar graczowi {@link Member}, uzyj tej metody
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * 
	 * </code>
	 * <br>
	 * Powyzszy kod
	 * 
	 * @author confuser
	 * @since 1.0
	 * @see #hasDragonBar()
	 * @see #setDragonLevel(float)
	 * @see #setDragonMessage(String)
	 * @see #setDragonMessage(String, float)
	 * @see #setDragonMessage(String, int)
	 */
	public void removeDragon();
	
	public void setDragonLevel(@Nonnull float percent);
	
	public void setDragonMessage(String message);
	
	public void setDragonMessage(String message, @Nonnull float percent);
	
	public void setDragonMessage(String message, @Nonnull int seconds);
	
	@Deprecated
	public void setDeads(int deads);
	
	@Deprecated
	public void setKills(int kills);
	
	@Deprecated
	public void setLastLogoutTime(@Nonnull SimpleDateFormat time);
	
	/**
	 * Ustaw ostatnio grany {@link Server} przez gracza {@link Member}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * DyrtCraft.getMember(PlayerJoinEvent.getPlayer().getName()).setLastServer("Lobby");
	 * </code>
	 * <br>
	 * Powyzszy kod ustawia aktualny serwer gracza {@link Member} na "Lobby"
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @param server {@link Server} Typ serwera na ktorym znajduje/znajdowal sie {@link Member}
	 * @see #getLastServer()
	 */
	public void setLastServer(@Nonnull Server server);
	
	/**
	 * @author TheMolkaPL
	 * @since 1.0
	 * @return {@link String}
	 * @see #addXp(int, String)
	 * @see #delXp(int, String)
	 * @see #getXp()
	 */
	public String showXp();
	
}
