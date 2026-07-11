import java.util.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      for(int i = 1 ; i <=n ; i++){
          for(int v = 1 ; v <= m ; v++){
             if (i <= 4 || v == 1 || i == n || v == m){
                 System.out.print("*");
             }else{
                 System.out.print(" ");
             }
          }
         
      System.out.println();
	}
}
}
