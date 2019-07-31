package evgenyt.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Place to define some beans
 */

@Configuration
public class AppConfig {

    @Bean
    public Music letItBeMusic() {
        return new Music("Let It Be");
    }
}
