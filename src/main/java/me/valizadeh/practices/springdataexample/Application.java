package me.valizadeh.practices.springdataexample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;

@SpringBootApplication
@Slf4j
public class Application implements CommandLineRunner {

    @Autowired
    private TransactionService service;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Page<Transaction> ali = service.all("ali");
        log.info("Ali total elements : {}", ali.getTotalElements());
        Page<Transaction> amir = service.all("amir");
        log.info("Amir total elements : {}", amir.getTotalElements());

        Page<Transaction> hassan = service.all("hassan");
        log.info("Hassan total elements : {}", hassan.getTotalElements());
    }
}
