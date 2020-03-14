import java.util.Scanner;

public class CalculatorDaysOfMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count days ?");
        int month = scanner.nextInt();
        String days;
        if (month >= 1 && month <= 12) {
            switch (month) {
                case 2:
                    days = "28 or 29";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = "30";
                    break;
                default:
                    days = "31";
            }
            System.out.printf("The month %d has %s days", month, days);
        } else {
            System.out.println("Invalid input");
        }
    }
}
