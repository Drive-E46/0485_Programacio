package AC_RA2_6;
	import java.util.Scanner;
public class AC_RA2_6_2 {
	public static void main(String args[]){
		//Variables
		String text=null;
		int num = 0;
		
		
		//Code
		AC_RA2_6_2 prog = new AC_RA2_6_2();
		
		
		text = "Introdueix un numero de mes: ";
		
		prog.print(text);
		num = (prog.num()-1);
		text = mesos(num);
		prog.print(text);
		
		
		
		
		
		
		
		
	}
	
	public static String mesos(int num) {
		//Variables
				String[] mes= {"Gener", "Febrer", "Març", "Abril", 
						"Maig", "Juny", "Juliol", "Agost", "Setembre", 
						"Octubre", "Novembre", "Decembre"};
				
				
				
				String mesos = mes[num];		
		return mesos;

	}	
	
	public int num() {
		//Variables
		int num=0;
		
		//Code
		Scanner in= new Scanner(System.in);
		num=in.nextInt();
		
		return num;
	}
	
	public void print(String text) {
		
		System.out.println(text);
		
	}

}
