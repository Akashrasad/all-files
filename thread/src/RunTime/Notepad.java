package RunTime;

import java.util.*;
import java.io.*;
class Notepad {
 public static void main(String[] args) {
// Runtime rs = Runtime.getRuntime();
// try {
// rs.exec("notepad");
// }
// catch (IOException e) {
// System.out.println(e);
// } 
	 Runtime rs=Runtime.getRuntime();
	 try {
		rs.exec("notepad");
	 } catch (IOException e) {
		System.out.println(e);
		// TODO: handle exception
	}
 }
}