package AC_RA2_5;

public class AC_RA2_5_1 {
	public static void main(String args[]) {
		//Variables 
		
		char[][] let=new char[3][3];
		
		
		//Code
		
		let[0][0]='X';
		let[0][1]='O';
		let[0][2]='X';
		let[1][0]=' ';
		let[1][1]='O';
		let[1][2]=' ';
		let[2][0]=' ';
		let[2][1]='X';
		let[2][2]=' ';
		
		
		for(int i=0;i<let.length;i++) {
			for(int j=0;j<let[0].length;j++) {
			System.out.print(let[i][j]);
			}
			System.out.println();
			
		}
		
		
		
		
		}
}
