package collections;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a=new ArrayList<String>();
		
		a.add("akshay");
		a.add("rohan");
		a.add("rohan");
		a.add("rohan");
		System.out.println(a);
		a.add(1,"sandeep");
		System.out.println(a);
		a.remove(1);
		a.remove("rohan");
		System.out.println(a);
		int j=a.size();
		System.out.println(a.indexOf("rohan"));
	}

}
