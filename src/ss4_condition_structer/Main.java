package ss4_condition_structer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Nếu điểm <4: rớt môn
        Nếu điểm >= 4: qua môn
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        double score = scanner.nextDouble();

        if (score < 0 || score > 10) {
            System.out.println("Điểm không hợp lệ");
        } else if (score < 4) {
            System.out.println("Rớt môn");
        } else if (score < 6) {
            System.out.println("Trung bình");
        } else if (score < 8) {
            System.out.println("Khá");
        } else {
            System.out.println("Giỏi");
        }
    }
}
