package AC_RA2_6;
	import java.util.Scanner;
public class AC_RA2_6_5 {
	public static void main(String args[]) {
		
		//Variables
		String frase = "Frase de mostra per fer proves";
		int opcio = 0;
		boolean sr = true;
		//Code
		AC_RA2_6_5 prog = new AC_RA2_6_5();
		
		
		while(sr) {
			
			opcio = prog.menu();
			
			switch(opcio) {
			
			case 0:
				
				sr=false;
				System.out.println("Adeu!!");
				
				
				
				break;
				
			case 1:
				
				System.out.print("La frase és: ");
				System.out.println(frase);
				System.out.println();
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				System.out.println("Hi ha "+ prog.numParaules(frase)+" paraules a la frase");
				System.out.println();
				
				break;
			
			case 4:
				
				System.out.println("Hi ha "+ prog.numVocals(frase)+" vocals a la frase");
				System.out.println();
				break;
				
			case 5:
				
				frase = prog.restaLletra(frase);
				break;
				
			case 6:
				
				frase = prog.restaParaula(frase);
				break;
				
			case 7:
				
				frase =  prog.fraseCabgirada(frase);			
				break;
				
			case 8:
				
				prog.giraParaules(frase);
				break;
			
					default:
						System.out.println("Aquesta opció no existeix");
			
			
			
			}
			
			
			
		}
	}
	
	public void giraParaules(String frase) {
		
		//Variables
		
		String paraula="";
		
		//Code
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)!=' ') {
				paraula= paraula + frase.charAt(i);
			}
			else {
				System.out.print(fraseCabgirada(paraula)+" ");
				paraula= " ";
			}
		}
		System.out.print(fraseCabgirada(paraula));
		System.out.println();
	}
	
	public String fraseCabgirada(String frase) {
		
		//Variables
		
		String nova=null;
		
		
		//Code
		
		for(int i = (frase.length()-1);i>=0;i--) {
			
			nova=nova+frase.charAt(i);
			
		}
		
		
		return nova;
		
		
	}

	public String restaParaula(String frase) {
		
		//Variables
		int pos=0;
		
		//Code
		pos = frase.lastIndexOf(' ');
		frase=frase.substring(0, (pos));

		return frase;
		
	}
	
	public String restaLletra(String frase) {
		
		//Variables
		
		//Code
		frase = frase.substring(0,(frase.length()-1));
		
		return frase;
	
	}
	
	public int numVocals(String frase) {
		
		//Variables
		int vocals=0;
		frase = frase.toLowerCase();
		
		//Code
		for(int i=0;i<frase.length();i++) {
			switch(frase.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vocals++;
				break;
			default:

			}
		}
		
		return vocals;
	}
	
	public int numParaules(String frase) {
		
		//Variable
		int espai = 0;
		
		//Code
		for(int i=0; i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				espai++;
			}

		}
		return espai+1;
	}
	
	public String  demanarFrase() {
		
		//Variables
		
		
		//Code
				Scanner in = new Scanner(System.in);
	}
	
	public int menu() {
		
		//Variables
		int nummenu=0;
		
		//Code
		Scanner in = new Scanner(System.in);
		
		System.out.println("*Tria una opcio:*");
		System.out.println("1- Entra una frase al sistema");
		System.out.println("2- Mostar estat frase");
		System.out.println("3- Número de paraules");
		System.out.println("4- Número de vocals");
		System.out.println("5- Eliminar ultima lletra");
		System.out.println("6- Elimina ultima paraula");
		System.out.println("7- Capgira frase");
		System.out.println("8- Capgira parules per separat");
		System.out.println("0- Exit");
		
		nummenu = in.nextInt();
		
		return nummenu;
	}

}
