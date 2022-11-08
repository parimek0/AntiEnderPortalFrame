package strictmcru.antiendportalframe.antiendportalframe;

import com.destroystokyo.paper.Title;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class EventListener implements Listener {

    @EventHandler
    public void parimekJointoServer(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        Block b = e.getBlock();
        Effect effect = e.ef;
        if(b.getType().equals(Material.END_PORTAL_FRAME)) {
            p.sendMessage(AntiEndPortalFrame.getInstance().getConfig().getString("message.enderportalframeplace"));
            b.setType(Material.END_PORTAL);
        }

    }

}
