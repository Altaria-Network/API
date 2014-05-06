package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import pl.dyrtcraft.xp.DyrtBungeeCord;
import pl.dyrtcraft.xp.DyrtCraftXP;
import pl.dyrtcraft.xp.DyrtDatabase;
import pl.dyrtcraft.xp.DyrtKits;
import pl.dyrtcraft.xp.DyrtMember;
import pl.dyrtcraft.xp.DyrtUtils;
import pl.dyrtcraft.xp.portals.DyrtPortalsManager;

public final class DyrtCraft {
	
	/**
	 * Zarzadzanie kontami w bazie danych MySQL
	 * @return {@link Database} Zarzadzanie baza MySQL
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member
	 */
	public static Database getDatabase() {
		return new DyrtDatabase();
	}
	
	/**
	 * Zarzadzanie {@link ItemStack} z roznymi mozliwosciami na serwerach
	 * @return {@link Kits} Zarzadzanie kitami
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member
	 * @see BungeeCord
	 */
	public static Kits getKits() {
		return new DyrtKits();
	}
	
	/**
	 * {@link Member} Zarzadzanie {@link Player} w API {@link DyrtCraftXP}
	 * @author confuser
	 * @author TheMolkaPL
	 * @since 1.0
	 * @param player {@link Player}
	 * @return {@link Member} Zarzadzanie {@link Player}
	 * @see #getMember(String)
	 */
	public static Member getMember(@Nonnull Player player) {
		return new DyrtMember(player);
	}
	
	public static PortalsManager getPortals() {
		return new DyrtPortalsManager();
	}
	
	/**
	 * Zarzadzanie nazwami/adresami serwerow z BungeeCord
	 * @return {@link BungeeCord} Zarzadznie proxy BungeeCord
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 */
	public static BungeeCord getProxy() {
		return new DyrtBungeeCord();
	}
	
	/**
	 * Metody ktore nie pasuja do zadnych innych {@link Class} w API {@link DyrtCraftXP}
	 * @return {@link Util} Metody inne, nie pasujace do innych {@link Class}
	 * @author TheMolkaPL
	 * @since 1.0
	 */
	public static Util getUtils() {
		return new DyrtUtils();
	}
	
}
