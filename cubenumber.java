import java.util.Scanner;

public class cubenumber {

    
    static int cube(int n) {
        return n * n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = cube(num);

        System.out.println("Cube of " + num + " is: " + result);

        sc.close();
    }
}