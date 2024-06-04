package TH_Demo;

import java.util.Scanner;

public class maxArrayDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.print("Enter row: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter col: ");
        col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Max = " + max);
        scanner.close();
    }
}
