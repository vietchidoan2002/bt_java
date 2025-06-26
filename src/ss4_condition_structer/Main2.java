package ss4_condition_structer;

public class Main2 {
    public static void main(String[] args) {
        int day = 3;
// Cách 1
        switch (day){
            case 2:
                System.out.println("Thứ 2");
                break;
            case 3:
                System.out.println("Thứ 3");
                break;
            case 4:
                System.out.println("Thứ 4");
                break;
            case 5:
                System.out.println("Thứ 5");
                break;
            default:
                System.out.println("Cuối tuần");
        }

        // Cách 2
        switch (day) {
            case 2 -> System.out.println("Thứ 2");
            case 3 -> System.out.println("Thứ 3");
            case 4 -> System.out.println("Thứ 4");
            case 5 -> System.out.println("Thứ 5");
            default -> System.out.println("Cuối tuần");
        }

        // Cách 3
        if (day == 2) {
            System.out.println("Thứ 2");
        } else if (day == 3) {
            System.out.println("Thứ 3");
        } else if (day == 4) {
            System.out.println("Thứ 4");
        } else if (day == 5) {
            System.out.println("Thứ 5");
        } else {
            System.out.println("Cuối tuần");
        }

    }
}
