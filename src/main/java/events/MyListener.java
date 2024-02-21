package events;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


public class MyListener extends ListenerAdapter
{
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        if (event.getAuthor().isBot()) return;
        // We don't want to respond to other bot accounts, including ourself
        Message message = event.getMessage();
        String content = message.getContentRaw();
        // getContentRaw() is an atomic getter
        // getContentDisplay() is a lazy getter which modifies the content for e.g. console view (strip discord formatting)
        if (content.startsWith("im " ) || content.startsWith("i'm " ) || content.startsWith("Im " ) || content.startsWith("I'm " ) || content.startsWith("IM " ) || content.startsWith("I'M " ))
        {
            MessageChannel channel = event.getChannel();
            //channel.sendMessage("Hi" + " " + "! I'm Dad!").queue(); // Important to call .queue() on the RestAction returned by sendMessage(...)

            // yes this is supposed to be a class leave me tf alone its late im lazy go fuck yourself

            String findIm0 = "im ";
            String findIm1 = "i'm ";
            String findIm2 = "Im ";
            String findIm3 = "I'm";
            String findIm4 = "IM";
            String findIm5 = "I'M";

            int imLocation = 10;
            String splitStr = "nullified";
            imLocation = content.indexOf(findIm0);

            if (imLocation > -1) {
                //channel.sendMessage("working condition 1").queue();
                int location = imLocation + 3;
                splitStr = content.substring(location);
                channel.sendMessage("Hi " + splitStr + ", I'm Dad!").queue();
            } else {
                System.out.println("ERR: How'd that happen?");
            }
        }

        }
        }
    }
