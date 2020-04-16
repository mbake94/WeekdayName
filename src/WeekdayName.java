import java.util.Scanner;

/*
Prompt user for number 1-7
set values to weekdays
print weekday based on input value
 */
public class WeekdayName {
    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        int number;
        int Sunday = 1;
        int Monday = 2;
        int Tuesday = 3;
        int Wednesday = 4;
        int Thursday = 5;
        int Friday = 6;
        int Saturday = 7;

        System.out.print("Enter a number 1-7: ");
        number = keybd.nextInt();

        if (number == 1) {
            System.out.printf("Today is Sunday!");
        } else if (number == 2) {
            System.out.printf("Today is Monday!");
        } else if (number == 3) {
            System.out.printf("Today is Tuesday!");
        } else if (number == 4) {
            System.out.printf("Today is Wednesday!");
        } else if (number == 5) {
            System.out.printf("Today is Thursday!");
        } else if (number == 6) {
            System.out.printf("Today is Friday!");
        } else if (number == 7) {
            System.out.printf("Today is Saturday!");
        }

    }
}
