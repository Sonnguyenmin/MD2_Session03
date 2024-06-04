package TH_Demo;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 10");
        } while (size > 10);
        //Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        //In ra danh sách tài sản đã nhập
        System.out.print("Một danh sách các số: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        //Duyệt các phần tử trong mảng để tìm GTBN và vị trí
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.printf("\n%-20s%s", "Giá trị nhỏ nhất: ", min);
        System.out.printf("\n%-20s%s", "Vị trí của giá trị nhỏ nhất: ", index);
    }
}
