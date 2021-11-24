package it.corso.valutazioni;

public class CalcolaValutazione {
	
	// attributi
	int idStudente;
	int percentualeAssenze;
	double mediaVoti;
	
	// costruttori
	
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
