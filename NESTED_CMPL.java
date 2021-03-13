class  NESTED_CMPL
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

		  for(int k =0; k<5 ; k++)
		{
				System.out.println(k + " k Value");
		}
	}
}


/**
The first set of nested loops is O(N^2) and 
   the second loop is O(N). 
   This is O(max(N^2,N)) which is O(N^2). 
**/
