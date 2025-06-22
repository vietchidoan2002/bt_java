package ss_java_overview;

import java.util.Scanner;

public class Bai6 {
    /**
     * Tính số nút trên xe
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập biển số xe của bạn: ");
        int n = scanner.nextInt();

        int tong = n % 10;
        n = n / 10;
        tong = tong + (n % 10);
        n = n / 10;
        tong = tong + (n % 10);
        n = n / 10;
        tong = tong + (n % 10);
        n = n / 10;
        tong = tong + (n % 10);

        System.out.println("Tổng: " + tong);

        int nut = tong % 10;
        System.out.println("Số nút: " + nut);

    }
}
