package TH_Demo;

import java.util.Scanner;

public class diagonalLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("Mời bạn nhập so dong:");
        row =Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhap so cot:");
        col =Integer.parseInt(sc.nextLine());
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = Integer.parseInt(sc.nextLine());
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int numberOne = 0;
        int numbertwo = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == j) {
                    numberOne += matrix[i][j];
                }
                if (j == col - 1 - i) {
                    numbertwo += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng của đường chéo chính là: " + numberOne);
        System.out.println("Tổng của đường chéo phụ là: " + numbertwo);
        System.out.println("Tổng của đường chéo chính và đường chéo phụ là: " + (numberOne + numbertwo));

    }
}
