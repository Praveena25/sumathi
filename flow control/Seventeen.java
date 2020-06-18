import java.util.Scanner;
public class seventeen {

    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int a = sc.nextInt();
     int sum = 0, r;
	 int temp = a;    
     while(n>0)
       {    
        r = a % 10;   
        sum = (sum*10)+r;    
        a = a/10;    
       }    
      if(temp==sum) {   
        System.out.println("It is a Palindrome number");
       }    
      else {   
        System.out.println("It is Not a palindrome number");    
     }  
}
}