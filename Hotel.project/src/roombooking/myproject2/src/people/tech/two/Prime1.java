
package people.tech.two;
public class Prime1 {

	public static void main(String[] args) 
	{
		int i, number, count; 
		
		System.out.println(" Prime Numbers from 20 to 40 are : ");	
		for(number = 20; number <= 40; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
}
