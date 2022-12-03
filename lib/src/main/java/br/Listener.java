package br;

import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Listener extends ListenerAdapter {
	
	@Override
	public void onReady(ReadyEvent event) {
		System.out.printf("%#s está conectado!", event.getJDA().getSelfUser());
	}
}
