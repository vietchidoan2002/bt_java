package ss4_condition_structer;

import java.util.Scanner;

/**
 * Giải phương trình bậc 1
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a và b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("Phương trình vô số nghiệm");
        } else if (a == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            System.out.println("Phương trình có nghiệm là: " + (-b / a));
        }
    }
}
