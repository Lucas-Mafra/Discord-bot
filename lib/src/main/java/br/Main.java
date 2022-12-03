package br;

import javax.security.auth.login.LoginException;

//import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

public class Main {

	public static void main(String[] args) throws LoginException, InterruptedException  {
		
		// Capturando o token do bot
		String BOT_TOKEN = System.getenv("BOT_TOKEN");
		
		try {
			// Iniciando o bot
			JDABuilder
				.createDefault(BOT_TOKEN)
				.addEventListeners(new Listener())
				.setActivity(Activity.watching("Meus servos"))
				.build();
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
