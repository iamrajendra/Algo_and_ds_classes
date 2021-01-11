import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        linearSearch();

//        binarySearchExample();
//bubbleSort();

//        selectionSort();

//    insertionSort();
    }

    private static void insertionSort() {
        int arr[] = new int[]{3, 2, 12 ,22 ,11};

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            }

        System.out.println(Arrays.toString(arr));


        }

    private static void selectionSort() {
        int arr[] = new int[]{64, 25, 12 ,22 ,11};
        for (int i = 0; i < arr.length-1; i++) {
//int min  = i;
            for (int j = i+1; j <arr.length ; j++) {

                if (arr[i]> arr[j]){
                    int temp  = arr[i];
                    arr[i]  = arr[j];
                    arr[j]  =temp;

                }

            }
        }
        System.out.println(Arrays.toString(arr));
//
    }

    private static void bubbleSort() {
        int arr[] = new int[]{10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
//       iterator
        for (int i = 0; i < arr.length-1; i++) {
//bubble
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1]  =temp;


                }

            }
        }
        System.out.println(Arrays.toString(arr));



        }



    private static void swap(int[] arr, int y, int x) {
        int  temp  = arr[y];
        arr[x]  = arr[y];
        arr[y] =temp;
    }

    private static void binarySearchExample() {
        int arr[] = new int[]{10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int x = 110;
        int left = 0;
        int right = arr.length -1;
        int mid = (left + right) / 2;

        System.out.println(binarySearch(arr, left, right, mid, x));


    }

    private static int binarySearch(int[] arr, int left, int right, int mid, int x) {
        int index = 0;
        while (index < arr.length) {

            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) {
                left = mid + 1;
                mid = (left + right) / 2;

            } else if (arr[mid] > x) {
                right = mid - 1;
                mid = (left + right) / 2;
   }


            index++;
        }
return  -1;
    }

    private static int linearSearch() {
        int arr[] = new int[]{10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 110;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) return i;

        }
        return -1;
    }
}
