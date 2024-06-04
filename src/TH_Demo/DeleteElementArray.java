package TH_Demo;

import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int[] number = {1, 3,5, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chi so phan tu can xoa: ");
        int indexDelete;
        do {
            indexDelete = Integer.parseInt(sc.nextLine());
            if(indexDelete < 0 || indexDelete > number.length) {
                System.out.println("Chi so phan tu can xoa khong ton tai, vui long nhap lai");
            } else  {
                break;
            }
        } while (true);
        int[] newNumber = new int[number.length - 1];
        for (int i = 0; i < newNumber.length; i++) {
            if (i < indexDelete) {
                newNumber[i] = number[i];
            }
            else {
                newNumber[i] = number[i + 1];
            }
        }

    }
}
