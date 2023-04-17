import java.util.Scanner;

public class StringPractice04 {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.print("文字を入力してください：");
        var s1 = sc.nextLine();
        var result = s1.indexOf("s");
        System.out.println(result);

        
    }
}
