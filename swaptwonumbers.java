import java.util.Scanner ;
class swaptwonumbers{

    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");

        int b = sc.nextInt();

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        swap (a,b);
    }
}