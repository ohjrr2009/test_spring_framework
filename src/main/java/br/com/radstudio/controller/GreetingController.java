package br.com.radstudio.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.radstudio.model.mock.Greeting;

@RestController
public class GreetingController {
	
	private final AtomicLong counter = new AtomicLong();
	
	/*
	 * Método mapeado que será chamado com a utilização de parâmetros | Query Param
	 */
	@RequestMapping("/greeting_param")
	public Greeting greetingParam(@RequestParam(value = "name", defaultValue = "Ornélio") String name) {
		return new Greeting(counter.incrementAndGet(), name);
	}
	
	/*
	 * Método mapeado que será chamado conforme o caminho | Query Path
	 */
	@RequestMapping("/greeting_path/{name}")
	public Greeting greetingPath(@PathVariable(value = "name") String name) {
		return new Greeting(counter.incrementAndGet(), name);
	}
}
