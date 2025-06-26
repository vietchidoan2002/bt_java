package ss4_condition_structer;

import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * Giải phương trình bậc 2 có dạng: a𝑥2 + bx + c = 0
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0 && c == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có nghiệm là: " + (-c / b));
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghệm kép: " + -b / (2 * a));
            } else {
                System.out.println("Phương trình có 2 nghiệm phân biệt: " + ((-b + sqrt(delta)) / (2 * a)) + " và " + (-b - sqrt(delta)) / (2 * a));
            }
        }
    }

}
