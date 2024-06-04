package SingleDemesion_Demo;

import java.util.Scanner;

public class single_dimension {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhap so phan tu:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arrNumbers = new int[size];
     do{
         System.out.println("****************Menu***************");
         System.out.println("1. Nhap gia tri cac phan tu cua mang");
         System.out.println("2. Hien thi gia tri cac phan tu cua mang");
         System.out.println("3. In ra cac gia tri phan tu la chan");
         System.out.println("4. In ra cac gia tri phan tu co chi so la le");
         System.out.println("5. Tinh tong cac phan tu trong mang");
         System.out.println("6. In ra cac gia lon nhat va nho nhat trong mang");
         System.out.println("7. thoat");

         System.out.println("Nhap cac so tu 1 den 7:");
         int choice = Integer.parseInt(scanner.nextLine());
         switch (choice) {
             case 1:
                 for (int i = 0; i < arrNumbers.length; i++) {
                     System.out.println("Nhap so phan tu" + i + ":");
                     arrNumbers[i] = Integer.parseInt(scanner.nextLine());
                 }
                 break;
             case 2:
                 System.out.println("Cac phan tu cua mang:");
//                 for (int i = 0; i< arrNumbers.length; i++){
//                     System.out.printf("%d\t", arrNumbers[i]);
//                 }
                 for (int element : arrNumbers) {
                     System.out.printf("%d \t", element);
                 }
                 System.out.printf("\n");
                 break;
             case 3:
                 //In ra cac gia tri phan tu la chan
//                 for (int i = 0; i< arrNumbers.length; i++){
//                     if(arrNumbers[i] % 2 == 0){
//                         System.out.println("Cac gia tri phan tu la chan");
//                     }
//                 }
                 for(int element : arrNumbers){
                     if(element % 2 == 0){
                         System.out.printf("%d \t", element);
                     }
                 }
                 System.out.printf("\n");
                 break;
             case 4:
                 for (int i = 0; i< arrNumbers.length; i++){
                     if(arrNumbers[i] % 2 != 0){
                         System.out.printf("%d \t", arrNumbers[i]);
                     }
                 }
                 System.out.printf("\n");
                 break;
             case 5:
                 int sum = 0;
                 for(int element : arrNumbers){
                     sum += element;
                 }
                 System.out.println("Tong cac phan tu trong mang la" + sum);
                 break;
             case 6:
                 int min = arrNumbers[0];
                 int max = arrNumbers[0];
                 for(int i = 1; i < arrNumbers.length; i++){
                     if(arrNumbers[i] < min){
                         min = arrNumbers[i];
                     }
                     if(arrNumbers[i] > max){
                         max = arrNumbers[i];
                     }
                 }
                 System.out.printf("Gia tri nho nhat: %d - lon nhat: %d", min, max);
                 break;
             case 7:
                 System.exit(0);
             default:
                 System.out.println("Vui long nhap tu 1 den 7");

         }
     }while (true);
    }
}
