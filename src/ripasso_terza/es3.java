package ripasso_terza;

import java.util.Random;

public class es3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		   Random random = new Random();


	        // Lancio dei dadi del giocatore 1
	        int dadoGiocatore1 = random.nextInt(6) + 1; // Genera un numero casuale tra 1 e 6
	        int dadoGiocatore2 = random.nextInt(6) + 1;
	      
	        int sommadadi1=0;
	        int sommadadi2=0;
	       
	        // Stampa dei risultati
	        System.out.println("Giocatore 1 ha lanciato il dado e ha ottenuto: " + dadoGiocatore1 + " " + dadoGiocatore2);
	        
	        if(dadoGiocatore1==dadoGiocatore2) {
	        	sommadadi1= (dadoGiocatore1+ dadoGiocatore2)*2;}
	        else {
	        	sommadadi1= dadoGiocatore1+dadoGiocatore2;
	        }
	        
	        
	        
	        
	        dadoGiocatore1 = random.nextInt(6) + 1;
	        dadoGiocatore2 = random.nextInt(6) + 1;
	        
	        System.out.println("Giocatore 2 ha lanciato il dado e ha ottenuto: " + dadoGiocatore1 + " " + dadoGiocatore2 );
	        
	        
	        if(dadoGiocatore1==dadoGiocatore2) {
	        	sommadadi2= (dadoGiocatore1+ dadoGiocatore2)*2;}
	        else {
	        	sommadadi2= dadoGiocatore1+dadoGiocatore2;
	        }
	        
	       
	      
	      
	        System.out.println("somma  del giocatore 1 : " + sommadadi1);
	        System.out.println("somma  del giocatore 2 : " + sommadadi2);
	        
	      
	        
	        // Determinare il vincitore
	        if ( sommadadi1 > sommadadi2) {
	            System.out.println("Il Giocatore 1 vince!");
	        } else if ( sommadadi2>  sommadadi1) {
	            System.out.println("Il Giocatore 2 vince!");
	        } else {
	            System.out.println("È un pareggio!");
	        }
	    }
}
	