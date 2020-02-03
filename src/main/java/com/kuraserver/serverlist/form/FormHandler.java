package com.kuraserver.serverlist.form;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import com.kuraserver.serverlist.Core;

public class FormHandler implements Listener {

    public static void init(Core plugin){
        plugin.getServer().getPluginManager().registerEvents(new FormHandler(), plugin);
    }

    @EventHandler
    public void onFormResponse(PlayerFormRespondedEvent event){
        if(event.getWindow() instanceof FormInterface){
            if(event.getResponse() != null) {
                ((FormInterface) event.getWindow()).handleResponse(event.getPlayer(), event.getResponse());
            }
        }
    }

}
