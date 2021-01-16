import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        howtoInputInMatrix();

//        multiplicationMatrix();

//        spiralMatrix();
//        rotationMatrix();
        waveTraverseMatrix();
    }

    private static void waveTraverseMatrix() {
        int [][] wave = new int[][]{{11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
        };
        int rowMax = wave.length;
        int colMax  = wave[0].length;
        for (int j = 0; j < colMax; j++) {

            if (j%2==0){
                for (int i = 0; i < rowMax; i++) {
                   int val = wave[i][j];
                    System.out.print(val+" ");
                }
            }else {
                for (int i = rowMax-1; i >=0; i--) {
                    int val = wave[i][j];
                    System.out.print(val+" ");
                }
            }
            //System.out.println();

        }


    }

    private static void rotationMatrix() {
        char[][] rotate = new char[][]{{'A', 'B', 'C', 'D'}, {'E', 'F', 'G', 'H'}, {'I', 'J', 'K', 'L'},{'M','N','O','P'}};
//        transpose
        for (int i = 0; i < rotate.length; i++) {
            for (int j = i; j < rotate[0].length-1; j++) {
                char temp = rotate[i][j];
                rotate[i][j] = rotate[j][i];
                rotate[j][i] = temp;
            }
        }

//        reverse
        for (int i = 0; i < rotate.length; i++) {
            int left =0;
            int right = rotate[i].length-1;
            while (left<right){
                char temp  = rotate[i][left];
                rotate[i][left] = rotate[i][right];
                rotate[i][right]  =temp;
                left++;
                right--;
            }

        }
        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[0].length; j++) {
                System.out.print(rotate[i][j]+" ");

            }
            System.out.println();
        }

    }

    private static void spiralMatrix() {
        int[][] spiral = new int[][]{{11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}};
        int colMax = spiral[0].length - 1;
        int rowMax = spiral.length - 1;
        int colMin = 0;
        int rowMin = 0;
        int total = spiral.length * spiral[0].length - 1;
        System.out.println(total);
        int counter = 0;

        while (total >= counter) {
            //    left

            for (int i = rowMin; i <= rowMax && counter <= total; i++) {

                System.out.print(spiral[i][colMin] + " ");
                counter++;
            }
            colMin++;
//        bottom
            for (int i = colMin; i <= colMax && counter <= total; i++) {
                System.out.print(spiral[rowMax][i] + " ");
                counter++;

            }
            rowMax--;
//        right
            for (int i = rowMax; i >= rowMin && counter <= total; i--) {
                System.out.print(spiral[i][colMax] + " ");
                counter++;

            }
            colMax--;
//        top
            for (int i = colMax; i >= colMin && counter <= total; i--) {
                System.out.print(spiral[rowMin][i] + " ");
                counter++;

            }
            rowMin++;
        }

    }


    private static void multiplicationMatrix() {
/*
        i/p = mat1 = 3 3
        1 1 1
        2 2 2
        3 3 3

        Mat2 = 3 3
        1 1 1
        2 2 2
        3 3 3
*/
        Scanner scanner = new Scanner(System.in);
        int mat1Row = scanner.nextInt();
        int mat1Col = scanner.nextInt();
        System.out.println("Row Mat 1 Row " + mat1Row);
        System.out.println("Row Mat 1 Col " + mat1Col);

        int[][] mat1 = new int[mat1Row][mat1Col];
//        first mat input
        for (int i = 0; i < mat1.length; i++) {

            for (int j = 0; j < mat1[0].length; j++) {
                System.out.print(String.format("int at %d and %d ", i, j));
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("first Mat is completed");
        int mat2Row = scanner.nextInt();
        int mat2Col = scanner.nextInt();
        System.out.println("Row Mat 2 Row " + mat2Row);
        System.out.println("Row Mat 2 Col " + mat2Col);

        int[][] mat2 = new int[mat2Row][mat2Col];
//        second mat input
        for (int i = 0; i < mat2.length; i++) {

            for (int j = 0; j < mat2[0].length; j++) {
                System.out.print(String.format("int at %d and %d ", i, j));

                mat2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("second Mat is completed");

// multiplication
        if (mat1Col != mat2Row) {
            System.out.println("Invalid combination");
            return;
        }
        int[][] output = new int[mat1Row][mat2Col];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                for (int k = 0; k < mat1Row; k++) {
                    output[i][j] = output[i][j] + mat1[i][k] * mat2[k][j];

                }
            }

        }
        System.out.println("Out put");
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {

                System.out.println(output[i][j] + " ");
            }
            System.out.println();
        }

    }
/*
how to take input from the scanner
 */
    private static void howtoInputInMatrix() {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("Output of the Matrix");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
    }


}
