package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;



public class CounterTest {

	private Counter counter;
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
		
		//Se crea el contador
		counter = new Counter();
		
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(123456789);
		counter.addNumber(3111333);
		counter.addNumber(544468);
		counter.addNumber(12323);
		counter.addNumber(91187);
		counter.addNumber(11233);
		counter.addNumber(112);
		counter.addNumber(123);
		counter.addNumber(123);
		counter.addNumber(4444444);
	}
	
	
	
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testCantidadPares() {
	
	// Getting the even occurrences
	int amount = counter.cantidadDePares();
	
	// I check the amount is the expected one
	assertEquals(amount, 1);
	}
	
	
	
	
	
	
	
	@Test
	public void testCantidadImpares() {
		int amount = counter.cantidadDeImpares();
		
		assertEquals(amount,9);
	}
	
	
	@Test
	public void testCantidadMultiplos () {
		int amount = counter.cantidadDeMultiplosDe_(4);
		
		assertEquals(amount,7);
	}
	
	
	
}

