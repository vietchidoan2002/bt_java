package ss_java_overview;

import java.util.Scanner;

/**
 * Tìm điểm trung bình
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm thi Toán: ");
        Double diemToan = sc.nextDouble();

        System.out.print("Nhập điểm thi Lý: ");
        Double diemLy = sc.nextDouble();

        System.out.print("Nhập điểm thi Hóa: ");
        Double diemHoa = sc.nextDouble();

        System.out.print("Nhập hệ số Toán: ");
        Double heSoToan = sc.nextDouble();

        System.out.print("Nhập hệ số Lý: ");
        Double heSoLy = sc.nextDouble();

        System.out.print("Nhập hệ số Hoa: ");
        Double heSoHoa = sc.nextDouble();

        Double dtb = (diemToan * heSoToan + diemLy * heSoLy + diemHoa * heSoHoa) / (heSoHoa + heSoLy + heSoToan);
        System.out.println("Điểm trung bình học sinh: " + dtb);
    }
}
