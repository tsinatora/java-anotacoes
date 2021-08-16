/*
	Aprender a configurar o VSCode para entender os imports que ele não sabe

	Provavelmente no trabalho seria apontar o junit-platform-console-standalone..., no settings.json

	Este pode ser baixado na Web, ver como Vinícius usa ou o povo do testes, tem o curso JUnit da Alura também
	

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TesteSimples {

	@Test
	public void testeConjuntoVazio() {
		Collection conjunto = new ArrayList();
		assertTrue(conjunto.isEmpty());
	}

	public static void main(String args[]) {
	      org.junit.runner.JUnitCore.main
       ("TesteSimples");
	}
}

*/