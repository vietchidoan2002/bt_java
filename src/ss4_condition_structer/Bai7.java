package ss4_condition_structer;

import java.util.Scanner;

/**
 * Tính lương nhân viên theo thâm niên công tác
 */
public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào thâm niên công tác: ");
        int tnct = scanner.nextInt();

        if (tnct <= 0) {
            System.out.println("Nhập sai");
        } else if (tnct < 12) {
            System.out.println("Tiền lương là: " + (650000 * 1.92));
        } else if (tnct < 36) {
            System.out.println("Tiền lương là: " + (650000 * 2.34));
        } else if (tnct < 60) {
            System.out.println("Tiền lương là: " + (650000 * 3));
        } else {
            System.out.println("Tiền lương là: " + (650000 * 4.5));
        }
    }

}
