import java.util.*;

class pattern 
{
	public static void main (String[] args) 
	{
		// your code goes here
		
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      for(int i = 1 ; i <=n ; i++){
          for(int v = 1 ; v <= m ; v++){
          System.out.print("*");
      }
      System.out.println();
	}
}
}