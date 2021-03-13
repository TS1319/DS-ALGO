class NESTED_CMPL3 
{
	public static void main(String[] args) 
	{
			int count = 0;

		for(int i=10; i> 0; i=i/2)
		{
			for(int j=0; j<i; j++)                        
			{
			count++;
			System.out.println(count + "  i value ->" +i+ " j  value ->" +j);
		    }	
          }
	}
}
