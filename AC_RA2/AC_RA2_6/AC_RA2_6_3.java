package AC_RA2_6;
	import java.util.Scanner;
public class AC_RA2_6_3 {
	private static final String[][] Taula = null;

	public static void main(String args[]) {
		//Variables
		String[][] Taula_dades;
		
		//Code
		AC_RA2_6_3 prog = new AC_RA2_6_3();
		
		
	}
	
	public String[][] Taula(String[][] Taula_dades){
		//variables
		String[][] Tau=new String[Taula_dades.length+1][4];
		
		for(int i=0;i<=Taula_dades.length;i++) {
			for(int j=0;j<4;j++) {
				if(i==Taula_dades.length-1) {

				Tau[i][j] = Taula_dades[i][j];
				}
				else {
					
				//importar nova linea;
				}
			}
			
			
			
		}
		
		
		return Taula;
		
	}

}
