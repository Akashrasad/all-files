

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester
{
public static void main(String[] args)
{
	Configuration configuration = new Configuration();
	configuration.configure("HibStudent.cfg.xml");
	System.out.println("Works");
	SessionFactory factory = configuration.buildSessionFactory();
	Session session = factory.openSession();
	student student1 = new student();
	student1.setId(13);
	student1.setName("Apgx");
	student1.setJob("Maven Project");
	session.save(student1);
	session.beginTransaction().commit();
	
}
}




