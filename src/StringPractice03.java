import java.util.Scanner;

public class StringPractice03 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("文字を入力してください：");
        var s1 = sc.nextLine();
        var result = s1.matches("\\d{3}");
        System.out.println(result);
    }
}
