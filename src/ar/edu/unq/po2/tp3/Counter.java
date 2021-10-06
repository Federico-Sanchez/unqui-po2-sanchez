package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	
	private ArrayList<Integer> list= new ArrayList<Integer>();
	
	
	
	public void addNumber(int numero) {
		
		list.add(numero);
	}
	
	
	public int cantidadDePares() {
		
		int cantPares = 0;
		for (int num : list ) {
			if (num % 2 == 0) {
				cantPares++;
			}
		}
		return cantPares;
	}
	
	
	public int cantidadDeImpares() {
		
		int cantImpares = 0;
		for (int num : list) {
			if (num % 2 != 0) {
				cantImpares++;
			}
		}
		return cantImpares;
	}
	
	
	public int  cantidadDeMultiplosDe_(int num) {
		
		int cantMultiplos = 0;
		for (int actual : list) {
			if (num % actual == 0) {
				cantMultiplos++;
			}
		}
		return cantMultiplos;
	}
	
	
	
}	






