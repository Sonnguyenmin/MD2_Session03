package TH_Demo;

import java.util.Scanner;

public class insertElement {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao phan tu can them");
        int insertValue = Integer.parseInt(sc.nextLine());
        System.out.println(" nhap vao dia chi can chen:");
        int insertIndex;
        do{
            insertIndex = Integer.parseInt(sc.nextLine());
            if(insertIndex > 0){
                break;
            }
            else  {
                System.out.println("Chi so chen lon hon 0, vui long nhap lai");
            }
        } while (true);
        int[] newNumbers;
        if(insertIndex < numbers.length){
            newNumbers = new int[numbers.length + 1];
            for(int i = 0; i < numbers.length; i++){
                if(i < insertIndex){
                    newNumbers[i] = numbers[i];
                }
                else if(i == insertIndex){
                    newNumbers[i] = insertValue;
                }
                else  {
                    newNumbers[i] = numbers[i - 1];
                }
            }
        }
        else {
            newNumbers = new int[insertIndex + 1];
            for(int i = 0; i < numbers.length; i++){
               newNumbers[i] = numbers[i];
            }
            newNumbers[insertIndex] = insertValue;
        }
        System.out.println("Mang sau khi them phan tu: ");
        for(int ele : newNumbers){
            System.out.printf("%d \t", ele);
        }
        System.out.println();
    }
}
