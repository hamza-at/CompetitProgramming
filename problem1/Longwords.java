package problem1;
import java.util.*;
public class Longwords {
public static void main(String args[]) {
	Scanner in= new Scanner(System.in);
    int n = in.nextInt();
   String a;
    for(int i=0;i<n;i++) {
    	a=in.next();
    	if(a.length()>10) {
    	
    	      System.out.println(a.charAt(0)+Integer.toString(a.length()-2)+a.charAt(a.length()-1));
    	     
    	}else {
    		 System.out.println(a);
        }
    	
    }
   
    in.close();
  }
}
