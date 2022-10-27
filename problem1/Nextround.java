package problem1;

import java.util.*;
public class Nextround {
	public static void main(String[] args) {
			  Scanner in = new Scanner(System.in);
			  
			  int n=in.nextInt(),k=in.nextInt(),sum=0,i=0,c=0;
			  int[] tab = new int[n];
			 for(int j=0;j<n;j++) {
				 tab[j]=in.nextInt();
				 }
			 	c=tab[k-1];
			  while(i<n && tab[i]>=c && tab[i]!=0) {
							sum++;
							i++;
					}
			  		
			     System.out.print(sum);
    }

}
