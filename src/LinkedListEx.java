import java.util.LinkedList;

public class LinkedListEx {
    static class Node {
        int data;
        Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public void add(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
        if (size == 0) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public static void main(String[] args) {
        define();
        LinkedListEx list = new LinkedListEx();
        list.removeFirst();

    }

    private void removeFirst() {
        if (size == 0) {
            System.out.print("List is empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }


    }

    private int getFirst() {
        if (size == 0) {
            System.out.println("link list is empty");
            return -1;
        } else {
            return head.data;
        }

    }

    private int getLast() {
        if (size == 0) {
            System.out.println("link list is empty");
            return -1;
        } else {
            return tail.data;
        }

    }

    private int getAt(int index) {
        if (size == 0) {
            System.out.println("link list is empty");
            return -1;
        } else if (index >= size || index < 0) {
            System.out.println("invalid request");
            return -1;

        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
            return temp.data;
        }

    }

    private static void define() {
        LinkedListEx list = new LinkedListEx();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        list.display();
    }

    private int size() {
        return size;
    }

    private void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();

    }

    public void addFirst(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = head;
        if (size == 0) {
            tail = temp;

        }
        size++;
    }

    public void addAt(int index, int val) {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (index < 0 || index > size) {
            System.out.println("Invalid request");
        } else if (index == 0) {
            addFirst(val);
        } else if (index == size) {
            addLast(val);

        } else {
            Node n = new Node();
            n.data = val;
            Node x = head;
            for (int i = 0; i < index - 1; i++) {
                x = x.next;
            }
            n.next = x.next;
            x.next = n;
            size++;


        }

    }

    private void removeLast() {
        if (size == 0) {
            System.out.println("Empty");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node temp = head;
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }
            tail = temp;
            temp.next = null;
            size--;

        }
    }

    private void removeAt(int index) {
        if (size == 0) {
            System.out.println("List is empty");
        } else if (index < 0 || index > size) {
            System.out.println("Invalid request");
        } else if (index == 0) {
            removeFirst();

        } else if (index == size - 1) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

    }

    private void addLast(int val) {
        Node temp = new Node();
        temp.data = val;
        temp.next = null;
        tail.next = temp;
        tail = temp;
        size++;
    }

    private int mid() {
        Node s, f;
        s = f = head;
        while (f.next != null && f.next.next != null) {
            s = s.next;
            f =f.next.next;
        }
        return s.data;
    }

    private void mergeLinkList(LinkL l1,LinkL l2 ){
        Node node1 = l1.head;
        Node node2  = l2.head;
        LinkedList result  = new LinkedList();
        while (node1!=null && node2!=null){
            if (node1.data <node2.data){
                result.addLast(node1.data);
            node1  =node1.next;
            }else {
                result.addLast(node2.data);
                node2 = node2.next;

            }
        }
        while (node1!=null){
            result.addLast(node1.data);
            node1  = node1.next;
        }
        while (node2!=null){
            result.addLast(node2.data);
            node2  = node2.next;
        }



    }
}
