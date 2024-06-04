package TH_Demo;

public class sortArray {
    public static void main(String[] args) {
        int[] number  = {1, 5, 3, 7, 4};
        //Sap xep mang theo thu tu tang dan
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    int temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println("mang sau khi sap xep:");
        for(int element : number) {
            System.out.printf("%d \t", element);
        }
        System.out.println();
    }
}
