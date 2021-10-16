import java.util.Scanner;

public class SolutionBitwise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter T: ");
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println("Enter a value for N: ");
            int N = scan.nextInt();
            System.out.println("Enter a value for K: ");
            int K = scan.nextInt();

            int max = 0;

            for (int j = 1; j < N; j++) {
                for (int k = j + 1; k <= N ; k++) {
                    int h = j & k;
                    if (h < K && max < h) {
                        max = h;
                    }

                }

            }

            System.out.println(max);

        }
    }
}
