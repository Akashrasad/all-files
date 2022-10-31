

public class trycatch {
	public static void main(String[] args) {
		try {
		System.out.println("hello");
			Thread.sleep(10000);
			System.out.println("world");
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("error");
		}
	}

}
