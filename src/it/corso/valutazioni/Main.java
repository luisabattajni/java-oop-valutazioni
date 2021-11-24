package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
		CalcolaValutazione[] randomValutazione = new CalcolaValutazione[20];
		
		int idStudente;
		int percentualeAssenze;
		double mediaVoti;

		for(int i = 0; i < randomValutazione.length; i++) {
			percentualeAssenze = randomGenerator.nextInt(101);
			mediaVoti = 5 * randomGenerator.nextDouble();
			idStudente = i + 1;
			
			randomValutazione[i] = new CalcolaValutazione(idStudente, percentualeAssenze, mediaVoti);
			
			//debug
			//System.out.println(idStudente + " " +  percentualeAssenze + " " + mediaVoti);
			
			boolean risultato = randomValutazione[i].promosso();
			
			if (risultato) {
				System.out.println(idStudente + " " + "Promosso");
			}else {
				System.out.println(idStudente + " " + "Bocciato");
			}

			} 


		}

}
