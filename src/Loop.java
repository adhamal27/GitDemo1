
public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*	int i=10;
		
		while(i>0) {
			System.out.println(i);
			i--;
			
		}
		
		
		
		/*	int k=1;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) 
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		} */
		int l=1;
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10-i;j++) 
			{
				System.out.print(i*j);
			
					System.out.print("\t");
			l++;
		
				
			}
		
			System.out.println("");

	}
		
		char[] s= {'s','t','d'};
		int size1;
		size1=s.length;
		
		String tsd=new String(s);
		
		System.out.println(size1);
		int z=0;
		while(z<size1) {
			System.out.print(s[z]);
			z++;
			System.out.print("\t");
		}
		
		
	}
}
