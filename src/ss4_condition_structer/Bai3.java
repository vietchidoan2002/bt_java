package ss4_condition_structer;

import java.util.Scanner;

/**
 * Đảo giá trị của hai biến
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số b: ");
        int b = scanner.nextInt();

        //Cách 1: Sử dụng biến tạm
       /* int n = a;
        a = b;
        b = n;*/
        //Cách 2: Không sử dụng biển tạm
        a = a + b;  // a = 2 + 3 = 5
        b = a - b;  // b = 5 - 3 = 2
        a = a - b;  // a = 5 - 2 = 3

        System.out.println("Số a là: " + a);
        System.out.println("Số b là: " + b);
    }
}
