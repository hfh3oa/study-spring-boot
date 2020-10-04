package org.example;

import org.example.configuration.EmbeddedTomcatConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(EmbeddedTomcatConfiguration.class)
public class BootApp {

    public static void main(String[] args) {
        SpringApplication.run(BootApp.class, args);
    }
}
