import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SolutionCatAndMouse {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(z - x) < Math.abs(y - z)) {
            return "Cat A";
        } else if (Math.abs(y - z) < Math.abs(z - x)) {
            return "Cat B";
        }
        return "Mouse C";
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] xyz = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xyz[0]);

            int y = Integer.parseInt(xyz[1]);

            int z = Integer.parseInt(xyz[2]);

            String result = catAndMouse(x, y, z);
            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

        bufferedReader.close();

//        bufferedWriter.close();

        scanner.close();
    }
}
