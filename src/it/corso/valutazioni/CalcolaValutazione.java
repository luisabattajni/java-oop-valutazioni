package it.corso.valutazioni;

public class CalcolaValutazione {
	
	/*
	 * tre attributi: 
	 * id dello studente (intero), 
	 * percentuale assenze (intero), 
	 * media voti (numero decimale). 
	 * La classe deve avere anche un metodo che calcola, 
	 * in base a percentuale assenze e media voti, 
	 * se lo studente è promosso o bocciato
	 */
	
	/*
	 * delete later
	 * 
	 * La valutazione complessiva viene fatta sulla percentuale di assenze (da 0 a 100) e la media dei voti (da 0 a 5):
	 * se lo studente ha fatto più del 50% di assenze è bocciato
	 * se ha fatto tra il 25% e il 50% di assenze è promosso solo se la media dei voti è superiore a 2
	 * se ha fatto meno del 25% di assenze è promosso se la media dei voti è superiore o uguale a 2
	 */
	

	
	// attributi
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;
	
	// costruttori
	//string?
	
	 CalcolaValutazione(int idStudente, int percentualeAssenze, double mediaVoti){
	 this.idStudente = idStudente; 
	 this.percentualeAssenze = percentualeAssenze;
	 this.mediaVoti = mediaVoti; }
	 
	
	//metodo
	
	
	boolean promosso () {
		if ((percentualeAssenze >= 25 && percentualeAssenze <= 50 && mediaVoti > 2) || (percentualeAssenze < 25 && mediaVoti >= 2)) {
			
			return true;
		} else {
			
			return false;
		}
		
	}

	
	
}
