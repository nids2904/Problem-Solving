import java.util.*;
import java.lang.*;
import java.io.*;

public class MissingNumber
 {
	public static void main (String[] args)
	 {
	    Scanner sc= new Scanner(System.in);
	    int numOfArray = sc.nextInt();
	 
	    int[] solution = new int[numOfArray];
	    
	    for(int i=0;i<numOfArray;i++){
	         int arrayLength = sc.nextInt();
	         int arraySum=0;
	         for(int j=0;j<arrayLength-1;j++){
	            arraySum += sc.nextInt();     
	         }
	         int expectedSum= arrayLength*(arrayLength+1)/2; // 1+2+3+4+......+n = n(n+1)/2
	         solution[i]=expectedSum-arraySum;
	    }
	    
	    for(int x: solution){
	        System.out.println(x);
	    }
	 }
}
