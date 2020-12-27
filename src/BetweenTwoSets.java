import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Stream;

class Result {

	/*
	 * Complete the 'getTotalX' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
	 */

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		// Write your code here

		int validCount = 0;

		int n = a.size();
		int m = b.size();
		int lower_bound = a.get(n - 1);
		int upper_bound = b.get(0);

		for (int i = lower_bound; i <= upper_bound; i = i + lower_bound) {
			int sum_mod = 0;
			for (int j = 0; j < n; j++) {
				sum_mod += i % a.get(j);
			}
			for (int k = 0; k < m; k++) {
				sum_mod += b.get(k) % i;
			}

			if (sum_mod == 0)
				++validCount;
		}
		return validCount;
	}
}

public class BetweenTwoSets {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = Result.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
