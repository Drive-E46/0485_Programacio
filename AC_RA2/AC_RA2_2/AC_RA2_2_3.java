package AC_RA2_2;
	import java.util.Scanner;
public class AC_RA2_2_3 {
	public static void main(String args[]){
		//Variables
		int num=0;
		int random = 0;
		
		//Code
		Scanner teclat=new Scanner(System.in);
		
		// Bucle de 5 intents
		for (int i=1;i<=5;i++){	
			
			//Pregunta i guarda a la variable
			System.out.println("Averigua el numero del 1 al 50");
			num=teclat.nextInt();
			//Genera un numero aleatori de 1 a 50
			random=(int)((Math.random()*50)+1);
			//Mira si es major o menor
			if(num>random){
				System.out.println("el numero aleatori es menor al introduit");
			}
			else {
				System.out.println("El numero aleatori es major que el intruduit");
			}
			//Informa si es guanyador o a fallat
			if (num == random){
				System.out.println("YOU WIN");
				i = 1;
			}
			else {
				System.out.println("TRY AGAIN");				
			}	
		}
		System.out.println("END GAME");
	}
}
