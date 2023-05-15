package ru.Meredov.PogrebM.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BotConfig {

    String botName;

    String token;
}
