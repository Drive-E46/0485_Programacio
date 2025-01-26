package AC_RA2_6;
	import java.util.Scanner;
public class AC_RA2_6_1 {
	public static void main(String args[]) {
		
		//Variables
		float num1=0f;
		float num2=0f;
		float divret=0f;
		float sumret=0f;
		
		//Code	
		AC_RA2_6_1 prog = new AC_RA2_6_1();
		
		num1 = prog.llegeix();
		num2 = prog.llegeix();
		divret= prog.divisio(num1, num2);
		sumret= prog.suma(num1, num2);
		prog.print(num1, num2, sumret, divret);
		
	}
	

	public float divisio(float num1,float num2) {
		
		//Variables
		float divret;
		
		//Code
		divret = num1/num2;
		
		return divret;
		
	}
	
	public float suma(float num1,float num2) {
		
		//Variables
		float sumret;
		
		//Code
		sumret = num1+num2;
		
		return sumret;
		
	}
	
	public float llegeix() {
		float num;
		//Code
		Scanner in=new Scanner(System.in);
		System.out.println("Introdueix un numero");
		num= in.nextFloat();
		
		return num;
		
	}
	
	public void print(float num1, float num2, float sumret, float divret) {
		
		//Code
		System.out.println("El valor del num 1 es :"+num1);
		System.out.println("El valor del num 2 es : "+num2);
		System.out.println("El resultat de la suma es :"+sumret);
		System.out.println("El resultat de la divisio es :"+divret);

	}
	
	                    	
		
	
	
	
}

