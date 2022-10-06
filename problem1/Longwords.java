package problem1;
import java.util.*;
public class Longwords {
public static void main(String args[]) {
	Scanner in= new Scanner(System.in);
    int n = in.nextInt();
   String a;
    String[] tab= new String[n];
    for(int i=0;i<n;i++) {
    	a=in.next();
    	if(a.length()>10) {
    		char begin = a.charAt(0);
    	      char end = a.charAt(a.length()-1);
    	      tab[i]=begin+Integer.toString(a.length()-2)+end;
    	     
    	}else {
    	tab[i]=a;
        }
    	 System.out.println(tab[i]);
    }
   
    in.close();
  }
}
