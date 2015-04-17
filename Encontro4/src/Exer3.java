import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int a;
		System.out.println("Digite a");
		a = entrada.nextInt();
		System.out.println("O valor de a é:" + a);
		
		int b;
		System.out.println("Digite b");
		b = entrada.nextInt();
		System.out.println("O valor de a é:" + b);
		System.out.println("Digite c");
		int c;
		c = entrada.nextInt();
		System.out.println("O valor de a é:" + c);
				
		entrada.close();
		
		int resultado = delta(a,b,c);
		
		System.out.println("O resultado é: " + resultado);
	}
		
	
	public static int delta(int a, int b, int c){
		
		int resultadodeDelta = b^2 - (4*a*c);

		return resultadodeDelta;
	}
}
