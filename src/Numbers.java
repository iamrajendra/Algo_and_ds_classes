public class Numbers {
    /*
     * This contains fibinica , gcd,lcm ,prime factors and prime number.
     * */
    public static void main(String[] args) {

//        primeFactorization();

//        countNumberOfDigit();
//        printNoOfDigit();
//        reverseNumberOfDigit();
        pythaghorustriple();
    }

    private static void pythaghorustriple() {
        int a = 5;
        int b = 12;
        int c = 13;
        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (max == a) {
            Boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else if (max == b) {
            Boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);
        } else {
            Boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);

        }
    }

    private static void reverseNumberOfDigit() {
        int n =438;
        while (n!=0){
            int r  = n%10;
            System.out.print(r);
            n =n/10;

        }
    }

    private static void countNumberOfDigit() {
        int  n = 8976 ;
        int dig= 0 ;
        while(n != 0){
            dig++;
            n = n/ 10;

        }
        System.out.println(dig);
    }


    private static void printNoOfDigit() {
        int  n = 8976 ;
        int temp =n;
        int dig= 0 ;
        while(temp != 0){
            dig++;
            temp = temp/ 10;

        }
int digit = (int) Math.pow(10,dig-1);

        while (n!=0){
int q  = n/digit;
            System.out.println(q);
            n  = n%digit;


            digit  = digit/10;
        }



    }



    public  static  void  primeFactorization(){

        int  n = 24;
        for(int i = 2 ; i <= n ;i++){
            while(n%i == 0){

                System.out.println(i);
                n = n / i ;
            }}
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
