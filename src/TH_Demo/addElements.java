package TH_Demo;

import java.util.Scanner;

public class addElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.println("Nhập vào số cần chèn: ");
        int number = scanner.nextInt();
        System.out.println("Nhập vào vị trí cần chèn: ");
        int index = scanner.nextInt();
        if (index < 0 || index > array.length) {
            System.out.println("Không chèn được phần tử vào mảng");
        }
        else {
            for (int i = array.length - 1; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
            System.out.println("Mảng sau khi chèn: ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + "\t");
            }

        }



    }
}
