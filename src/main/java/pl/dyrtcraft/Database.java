package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;

/**
 * Zarzadzanie kontami w bazie danych MySQL
 * @author TheMolkaPL
 * @since 1.0
 * @see #createNew(Player)
 * @see #createNew(String)
 */
public interface Database {
	
	/**
	 * Stworz nowe konto dla {@link Player} w bazie danych
	 * Jezeli potrzebujesz stworzyc nowe konto w bazie danych, uzyj tej metody!
	 * <br>
	 * <code>
	 * if(!PlayerJoinEvent.getPlayer().hasPlayedBefore());<br>
	 * DyrtCraft.getDatabase().createNew(PlayerJoinEvent.getPlayer());
	 * </code>
	 * <br>
	 * Powyzszy kod tworzy nowe konto w bazie danych, jezeli wbil na serwer jako nowy gracz
	 * 
	 * @param player {@link Player} Gracz ktory ma posiadac nowe konto
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see #createNew(String)
	 * @see Member
	 */
	public void createNew(@Nonnull Player player);
	
	/**
	 * Stworz nowe konto dla gracza w bazie danych
	 * Jezeli potrzebujesz stworzyc nowe konto w bazie danych, uzyj tej metody!
	 * <br>
	 * <code>
	 * if(!PlayerJoinEvent.getPlayer().hasPlayedBefore());<br>
	 * DyrtCraft.getDatabase().createNew(PlayerJoinEvent.getPlayer().getName());
	 * </code>
	 * <br>
	 * Powyzszy kod tworzy nowe konto w bazie danych, jezeli wbil na serwer jako nowy gracz
	 * 
	 * @param player {@link String} Nick gracza ktory ma posiadac nowe konto
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see #createNew(Player)
	 * @see Member
	 */
	public void createNew(@Nonnull String name);
	
}
