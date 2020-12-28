package com.easy;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class RepeatedStrings {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long strLen = s.length();
    	long multiples = 0;
    	if(n > strLen) {
    		multiples = (long) (n/strLen);
    	}
    	
    	int mod = (int) (n % strLen);
    	String subStr = s.substring(0,mod);
    	long tmpCount = countA(s);
    	long subStrACount = countA(subStr);
    	long finalCount = (tmpCount * multiples) + subStrACount;
    	
    	return finalCount;
    }

    private static long countA(String finalStr) {
    	long aCount = 0;
    	char[] charArray = finalStr.toCharArray();
    	for (char character : charArray) {
			if(character == 'a') {
				aCount ++;
			}
		}
    	return aCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}