import java.util.Arrays;
import java.util.Stack;

public class StackImpl {
    int[] array;
    int tos;

    public StackImpl(int capicity) {
        array = new int[capicity];
        tos = -1;
    }

    public static void main(String[] args) {
        StackImpl stack = new StackImpl(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        System.out.println("Size " + stack.size());
        System.out.println("Top " + stack.top());
        System.out.println("POP " + stack.pop());
        stack.display();

    }

    public int size() {
        return tos + 1;
    }

    public int top() {
        if (tos == -1) {
            System.out.println("under flow");
            return -1;
        } else {
            return array[tos];
        }

    }

    public int pop() {
        if (tos == -1) {
            System.out.println("under flow");
            return -1;
        } else {
            int val = array[tos];
            tos--;
            return val;
        }

    }

    public void push(int element) {
        if (tos == array.length - 1) {
            System.out.println("Over flow");
        } else {
            tos++;
            array[tos] = element;
        }
    }

    private void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(" " + String.format("[%d]", array[i]));

        }
        System.out.println();
    }
}
