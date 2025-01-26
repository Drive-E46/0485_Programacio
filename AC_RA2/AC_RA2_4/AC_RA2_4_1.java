package AC_RA2_4;

public class AC_RA2_4_1 {
	public static void main(String args[]){
	//Variables 
	int[] num = new int[100];
	
	//Code
	for(int i=0;i<100;i++) {

		num[i]=(int)((Math.random()*1000)+1);
		System.out.println(num[i]);
		
	}
	System.out.print("{");
	for(int i=0;i<99;i++) {
		System.out.print(num[i]+ ", ");
	}
	System.out.print(num[99]+"}");
	
	
	
	
	
}
	}
