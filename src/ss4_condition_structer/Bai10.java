package ss4_condition_structer;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Kiểm tra số chính phương
 */
public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số chính phương: ");
        double cp = scanner.nextDouble();

        if (sqrt(cp) % 1 == 0) {
            System.out.println("Đó là số chính phương");
        } else {
            System.out.println("Không phải số chính phương");
        }
    }
}
