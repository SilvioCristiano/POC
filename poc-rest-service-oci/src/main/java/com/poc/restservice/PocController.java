package com.poc.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value ="/pocaccept")
	public Poc pocaccept(@RequestParam(value = "name", defaultValue = "OK") String name,
            @RequestHeader(value = "Accept", defaultValue = "Not Provided") String acceptHeader) {
        // Exibir o cabeçalho recebido no console
        System.out.println("Accept Header Recebido: " + acceptHeader);
		return new Poc(counter.incrementAndGet(), String.format(template, name));
	}
}
