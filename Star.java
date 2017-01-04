
public class Pattern3 {
	public static void main(String args[]){
		
		 int i, j, k;
		 for(i=3;i>=1;i--)
		 {
		 for(j=3;j>i;j--)
		 {
		 System.out.print(" ");
		 }
		 for(k=1;k<(i*2);k++)
		 {
		  int sum = (i*2)-1;
		  if(k==1 || k==sum){
		 System.out.print("*");
		  }else{
		    System.out.print(" ");
		  }
		 }
		 System.out.println();
		 }
		 
		for(i=2;i<=3;i++)
		{
		for(j=i;j<3;j++)
		{
		System.out.print(" ");
		}
		for(k=1;k<(i*2);k++)
		{
			  int sum = (i*2)-1;
			  if(k==1 || k==sum){
			 System.out.print("*");
			  }else{
			    System.out.print(" ");
			  }
	
		}
		System.out.println();
		}

	}
}
