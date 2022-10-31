package people.tech.two;

import java.util.Scanner;

class Hotel1 {
	Scanner sc=new Scanner(System.in);
    public void TypeofRoom(int one){

        System.out.println("Non Ac Room Is added and You Have To Pay RS 2500");

    }
    public void TypeofRoom(int one, int two){
        System.out.println("A/c Room is Added You Have To Pay RS:3000");

    }

        public void Child(){
            System.out.println("You are Not a child you should be lesser than 10 age");
            System.out.println("Remaining All Details are added");
        }


   public void Child(String c1,int agech1) {
       System.out.println("child is Added");
       System.out.println("Remanig All Details are added");

   }

    public void Child(String ch1,int agech1,String ch2,int agech2){
        System.out.println(ch1+"Added and age is "+agech1+"child name "+ch2+"and Age "+agech2);
        System.out.println("Remaning All Details  are added");
    }
    
    public void Adullt(String A1,int ageA1){
        System.out.println("name is "+A1+"and age is "+ageA1+"added");
        System.out.println("Remaning All Details are added");

    }
    public void Adult(String A1,int ageA1,String A2,int ageA2){
        System.out.println("name is "+A1+"and age is "+ageA1+"name is "+A2+"and age is "+ageA2);
        System.out.println("Remaning all details are added");

    }


    public void Adullt(String adultName, int adultAge, String adultName1, int adultAge1) {
    }
}


    
    


