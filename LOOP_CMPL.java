class  LOOP_CMPL
{
	public static void main(String[] args) 
	{
		int count = 0;

		for(int i=0; i< 5; i++)
		{
			for(int j=10; j>i; j--)                        
			{
			count++;
			System.out.println(count + "  i value ->" +i+ " j  value ->" +j);
		    }	
          }
	}
}

/**
The first loop is O(N) and the second loop is O(M).
Since you don't know which is bigger, 
you say **this is O(N + M)**.
This can also be written as O(max(N, M)).
Since there is no additional space being utilised
the space complexity is constant / O(1)
**/
