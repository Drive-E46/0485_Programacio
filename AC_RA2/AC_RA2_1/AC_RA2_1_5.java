package AC_RA2_1;
	import java.util.Scanner;
public class AC_RA2_1_5 {
	public static void main(String args[]) {
		
		//Variables 
		String text=null;
		boolean capicua=true;
		
		
		//Code 
			//Tot en majuscules
		Scanner  in = new Scanner(System.in);
		System.out.println("Introdueix un text:");
		text=in.nextLine();
		
		
			//Cap i cua
		for(int i=0;i<((int)(text.length()/2));i++) {
			if(text.charAt(i)!=text.charAt(((text.length()-1)-i))) {
				
				capicua=false;
				break;
				
			}
		}
			
			//Imprimeix resultat
		System.out.println("Lletres amb majúscules:"+(text.toUpperCase()));
		if(capicua==false) {
			System.out.print("El text no es cap i cua");
		}
		else {
			System.out.println("El text es cap i cua");
		}
			
		
		
		
	}

}
