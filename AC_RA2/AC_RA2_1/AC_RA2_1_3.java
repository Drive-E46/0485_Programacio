package AC_RA2_1;

import java.util.Scanner;

public class AC_RA2_1_3 {
	public static void main(String args[]) {
	//Variable
	String nom="null";
	int num=0;;

	//Code
	Scanner teclat=new Scanner(System.in);
	System.out.println("Introdueix un nom");
	nom=teclat.nextLine();
	num=nom.length();
	System.out.print("Les lleres son: ");
	
	for(int i=(num-1);i>=0;i--) {
		System.out.print(nom.charAt(i) +" ");
		
	}
	}
}
