/**A. Team  Using BuffredReader (faster than the Scanner)
 374 ms 	300 KB   (vs 498 ms 	500 KB )*/
/**
 * @author Hamza
 *
 */
package problem1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Team {

	public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
    int s,count=0,n=Integer.parseInt(in.readLine());
    String[] Row;
    for(int i=0;i<n;i++) {
    	s=0;
    	/*for(int j=0;j<3;j++)
    		 s+=in.nextInt();
    	if(s>=2) {count++;
	   } 	
    }
    System.out.print(count);
    in.close();*/
    		
    	Row=in.readLine().split(" ");	
    	for(String e : Row)
    		s+=Integer.parseInt(e);
    	if(s>1) {count++;}
    	
    		
	}
    System.out.println(count);

}
}
