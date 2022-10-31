package people.tech.two;

public class Inheritance {

	
	
	    public static void main(String[] args) {
	        Bajajmotors b=new Bajajmotors();
	        b.Cycle();
	        b.motor();
	        b.power();
	    }
	}
	class Cycle
	{
	    public static void  Cycle()
	        {
	            System.out.println("We have two  tyres");
	            
	        }
	}
	class Bike extends Cycle
	{
	    public static void motor()
	        {
	            System.out.println("We have motor");
	        }
	}
	class Bajajmotors extends Bike
	{
	    public static void power()
	        {
	            System.out.println("we have power motor");
	        }
	}