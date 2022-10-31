
public class Main {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
