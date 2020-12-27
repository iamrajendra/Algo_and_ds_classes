import javax.naming.SizeLimitExceededException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) throws InterruptedException {

//        spanOFArray();
//        findElementInArray();
//barOfArray();

        //sumOfTwoArray();
//        diffOfTwoArray();
        reverseTheNumber();
    }

    private static void reverseTheNumber() {
        int [] num =  new int[]{1,2,3,4,5};
        int i  = num.length-1;
        int[] res =  new int[i];
        int j =0;
        while(true){
            res[j] = num[i];
            if (i!=0)
                break;
        j++;
        i--;
        }
        System.out.println(Arrays.toString(res));
    }

    private static void diffOfTwoArray() {
        Integer [] a  =  new Integer[]{3,3,3,3,3};
        Integer [] b  =  new Integer[]{9,9,9,9};

        if (a.length>b.length){
            ArrayList<Integer> temp= new ArrayList<Integer>(Arrays.asList(b));
            temp.add(0,0);
            b  = temp.toArray(new Integer[0]);

        }

        int [] res =  new int[a.length];
        int i = a.length-1;
        int j= a.length-2;
        while(i!=0 ){

            if(a[i]>b[i]){

                res[i] = a[i]- b[i];
            }else {
               a[j]= a[j]-1;
                res[i] = 10+a[i] -b[i];
            }

            i--;
            j--;
        }
        System.out.println(Arrays.toString(res));


    }

    private static void sumOfTwoArray() {
        int[] a = new int[]{9, 3, 4, 6, 8};
        int[] b = new int[]{1, 9, 8, 8, 0, 8};
        int[] arrayA;
        int[] arrayB;

        if (a.length > b.length) {
            arrayA = a;
            arrayB = b;
        } else {
            arrayB = a;
            arrayA = b;
        }
        int n = arrayA.length - 1;
        int m = arrayB.length - 1;
        int[] res = new int[arrayA.length];

        int d, c = 0;
        int sum;
        int i = n;
        int j = m;
        int k = n;

        while (j >= 0) {
            sum = arrayA[i] + arrayB[j] + c;

            res[k] = (sum % 10);

            // Finding carry for next sum.
            c = sum / 10;

            i--;
            j--;
            k--;
        }


        while (i >= 0) {
            // Add carry to first array elements.
            sum = arrayA[i] + c;
            res[k] = (sum % 10);
            c = sum / 10;

            i--;
            k--;
        }
        System.out.println(Arrays.toString(res));


    }

    private static void barOfArray() throws InterruptedException {

        int[] array = new int[]{3, 1, 0, 7, 5};
        int max = array[0];
        for (int i = 0; i < array.length; i++) max = Math.max(max, array[i]);

        for (int floor = max; floor >= 1; floor--) {
            Thread.sleep(1000);

            for (int i = 0; i < array.length; i++) {
                if (array[i] >= floor) { // 3 >= 7
                    System.out.print("*\t");

                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


    private static void findElementInArray() {
        int[] array = new int[]{6, 15, 30, 40, 4, 11, 9};
        boolean isPresnt = false;

        int find = 40;
        int index = -1;
        for (int i = 0; i < array.length; i++) {

            if (find == array[i]) {
                isPresnt = true;
                index = i;
                break;
            }
        }
        if (isPresnt) System.out.println(String.format("Element is present at %d", index));
        else System.out.println("Element does not present");
    }

    private static void spanOFArray() {
        int[] array = new int[]{6, 15, 30, 40, 4, 11, 9};
        Arrays.sort(array);
        int intialVal = array[0];
        int finalVal = array[array.length - 1];

        System.out.println(String.format("The Difference is %d", (finalVal - intialVal)));

    }

}
