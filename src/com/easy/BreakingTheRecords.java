package com.easy;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BreakingTheRecords {

	// Complete the breakingRecords function below.
	static int[] breakingRecords(int[] scores) {
		int minScore = Integer.MIN_VALUE, maxScore = Integer.MIN_VALUE;
		int minCount = 0, maxCount = 0;
		for (int i = 0; i < scores.length; i++) {
			if(i==0) {
				minScore = maxScore = scores[i];
				continue;
			}
			if(scores[i] < minScore && scores[i]!=0) {
				minScore = scores[i];
				minCount++;
				continue;
			}
			if(scores[i] > maxScore) {
				maxScore = scores[i];
				maxCount++;
				continue;
			}
		}
		return new int[] {maxCount,minCount};
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] scores = new int[n];

		String[] scoresItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int scoresItem = Integer.parseInt(scoresItems[i]);
			scores[i] = scoresItem;
		}

		int[] result = breakingRecords(scores);

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
