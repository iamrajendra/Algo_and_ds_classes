import java.util.*;

public class StringPrac {
    public static void main(String[] args) {
//        subString();
//        System.out.println("Palindrome = " + ispalindrome());
//ispalindromeSs();

//       compress1();
//       compress2();
//        long start = System.currentTimeMillis();

//        toggleString();
//        long end = System.currentTimeMillis();
//        System.out.println("The time difference = "+(end-start));

//        conDiff();
    }

    private static void conDiff() {
        String s = "acadbe";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            int diff = c2 - c1;
            sb.append(c1);
            sb.append(diff);

        }
        sb.append(s.charAt(s.length() - 1));
        System.out.println(sb);
    }

    private static void toggleString() {
        String s = "aBcDef";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c + 'A' - 'a');
            } else {
                c = (char) (c + 'a' - 'A');
            }
            System.out.print(c + " ");

        }
    }

    private static void compress2() {
        String s = "aaabbcccddaeef";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if (c1 != c2) {
                System.out.print(c1 + " ");
                System.out.print(count == 1 ? "" : count + " ");
                count = 1;
            } else {
                count++;
            }

        }
        System.out.println(s.charAt(s.length() - 1) + "");

    }

    private static void compress1() {
        String s = "aaabbcccddaeef";
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if (c1 != c2) {
                System.out.print(c1 + " ");
            }

        }
        System.out.println(s.charAt(s.length() - 1) + "");


    }

    private static void ispalindromeSs() {
        String s = "abccbc";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {
                String c = s.substring(i, j);
                if (ispalindrome(c)) {
                    System.out.print(c + " ");
                }

            }
        }

    }

    private static boolean ispalindrome(String string) {
//       Scanner s  = new Scanner(System.in);
//       String string  = s.next();
//       nitin
        int left = 0;
        int right = string.length();
        while (left < right) {
            char lc = string.charAt(left);
            char rc = string.charAt(right - 1);
            if (lc != rc) return false;

            left++;
            right--;
        }

        return true;
    }

    private static void subString() {
        String s = "abcd";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j <= s.length(); j++) {
                System.out.print(s.substring(i, j) + " ");

            }
        }


    }


}
