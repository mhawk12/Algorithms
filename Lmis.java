// algorithm to find the longest monotonically increasing sequence in O(N^2) using DP

import java.util.Random;

public class Lmis {

	public static void main(String args[]) 
	{
		Random rand = new Random();
		int[] a = new int[10];
		int[] len = new int[10];
		int max  = 0 ;
		
		
		for(int i = 0 ; i< a.length; i++)
		{
			a[i] = rand.nextInt(10);
			len[i] = 1; // set the initial lengths to 1
		}
		
		
		//Print the input sequence
		for(int i =0 ; i< a.length; i++)
		System.out.println(a[i]);
		
		
		
		//main code
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j< i ; j++)
			{
				if(a[i] > a[j] && len[i] < len[j] +1 )
				{
					len[i]= len[j] + 1 ;
				}
			}
		}
		
		
		
		
		//finding the maximum of the lengths
		for(int i = 0; i< a.length ; i++)
		{
			if(max < len[i])
			{
				max = len[i];
			}
		}
		
		
		
		
		System.out.println("Lenght of LMIS:");
		System.out.println(max);
	}
}
