import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
//        func();
//        System.out.println("args = " + duplicateBracket("(a + b) + c + d"));;
//        System.out.println("IS Bal = " + balanceBracket("[(a + b) + {(c + d) * (e / f)}]"));;
        int[] input = new int[]{2, 5, 9, 3, 1, 12, 6, 8, 7};
//        int [] output =nextGreaterElement(input);
//        output(output);
//        stockSpan();
//    histogram();
        celebrityProblem();
    }

    private static void celebrityProblem() {
        int[][] input = {{0, 1, 1, 0},
                {1, 0, 1, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 0}};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {// 0 -3
            stack.push(i); //0,1,2,3
        }
        while (stack.size() >= 2) {
            int i = stack.pop();//3
            int j = stack.pop();//2
            if (input[i][j] == 1) { // input[3]2[]
                stack.push(j);//2
            } else {
                stack.push(i);
            }

        }

        int x = stack.pop();//2
        for (int i = 0; i < input.length; i++) {
            if (i != x) { // 3!=2
                if (input[i][x] == 0 || input[x][i] == 1) {// input[3][2] == 0 || input[2][3] ==1
                    System.out.println("none");
                    return;
                }


            }
        }
        System.out.print(x + " "); // 2
    }


    private static void histogram() {
        int[] input = {6, 2, 5, 4, 5, 1, 3};
        int[] leftB = new int[input.length];
        int[] rightB = new int[input.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(input.length - 1);//6
        rightB[input.length - 1] = input.length;// 7
        for (int i = input.length - 2; i >= 0; i--) {

            while (stack.size() > 0 && input[i] < input[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                rightB[i] = input.length;
            } else {
                rightB[i] = stack.peek();
            }
            stack.push(i);

        }
        stack = new Stack<>();
        stack.push(0);//6
        leftB[0] = -1;

        for (int i = 1; i < input.length; i++) {

            while (stack.size() > 0 && input[i] < input[stack.peek()]) {
                stack.pop();
            }
            if (stack.size() == 0) {
                leftB[i] = -1;
            } else {
                leftB[i] = stack.peek();
            }
            stack.push(i);

        }

        int maxArea = 0;
        for (int i = 0; i < input.length; i++) {
            int width = rightB[i] - leftB[i];
            int area = width * input[i];
            if (area > maxArea) {
                maxArea = area;
            }
        }
        System.out.println("Max Area " + maxArea);
    }

    private static void output(int[] output) {
        for (int o = 0; o < output.length; o++) {
            System.out.print(output[o] + " ");

        }
    }

    private static void stockSpan() {
//        I.p = [2 5 9 3 1 12 6 8 7]
//        1 2 3 1 1 6 1 2 1

        int[] input = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] output = new int[input.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        output[0] = 1;
        for (int i = 1; i < input.length; i++) {
            while (st.size() > 0 && input[i] > input[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) output[i] = i + 1;
            else output[i] = i - st.peek();
            st.push(i);

        }
        output(output);
    }

    private static int[] nextGreaterElement(int[] input) {
        int[] nextGreater = new int[input.length];
        Stack<Integer> st = new Stack<>();
        st.push(input[input.length - 1]);
        nextGreater[input.length - 1] = -1;
        for (int i = input.length - 2; i >= 0; i--) {
            while (st.size() > 0 && input[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) nextGreater[i] = -1;
            else nextGreater[i] = st.peek();
            st.push(input[i]);
        }
        return nextGreater;
    }

    private static boolean balanceBracket(String str) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                return handleClosing(st, '(');
            } else if (ch == '}') {
                return handleClosing(st, '}');

            } else if (ch == ']') {
                return handleClosing(st, ']');

            }

        }
        return false;
    }

    private static boolean handleClosing(Stack<Character> st, char c) {
        if (st.size() == 0)
            return false;
        else if (st.peek() != c)
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
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }

            } else {
                st.push(ch);

            }

        }

        return false;
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
