package es.kikisito.edoras.EdorasModsWL;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin implements Listener {

    public static String prefix = ChatColor.WHITE + "[" + ChatColor.DARK_AQUA + "Edoras" + ChatColor.WHITE + "] ";
    public static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;
        this.getProxy().getPluginManager().registerListener(this, new PostLogin());
    }

}