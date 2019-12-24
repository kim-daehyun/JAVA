package weekend2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class Re_LottoMachine2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
//		rd.nextInt()
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(set.size()<10) {
			
			set.add(rd.nextInt(21)+10);
		
		}
	Iterator <Integer> it = set.iterator();
	while(it.hasNext()) {
		Integer str = it.next();
		System.out.println(str);
	}
	System.out.println(set);
	
	}

}
