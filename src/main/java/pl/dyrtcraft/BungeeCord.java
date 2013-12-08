package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.inventory.Inventory;

/**
 * Zarzadzanie nazwami/adresami serwerow z BungeeCord
 * @author TheMolkaPL
 * @since 1.0
 * @see #getServer(String)
 * @see #getServerAddress(Server)
 * @see #getServerChooserInventory()
 * @see #getServerName(Server)
 */
public interface BungeeCord {
	
	/**
	 * Zdobadz serwer z adresu
	 * Jezeli potrzebujesz serwera ze {@link String}, mozesz pobrac go z adresu w BungeeCord
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * DyrtCraft.getMember("Notch").connect(DyrtCraft.getProxy().getServer("myserver"));
	 * </code>
	 * <br>
	 * Powyzszy kod teleportuje gracza o nicku "Notch" na serwer "myserver".
	 * 
	 * @param address Adres serwera w BungeeCord
	 * @return {@link Server}
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 * @see #getServerAddress(Server)
	 * @see #getServerName(Server)
	 */
	public Server getServer(@Nonnull String address);
	
	/**
	 * Zdobadz adres serwera z {@link Server}
	 * Jezeli potrzebujesz adresu serwera w BungeeCord, mozesz go pobrac z {@link Enum} {@link Server}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.sendMessage(DyrtCraft.getProxy().getServer(Server.LOBBY));
	 * </code>
	 * <br>
	 * Powyzszy kod wysyla do {@link Player} adres serwera
	 * 
	 * @param server {@link Enum} {@link Server} ktory chcesz wybrac
	 * @return Adres serwera
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 * @see #getServer(String)
	 */
	public String getServerAddress(@Nonnull Server server);
	
	/**
	 * Zdobadz {@link Inventory} wyboru serwerów DyrtCraft Network
	 * Jezeli potrzebujesz {@link Inventory} z wyborem serwerow, mozesz go pobrac z {@link #getServerChooserInventory()}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.openInventory(DyrtCraft.getProxy().getServerChooserInventory());
	 * </code>
	 * <br>
	 * Powyzszy kod otwiera {@link Inventory} z wyborem serwerow dla {@link Player}
	 * 
	 * @return Otwarcie {@link Inventory} z wyborem serwerow sieci DyrtCraft Network
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 * @see #getServerName(Server)
	 */
	public Inventory getServerChooserInventory();
	
	/**
	 * Zdobadz nazwe serwera z {@link Server}
	 * Jezeli potrzebujesz nazwy serwera, mozesz go pobrac z {@link Enum} {@link Server}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.sendMessage(DyrtCraft.getProxy().getServerName(Server.LOBBY));
	 * </code>
	 * <br>
	 * Powyzszy kod wysyla do {@link Player} nazwe serwera
	 * 
	 * @param server {@link Enum} {@link Server} ktory chcesz wybrac
	 * @return Nazwa serwera
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see #getServerAddress(Server)
	 * @see #getServerChooserInventory()
	 */
	public String getServerName(@Nonnull Server server);
	
}
