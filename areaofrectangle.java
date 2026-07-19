import java.util.Scanner;

 class areaofrectangle {

    
    static int area(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter width: ");
        int width = sc.nextInt();

        int result = area(length, width);

        System.out.println("Area of Rectangle = " + result);

       
    }
}