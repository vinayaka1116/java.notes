import java.util.Scanner;
class productoftwonumber {

    public static int multiplication(int a , int b){
        System.out.println(a*b);
        return 1;
    }
    public static void main (String [] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       
       multiplication(a, b);
    }
}