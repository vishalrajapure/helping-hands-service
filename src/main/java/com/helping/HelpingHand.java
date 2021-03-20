package com.helping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@EnableJpaAuditing
@EnableJpaRepositories*/
public class HelpingHand {

    public static void main(String[] args) {
        System.out.println("Helping hand has been initiated");
        SpringApplication.run(HelpingHand.class, args);
    }

}
