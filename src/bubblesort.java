
public class bubblesort {
	
	public static void main(String[] args) {
		
	
	int[] arr = {1,76,5,56,4,54};
	
	  int n = arr.length;  
      int temp = 0;  
       for(int i=0; i < n; i++){  
               for(int j=1; j < (n-i); j++){  
                        if(arr[j-1] > arr[j]){  
                               //swap elements  
                               temp = arr[j-1];  
                               arr[j-1] = arr[j];  
                               arr[j] = temp;  
                       }  
                        
               }  
             }
}
}