package events;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MyListener extends ListenerAdapter
{
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // Ignore messages from bots to prevent potential loops
        if (event.getAuthor().isBot()) {
            return;
        }

        String message = event.getMessage().getContentRaw();

        // Create a case-insensitive pattern for "I'm" or "Im" followed by spaces and a word
        Pattern pattern = Pattern.compile("\\b(?:i['']?m|im)\\s+(\\w+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(message);

        // Check if pattern is found and get the word after "I'm"
        if (matcher.find()) {
            String wordAfterIm = matcher.group(1);
            // Reply in the same channel
            event.getChannel().sendMessage("Hi " + wordAfterIm + ", I'm Dad!").queue();
            // unfortunately yes, claude made it. Thanks anthropic and I feel unfathomably stupid.
        }
    }
}