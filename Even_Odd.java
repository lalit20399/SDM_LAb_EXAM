import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.out.println("program to find wven or odd number");
		
		System.out.println();
		
		System.out.println("enter a number = ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("entered number is a even number");
		}
		
		else
		{
			System.out.println("entered number is odd number");
		}
		
		sc.close();
	}

}
