import java.util.Scanner;


public class Exer2 {

	public static void main(String[] args) {
		System.out.println("Digite um n�mero");
		
		Scanner scanner = new Scanner(System.in);		
		float input = scanner.nextFloat();
		
		boolean isZero = isZero(input);
		
		if(isZero){
			System.out.println("� zero!");
		}else{
			System.out.println("N�o � zero");
		}
		scanner.close();
	}
	
	public static boolean isZero(float num){
		boolean checkIsZero;
		
		if(num == 0){
			checkIsZero = true;
		}else{
			checkIsZero = false;
		}

		return checkIsZero;
	}
	



}
