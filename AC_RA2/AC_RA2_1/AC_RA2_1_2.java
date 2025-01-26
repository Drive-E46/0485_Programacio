package AC_RA2_1;
import java.util.Scanner;
public class AC_RA2_1_2 {
	public static void main(String args[]) {
	//Variables
		String nom="";
		int num=0;
	//Code
		Scanner teclat=new Scanner(System.in);
		System.out.println("Introdueix un nom");
		nom=teclat.nextLine();
		num=nom.length();
		System.out.println("El nom te:"+num);
		System.out.print("Les vocals son: ");
		for(int i=0;i<num;i++) {
			switch(nom.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
		
			System.out.print(nom.charAt(i)+" ");
			}
		}
		
}}
