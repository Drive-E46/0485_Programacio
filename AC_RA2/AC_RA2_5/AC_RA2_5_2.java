package AC_RA2_5;
	import java.util.Scanner;
public class AC_RA2_5_2 {
	public static void main(String args[]) {
		
		//Variables
		
		int[][] num;
		int x=0;
;
		
		//Code
		do{
			Scanner in = new Scanner(System.in);
			System.out.println("Inserta un numero del 0 al 10");
			x = in.nextInt();
		}while(((x<0)||(x>10)));
		
		num =new int [x][x];
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if((i==0)||(j==0)||(i==(num.length-1))||(j==(num[i].length-1))) {
					num[i][j]=1;
				}
				
				else {
					num[i][j]=0;	
				}	
			}
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
