package array;

public class minMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int abc[][]={{34,312,56},{6,8,4},{34,65,87}};
		
		int min=abc[0][0];
		int mincol=0;
		int minrow=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
					minrow=i;
					mincol=j;
				}
				
			}
		}
		System.out.println("Minimum number="+min);
		System.out.println("Minimum row number="+minrow+" Min Column number="+mincol);
		
		int k=0;
		int max=0;
		int maxcolumn=abc[0][mincol];
		
		while(k<3) {
			if(abc[k][mincol]>maxcolumn) {
				
				max=abc[k][mincol];
			}
				k++;
		}
		
		System.out.println("Maximum number in column="+max);
		
		int maxrown=abc[minrow][0];
		int m=0;
	
		while(m<3)
		{
			if(abc[minrow][m]>maxrown)
			{
				maxrown=abc[minrow][m];
			}
			m++;
		}
		System.out.println("Maximum number in row="+maxrown);
	}

}
