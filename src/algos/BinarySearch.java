import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
	
  public static void main(String[] args) {
    int l = 0;
    int arr[] = {1,5,21,4,7,8,10};
	System.out.println("The position is going to be found.");

    int num = 21;
    Arrays.sort(arr);
    int r = (Array.getLength(arr) - 1);
    boolean mid1 = false;
    int mid = 0;
   // int i = 0;
    while(l != r) {
      //i++;
      if (arr[l] == num) {
    		System.out.println("The position of " + num + " is " + l + ".");
    		break;
    	} else if (arr[r] == num) {
    		System.out.println("The position of " + num + " is " + r + ".");
    		break;
    		
    	}
      if (((l+r) %2) == 0 )
      	mid = (l + r)/2;
      	
      else 
    	  mid = (l + r)/2 + 1;
    if (arr[mid] <= num) {
    	l = mid ; 
    		
    } else if (arr[mid] > num) {
    	r = mid;
    	   		
    }
   System.out.println(".");
    }
  }
  
    	
   
    
    
}
