package arra;

import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *Java program which terminates itself by using System.exit() method , non zero call to exit() method denotes abnormal termination.
 */
public class JavaCloseExample {
   
    public static void main(String args[]) throws InterruptedException {
     
       Thread t = new Thread(){
            @Override
           public void run(){
               while(true){
                   System.out.println("User thread is running");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(JavaCloseExample.class.getName()).log(Level.SEVERE, null, ex);
                    }
               }
           }
       };
       
       t.start();
       Thread.sleep(200);
       System.out.println("terminating or closing java program");
       System.exit(1); //non zero value to exit says abnormal termination of JVM
    }
}
 

