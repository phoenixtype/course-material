import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();
        List<Integer> value = new ArrayList<>();

        while (N-- > 0) {
            Integer data = scan.nextInt();
            value.add(data);
        }

        int[] array = value.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(value);
        reversePrint(array);
        System.out.println();
        System.out.println(factorial(5));
    }

    private static void reversePrint(int[] numbers) {
        if (numbers.length == 0) {
            return;
        }
        int[] a = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            a[i] = numbers[i + 1];
        }
        reversePrint(a);
        System.out.print(numbers[0] + " ");
    }

    private static int factorial(int b) {
        if (b == 1) {
            return 1;
        }
        return b*factorial(b-1);
    }
}
