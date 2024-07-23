import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.exceptions.InvalidTokenException;

public class DiscordBot {
  public static void main(String[] args) throws InvalidTokenException {
    final String TOKEN = System.getenv("BOT_TOKEN");
    JDABuilder jdaBuilder = JDABuilder.createDefault(TOKEN);

    jdaBuilder.build();
  }
}
