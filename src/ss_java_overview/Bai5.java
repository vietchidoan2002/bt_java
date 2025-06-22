package ss_java_overview;

import java.util.Scanner;

/**
 * Tính chu vi và diện tích hình tròn
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = scanner.nextDouble();

        double c = 2 * Math.PI * r;
        System.out.println("Chu vi hình tròn là: " + c);

        double s = r * r * Math.PI;
        System.out.println("Diện tích hình tròn là: " + s);
    }
}
