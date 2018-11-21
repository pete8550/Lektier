import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        do {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Enter two integers: ");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println("The sum is " + (a + b));
            } catch (Exception e) {
                System.out.println("Wrong input! Try again!");
                input.reset();
                continue;
            }
            break;
        } while (true);
    }
}