import java.util.Scanner;

public class MathPractice05 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("(最小値の処理です。)数値を入力してください：");
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        System.out.print("(最小値の処理です。)数値を入力してください：");
        var s2 = sc.nextLine();
        var num2 = Integer.parseInt(s2);

        var result = Math.min(num1,num2);
        System.out.println(result);
    }
}
