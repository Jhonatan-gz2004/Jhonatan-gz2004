package com.gestionaula;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class GestionaTuAulaApplication {
    public static void main(String[] args) {
        java.util.TimeZone.setDefault(java.util.TimeZone.getTimeZone("America/Bogota"));
        SpringApplication.run(GestionaTuAulaApplication.class, args);
    }
}
