package ripasso_terza;

import java.util.Scanner;

public class Azienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner kb= new Scanner(System.in);
		System.out.println("inserisci numero impiegati");
		int numimpiegati= kb.nextInt();
		gestione A[]= new gestione[numimpiegati];
		
		for(int i=0;i<numimpiegati;i++) {
			gestione a= new gestione();
			a.inserimento();
			A[i]=a;
			
		}
		
		for(int i=0;i<numimpiegati;i++) {
			A[i].visualizza();
		}
		
	}
	
}

orestraordinarie=0;
for (int i=0;i<nimpiegati;i++){
	if(A[i].getOrestraordinarie()>oreStraordinarie) {
		orestraordinarie=A[i].getOreSrraordinarie();
	}
}}}
