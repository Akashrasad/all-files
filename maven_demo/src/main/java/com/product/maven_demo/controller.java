package com.product.maven_demo;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		product p=new product();
		p.setId(1);
		p.setName("ring");
		p.setEmail("ab@gmail.cm");
		p.setType("hr");
		
//		p.getId();
//		p.getName();
//		p.getType();
//		p.getEmail();
		int id;
		@Override
		public String toString() {
			return "controller [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}

		
		try {
		System.out.println(id=p.getId());
		
		}catch (Exception e) {
			// TODO: handle exception
			System.err.println(p);
		
		}

	}

	
}
