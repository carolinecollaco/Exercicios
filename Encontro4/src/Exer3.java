import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		System.out.println("Digite a");		
		Scanner num = new Scanner(System.in);		
		int input = num.nextInt();
		int a = delta(input);

	}
	
	public static int delta(int a, int b, int c){
		
		int resultadodeDelta = b^2 - (4*a*b);

		return resultadodeDelta;
	}
}
