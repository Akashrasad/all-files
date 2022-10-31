package roombooking;
import java.util.Scanner;

public class Booking1 {
       public void user() {
              Scanner sc=new Scanner(System.in);
              System.out.println("please 1. Mumbai");
              int a =sc.nextInt();
              System.out.println("please 2.Ooty");
              int b=sc.nextInt();
              System.out.println("please enter the location name");
              System.out.println("if it is location 1: please enter 1");
              System.out.println("if it is location 2:please enter 2");
              int c=sc.nextInt();
              int n ,k ,cost;
              if (c==1) {
                     System.out.println("for ac room:3000");
                     System.out.println("for non ac room :2500");
                     System.out.println("if ac please enter 1");
                     System.out.println("if non ac please enter 2");
                     int d=sc.nextInt();
                     if (d==1) {
                           
                     
                     if (a>=b) {
                           if (a%2==0) {
                                  n=a/2;
                                  System.out.println("no of rooms ="+n);
                                  System.out.println("cost of rooms"+(cost=n*3000));
                                  
                           }
                           else {
                                  n=a/2;
                                  System.out.println("no of rooms="+(cost=n+1));
                                  System.out.println("total cost"+(cost*3000));
                           }
                           
                     }
                     else if (a<b) {
                           if (a%2==0) {
                                  n=a/2;
                                  if (b-2%2==0) {
                                         k=b-2/2;
                                         System.out.println("no of rooms ="+(cost=n+k));
                                         System.out.println("total cost of rooms"+(cost*3000));
                                         
                                  }
                                  else {
                                         n=a/2;
                                         if (b-2%2==0) {
                                                k=b-2/2;
                                                System.out.println("no of rooms ="+(cost=n+k+1));
                                                System.out.println("total cost"+cost*3000);
                                                
                                         
                                  }
                                  
                                  
                           }
                           }
                           
                           
                           
                     
                     
                     
              }
              }
                     else if (d==2) {
                           
                           
                           if (a>=b) {
                                  if (a%2==0) {
                                         n=a/2;
                                         System.out.println("no of rooms ="+n);
                                         System.out.println("cost of rooms"+(cost=n*2500));
                                         
                                  }
                                  else {
                                         n=a/2;
                                         System.out.println("no of rooms="+(cost=n+1));
                                         System.out.println("total cost"+(cost*2500));
                                  }
                                  
                           }
                     
                            if (a<b) {
                                  if (a%2==0) {
                                         n=a/2;
                                         if (b-2%2==0) {
                                                k=b-2/2;
                                                System.out.println("no of rooms ="+(cost=n+k));
                                                System.out.println("total cost of rooms"+(cost*2500));
                                                
                                         }
                                         else {
                                                n=a/2;
                                                if (b-2%2==0) {
                                                       k=b-2/2;
                                                       System.out.println("no of rooms ="+(cost=n+k+1));
                                                       System.out.println("total cost"+cost*2500);
                                                       
                                                
                                         }
                                         
                                         
                                  }
                                  }
                                  
                                  
                                  
                           
                           
                           
                     }
                     }
                     
              }
              else if (c==2) {
                     System.out.println("for ac room:2000");
                     System.out.println("for non ac room :1800");
                     System.out.println("if ac please enter 1");
                     System.out.println("if non ac please enter 2");
                     int d=sc.nextInt();
                     if (d==1) {
                           
                     
                     if (a>=b) {
                           if (a%2==0) {
                                  n=a/2;
                                  System.out.println("no of rooms ="+n);
                                  System.out.println("cost of rooms"+(cost=n*2000));
                                  
                           }
                           else {
                                  n=a/2;
                                  System.out.println("no of rooms="+(cost=n+1));
                                  System.out.println("total cost"+(cost*2000));
                           }
                           
                     }
                     else if (a<b) {
                           if (a%2==0) {
                                  n=a/2;
                                  if (b-2%2==0) {
                                         k=b-2/2;
                                         System.out.println("no of rooms ="+(cost=n+k));
                                         System.out.println("total cost of rooms"+(cost*2000));
                                         
                                  }
                                  else {
                                         n=a/2;
                                         if (b-2%2==0) {
                                                k=b-2/2;
                                                System.out.println("no of rooms ="+(cost=n+k+1));
                                                System.out.println("total cost"+cost*2000);
                                                
                                         
                                  }
                                  
                                  
                           }
                           }
                           
                           
                           
                     
                     
                     
              }
              }
                     else if (d==2) {
                           
                           
                           if (a>=b) {
                                  if (a%2==0) {
                                         n=a/2;
                                         System.out.println("no of rooms ="+n);
                                         System.out.println("cost of rooms"+(cost=n*1800));
                                         
                                  }
                                  else {
                                         n=a/2;
                                         System.out.println("no of rooms="+(cost=n+1));
                                         System.out.println("total cost"+(cost*1800));
                                  }
                                  
                           }
                           else if (a<b) {
                                  if (a%2==0) {
                                         n=a/2;
                                         if (b-2%2==0) {
                                                k=b-2/2;
                                                System.out.println("no of rooms ="+(cost=n+k));
                                                System.out.println("total cost of rooms"+(cost*1800));
                                                
                                         }
                                         else {
                                                n=a/2;
                                                if (b-2%2==0) {
                                                       k=b-2/2;
                                                       System.out.println("no of rooms ="+(cost=n+k+1));
                                                       System.out.println("total cost"+cost*1800);
                                                       
                                                
                                         }
                                         
                                         
                                  }
                                  }
                                  
                                  
                                  
                                  
                           
                           
                           
                     }
                     }
                     
              }
              else {
                     System.err.println("select valid data");
              }
       }
              public static void main(String[] args)
              {
             Booking1 b1=new booking1();
             b1.user();
       }
}

            