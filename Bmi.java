import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1人目の情報を入力してください:");
        System.out.print("身長を入力してください※小数点は切り捨てで入力してください: ");
        int height1 = scanner.nextInt(); // 1人目の身長を整数として受け取る

        System.out.print("体重を入力してください※小数点は切り捨てで入力してください: ");
        int weight1 = scanner.nextInt(); // 1人目の体重を整数として受け取る

        System.out.println("2人目の情報を入力してください:");
        System.out.print("身長を入力してください※小数点は切り捨てで入力してください: ");
        int height2 = scanner.nextInt(); // 2人目の身長を整数として受け取る

        System.out.print("体重を入力してください※小数点は切り捨てで入力してください: ");
        int weight2 = scanner.nextInt(); // 2人目の体重を整数として受け取る

        double bmi1 = calculateBMI(weight1, height1);
        double bmi2 = calculateBMI(weight2, height2);

        String formattedBMI1 = String.format("%.2f", bmi1);
        String formattedBMI2 = String.format("%.2f", bmi2);

        System.out.println("1人目のBMIは " + formattedBMI1 + " です。");
        System.out.println("2人目のBMIは " + formattedBMI2 + " です.");

        String result1 = interpretBMI(bmi1);
        String result2 = interpretBMI(bmi2);

        System.out.println("1人目のBMIの評価: " + result1);
        System.out.println("2人目のBMIの評価: " + result2);

        scanner.close();
    }

    public static double calculateBMI(int weight, int height) {
        double heightInMeters = height / 100.0;
        return (double) weight / (heightInMeters * heightInMeters);
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "<低体重> 貧血を引き起こし、疲れやすい、だるいなどの症状があらわれます。";
        } else if (bmi < 24.9) {
            return "<正常体重>　nice!";
        } else if (bmi < 29.9) {
            return "肥満度1度  2型糖尿病や循環器疾患のリスクが高くなり、内臓脂肪が増えていきます。";
        } else if (bmi < 34.9) {
            return "<肥満度2度> 死亡リスクが94%になります。";
        } else if (bmi < 39.9) {
            return "<肥満度3度> 死亡リスクが2度に比べて3倍になりますになります。";
        } else {
            return "<肥満度4度> 頑張りましょう。";
        }
    }
}

