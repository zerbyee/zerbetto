package ripasso_terza;

import java.util.Scanner;

public class es2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tastiera= new Scanner(System.in);
		int n=0;//ins numemero
		int  n2=0;//quadrato del num
		
		int a=0;//counter
		System.out.println("inserisci num");
		n= tastiera.nextInt();
		for(int i=0;a<n;i++) {//scorro da 0 al numero inserito
			if(i%2!=0) {// se è dispari
				n2+= i;//si aggiunge al quadrato i
				a++;//incremneta quando abbiamo trovato un numero dispari
				System.out.println(i);
			}
		}
				System.out.println("il quadrato di "+ n +" è  =  " + n2);
		}

	}
