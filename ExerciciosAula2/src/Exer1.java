import java.util.Random;
public class Exer1 {

	public static void main(String[] args) {
		
		Random gerador = new Random(); 
		
		int n =gerador.nextInt(101) + 51;
		System.out.println(n);

			
			if(n < 70){
				System.out.println("Estou de recuperação");				
			}
			else if (n>=70 && n < 80) {
				System.out.println("Passei e fiquei no mediano");
			}
			else if (n>=80 && n < 90){
				System.out.println("Passei e fiquei relativamente bem");
			}
			else if (n>=90 && n < 96){
				System.out.println( "Passei e fiquei acima da média");
			}
			else{
				System.out.println("FUCK YEA");
			}
		}
	}	

