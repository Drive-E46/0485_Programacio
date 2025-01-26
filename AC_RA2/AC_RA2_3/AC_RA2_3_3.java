package AC_RA2_3;
	
public class AC_RA2_3_3 {
	public static void main(String args[]) {
		//Variables
		int[] num= new int[10];
		int numbig = 0;
		int numsmall = 0;
		
		//Code
		for(int i=0;i<10;i++) {
			num[i] = (int)((Math.random()*100)+1);
		}
		for(int i=0;i<=100;i++) {
			for(int j=0;j<10;j++) {
			if(i == num[j]){
				numbig = (num[j]);
			}
			}		
		}
		for(int i=100;i>=0;i--) {
			for(int j=0;j<10;j++) {
			if(i == num[j]){
				numsmall = (num[j]);
			}
			}
		}

		System.out.println("El numero mes gran es: "+numbig);
		System.out.println("El numero mes petit es: "+numsmall);		
	}
		
}

