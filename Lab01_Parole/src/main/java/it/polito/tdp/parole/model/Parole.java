package it.polito.tdp.parole.model;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Parole {
	
	List<String> parole;
	
	
	public Parole() {
		parole = new LinkedList <String>(); // inizializzo stringa	
	}
	
	public void addParola(String p) { //metodo creato per aggiungere le parole alla lista
		parole.add(p); 
	}
	
	public List<String> getElenco() {
		List<String> lalfa = new LinkedList <String> (this.parole); // crea nuova lista temporanea dove al costruttore gli passo
																	// la lista parole
		Collections.sort(lalfa); //riordina in modo naturale con metodo compare quindi alfabetico
		return lalfa;	
	}																
	
	public void reset() {
		parole.clear(); // svuota la lista
	}
	
	public void cancel(String p) {
		
		parole.remove(p);
	}
	
	public void cancella() {
		
		
	}
}
