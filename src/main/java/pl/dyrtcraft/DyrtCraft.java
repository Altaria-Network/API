package pl.dyrtcraft;

import javax.annotation.Nonnull;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import pl.dyrtcraft.xp.DyrtBungeeCord;
import pl.dyrtcraft.xp.DyrtCraftXP;
import pl.dyrtcraft.xp.DyrtDatabase;
import pl.dyrtcraft.xp.DyrtKits;
import pl.dyrtcraft.xp.DyrtMember;
import pl.dyrtcraft.xp.DyrtUtils;

public final class DyrtCraft {
	
	private static DyrtCraftXP plugin = new DyrtCraftXP();
	private static Player memName;
	private static BungeeCord bungeeCord = new DyrtBungeeCord();
	private static Member member = new DyrtMember(memName);
	private static Database database = new DyrtDatabase(plugin);
	private static Kits kits = new DyrtKits();
	private static Util util = new DyrtUtils();
	
	/**
	 * Zarzadzanie kontami w bazie danych MySQL
	 * @return {@link Database} Zarzadzanie baza MySQL
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member
	 */
	public static Database getDatabase() {
		return database;
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
		return kits;
	}
	
	public static Member getMember(@Nonnull Player player) {
		memName = player;
		return member;
	}
	
	public static Member getMember(@Nonnull String name) {
		Player player = Bukkit.getPlayer(name);
		memName = player;
		return member;
	}
	
	/**
	 * Zarzadzanie nazwami/adresami serwerow z BungeeCord
	 * @return {@link BungeeCord} Zarzadznie proxy BungeeCord
	 * @author TheMolkaPL
	 * @since 1.0
	 * @see Member#connect(Server)
	 */
	public static BungeeCord getProxy() {
		return bungeeCord;
	}
	
	public static Util getUtils() {
		return util;
	}
	
}
