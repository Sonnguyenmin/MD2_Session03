package TH_Demo;

import java.util.Scanner;

public class sumRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.print("Nhập số dòng: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột: ");
        col = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
            System.out.println();
            int sum = 0;
            for (int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
            System.out.println("Tổng dòng " + i + ": " + sum);
        }
        scanner.close();
    }
}
