package AC_RA2_2;
	import java.util.Scanner;
public class AC_RA2_2_4 {
	public static void main(String args[]) {
	//Variables
	double num=0;
	double mija=0;
	//Code
	Scanner in = new Scanner(System.in);
	
	for(int i=1;i<=5;i++) {
		System.out.println("introdueix un numero real");
		num = in.nextDouble();
		mija= num+mija;
	}
	mija= mija/5;
	System.out.println("La mija es: "+(mija));
	System.out.println("Arodonit cap adalt: "+Math.ceil(mija));
	System.out.println("Arodonit cab avaix: "+Math.floor(mija));
	}
}
