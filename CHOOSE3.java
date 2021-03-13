class CHOOSE3 
{
	public static void main(String[] args) 
	{
		    int icount = 0;
			int jcount=0;
	
	
	// option d, but in limit mentioned value is  i >-1 
	//which will run infinite
		for(int i= 10000;  i>0 ; i/=2)   
		
		{
              icount++;
			  System.out.println(" i count ==> "+icount + " i Value is ==>"+i);
		}


            // option c
		for(int j=1; j<10000; j=j*2)                  
		{
			jcount++;
        System.out.println(" j count ==> "+jcount + " i Value is ==>"+j);
		}
	}
}
