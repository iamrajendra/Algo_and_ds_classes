import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
//        howtoInputInMatrix();

        // multiplicationMatrix();

//        spiralMatrix();
//rotationMatrix();
//        waveTraverseMatrix();
//        diagonalTraversalMatrix();
        endPoint();
    }

    private static void endPoint() {
        int[][] path = new int[][]{{0, 0, 1, 0}, {1, 0, 0, 0}, {0, 0, 0, 0}, {1, 0, 1, 0}};
        int i = 0;
        int j = 0;
        int direction = 0;
        while (true) {
            direction  = (direction+path[i][j]) %4;

            if (direction == 0) { // east
                j++;

            } else if (direction == 1) {//south
                i++;

            } else if (direction == 2) { // west
                j--;

            } else if (direction == 3) {// north
                i--;
            }
            if(i<0){
                i++;
                break;
            }else  if (j<0){
                j++;
                break;

            }else if (i==4){
                i--;
                break;

            }else if (j==4){
                j--;
                break;
            }
        }
        System.out.println(String.format("i=%d, j=%d",i,j));


    }


    private static void diagonalTraversalMatrix() {
        int[][] mat = new int[][]{{11, 12, 13}, {21, 22, 23}, {31, 32, 33}};
        for (int g = 0; g < mat.length; g++) {
            for (int i = 0, j = g; j < mat.length; i++, j++) {
                System.out.print(mat[i][j] + " ");
            }
        }


    }

    private static void waveTraverseMatrix() {
        int[][] wave = new int[][]{{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
        };
        int rowMax = wave.length;
        int colMax = wave[0].length;
        for (int j = 0; j < colMax; j++) {

            if (j % 2 == 0) {
                for (int i = 0; i < rowMax; i++) {
                    int val = wave[i][j];
                    System.out.print(val + " ");
                }
            } else {
                for (int i = rowMax - 1; i >= 0; i--) {
                    int val = wave[i][j];
                    System.out.print(val + " ");
                }
            }
            //System.out.println();

        }


    }

    private static void rotationMatrix() {
        char[][] rotate = new char[][]{{'A', 'B', 'C', 'D'},
                {'E', 'F', 'G', 'H'},
                {'I', 'J', 'K', 'L'},
                {'M', 'N', 'O', 'P'}};
//        transpose
        for (int i = 0; i < rotate.length; i++) {
            for (int j = i; j < rotate[0].length; j++) {
                char temp = rotate[i][j];
                rotate[i][j] = rotate[j][i];
                rotate[j][i] = temp;
            }
        }

//        reverse
        for (int i = 0; i < rotate.length; i++) {
            int left = 0;
            int right = rotate[i].length - 1;
            while (left < right) {
                char temp = rotate[i][left];
                rotate[i][left] = rotate[i][right];
                rotate[i][right] = temp;
                left++;
                right--;
            }

        }
        for (int i = 0; i < rotate.length; i++) {
            for (int j = 0; j < rotate[0].length; j++) {
                System.out.print(rotate[i][j] + " ");

            }
            System.out.println();
        }

    }

    private static void spiralMatrix() {
        int[][] spiral = new int[][]{{11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34}};
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

        int[][] mat1 = new int[][]{{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};
        int[][] mat2 = new int[][]{{1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}};
        int mat1Col = mat1[0].length;
        int mat2Row = mat2.length;
        int mat1Row = mat1.length;
        int mat2Col = mat2.length;

// multiplication
        if (mat1Col != mat2Row) {
            System.out.println("Invalid combination");
            return;
        }
        int[][] output = new int[mat1Row][mat2Col];
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {
                for (int k = 0; k < mat1Row; k++) {
                    // System.out.println(String.format("Value of i =%d  value of j=%d and value of k=%d",i,j,k));
                    // System.out.println(String.format("%d * %d ",mat1[i][k],mat1[i][j]));
                    output[i][j] += mat1[i][k] * mat2[k][i];

                }
            }

        }
        System.out.println("Out put");
        for (int i = 0; i < output.length; i++) {
            for (int j = 0; j < output[i].length; j++) {

                System.out.print(output[i][j] + " ");
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
