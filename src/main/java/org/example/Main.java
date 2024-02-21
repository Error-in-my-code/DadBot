package org.example;

import events.MyListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {

        final String TOKEN = "MTE1MjM2MTI5ODg1MjU5Nzc5MA.Gu8K9I.o8KSS-KP24hjiSFVEIoSvDPkBiJF_ek5xj_pVs";
        JDABuilder jdaBuilder = JDABuilder.createLight(TOKEN, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS);

        jdaBuilder.setActivity(Activity.watching("Thursday Night Football"));

        jdaBuilder.addEventListeners(new MyListener()).build();

    }
}