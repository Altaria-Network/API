package pl.dyrtcraft;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

/**
 * Zarzadzanie {@link ItemStack} z roznymi mozliwosciami na serwerach
 * @author TheMolkaPL
 * @since 1.0
 * @see #getLobbyItem()
 * @see #getServerChooserItem()
 */
public interface Kits {
	
	/**
	 * Zdobadz {@link ItemStack} z kompasem do teleportacji na inne serwery DyrtCraft Network
	 * Jezeli potrzebujesz wyswietlic {@link Inventory} z wyborem serwera z sieci DyrtCraft Network, mozesz otworzyc go poprzez ten {@link ItemStack}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.getInventory().setItem(0, DyrtCraft.getKits().getServerChooserItem());
	 * </code>
	 * <br>
	 * Powyzszy kod ustawia {@link ItemStack} dla {@link Player} w jego {@link Inventory} w slocie o ID 0
	 * 
	 * @return {@link ItemStack} Kompas z wyborem serwerow
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 * @see #getLobbyItem()
	 */
	public ItemStack getServerChooserItem();
	
	/**
	 * Zdobadz {@link ItemStack} z okiem enderu do teleportacji na serwer Lobby
	 * Jezeli potrzebujesz wyslac {@link Player} na serwer Lobby, mozesz dac mu do {@link Inventory} ten {@link ItemStack}
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * Player.getInventory().setItem(8, DyrtCraft.getKits().getLobbyItem());
	 * </code>
	 * <br>
	 * Powyzszy kod ustawia {@link ItemStack} dla {@link Player} w jego {@link Inventory} w slocie o ID 8
	 * 
	 * @return {@link ItemStack} Oko enderu do teleportacji na serwer Lobby
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 * @see #getServerChooserItem()
	 */
	public ItemStack getLobbyItem();
	
}
