import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
//        func();
//        System.out.println("args = " + duplicateBracket("(a + b) + c + d"));;
//        System.out.println("IS Bal = " + balanceBracket("[(a + b) + {(c + d) * (e / f)}]"));;
    }

    private static boolean balanceBracket(String str) {
        Stack<Character> st  = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch  = str.charAt(i);

            if(ch =='(' || ch=='{' || ch=='['){
                st.push(ch);
            }else if (ch ==')'){
            return handleClosing(st,'(');
            }
            else if (ch =='}'){
                return handleClosing(st,'}');

            }
            else if (ch ==']'){
                return handleClosing(st,']');

            }

        }
        return false;
    }

    private static boolean handleClosing(Stack<Character> st, char c) {
        if (st.size()==0)
            return false;
        else if (st.peek()!=c)
            return false;
        else st.pop();
        return true;
    }

    private static boolean duplicateBracket(String str) {
//
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')') {
                if (st.peek() == '(')
                    return true;
                else {
                    while (  st.peek() != '(') {
                        st.pop();
                    }
                  st.pop();
                }

            } else {
                st.push(ch);

            }

        }

return  false;
    }

    private static void func() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println("Size " + stack.size());
        System.out.println(stack.peek());


    }
}
