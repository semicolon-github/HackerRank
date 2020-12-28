package com.easy;
import java.math.BigDecimal;
import java.util.Scanner;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int arrLength = arr.length;
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        for (int i : arr) {
            if (i > 0) {
                positiveCount++;
            } else if (i < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println(BigDecimal.valueOf((double)positiveCount/arrLength).setScale(6,BigDecimal.ROUND_HALF_UP));
        System.out.println(BigDecimal.valueOf((double)negativeCount/arrLength).setScale(6,BigDecimal.ROUND_HALF_UP));
        System.out.println(BigDecimal.valueOf((double)zeroCount/arrLength).setScale(6,BigDecimal.ROUND_HALF_UP));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
