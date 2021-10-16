import java.io.*;
import java.util.stream.IntStream;

class ResultUtopianTree {

    /*
     * Complete the 'utopianTree' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int utopianTree(int n) {
        // Write your code here
        //if spring x2 & if summer + 1
        int height = 1;

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return 2;
        }

        for (int i = 1; i <= n / 2; i++) {
            height = height * 2;
            height++;
        }

        if (n % 2 == 0) {
            return height;
        } else {
            return height * 2;
        }
    }

}

public class SolutionUtopianTree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = ResultUtopianTree.utopianTree(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
