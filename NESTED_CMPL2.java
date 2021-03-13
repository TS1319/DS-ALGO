class NESTED_CMPL2 
{
	public static void main(String[] args) 
	{
		int count = 0;

		for(int i=0; i< 5; i++)
		{
			for(int j=5; j>i; j--)                        
			{
			count++;
			System.out.println(count + "  i value ->" +i+ " j  value ->" +j);
		    }	
          }
      
	}
}

/**Total number of runs = N + (N - 1) + (N - 2) + ... 1 + 0

= N * (N + 1) / 2

= 1/2 * N^2 + 1/2 * N

O(N^2) times. 


**/