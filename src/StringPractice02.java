import java.util.Scanner;

public class StringPractice02 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("文字を入力してください：");
        var s1 = sc.nextLine();
        var result = s1.startsWith("http");
        System.out.println(result);
    }
}
