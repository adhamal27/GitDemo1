package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("Japan");
		hs.add("INDIA");
		hs.add("India");
		
		System.out.println(hs);
		
		
		Iterator<String> i=hs.iterator();
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
