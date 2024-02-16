
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Give numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == (-1)) {
                System.out.println("Thx! Bye!");
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            sum = sum + number;
            count++;

        }

        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);

        if (count == 0) {
            average = 0;
        } else {
            average = (double) sum / count;
        }
        System.out.println("Average: " + average);

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
