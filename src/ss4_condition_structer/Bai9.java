package ss4_condition_structer;

import java.util.Scanner;

/**
 * Đổi chữ hoa thành chữ thường và ngược lại
 */
public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào kí tự chữ cái: ");
        char kt = scanner.next().charAt(0);

        if (kt >= 'a' && kt <= 'z') {
            System.out.println("Chữ cái: " + (kt -= 32));
        } else if (kt >= 'A' && kt <= 'Z') {
            System.out.println("Chữ cái: " + (kt += 32));
        } else {
            System.out.println("Nhập sai");
        }
    }
}
