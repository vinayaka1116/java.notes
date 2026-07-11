import java.util.Scanner;
public class table {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v = 1;
        while(v <= 10){
          System.out.println(n + "x" + v + "="+ (v*n));
          v++;
     }
    }
    
}
