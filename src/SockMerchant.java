import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SockMerchant {

    // Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {
		int matchingPairs = 0;
		int[] copyOf = Arrays.copyOfRange(ar, 0, n);
		Map<Integer, Long> map = IntStream.of(copyOf).boxed()
				.collect(Collectors.groupingBy(e -> e, Collectors.counting()));

		Set<Entry<Integer, Long>> entrySet = map.entrySet();
		for (Entry<Integer, Long> entry : entrySet) {
			Integer key = entry.getKey();
			Long value = map.get(key);
			matchingPairs = matchingPairs + (int) (value / 2);
		}

		return matchingPairs;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
