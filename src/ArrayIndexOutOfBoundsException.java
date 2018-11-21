import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = getRandomInts(120);

        System.out.print("Enter an array index: ");
        int index = -1;
        try {
            index = input.nextInt();
        } catch (Exception e) {
            System.out.println("Error: incorrect input format.");
            System.exit(1);
        }

        try {
            System.out.println("The value is " + nums[index]);
        } catch (Exception e) {
            System.out.println("Out of Bounds");
            System.exit(2);
        }
    }

    public static int[] getRandomInts(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() * size);
        }
        return nums;
    }
}