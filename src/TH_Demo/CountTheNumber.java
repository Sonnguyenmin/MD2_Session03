package TH_Demo;

import java.util.Scanner;

public class CountTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";
        System.out.println(str);
        int count = 0;
        System.out.println("Nhap vao ky tu muon dem");
        char ch = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
            System.out.println(str.charAt(i));
        }
        if(count == 0) {
            System.out.printf("Khong ton tai ky tu %c" , ch);
        }
        else  {
            System.out.printf("Co ton tai ky tu %c" , ch);
        }
    }
}
