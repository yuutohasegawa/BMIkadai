import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("身長を入力してください※小数点は切り捨てで入力してください: ");
        int height = scanner.nextInt();

        System.out.print("体重を入力してください※小数点は切り捨てで入力してください: ");
        int weight = scanner.nextInt();

        double bmi = calculateBMI(weight, height);

        
        String formattedBMI = String.format("%.1f", bmi);

        System.out.println("あなたのBMIは " + formattedBMI + " です。");

        String result = interpretBMI(bmi);
        System.out.println("BMIの評価: " + result);

        scanner.close();
    }

    public static double calculateBMI(int weight, int height) {
        
        double heightInMeters = height / 100.0;
        
        return (double) weight / (heightInMeters * heightInMeters);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "低体重";
        } else if (bmi < 24.9) {
            return "正常体重";
        } else if (bmi < 29.9) {
            return "肥満度1度";
        } else if (bmi < 34.9) {
            return "肥満度2度";
        } else if (bmi < 39.9) {
            return "肥満度3度";
        } else {
            return "肥満度4度";
        }
    }
}
