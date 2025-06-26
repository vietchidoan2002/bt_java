package ss4_condition_structer;

import java.util.Scanner;

/**
 * Tìm số lớn nhất và số nhỏ nhất
 * Toán tử 3 ngôi
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a và b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int max = a > b ? a : b;
        int min = a < b ? a : b;

//        int max = Math.max(a, b);

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
