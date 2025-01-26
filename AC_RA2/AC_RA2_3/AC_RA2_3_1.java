package AC_RA2_3;
 import java.util.Scanner;
public class AC_RA2_3_1 {
	public static void main(String args[]) {
		//Variables 
		int[] num= new int[5];
		//Code 
		Scanner teclat=new Scanner (System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("Introdueix el "+(i+1)+" valor:");
			num[i] = teclat.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("El "+(i+1)+" valor introduit es: "+num [i]);
		
		}
		
		
	}
}
