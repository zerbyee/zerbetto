package ripasso_terza;

import java.util.Scanner;

public class sequenzadiFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tastiera= new Scanner(System.in);
		
		int somma=0;
		int num=0;
		do {
			System.out.println("metti num");
			num=tastiera.nextInt();
			
		}while(num<0);
			int n1=1;
			int n2=1;
			int i=0;
			
			do {
				System.out.println("n" + i + "=" + n1);
			somma= n1+n2;
			n1=n2;
			n2=somma;
			i++;
			}while(i<num);
		}

	}
