public class SolutionPalindrome {
    public static void main(String[] args) {
//        System.out.println(opposite(9009));
        int product = palindromeFinder(5);
        System.out.println(product);
    }

    private static int palindromeFinder(int x) {
        int upperLimit = (int) Math.pow(10, x) - 1;
        int lowerLimit = 1 + upperLimit / 10;

        for (int i = upperLimit; i >= lowerLimit; i--) {
            for (int j = upperLimit; j >= lowerLimit; j--) {
                int product = i * j;
                if (palindromeValidation(product)) {
                    System.out.println(i);
                    System.out.println(j);
                    return product;
                }
            }
        }
        return 0;
    }

    public static boolean palindromeValidation(int n) { //n==121 ... m= 121 if n=m
        int m = 0;
        int temp = n;

        while (n > 0) {
            m = m * 10 + n % 10; //1 | 12 |
            n = n / 10; // 12 | 1
        }
        return m == temp;
    }
}

// Java problem to find out the
// largest palindrome number
// which is product of two
// n digit numbers


// class GFG
//{
//
//// Function to calculate largest palindrome which is product of two n-digits numbers
//    static int largestPalindrome(int n)
//    {
//        int upper_limit = (int)Math.pow(10, n) - 1;
//
//
//        // largest number of n-1 digit.
//        // One plus this number
//        // is lower limit which is
//        // product of two numbers.
//
//        int lower_limit = 1 + upper_limit / 10;
//
//        // Initialize result
//        int max_product = 0;
//
//        for (int i = upper_limit; i >= lower_limit; i--)
//        {
//            for (int j = i; j >= lower_limit; j--)
//            {
//                // calculating product of two
//                // n-digit numbers
//                int product = i * j;
//                if (product < max_product)
//                    break;
//                int number = product;
//                int reverse = 0;
//
//                // calculating reverse of product
//                // to check whether it is
//                // palindrome or not
//                while (number != 0)
//                {
//                    reverse = reverse * 10 + number % 10;
//                    number /= 10;
//                }
//
//                // update new product if exist and if
//                // greater than previous one
//                if (product == reverse && product > max_product)
//                    max_product = product;
//            }
//        }
//        return max_product;
//    }
//
//    // Driver code
//    public static void main (String[] args)
//    {
//
//        int n = 2;
//        System.out.print(largestPalindrome(n));
//    }
//}
//
//// This code is contributed by Anant Agarwal.
