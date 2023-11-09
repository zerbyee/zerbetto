package vector;

import java.util.Vector;

public class esempio1 {


	public static void main(String[] args) {


		// Vector v = new Vector(); //old


		// new
		// COSTRUTTORE di defaut Vector<E>()
		Vector<Quadrato> v = new Vector<Quadrato>();

		System.out.println("Capacità = " + v.capacity());
		System.out.println("Size     = " + v.size());


		/*
		METODI VECTOR: v.
		size()  --> numero elementi
		capacity() --> quant'è la dimensisone massima che può contenere in quel momento -> capacità dinamica
		 */


		System.out.println();
		System.out.println("-------------------------");
		System.out.println();


		/*

		Vector<Quadrato> v2 = new Vector<Quadrato>(2); //dimensione di 2 -> con 2, la sua capacità radoppia ogni volta


		System.out.println(" ---> Prima <--- ");
		System.out.println("Capacità = " + v2.capacity());
		System.out.println("Size     = " + v2.size());


		System.out.println();

		v2.add(new Quadrato(3)); //posso aggiungere un quadrato
		v2.add(new Quadrato(5)); 
		System.out.println(" ---> +2 <--- ");
		System.out.println("Capacità = " + v2.capacity());
		System.out.println("Size     = " + v2.size());


		System.out.println();


		v2.add(new Quadrato(4));
		v2.add(new Quadrato(6)); 
		System.out.println(" ---> +2 <--- ");
		System.out.println("Capacità = " + v2.capacity());
		System.out.println("Size     = " + v2.size());


		System.out.println();


		v2.add(new Quadrato(7)); 
		System.out.println(" ---> +1 <--- ");
		System.out.println("Capacità = " + v2.capacity());
		System.out.println("Size     = " + v2.size());


		 */

		Vector<Quadrato> v3 = new Vector<Quadrato>(3,2);


		System.out.println(" ---> Prima <--- ");
		System.out.println("Capacità = " + v3.capacity());
		System.out.println("Size     = " + v3.size());


		System.out.println();

		v3.add(new Quadrato(3)); //posso aggiungere un quadrato
		v3.add(new Quadrato(5)); 
		System.out.println(" ---> +2 <--- ");
		System.out.println("Capacità = " + v3.capacity());
		System.out.println("Size     = " + v3.size());


		System.out.println();


		v3.add(new Quadrato(4));
		v3.add(new Quadrato(6)); 
		System.out.println(" ---> +2 <--- ");
		System.out.println("Capacità = " + v3.capacity());
		System.out.println("Size     = " + v3.size());


		System.out.println();

		v3.add(new Quadrato(7)); 
		v3.add(new Quadrato(8)); 
		v3.add(new Quadrato(9)); 
		System.out.println(" ---> +1 <--- ");
		System.out.println("Capacità = " + v3.capacity());
		System.out.println("Size     = " + v3.size());

		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();

		//visualizzo il vector
		for(int i=0; i<v3.size(); i++) 
			//System.out.println(v3.elementAt(i));
			System.out.println(v3.get(i));








	}
}
