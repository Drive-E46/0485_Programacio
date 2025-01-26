package AC_RA2_1;
	//import java.util.Scanner;
public class AC_RA2_1_4 {
	public static void main(String args[]){
		//Variables
		String text="Mòdul 0440: Programació";
		int num=0;
		int primera=0;
		int ultima=0;
		String newtext=null;
		//Code
		num=text.length();
		for(int i=0;i<num;i++) {
		switch(text.charAt(i)) {
		case 'a':
				System.out.print("i");
			break;
			
			default: 
				System.out.print(text.charAt(i));
		
		
		}
		

		
		
		}
		System.out.println("");
		for(int i=0;i<num;i++) {
			switch(text.charAt(i)) {
			case ' ':
					System.out.print("");
				break;
				
				default: 
					System.out.print(text.charAt(i));
			}
				
		}
		System.out.println("");
		primera=text.indexOf('M');
		ultima=(text.lastIndexOf(':')+1);
		newtext=text.substring(primera,ultima);
		System.out.println(newtext);
		
		
		
		}
		
		
	

}
