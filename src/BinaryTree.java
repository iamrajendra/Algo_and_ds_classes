import java.util.Stack;

public class BinaryTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static class Pair {
        Node node;
        int state;

        public Pair(Node node, int state) {
            this.node = node;
            this.state = state;
        }
    }

    public static void main(String[] args) {
        Integer[] input = {50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null};
        Node root = new Node(input[0], null, null);
        Stack<Pair> st = new Stack<Pair>();
        Pair p = new Pair(root, 1);
        st.push(p);
        int index = 0;
        while (st.size() > 0) {
            Pair top = st.peek();
            if (top.state == 1) {
                index++;

                if (input[index] != null) {
                    top.node.left = new Node(input[index], null, null);
                    Pair left = new Pair(top.node.left, 1);
                    st.push(left);
                } else {
                    top.node.left = null;
                }
                top.state++;
            } else if (top.state == 2) {
                index++;
                if (input[index] != null) {
                    top.node.right = new Node(input[index], null, null);
                    Pair r = new Pair(top.node.right, 1);
                    st.push(r);
                } else {
                    top.node.right = null;
                }
                top.state++;


            } else {
                st.pop();
            }
        }
//        display(root);
        System.out.println("Sum " + sum(root));
        System.out.println("size " + size(root));
    }

    private static void display(Node node) {
        String str = "";
        if (node == null)
            return;
        str += node.left == null ? "," : node.left.data + "";
        str += "<-" + node.data + "->";
        str += node.right == null ? "," : node.right.data + "";
        System.out.println(str);
        display(node.left);
        display(node.right);
    }

    private static int size(Node node) {
        if (node == null)
            return 0;
        int ls = size(node.left);
        int rs = size(node.right);
        int total = ls + rs + 1;
        return total;


    }

    private static int sum(Node node) {
        if (node == null)
            return 0;
        int lsm = sum(node.left);
        int rsm = sum(node.right);
        int total = lsm + rsm + node.data;
        return total;
    }

    private static int max(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int lm = max(node.left);
        int rm = max(node.right);
        int t = Math.max(node.data, Math.max(lm, rm));
        return t;
    }

    private static int height(Node node) {
        if (node == null)
            return -1;

        int lh = height(node.left);
        int rh = height(node.right);
        int t = Math.max(lh,rh)+1;
        return t;
    }


}
