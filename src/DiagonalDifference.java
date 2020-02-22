import java.util.Scanner;

public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sum = 0;
        for(int i=0,j=a.length-1; i < a.length ; i++, j--){
            sum += (a[i][i] - a[i][j]);
        }
        return Math.abs(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}