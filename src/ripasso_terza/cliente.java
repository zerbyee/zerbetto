package ripasso_terza;
import java.util.Scanner;


public class cliente {
	
	private String cognome,nome,città,residenza;
	private int numero;
	
	public cliente() {
		cognome="";
		nome="";
		città="";
		residenza="";
		numero=0;
	}
	
	public cliente( String cognome, String nome, String città, String residenza, int numero) {
		
		this.cognome = cognome;
		this.nome = nome;
		this.città = città;
		this.residenza = residenza;
		this.numero = numero;
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

	public String getCittà() {
		return città;
	}

	public void setCittà(String città) {
		this.città= città;
	}

	public String getResidenza() {
		return residenza;
	}

	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "cliente [ cognome=" + cognome + ", nome=" + nome + ", città =" + città
				+ ", residenza=" + residenza + ", numero=" + numero + "]";
	}
	
	public void inserimento() {
		Scanner tastiera= new Scanner(System.in);
		System.out.println("inserisci cognome");
		cognome=tastiera.nextLine();
		System.out.println("inserisci nome");
		nome=tastiera.nextLine();		
		System.out.println("inserisci cittÃ ");
		città=tastiera.nextLine();
		System.out.println("inserisci numero");
		numero=tastiera.nextInt();
	}
	
	public void visualizza() {
		System.out.println("il cognome è¨ " + cognome);
		System.out.println("il nome è¨ " + nome);
		System.out.println("la città   è¨ " + città);
		System.out.println("il numero è¨ " + numero);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner tastiera= new Scanner(System.in);
		
		
		
		cliente Array[]= new cliente[3];
		for(int i=0; i<3;i++) {
			
			
			
			Array[i].inserimento();
			Array[i].visualizza();
			
	
			
		}
		System.out.println("metti città");
		String città=tastiera.nextLine();
		for(int i=0;i<3;i++) {
			if(città==Array[i].getCittà()) {
				System.out.println(Array[i].getCognome() + " " + Array[i].getNome());
			}
		}
		
		
		System.out.println("metti città");
		String nome=tastiera.nextLine();
		System.out.println("metti cognome");
		String cognome=tastiera.nextLine();
		for(int i=0;i<3;i++) {
			if(nome==Array[i].getNome()) {
				System.out.println(Array[i].getNumero() );
			if(cognome==Array[i].getCognome()) {
					System.out.println(Array[i].getNumero() );
			}

		
			}
		
		
		
		
		
		
		
	}

}}
