import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for i:");
		int i = scan.nextInt();
		
		System.out.println("Enter value for j:");
		int j = scan.nextInt();
		
		int k = i * j;
		System.out.println("Multiplication of i and j is...."+k);
		
		}

}
