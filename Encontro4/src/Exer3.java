import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int a;
		System.out.println("Digite a");
		a = entrada.nextInt();
		System.out.println("O valor de a �:" + a);
		
		int b;
		System.out.println("Digite b");
		b = entrada.nextInt();
		System.out.println("O valor de a �:" + b);
		System.out.println("Digite c");
		int c;
		c = entrada.nextInt();
		System.out.println("O valor de a �:" + c);
				
		entrada.close();
		
		int resultado = delta(a,b,c);
		
		System.out.println("O resultado �: " + resultado);
	}
		
	
	public static int delta(int a, int b, int c){
		
		int resultadodeDelta = b^2 - (4*a*c);

		return resultadodeDelta;
	}
}
