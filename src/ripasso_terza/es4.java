package ripasso_terza;

import java.util.Random;
import java.util.Scanner;

public class es4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera= new Scanner(System.in);
		Random random= new Random();
		int contatore=0;
		int x;
		int tentativo = 0;
		x=random.nextInt(100)+1;
		boolean vittoria=false;//serve a controllare se abbiamo vinto
		
		do {
			System.out.println("metti numero");
			tentativo=tastiera.nextInt();
			contatore++;
			if(tentativo==x) {
				System.out.println("hai vinto con " + contatore + " tentativi");
				vittoria=true;
			}
			else if(tentativo<x) {
				System.out.println("il numero inserito è piu basso. Re-inserisci");
				
			}
			else  {
				System.out.println("il numero inserito è piu alto. Re-inserisci");
			}
		}while(!vittoria);//not vittoria	//vittoria==false
	}}