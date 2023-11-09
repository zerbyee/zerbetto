package VERIFICA1;

public class Aereo2 {
	
	private int maxposti,costo;
	private String nome_compagnia,l_partenza,l_destinazione,naereo;
	
	
	public Aereo2() {
		naereo="FR799";
		maxposti=4;
		nome_compagnia="RYANAIR";
		l_partenza="VENEZIA";
		l_destinazione="LONDRA";
		costo=50;	}
	
	
	public int getMaxposti() {
		return maxposti;
	}

	public void setMaxposti(int maxposti) {
		this.maxposti = maxposti;
	}

	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}

public String getNome_compagnia() {
		return nome_compagnia;
	}
	public void setNome_compagnia(String nome_compagnia) {
		this.nome_compagnia = nome_compagnia;
	}

	public String getL_partenza() {
		return l_partenza;
	}


	public void setL_partenza(String l_partenza) {
		this.l_partenza = l_partenza;
	}


	public String getL_destinazione() {
		return l_destinazione;
	}


	public void setL_destinazione(String l_destinazione) {
		this.l_destinazione = l_destinazione;
	}

	public String getNaereo() {
		return naereo;
	}


	public void setNaereo(String naereo) {
		this.naereo = naereo;
	}



	public String toString() {
		return "Aereo2 [maxposti=" + maxposti + ", costo=" + costo + ", nome_compagnia=" + nome_compagnia
				+ ", l_partenza=" + l_partenza + ", l_destinazione=" + l_destinazione + ", naereo=" + naereo + "]";
	}


	public Aereo2(int maxposti, int costo, String nome_compagnia, String l_partenza, String l_destinazione,
			String naereo) {
		
		this.maxposti = maxposti;
		this.costo = costo;
		this.nome_compagnia = nome_compagnia;
		this.l_partenza = l_partenza;
		this.l_destinazione = l_destinazione;
		this.naereo = naereo;
	}


	public void visualizza3() {
		System.out.println("il num dell'aereo :" + naereo + "il max di posti è :" + maxposti + "nome della compagnia: " + nome_compagnia + "partenza da :" + l_partenza + "destinazione :" + l_destinazione);
		
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
