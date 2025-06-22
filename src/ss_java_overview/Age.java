package ss_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn: ");
        int age = scanner.nextInt();

        int currentYear = Year.now().getValue();

        System.out.println("Tuổi của bạn là: " + (currentYear - age));


    }
}
