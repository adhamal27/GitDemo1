package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "akshay");
		hm.put(32, "swaraj");
		hm.put(65, "raj");
		hm.put(12, "rohan");
		
		System.out.println(hm);
		System.out.println(hm.get(12));
		
		hm.remove(65);
		System.out.println(hm);
		
		Set st=hm.entrySet();
		
		Iterator i=st.iterator();
		
		while(i.hasNext()) {
			Map.Entry mp=(Map.Entry)i.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
