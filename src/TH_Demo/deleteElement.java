package TH_Demo;

public class deleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number = 6;
        int indexDelete = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexDelete = i;
                break;
            }
        }
        for (int i = indexDelete; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
