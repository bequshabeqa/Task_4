import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("ჩაწერეთ ტიცხვი 0-დან 100-ჩათვლით");
        } else if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else
            System.out.println("F");
    }
}