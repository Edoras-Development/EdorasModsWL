package es.kikisito.edoras.EdorasModsWL;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class PostLogin implements Listener {
    @EventHandler
    public void onLogin(final ServerConnectEvent e){
        if(e.getTarget().getName().equals("mods")) {
            if (!e.getPlayer().hasPermission("edoras.mods.access")) {
                e.getPlayer().disconnect(new TextComponent(ChatColor.RED + "No tienes permiso para acceder a Edoras Mods."));
            }
        }
    }
}
