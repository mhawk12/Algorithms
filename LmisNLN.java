package algorithms;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LmisNLN {
   
	
	public static int ceilIndex(int[] tailTable , int l , int r, int key)
	{
		
		while(r-l > 1)
		{
			int m = l + (r-l)/2;
			if(tailTable[m]>=key)
				r=m;
			else
				l=m;
		}
		return r;
	}
	
	public static int LongestIncreasingSubsequenceLength(int[]a, int n)
	{
		int[] tailTable = new int[n];
		int len;
		
		tailTable[0] = a[0];
		len = 1;
		
		for(int i = 1 ; i< n; i++)
		{
			if(a[i] < tailTable[0])
			{
				tailTable[0]=a[i];
			}
			else if ( a[i] > tailTable[len-1])
			{
				tailTable[len++] = a[i];
			}
			else
				tailTable[ceilIndex(tailTable, -1, len-1, a[i])] =a[i];
		}
		return len;
	}
	
	
	public static void main(String artgs[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[n];
		
		for(int i=0 ; i< n ; i ++)
		{
			a[i]= Integer.parseInt(br.readLine());
		}
		
		System.out.println(LongestIncreasingSubsequenceLength(a,n));
	}
	
}
