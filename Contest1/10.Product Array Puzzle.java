//Product Array Puzzle
//https://www.geeksforgeeks.org/problems/product-array-puzzle4525/1


//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
        	int[] array = new int[n];
        	for (int i=0; i<n ; i++ ) {
        		array[i] = sc.nextInt();
        	}
            Solution ob = new Solution();
            long[] ans = new long[n];
            ans = ob.productExceptSelf(array, n); 

           	for (int i = 0; i < n; i++) { 
				System.out.print(ans[i]+" ");
			} 
            System.out.println();
            t--;
        }
    } 
} 
  


// } Driver Code Ends


//User function Template for Java


class Solution
{
       static long product(int[] arr) {
        long m = 1;
        for (int i : arr) {
            if(i==0){
                m=m*1;
            }else{
            m *= i;
            }
        }
        return m;
    }

    
	public static long[] productExceptSelf(int arr[], int n) 
	{ 
        // code here
        int zeroCount = 0;
        int zeroIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            }
        }

        long[] res = new long[arr.length];
        if (zeroCount > 1) {
            // All elements will be zero
            return res;
        } else if (zeroCount == 1) {
            // Only the zero element will be the product of all others
            long m = product(arr);
            res[zeroIndex] = m;
            return res;
        } else {
            // No zeros, regular calculation
            long m = product(arr);
            for (int i = 0; i < arr.length; i++) {
                res[i] = m / arr[i];
            }
            return res;
        }
	}
} 

