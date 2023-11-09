package VERIFICA1;

import java.util.Scanner;

public class Aereo {

	private int maxposti;
	private String nome_compagnia,l_partenza,l_destinazione,naereo;
	
	
	public Aereo() {
		naereo="";
		maxposti=0;
		nome_compagnia="";
		l_partenza="";
		l_destinazione="";
	}
	
	
	public String getNaereo() {
		return naereo;
	}


	public void setNaereo(String naereo) {
		this.naereo = naereo;
	}


	public int getMaxposti() {
		return maxposti;
	}

	public void setMaxposti(int maxposti) {
		this.maxposti = maxposti;
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

	
	public String toString() {
		return "Aereo [naereo=" + naereo + ", maxposti=" + maxposti + ", nome_compagnia=" + nome_compagnia
				+ ", l_partenza=" + l_partenza + ", l_destinazione=" + l_destinazione + "]";
	}


	public Aereo(String naereo, int maxposti, String nome_compagnia, String l_partenza, String l_destinazione) {
		
		this.naereo = naereo;
		this.maxposti = maxposti;
		this.nome_compagnia = nome_compagnia;
		this.l_partenza = l_partenza;
		this.l_destinazione = l_destinazione;
	}

	public void inserimento1() {
		Scanner kb= new Scanner(System.in);
		System.out.println("metti numero aereo");
		naereo=kb.nextLine();
		System.out.println("metti numero max di posti");
		maxposti=kb.nextInt();
		System.out.println();
		System.out.println("metti nome della compagnia");
		nome_compagnia= kb.nextLine();
		System.out.println("metti la partenza");
		l_partenza= kb.nextLine();
		System.out.println("metti destinazione");
		l_destinazione=kb.nextLine();
		
	
	}
	
	public void visualizza1() {
		System.out.println("il num dell'aereo :" + naereo);
		System.out.println("il max di posti è :" + maxposti);
		System.out.println("nome della compagnia: " + nome_compagnia);
		System.out.println("partenza da :" + l_partenza);
		System.out.println("destinazione :" + l_destinazione);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
