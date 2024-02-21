package org.example;

import events.MyListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
// for reading the secret; take it out if you don't use it or something idc
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {

        String clientSecret = ReadFile();
        final String TOKEN = clientSecret;
        JDABuilder jdaBuilder = JDABuilder.createLight(TOKEN, GatewayIntent.GUILD_MESSAGES, GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS);

        jdaBuilder.setActivity(Activity.watching("Thursday Night Football"));

        jdaBuilder.addEventListeners(new MyListener()).build();

    }

    public static String ReadFile() {
        try {
            File newFile = new File("token.txt");
            Scanner secretReader = new Scanner(newFile);
            while (secretReader.hasNextLine()) {
                String secret = secretReader.nextLine();
                System.out.println("Client secret found: " + secret);
                return secret;
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: is there a file named token.txt?");
            e.printStackTrace();
        }
        return "balls"; // intellij made me do it
    }
}