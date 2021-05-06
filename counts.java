package program;

public class counts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int num= 1;
		
		
		for(int i=1;  i<=n; i++)
			
		{
			//spaces
			for(int sp =1; sp <= n-i;sp++)
			{
				
			
			System.out.print("-");
			
	     	}
			
			
		     for(int j=1; j<=i;j++)
		
		{
			
			
			System.out.print(num +" ");
			num++;
			  
			
		}
		
		System.out.println();
	}

	}
}


