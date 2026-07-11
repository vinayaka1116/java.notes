import java.util.Scanner;
public class sum {
    public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int sum = 0;
    for(int v = 1; v <= n ; v++){
        sum = sum+v;
    }
    System.out.println(sum);
    
}
}