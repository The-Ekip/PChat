
package com.ekip.pchat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PchatApplication {
    public static void main(String[] args) {

        SpringApplication.run(PchatApplication.class, args);
    }

}
