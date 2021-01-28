import java.util.Arrays;

public class QueueImpl {
    int [] array;
    int front;
    int size;
    public QueueImpl(int capacity) {
    array  = new int[capacity];
    front =0;
    size  =0;
    }

    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl(10);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.display();
        System.out.println(queue.size());

        System.out.println(queue.peek());
        queue.remove();
        queue.display();
    }

    private int size() {
        return size;

    }

    private int remove() {
        if (size==0){
            System.out.println("under flow");
            return -1;
        }else {
            int val  = array[front];
            front = (front+1)%array.length;
            size--;
            return val;
        }

    }

    private int peek() {
        if (size ==0){
            System.out.println("under flow");
            return -1;
        }else {
            return array[front];
        }

    }

    private void display() {
        for (int i = 0; i < size; i++) {
            int idx  = (front+i)%array.length;
            System.out.print(" "+array[idx]);
        }
        System.out.println();
    }

    private void add(int val) {
        if (size == array.length){
            System.out.println("Over flow");

        }else {
            int rear = (front+size)%array.length;
            array[rear]  =val;
            size++;

        }
    }
}
