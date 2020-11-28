import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Pattern {
    public static void main(String[] args) {
        starPattern();
//        right triangle Pattern
//rtp();

        /*
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         * * * * * * * * * *
         */
//        invert right  triangle pattern

        /** * * * * * * * * *
        * * * * * * * * *
        * * * * * * * *
        * * * * * * *
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        */
//        irtp();

//        *
//      *  *
//     *  *  *
//    *  *  *  *
//   *  *  *  *  *

//        pyramid( 5);
int [] x  = new int[]{1,2,3,4,4,3,2,1};
        System.out.println("args = " +Pattern.hasGroupsSizeX(x));
    }

    private static void pyramid(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    private static void irtp() {
        int column =10 ;
        for (int i = 0; i < column; i++) {

            for (int j = i; j <column-1; j++) {
                System.out.print("* ");

            }
            System.out.println("*");

        }
    }

    private static void rtp() {
            int column = 10;

            for (int i = 1; i <= column; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print("* ");


                }
                System.out.println("*");

            }

        }

    public static  boolean hasGroupsSizeX(int[] deck) {
        if (deck.length <= 1) {
            return false;
        }
        Map<Integer, Integer> times = new HashMap<>();
        for (int d: deck) {
            times.put(d, times.getOrDefault(d, 0) + 1);
        }

        int minTimes = Integer.MAX_VALUE;
        for (int key: times.keySet()) {
            minTimes = times.get(key) < minTimes ? times.get(key) : minTimes;
        }
        if (minTimes < 2) {
            return false;
        }
        for (int x = 2; x <= minTimes; x++) {
            boolean res = true;
            for (int key: times.keySet()) {
                if (times.get(key) % x != 0) {
                    res = false;
                    break;
                }
            }
            if (res) {
                return res;
            }
        }

        return false;
    }


    public static   void  starPattern(){
        int row =8;
       int  space = row - 1;
        for (int j = 1; j<= row; j++)
        {
            for (int i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j<= row - 1; j++)
        {
            for (int i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i<= 2 * (row - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}



