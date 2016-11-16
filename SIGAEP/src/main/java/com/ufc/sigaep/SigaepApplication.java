package com.ufc.sigaep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class SigaepApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigaepApplication.class, args);
	}
}
