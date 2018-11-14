import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int s;
        a = in.nextInt();
        b = in.nextInt();
        s = a + b;
        System.out.println(s);
    }
}
