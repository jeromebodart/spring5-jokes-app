package guru.srpingframework.joke.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public   ChuckNorrisQuotes chuckNorrisQuote() {
        return new ChuckNorrisQuotes();
    }
}
