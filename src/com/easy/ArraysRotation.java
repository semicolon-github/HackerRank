package com.easy;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysRotation {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {
		int[] result = new int[a.length];

		if (d == 0) {
			return a;
		}
		if (d > a.length) {
			d = d - a.length;
		}

		int[] end = Arrays.copyOfRange(a, 0, d);
		int[] start = Arrays.copyOfRange(a, d, a.length);
		
		int i = 0;
		for (; i < start.length; i++) {
			result[i] = start[i];
		}
		for (int j = 0; j < end.length; i++, j++) {
			result[i] = end[j];
		}
		
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] nd = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nd[0]);

		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];

		String[] aItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		
		System.out.println(Arrays.toString(a));

		int[] result = rotLeft(a, d);

		for (int i = 0; i < result.length; i++) {
			bufferedWriter.write(String.valueOf(result[i]));

			if (i != result.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
