import java.util.Random;
import java.util.Scanner;

public class Excercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("ჩაწერე რიცხვი 1-დან 50-ის ჩათვლით ");

        int randomNumber = random.nextInt(50);
        int userNumber = 0;

        while (userNumber != randomNumber) {
            System.out.println("აირჩიე შენი ციფრი: ");
            userNumber = scanner.nextInt();

            if (userNumber > 50) {
                System.out.println(" არჩეული ციფრი მეტია 50-ზე, შეიყვანე რიცხვი 1-დან 50-ის ჩათვლით ");

            } else if (userNumber < randomNumber) {
                System.out.println("შენი ციფრი ნაკლებია ჩაფიქრებულ ციფრზე, კიდევ სცადე ");

            } else if (userNumber > randomNumber) {
                System.out.println("შენი ციფრი მეტია ჩაფიქრებულ ციფრზე, კიდევ სცადე ");

            } else {
                System.out.println(" გილოცავ, შენი რიცხვი ემთხვევა ჩაფიქრებულ ციფრს " + randomNumber);
            }
        }
    }
}