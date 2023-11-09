package vector;

import java.util.ArrayList;
import java.util.Vector;



public class esempio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Vector <Quadrato> v = new Vector<Quadrato>(3,2);
		//		for (int i=1;i<=5;i++) {
		//			int lato= (int)(Math.random()*10+1);
		//			Quadrato q = new Quadrato(lato);
		//			v.add(q);
		//		}
		//
		//		System.out.println(v);
		//		System.out.println(v.toString());
		//		System.out.println("visualizza foreach");
		//		for (Quadrato q : v )//visualizzazione foreach, ciclo in cui vai a specifiare un tipo di dato che sta allinterno del vector
		//			System.out.println(q);
		//		System.out.println();
		//		v.add(0,new Quadrato(100));
		//		v.add(6 , new Quadrato(200));
		//		
		//		//cancellazionee
		//		v.remove(0);
		//		System.out.println(v);
		//		
		//		
		////		//ricerca indexof //mi dice se ce e dove si trova, se non ce mi restituisce -1
		////		Quadrato q1= new Quadrato(200);
		////		int pos = v.indexOf(q1);
		////		System.out.println("quadrato con lato = 200");
		//		
		//		System.out.println("capacità " + v.capacity());
		//		System.out.println("size"+ v.size());
		//		v.trimToSize(); // funzione che taglia gli spazi in più
		//		System.out.println("capacità " + v.capacity());
		//		System.out.println("size"+ v.size());
		//		
		//		
		//		v.clear();//rimuove tutti gli elementi dal vector
		//		System.out.println(v);
		//		
		//		//contains mi dicer se ce o noi, vero o falso
		//		v.firstElement();// restituisce il primo elemeneto del vector
		//		v.lastElement()	;	
		//		v.isEmpty(); // dice se il vector è vuoto
		//		v.remove(v);
		//	
		//	

		// 	ArrayList di strig

		ArrayList<String> al1 = new ArrayList<String>(3);
		al1.add("ciao");
		al1.add("ciao mondo");
		System.out.println(al1);
		//	ArrayList di numeri interi

		ArrayList<Integer> al2 = new ArrayList<Integer>(3);
		al2.add(4);
		al2.add(6);
		System.out.println(al2);

	}}





































