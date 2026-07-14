import java.util.Scanner;

public class function {
    public static void faa (String name1 ,String name2 ,String name3, int n1 ,int n2 ,int n3){
        System.out.println(name1 + n1);
        System.out.println(name2 + n2);
        System.out.println(name3 + n3);
        
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        int n1 = sc.nextInt();
        String name2 = sc.next();
        int n2 = sc.nextInt();
        String name3 = sc.next();
        int n3 = sc.nextInt();
        

        faa (name1 , name2 , name3 , n1 , n2, n3);
    }
    
}
