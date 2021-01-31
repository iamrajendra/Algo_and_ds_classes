import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GenericTree {
    private static class Node {
        int data;
        List<Node> children = new ArrayList<>();

    }
//10 -> 20,30,40

    public static void main(String[] args) {
        int[] array = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
        Node root = null;
        Stack<Node> st = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                st.pop();
            } else {
                Node temp = new Node();
                temp.data = array[i];
                if (st.size() > 0) {
                    st.peek().children.add(temp);
                } else {
                    root = temp;
                }
                st.push(temp);
            }
//            display(root);
            GenericTree genericTree = new GenericTree();
//            int size = genericTree.size(root);
            //System.out.println("Size "+size);
//            int maxSize = maxMem(root);
//            System.out.println(" Max Size " + maxSize);
//            int heigh = height(root);
            //  System.out.println("Height Of Tree"+heigh);
            genericTree. gTMirror(root);
        }

    }

    public static void display(Node node) {
        String str = "" + node.data + "->";
        for (Node child : node.children) {
            str += child.data + ",";

        }
        str += ".";
        System.out.println(str);
        for (Node child : node.children) {
            display(child);
        }

    }

    public int size(Node node) {
        int s = 0;
        for (Node child : node.children) {
            int val = size(child);
            s = s + val;

        }
        s = s + 1;

        return s;
    }

    public static int maxMem(Node node) {
        int max = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int val = maxMem(child);
            max = Math.max(val, max);
        }
        max = Math.max(node.data, max);

//        System.out.println("The max is"+max);
        return max;


    }

    public static int height(Node node) {
        int h = -1;
        /*for (Node child : node.children) {

            int ch = height(child);
            h = Math.max(ch,h);

        }*/
        int i;
        for (i = 0; i < node.children.size(); i++) {
            int ch = height(node.children.get(i));
            h = Math.max(ch, h);

        }
        if (i == node.children.size())
            System.out.println(h);
        h += 1;
        return h;

    }

    public void gTMirror(Node node) {
        for (Node child : node.children) {
            gTMirror(child);
        }
        Collections.reverse(node.children);
        display(node);

    }

}
