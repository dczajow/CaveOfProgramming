package Arrays;
import java.util.Scanner;

public class askThreeTimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int NUM_VALUES = 3;
        int[] numbers = new int[NUM_VALUES];

        for(int i=0; i<NUM_VALUES; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();
                }

        scanner.close();
        System.out.println("You entered: ");
        int total = 0;

        /*

       //wykorzystanie for loop

        for(int i=0; i<NUM_VALUES; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }                 */

        // wykorzystnia for each loop

        for(int number: numbers) {
            System.out.println(number);
            total += number;}

        System.out.printf("total value of the numbers entered is %d", total);
    }
}
