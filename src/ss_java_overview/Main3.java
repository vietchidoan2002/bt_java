package ss_java_overview;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //System.in: Tiêu chuẩn để nhập dữ liệu từ bàn phím

        Scanner scanner = new Scanner(System.in);

        System.out.print("tuổi của bạn: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println(" Nhập tên của bạn: ");
//        scanner.nextLine(); // Clear dữ liệu
        String name = scanner.nextLine();

        System.out.println("Tuổi của bạn là: " + age);
        System.out.println("Tên của bạn là: " + name);
    }
}
