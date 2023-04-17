import java.util.Scanner;

public class MathPractice03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("(絶対値の処理です。)数値を入力してください：");
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);

        var result = Math.abs(num1);
        System.out.println(result);
    }
}