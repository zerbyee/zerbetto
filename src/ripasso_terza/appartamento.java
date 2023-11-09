package ripasso_terza;

import java.util.Scanner;

public class appartamento {

	private int numero,superficie;
	private float quota;
	private String cognome,nome;
	
	
	public appartamento(){
		this.numero=0;
		this.superficie=0;
		this.quota=0;
		this.cognome="";
		this.nome="";
		
		
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public float getQuota() {
		return quota;
	}

	public void setQuota(float qmillesimale) {
		this.quota = qmillesimale;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "appartamento [numero=" + numero + ", superficie=" + superficie + ", quota=" + quota + ", cognome="
				+ cognome + ", nome=" + nome + "]";
	}

	public appartamento(int numero, int superficie, int quota, String cognome, String nome) {
		
		this.numero = numero;
		this.superficie = superficie;
		this.quota = quota;
		this.cognome = cognome;
		this.nome = nome;
	}
	
	public float qMillesimale(int supTot) {
		float qmillesimale = (superficie/supTot)*1000;
		setQuota(qmillesimale);
		return qmillesimale;
	}
	
	public void inserimento() {
		Scanner kb= new Scanner(System.in);
		System.out.println("inserisci il numero dell'appartamento");
		numero= kb.nextInt();
		while(numero<0 || numero>100){
			System.out.println("sbgagliato. Il numero del condominio va da 1 a 100");
			numero= kb.nextInt();}
		System.out.println("inserisci la superficie del condominio");
		superficie= kb.nextInt();
		while(superficie<=0) {
			System.out.println("re-inserisci");
			superficie= kb.nextInt();}
		System.out.println("inserisci la quota millesimale");
		quota= kb.nextInt();
		while(quota<=0) {
			System.out.println("reinserisci quota");
			quota= kb.nextInt();}
		System.out.println("inserisci cognome del proprietario");
		cognome=kb.nextLine();
		System.out.println("inserisci nome");
		nome=kb.nextLine();		
	}
	
	public void visualizza() {
		System.out.println("il numero dell'appartamento è : " + numero + ".");
		System.out.println("la superficie dell'appartamento è : " + superficie + "metri.");
		System.out.println("la quota dell'appartamento è : " + quota + "€.");
		System.out.println("il cognome del proprietario dell'appartamento è : " + cognome + ".");
		System.out.println("il nome del proprietario dell'appartamento è : " + nome + ".");
		
	}
	
	
}
