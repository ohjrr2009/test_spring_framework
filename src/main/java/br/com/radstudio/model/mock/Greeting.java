package br.com.radstudio.model.mock;

/*
 * Classe utilizada apenas para teste inicial de funcionamento do Spring Boot
 */
public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
