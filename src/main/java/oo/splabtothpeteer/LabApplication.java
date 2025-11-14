package oo.splabtothpeteer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean; // <-- Import nou
import org.springframework.web.servlet.config.annotation.CorsRegistry; // <-- Import nou
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer; // <-- Import nou

@SpringBootApplication
public class LabApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabApplication.class, args);
    }

    // Adaug acest Bean pentru a activa CORS
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permite toate cererile de la orice origine
                registry.addMapping("/**").allowedOrigins("http://localhost:8081");
            }
        };
    }
}