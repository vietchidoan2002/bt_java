package ss_java_overview;

import java.util.Scanner;

/**
 * Phép tính
 */

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Nhập a và b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("Tổng của a và b là: " + (a + b));
        System.out.println("Hiệu của a và b là: " + (a - b));
        System.out.println("Tích của a và b là: " + (a * b));
        System.out.println("Thương của a và b là: " + ((double) a / b));
    }
}
