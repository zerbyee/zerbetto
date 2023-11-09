package ripasso_terza;

import java.util.Scanner;

public class gestione {

	private String nome,cognome;
	private int orenormali,orestraordinarie,orefestive;
	
	public gestione() {
		cognome="";
		nome="";
		orenormali=0;
		orestraordinarie=0;
		orefestive=0;
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getOrenormali() {
		return orenormali;
	}
	public void setOrenormali(int orenormali) {
		this.orenormali = orenormali;
	}
	public int getOrestraordinarie() {
		return orestraordinarie;
	}
	public void setOrestraordinarie(int orestraordinarie) {
		this.orestraordinarie = orestraordinarie;
	}
	public int getOrefestive() {
		return orefestive;
	}
	public void setOrefestive(int orefestive) {
		this.orefestive = orefestive;
	}

	public gestione(String nome, String cognome, int orenormali, int orestraordinarie, int orefestive) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.orenormali = orenormali;
		this.orestraordinarie = orestraordinarie;
		this.orefestive = orefestive;
	}

	public String toString() {
		return "gestione [nome=" + nome + ", cognome=" + cognome + ", orenormali=" + orenormali + ", orestraordinarie="
				+ orestraordinarie + ", orefestive=" + orefestive + "]";
	}

	public void inserimento(){
		Scanner kb= new Scanner(System.in);
		System.out.println("inserisci nome dell'impiegato");
		nome=kb.nextLine();
		setNome(nome);
		
		System.out.println("inserisci cognome dell'impiegato");
		cognome=kb.nextLine();
		setCognome(cognome);
		System.out.println("inserisci numero delle ore normali");
		orenormali=kb.nextInt();
		while(orenormali<=0) {
			System.out.println("re-inserisci");
			orenormali=kb.nextInt();
		}
		setOrenormali(orenormali);
		System.out.println("inserisci numero delle ore straordinarie");
		orestraordinarie=kb.nextInt();
		while(orestraordinarie<=0) {
			System.out.println("re-inserisci");
			orestraordinarie=kb.nextInt();}
		setOrestraordinarie(orestraordinarie);
		System.out.println("inserisci numero delle ore festive");
		orefestive=kb.nextInt();
		while(orefestive<=0) {
			System.out.println("re-inserisci");
			orefestive=kb.nextInt();
		
		}
		setOrefestive(orefestive);
		}
		
	
	public void visualizza() {
		
		System.out.println("il nome è :" + getNome());
		System.out.println("il cognome è :" + getCognome());
		System.out.println("il numero delle ore normali è :" + getOrenormali());
		System.out.println("il nuemero delle orestraordinarie è : " + getOrestraordinarie());
		System.out.println("il numero delle orefestive è " + getOrefestive());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
	}

}
