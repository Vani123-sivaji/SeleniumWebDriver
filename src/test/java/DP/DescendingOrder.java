package DP;


	import java.util.Arrays;
	import java.util.Collections;

	public class DescendingOrder {
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 3};

	        // Sort in ascending
	        Arrays.sort(arr);

	        // Reverse manually
	        for (int i = 0; i < arr.length / 2; i++) {
	            int temp = arr[i];
	            arr[i] = arr[arr.length - 1 - i];
	            arr[arr.length - 1 - i] = temp;
	        }

	        System.out.println("Descending order: " + Arrays.toString(arr));
	    }
	}


