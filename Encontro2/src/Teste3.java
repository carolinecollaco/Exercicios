
public class Teste3 {

	public static void main(String[] args) {
	
		int incial = 1;
		int resultado = 0;
		
		resultado = ++incial;
		
		System.out.println(resultado);
		
		for (int contador = 0; contador < 10; contador+=2) {
			System.out.println(contador);
			
		}
		
		int contador2 =5;
				
		while(contador2 < 10){
			System.out.println("Contador 3 com while: "+contador2);
			contador2++;
		}
		
		int contador3 =3;
		
		do{
			System.out.println("Contador 3 com do while: "+contador3);
			contador3++;			
		}while(contador3 <= 100);
	}


}
