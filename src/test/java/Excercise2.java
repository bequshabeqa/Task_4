import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char vowel = scanner.next().charAt(0);

        if (Character.isLetter(vowel)) {
            switch (vowel) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(vowel + " is a vowel.");
                    break;
                default:
                    System.out.println(vowel + " is a consonant.");
                    break;
            }
        } else {
            System.out.println("ჩაწერე ანბანის შესაბამისი ასოები");
        }

    }
}