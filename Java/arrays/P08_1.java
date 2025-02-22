// Left Rotate array by 1 place

package arrays;

public class P08_1 {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		
		rotateArray(arr, n);
	}
	
	
	static void rotateArray(int arr[], int n) {
		
		int temp = arr[0];
		
		for(int i=1; i<n; i++)
			arr[i-1] = arr[i];
		
		arr[n-1] = temp;
		
		
		// Printing array
		for(int i=0; i<n; i++)
			System.out.print(arr[i] + " ");
	}

}
