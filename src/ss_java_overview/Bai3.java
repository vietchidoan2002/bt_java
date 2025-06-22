package ss_java_overview;

import java.util.Scanner;

/**
 *Tính tiền
 */
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhâp tên sản phẩm: ");
        String product = scanner.nextLine();

        System.out.print("Nhập số lượng: ");
        int quantity = scanner.nextInt();

        System.out.print("Nhập đơn giá: ");
        int price = scanner.nextInt();

        int money = quantity * price;
        System.out.println("Tên sản phẩm là: " + product);
        System.out.println("Số tiền là: " + money);
        System.out.println("Thuế giá trị gia tăng: " + money * 0.1);
    }
}
