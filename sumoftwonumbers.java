import java.util.Scanner ;
public class sumoftwonumbers {

    public static void voter (String name, int age){
        
        if(age >= 18){
            System.out.println( name   +  " eligible for vote");
        }else{
            System.out.println( name + " not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String name  = sc.nextLine();
        int age = sc.nextInt();
        voter( name , age);
    }
    
}
