package roombooking;

public class Interface3 implements Face2,Face1
{
public void student(){
	System.out.println("student name");
}
public void Rollno(){
	System.out.println("roll number of the student");
}
public void dresscode(){
	System.out.println("dress code");
}

public void school() {
	System.out.println("school name");
}
	public void Area()
	{
		System.out.println("Area of school");
	}
	public void location()
	{
		System.out.println("location of school");
	
		}
	public static void main(String[] args)
	{
		Interface3 i=new Interface3();
		i.student();
		i.Rollno();
		i.dresscode();
		i.school();
		i.Area();
		i.location();
	
	}
}	




