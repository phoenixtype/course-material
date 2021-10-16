import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N  = scan.nextInt();

        String emailRegEx = ".@gmail\\.com$";
        Pattern pattern = Pattern.compile(emailRegEx);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String name = scan.next();
            String email = scan.next();
            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) {
                list.add(name);
            }

        }
        scan.close();

        Collections.sort(list);

        list.forEach(System.out::println);
    }
}