package ereditarietà;
import java.util.Scanner;
public  class QuadratoAColori extends Quadrato{

	private String colore;
	public  QuadratoAColori(int lato) {
	super(lato);				// richiamo il costruttore del Quadrato(lato)
	colore="blu";
	}
	@Override
	public String toString() {
		super.toString();
		return "QuadratoAColori " + super.toString() + "[colore=" + colore + "]";
	}
	public void inserimento() {
		
		Scanner tastiera= new Scanner(System.in);
		System.out.println("metti lato");
		lato=tastiera.nextInt();
		super.inserimento();
		}
	
	public void visualizza() {
		// TODO Auto-generated method stub
	System.out.println("lato");
	super.visualizza();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
