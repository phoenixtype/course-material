import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class ResultHurdleRace {

    /*
     * Complete the 'hurdleRace' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY height
     */

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        //initialize a value int potion = 0;
        int potion = 0;
        int maxHeight = 0;
        for (Integer integer : height) {
            if (integer > maxHeight) {
                maxHeight = integer;
            }
        }
        if (maxHeight >= k) {
            potion = maxHeight - k;
        } else {
            return potion;
        }
        return potion;
//        //spin up a new list and sort the old list
////        List<Integer> sortList = new ArrayList<Integer>();
//        Collections.sort(height);
//        //get the index of the last element
//        height.get()
//        //check if the height value is greater than K
//        //if yes, subtract the value from k
//        //else return the potion as 0


    }

}

public class SolutionHurdleRace {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> height = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = ResultHurdleRace.hurdleRace(k, height);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
    }
}
