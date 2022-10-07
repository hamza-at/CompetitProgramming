/** A. Team */
/**
 * @author Hamza
 *
 */
package problem1;
import java.util.*;
public class Team {

	public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    int s,count=0, n=in.nextInt();
 
    for(int i=0;i<n;i++) {
    	s=0;
    	for(int j=0;j<3;j++)
    		 s+=in.nextInt();
    	if(s>=2) {count++;
	   } 	
    }
    System.out.print(count);
    in.close();
	}

}
