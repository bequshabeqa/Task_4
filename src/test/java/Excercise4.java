import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        System.out.println("შეიყვანეთ n-ის მნიშვნელობა");
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;
        int i = 2;

        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println(" ჯამი = " + sum);
    }
}
