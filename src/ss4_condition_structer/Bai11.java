package ss4_condition_structer;

import java.util.Scanner;

/**
 * Kiểm tra và tìm ngày kế tiếp, ngày trước đó
 */
public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int day = scanner.nextInt();
        System.out.print("Nhập tháng: ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            daysInMonth[1] = 29;
        }

        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            System.out.println("Ngày không hợp lệ");
            return;
        }

        int nextDay = day + 1;
        int nextMonth = month;
        int nextYear = year;

        if (nextDay > daysInMonth[month - 1]) {
            nextDay = 1;
            nextMonth++;
            if (nextMonth > 12) {
                nextMonth = 1;
                nextYear++;
            }
        }

        int prevDay = day - 1;
        int prevMonth = month;
        int prevYear = year;

        if (prevDay < 1) {
            prevMonth--;
            if (prevMonth < 1) {
                prevMonth = 12;
                prevYear--;
            }

            int prevMonthDay = 0;
            if (prevMonth == 2) {
                if ((prevYear % 4 == 0 && prevYear % 100 != 0) || prevYear % 400 == 0) {
                    prevMonthDay = 29;
                } else {
                    prevMonthDay = 28;
                }
            } else {
                prevMonthDay = daysInMonth[prevMonth - 1];
            }

            prevDay = prevMonthDay;
        }

        System.out.println("Ngày đã nhập: " + day + "-" + month + "-" + year);
        System.out.println("Ngày hôm trước: " + prevDay + "-" + prevMonth + "-" + prevYear);
        System.out.println("Ngày hôm sau: " + nextDay + "-" + nextMonth + "-" + nextYear);
    }
}

