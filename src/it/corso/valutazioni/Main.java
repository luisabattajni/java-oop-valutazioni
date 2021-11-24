package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * create un array di 20 CalcolaValutazione, 
		 * lo popolate con id studente progressivo (da 1 a 20), 
		 * percentuale assenze e media voti generati random. 
		 * Per ogni elemento dell’array stampate a video 
		 * l’id studente e se è promosso o bocciato
		 */
		
		
		Random randomGenerator = new Random();

		
		CalcolaValutazione[] randomValutazione = new CalcolaValutazione[20];
		
		int idStudente;
		int percentualeAssenze;
		double mediaVoti;


		
		for(int i = 0; i < randomValutazione.length; i++) {
			percentualeAssenze = randomGenerator.nextInt(101);
			//fix later + add only 2 decimals
			mediaVoti = 5 * randomGenerator.nextDouble();
			
			idStudente = i + 1;
			
			//String risultato = randomValutazione[i].ris();
			
			
			//below: stampa di id + assenze + media
			System.out.println(idStudente + " " +  percentualeAssenze + " " + mediaVoti);
			//System.out.println(idStudente + " " + risultato);
			
			} 


		
		}

	

}
