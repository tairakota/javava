import java.util.Scanner;

public class MathPractice04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("(最大値の処理です。)数値1を入力してください：");
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        System.out.print("(最大値の処理です。)数値2を入力してください：");
        var s2 = sc.nextLine();
        var num2 = Integer.parseInt(s2);

        var result = Math.max(num1,num2);
        System.out.println(result);
    }
}
