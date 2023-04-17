import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("文字を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        System.out.println(s1);
        sc.close();
    }
}
