package AC_RA2_3;
 import java.util.Scanner;
public class AC_RA2_3_2 {
	public static void main(String args[]) {
		//Variables
		int[] num = new int[12];
	
	Scanner teclat= new Scanner (System.in);
	System.out.println("Introdueix un valor: ");
	num[0] = teclat.nextInt();
	for(int i=1;i<12;i++) {
	num[i]=(num[(i-1)]*2);		
	}
	for(int i=0;i<12;i++) {
		System.out.println("El valor de la casella numero "+(i+1)+" es: "+num[i]);	}
	}
}
