import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ResultCountingValley {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int valleyCounter = 0;
        int altitude = 0;

        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                altitude++;
                if (altitude == 0) {
                    valleyCounter++;
                }
            } else {
                altitude--;
            }
        }
        return valleyCounter;
    }
}

public class SolutionCountingValley {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = ResultCountingValley.countingValleys(steps, path);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
