//LCS to print the length of LCS
import java.util.Random;

public class LCS {
	
	//length of the LCS
	public static int lcs(char[] a , char[] b, int m, int n)
	{
		int[][] ab = new int[m+1][n+1];
		
			for(int i =0; i<=m ;i++)
			{
				for(int j =0;j<=n;j++ )
				{
					if(i == 0 || j ==0)
						ab[i][j]=0;
					
					else if(a[i-1]==b[j-1])
					{
						ab[i][j]=ab[i-1][j-1]+1;
					}
					else
					{
						ab[i][j]=Math.max(ab[i-1][j],ab[i][j-1]);
					}
				}
			}
		return ab[m][n];
		
		
	}
	
	
	
	
	
	public static void main(String args[])
	{
		char[] a= {'A','G','G','T','A','B'};
		char[] b= {'G','X','T','X','A','Y','B'};
		
		System.out.println(lcs(a,b,a.length, b.length));
		
	}

}
