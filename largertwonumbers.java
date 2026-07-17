import java.util.Scanner;

public class largertwonumbers {

    // Function to find the larger number
    static int findLarger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int larger = findLarger(num1, num2);

        System.out.println("The larger number is: " + larger);

        sc.close();
    }
}