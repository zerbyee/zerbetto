package VERIFICA1;
import java.util.Scanner;	
public class Passeggero {
	//ZERBETTODENIS

	private String cognome,nome;
	private int bagaglio_a_mano,bagaglio_in_stiva,costo_base,costo_bagaglio;

	public Passeggero() {
		cognome="";
		nome="";
		bagaglio_a_mano=0;
		bagaglio_in_stiva=0;
		costo_base=0;
		costo_bagaglio=0;


	}
    


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		cognome = cognome;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		nome = nome;
	}

	public int getBagaglio_a_mano() {
		return bagaglio_a_mano;
	}
	public void setBagaglio_a_mano(int bagaglio_a_mano) {
		bagaglio_a_mano = bagaglio_a_mano;
	}

	public int getBagaglio_in_stiva() {
		return bagaglio_in_stiva;
	}

	public void setBagaglio_in_stiva(int bagaglio_in_stiva) {
		bagaglio_in_stiva = bagaglio_in_stiva;
	}

	public int getCosto_base() {
		return costo_base;
	}

	public void setCosto_base(int costo_base) {
		costo_base = costo_base;
	}
	public int getCosto_bagaglio() {
		return costo_bagaglio;
	}
	public void setCosto_bagaglio(int costo_bagaglio) {
		costo_bagaglio = costo_bagaglio;
	}


	public String toString() {
		return "Passeggero [Cognome=" + cognome + ", Nome=" + nome + ", Bagaglio_a_mano=" + bagaglio_a_mano
				+ ", Bagaglio_in_stiva=" + bagaglio_in_stiva + ", Costo_base=" + costo_base + ", Costo_bagaglio="
				+ costo_bagaglio + "]";
	}

	public Passeggero(String cognome, String nome, int bagaglio_a_mano, int bagaglio_in_stiva, int costo_base,
			int costo_bagaglio) {

		this.cognome = cognome;
		this.nome = nome;
		this.bagaglio_a_mano = bagaglio_a_mano;
		this.bagaglio_in_stiva = bagaglio_in_stiva;
		this.costo_base = costo_base;
		this.costo_bagaglio = costo_bagaglio;
	}

	public void inserimento()
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("inserisci cognome");
		cognome=kb.nextLine();
		System.out.println("inserisci nome");
		nome=kb.nextLine();
		System.out.println("inserisci peso bagalio a mano");
		bagaglio_a_mano=kb.nextInt();
		while(bagaglio_a_mano<0) {
			System.out.println("rimetti");
			bagaglio_a_mano=kb.nextInt();
		}


		System.out.println("inserisci peso bagaglio_in_stiva");
		bagaglio_in_stiva=kb.nextInt();
		while(bagaglio_in_stiva<0) {
			System.out.println("rimetti");
			bagaglio_in_stiva=kb.nextInt();
		}
		System.out.println("inserisci costo_base");
		costo_base=kb.nextInt();
		while(costo_base<0) {
			System.out.println("rimetti");
			costo_base=kb.nextInt();
		}
		System.out.println("inserisci costo_bagaglio");
		costo_bagaglio= kb.nextInt();	


	}

	
	public void visualizza() {
		System.out.println("il cognome  : " + cognome);
		System.out.println("il nome  :" + nome);
		System.out.println("bagaglio a mano  :" + bagaglio_a_mano);
		System.out.println("il bagaglio in stiva  :" + bagaglio_in_stiva);
		System.out.println("il costo base  :" + costo_base);
		System.out.println("il costo bagaglio  " + costo_bagaglio);
	}
public void peso() {
	int peso=0;
	peso=bagaglio_a_mano + bagaglio_in_stiva;

}
}
	