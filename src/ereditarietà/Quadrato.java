package ereditarietà;

import java.util.Scanner;

public class Quadrato {

	protected int lato;
	public Quadrato() {
		lato=0;
	}
	
	
	

	public int getLato() {
		return lato;
	}

	public void setLato(int lato) {
		this.lato = lato;
	}

//	public String toString() {
//		return "Quadrato [lato=" + lato + "]";
//	}

	public Quadrato(int lato) {
		
		this.lato = lato;
	}

public void inserimento() {
	Scanner tastiera= new Scanner(System.in);
	System.out.println("metti lato");
	lato= tastiera.nextInt();
	
}

	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}




	public void visualizza() {
		// TODO Auto-generated method stub
		System.out.println(lato);
	}

}
