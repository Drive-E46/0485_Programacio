package AC_RA2_3;

public class AC_RA2_3_4 {
	public static void main(String args[]) {
		//Variables
		int[] num= new int[5];
		//Code
		for(int i=0;i<5;i++) {
			num[i]=(int)((Math.random()*12)+1);
		}
		System.out.println("La suma es: "+(num[1]+num[3]));
	}

}
