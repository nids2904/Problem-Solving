import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc= new Scanner(System.in);
	    int numOfArray = sc.nextInt();
	 
	    int[] result = new int[numOfArray];
	    
	    for(int i=0;i<numOfArray;i++){
	         int arrayLength = sc.nextInt();
	         int currentArray[] = new int[arrayLength];
	         for(int j=0;j<arrayLength;j++){
	            currentArray[j] = sc.nextInt();     
	         }
	         result[i] = majorityElement(currentArray);
	    }
	    
	    for(int x: result){
	        System.out.println(x);
	    }
	 }
	 
	 private static int majorityElement(int[] arr){
	     
	     int element = findMajority(arr);
	     //validate majority element
	     int count = 0;
	     for(int x: arr){
	         if(x == element){
	             count++;
	         }
	         if(count > arr.length/2){
	             return element;
	         }
	     }
	     
	     return -1;
	 }
	 
	 //Boyer-moore voting algorithm
 	 private static int findMajority(int[] arr){
 	    int count = 0;
        Integer candidate = null;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
 	 }
}
