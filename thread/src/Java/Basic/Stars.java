package Java.Basic;

class Stars {
	 public static void main(String[] args) {
//	 int row, numberOfStars;
//	 for (row = 1; row <= 10; row++) {
//	 for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
//	 System.out.print("*");
//	 }
//	 System.out.println(); // Go to next line
//	 }
	 /////
//	 int row, numberOfStars;
//	 for (row = 1; row <= 10; row++) {
//	 for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
//	 System.out.print("*");
//	 }
//	 System.out.println(); // Go to next line
//	 }
//
//	 }
	 
	 for(int i=1; i<=5; i++) 
		 for(int j=1; j<=5; j++) {
			 if(i==1 || (i+j==6) || i==5) {
			 System.out.println("*");
		 }else {
			 System.out.print(" ");
		 }
		 }System.out.println();
	 }
	 }
	 


