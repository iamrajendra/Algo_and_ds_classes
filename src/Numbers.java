import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Numbers {
    /*
     * This contains fibinica , gcd,lcm ,prime factors and prime number.
     * */
    public static void main(String[] args) {



    }







    private static void fibonica() {
        int n = 10;
        int a = 0;
        int b = 1;
        int i = 1;


        while (i < n) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }


    }

    private static void gcd() {
        int n1 = 81, n2 = 153, gcd = 1;
        int i = 1;
        while (i <= n1 && i <= n2) {

            if (n1 % i == 0 && n2 % i == 0) gcd = i;
            i++;

        }

        System.out.println(String.format("GCD of %d and %d is %d", n1, n2, gcd));
    }


    private static void lcm() {
        int n1 = 5, n2 = 9, lcm;

        // maximum number between n1 and n2 is stored in lcm
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while (true) {
            if (lcm % n1 == 0 && lcm % n2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }


    // want to know the prime factor
    private static void primefactor() {
        int n = 900;
        int i = 2;

        while (n > 1) {

            if (n % i == 0) {
                n = n / i;
                System.out.println(i);
                i = 2;

            }
            i++;

        }

    }

    // check prime no or not
    private static void primeNo() {
        int n = 9;
        int i = 3;
        if (n == 2) {
            System.out.println("not prime no");
            return;
        }
        if (n == 3) {
            System.out.println("prime no");
            return;
        }

        while (i < n - 1) {

            if (n % i == 0) {

                System.out.println("not prime no");
                return;
            }
            i++;
        }
        System.out.println("prime no");


    }


}
