package array;

public class arrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int i[]= {1,2,3,4,5,345,345,3,5,2143,423,53};
		 
		// i[0]=1;
		 //i[1]=2;
//		 i[2]=3;
	//	 i[3]=4;
		// i[4]=5;
		 
		 int a[][]=new int[2][3];
		 
		 a[0][0]=1;
		 a[0][1]=32;
		 a[0][2]=12;
		 a[1][0]=1;
		 a[1][1]=32;
		 a[1][2]=123;
			 
		 
		 for(int k=0;k<2;k++) {
			 for(int l=0;l<3;l++) {
 			 System.out.print(a[k][l]);
			 System.out.print("\t");
			 }
			 System.out.println("");
		 }
	}

}
