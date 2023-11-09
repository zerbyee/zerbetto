package ripasso_terza;

import java.util.Random;
import java.util.Scanner;

public class es5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	final int DIM = 100;
	final int min = 1;
	final int max = 1000;
	int array[] = new int[DIM]; 
	int i;
	int somma = 0;

	for(i=0; i<DIM; i++) {
		array[i] = (int)(Math.random()*(max-min+1)+min)+1;
		somma = somma + array[i];
		
	}

	for(i=0; i<DIM; i++) {
		System.out.println("array["+i+"]=" + array[i]);
	}

	int MIN = max;
	int MAX = min;

	for(i=0; i<DIM; i++) {
		if(MIN>array[i])
			MIN = array[i];
		else if(MAX<array[i])
			MAX = array[i];
	}

	System.out.println();
	System.out.println("Il maggiore è " + MAX);
	System.out.println("Il minore è " + MIN);
	System.out.println("La somma è " + somma);
	System.out.println("La media è " + (double) somma/DIM);
	
	}

}

