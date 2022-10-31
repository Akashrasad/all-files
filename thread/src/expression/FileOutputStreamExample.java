package expression;

import java.io.FileOutputStream; 
public class FileOutputStreamExample { 
 public static void main(String args[]){ 
 try{ 
 FileOutputStream fout=new FileOutputStream("C:\\testout.txt.txt"); 
 fout.write(67); 
 fout.close(); 
 System.out.println("success.. by gayi."); 
 }catch(Exception e){System.out.println(e);} 
 } 
} 