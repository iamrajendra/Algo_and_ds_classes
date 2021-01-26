import java.util.*;

public class DynamicPro {
    public static void main(String[] args) {
//        System.out.println(   fibonacci(5));
//        System.out.println(climpingStair(5,new  int[5+1]));
//        System.out.println(climpingStairTabulation(5));


    }

    /*private static int climpingStairTabulation(int i) {


        return false;
    }*/

    private static int climpingStair(int n, int [] qb) {
        if (n == 1 ) return n;
        else  if (n<0) return 0;
        if (qb[n] !=0) return qb[n];
        int nm1  =  climpingStair(n-1,qb);
        int nm2  =  climpingStair(n-2,qb);
        int nm3  =  climpingStair(n-3,qb);
        int res  = nm1+nm2+nm3;
        qb[n]  = res;
        return res;
    }

    private static int fibonacci(int n) {
      if (n==1 || n==0) return n;
      int fnm1  =  fibonacci(n-1);
        int fnm2  =  fibonacci(n-2);
        int res  = fnm1+fnm2;
//        qb[n]  = res;

        return res;
    }


}

