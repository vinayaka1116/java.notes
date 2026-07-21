import java.util.Scanner;

 class countdigitnnumber {

    
    static int countDigits(int n) {
        int count = 0;

        while (n != 0) {
            n = n / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = countDigits(num);

        System.out.println("Number of digits = " + result);

        sc.close();
    }
}