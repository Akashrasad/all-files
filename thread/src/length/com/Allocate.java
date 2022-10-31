package length.com;
//Advantage of Finally in Exception Handling java Program
class Allocate {
	 public static void main(String[] args) {
	 try {
	 long data[] = new long[1000000000];
	 }
	 catch (Exception e) {
	 System.out.println(e);
	 }
	 finally {
	 System.out.println("finally block will execute always.");
	 }
	 }
	}
/*
 public static void doStuff(){
 int a=5;
 while(a<50){
 syso("hi");
 a++;
 }}
 */