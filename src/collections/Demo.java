package collections;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3,2,4,4,2,3,4,5,9,4,5};
		
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ar.contains(a[i]))
			{
				ar.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
		if(k==1)
		{
			System.out.println(a[i]);
		}
		}
		
		
	}
		
	}
}
