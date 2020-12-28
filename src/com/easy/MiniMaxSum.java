package com.easy;
import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	int minSum = 0, maxSum = 0;
    	
    	int[] tmpArr = arr;
    	
    	Arrays.sort(tmpArr);
    	
    	for (int i = 0; i < tmpArr.length; i++) {
    		if(i!=tmpArr.length-1)
    			minSum += tmpArr[i];
    		if(i!=0)
    			maxSum += tmpArr[i];
		}
    	
    	System.out.println(minSum +" "+maxSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
