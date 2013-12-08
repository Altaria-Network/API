package pl.dyrtcraft;

import java.io.Console;

import javax.annotation.Nonnull;

import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.ServerOperator;

import pl.dyrtcraft.xp.DyrtCraftXP;

/**
 * Metody ktore nie pasuja do zadnych innych {@link Class} w API {@link DyrtCraftXP}
 * @author TheMolkaPL
 * @since 1.0
 * @see #sendNotify(String, boolean)
 */
public interface Util {
	
	/**
	 * Wyslij powiadomienie do {@link ServerOperator} oraz {@link Permission} "dyrtcraftxp.notify"
	 * Jezeli potrzebujesz wyslac jakies powiadomienie do {@link ServerOperator}, uzyj tej metody
	 * <br>
	 * <b>Przyklad:</b>
	 * <br>
	 * <code>
	 * DyrtCraft.getUtils().sendNotify(Player.getName() + " used your command", false);
	 * </code>
	 * <br>
	 * Powyzszy kod wysyla do {@link ServerOperator} oraz {@link Permission} "dyrtcraftxp.notify" powiadomienie o uzytej Twojej komendzie przez {@link Player}
	 * 
	 * @author TheMolkaPL
	 * @since 1.0
	 * @param message {@link String} Tresc powiadomienia (nie zalecane uzywanie na koncu kropek, wykrzyknikow, itd.)
	 * @param priority {@link Boolean} Priorytet tego powiadomienia. <code>true</code> ustawia wysoki priorytet Twojego powiadomienia, oraz zostaje ono wyslana z czerwonym kolorem.
	 * <code>false</code> Ustawia normalny priorytet Twojego powiadomienia, oraz zostaje ono wyslane o normalnym kolorze oraz logu do {@link Console}.
	 * @see Member
	 */
	public void sendNotify(@Nonnull String message, @Nonnull boolean priority);
	
}
