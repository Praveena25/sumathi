import java.util.Scanner;

public class First {

	private static boolean lastDigit(int a1,int a2) {
		
			return a1%10==a2%10;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		lastDigit(n1, n2);
		System.out.println(lastDigit(n1,n2));
		

	}

	

}