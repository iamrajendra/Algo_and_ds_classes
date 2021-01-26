import java.util.*;

public class RecursionPrac {
    public static void main(String[] args) {
//        printDec(5);
        // printInc(5);
//        printIncDec(5);
//        System.out.println("args = " + fact(5));;
//        int ans =  lpw(2,10);
//        System.out.println(ans);

//        tuh("a", "b", "c", 3);

//        int [] a  =  new int[]{10,20,70,40,50};
//        dArray(a,0);
//rdArray(a,0);
//        System.out.println(maxA(a,0));
//        System.out.println(subSeq("abc"));
//        System.out.println(getStairPazzth(3)); ;
//        System.out.println(getMazepath(1, 1,3,3)); ;
       String str  = "abc";
        permutation(str,"");
    }

    private static void permutation(String str, String s) {
        if (str.length()==0) {
            System.out.println(s+"");
            return;
        }
        for (int i = 0; i < str.length() ; i++) {
//            a
            char c = str.charAt(i);
//            b
            String l  = str.substring(0,i);
//            c
            String r  = str.substring(i+1);

            String ros  = l+s;
            permutation(ros,s+c);

        }
    }

    private static List<String> getMazepath(int sr, int sc, int dr, int dc) {
if (sr>dr || sc > dc){
    return  new ArrayList<>();
}else  if (sr == dr  && sc == dc){
    List<String>  empty  = new ArrayList<>();
    empty.add("");
    return  empty;

}

        List<String> hPath  =  getMazepath(sr,sc+1,dr,dc);
        List<String> vPath  =  getMazepath(sr+1,sc,dr,dc);
        List<String> path  = new ArrayList<>();
        for (String hP: hPath) {
            path.add("h"+hP);

        }

        for (String vP: vPath) {
            path.add("v"+vP);

        }

        return path;
    }

    private static List<String> getStairPazzth( int n) {
        if (n==0) {
            List<String>  bes = new ArrayList<>();
            bes.add("");
            return bes;
        }else if (n<0){
            List<String>  bes = new ArrayList<>();
return  bes;
        }

        List<String> path1 =   getStairPazzth(n-1);
        List<String> path2 =   getStairPazzth(n-2);
        List<String> path3 =   getStairPazzth(n-3);
        List<String> path  = new ArrayList<>();
        for (String p:path1) {
            path.add(1+p);

        }
        for (String p:path2) {
            path.add(2+p);

        }
        for (String p:path3) {
            path.add(3+p);

        }

return  path;
    }

    private static List<String>  subSeq(String str) {
        if(str.length() == 0) {
            List<String> empty  = new ArrayList<>();
            empty.add("");
            return  empty;
        }
    char s  = str.charAt(0);
    String ros = str.substring(1);
        List<String>  res  =  subSeq(ros); // --,bc,b,c
        List<String> mainResult  = new ArrayList<>();
        for (String i:res) {
            mainResult.add(i);
        }
        for (String j:res) {
            mainResult.add(s+j);
        }

        return mainResult;
    }

    private static int maxA(int[] a, int index) {
      if (a.length -1 == index) return a[index];
        int v  = maxA(a,index+1);
        if (v>a[index]) return  v;
        else return  a[index];
    }

    private static void rdArray(int[] a, int index) {
        if (a.length== index) return;
        rdArray(a,index+1);
        System.out.println(+a[index]+" ");
    }

    private static void dArray(int[] a, int index) {
//        lla
        if (a.length==index) return   ;
//         exp  = 1+2
//        first index (1)
        System.out.print(a[index]+" ");
//      faith (2)
        dArray(a,index+1);



    }

    private static void tuh(String source, String destination, String helper, int n) {
        if(n==0) return ;
        tuh(source, helper, destination, n - 1);
        System.out.println(String.format("%d [%s -> %s]",n, source, destination));
        tuh(helper, destination, source, n - 1);


    }

    private static int lpw(int base, int n) {
        if (n == 0) return 1;
        int xpnm1 = lpw(base, n - 1);
        int pw = base * xpnm1;
        return pw;
    }

    private static int fact(int n) {
        if (n == 0) return 1;
        int fnm1 = fact(n - 1);
        int fn = fnm1 * n;
        return fn;
    }

    private static void printIncDec(int n) {
//        out  54321 12345
        if (n == 0)
            return;
        /*printIncDec(n-1);
        System.out.print( n+" ");
        printIncDec(n-1);
*/
        System.out.print(n + " ");
        printIncDec(n - 1);
        System.out.print(n + " ");
    }

    private static void printInc(int n) {
//        Expecton [5]  1,2,3,4,5
//        faith [4] 1,2,3,4
//        exp  = faith +n
        if (n == 0) return;
        printInc(n - 1);
        System.out.println(n);

    }

    private static void printDec(int n) {
//        LLA
        if (n == 0) return;
//        HLA
        System.out.println(n);
        printDec(n - 1);
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            backtrack("", digits);
        return output;
    }

    static Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    static List<String> output = new ArrayList<String>();

    public static void  backtrack(String combination, String next_digits) {
        // if there is no more digits to check
        if (next_digits.length() == 0) {
            // the combination is done
            output.add(combination);
        }
        // if there are still digits to check
        else {
            // iterate over all letters which map
            // the next available digit
            String digit = next_digits.substring(0, 1);
            String letters = phone.get(digit);
            for (int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i + 1);
                // append the current letter to the combination
                // and proceed to the next digits
                backtrack(combination + letter, next_digits.substring(1));
            }
        }
    }



}
