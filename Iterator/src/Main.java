import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * @author Joni Jääskeläinen
 */
public class Main {
	public static void main(String[] args) {
		List<String> kokoelma = new ArrayList<String>();
		
		kokoelma.add("aaa");
		kokoelma.add("bbb");
		kokoelma.add("ccc");
		kokoelma.add("ddd");
		kokoelma.add("eee");
		
		Iterator<String> iteraattori1 = kokoelma.iterator();
		Iterator<String> iteraattori2 = kokoelma.iterator();
		
		IteratorThread thread1;
		IteratorThread thread2;
		IteratorRemoveThread threadR;
		IteratorEachRemainingThread threadE;
		
		//a) Kaksi säiettä ja molemmilla omat iteraattorit
//		thread1 = new IteratorThread(iteraattori1, 1);
//		thread2 = new IteratorThread(iteraattori2, 2);
//		thread1.start();
//		thread2.start();
//		try {
//			thread1.join();
//			thread2.join();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//b) Kaksi säiettä ja yhteinen iteraattori
//		thread1 = new IteratorThread(iteraattori1, 1);
//		thread2 = new IteratorThread(iteraattori1, 2);
//		thread1.start();
//		thread2.start();
//		try {
//			thread1.join();
//			thread2.join();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//c) Yksi säite ja iteraattori, kokoelmaa muutetaan kesken iteroinnin
		thread1 = new IteratorThread(iteraattori1, 1);
		thread1.start();
		kokoelma.add("fff");
		try {
			thread1.join();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//d)Iteraattorin remove
//		System.out.println(kokoelma);
//		threadR = new IteratorRemoveThread(iteraattori1, 1);
//		threadR.start();
//		try {
//			threadR.join();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(kokoelma);
		
		//Iteraattorin forEachRemaining, tulostetaan forEachRemaining metodin avulla kokoelman sisältö
//		threadE = new IteratorEachRemainingThread(iteraattori1, 1);
//		threadE.start();
//		try {
//			threadE.join();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
