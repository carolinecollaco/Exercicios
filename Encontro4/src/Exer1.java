
public class Exer1 {
	
	public static void main(String[] args) {
		boolean result = isPositive(-13);
		if(result == true){
			System.out.println("Positivo");
		}else{
			System.out.println("Negativo");
		}
	}

	public static boolean isPositive (float num){
		
		boolean positive = num >0;
		
		return positive;	
		
	}

}
