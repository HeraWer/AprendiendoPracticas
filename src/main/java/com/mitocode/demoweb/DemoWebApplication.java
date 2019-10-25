package com.mitocode.demoweb;

import com.mitocode.service.IPersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.mitocode")
@EnableJpaRepositories(basePackages = {"com.mitocode"})
@EntityScan(basePackages = {"com.mitocode.model"})
public class DemoWebApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(DemoWebApplication.class);

    @Autowired
    private IPersonaService personaService;

    public static void main(String[] args) {
        SpringApplication.run(DemoWebApplication.class, args);
    }

    @Override
    public void run(String... args)throws Exception {

        //LOG.info("Hola Coders desde Spring Boot en consola");
        //LOG.warn("Adviertiendo a los coders");
        personaService.registrar("MitoCode");
    }
}
