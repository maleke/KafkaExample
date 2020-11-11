package com.asanpardakht.kafkaExample;

import com.asanpardakht.kafkaExample.entity.Greeting;
import com.asanpardakht.kafkaExample.service.SendMessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaExampleApplication implements CommandLineRunner {

	private final SendMessageService sendMessageService;

	public KafkaExampleApplication(SendMessageService sendMessageService) {
		this.sendMessageService = sendMessageService;
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
    // sendMessageService.sendMessage("Hello Kafka");
    for (int i = 0; i < 10; i++) {
      sendMessageService.sendGreetingMessage(new Greeting("Hello", "World"));
		 }
	}
}
