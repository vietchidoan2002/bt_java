package ss4_condition_structer;

import java.util.Scanner;

/**
 * Kiểm tra và tìm ngày kế tiếp, ngày trước đó
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ngày: ");
        int date = scanner.nextInt();
        System.out.println("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.println("Nhập năm: ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12 || year < 1 || date < 1) {
            System.out.println("Nhập sai");
        } else if (month == 4 || month == 6 || month == 8) {
            System.out.println("Số ngày là: 30");
        } else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println("Số ngày là: 29");
            } else {
                System.out.println("Số ngày là: 28");
            }
        } else {
            System.out.println("Số ngày là: 31");
        }
    }
}
