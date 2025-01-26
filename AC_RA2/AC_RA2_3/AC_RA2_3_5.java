package AC_RA2_3;

public class AC_RA2_3_5 {
	public static void main(String args[]) {
		//Variables
		int[] num = new int[50];
		int[] sumes = new int[4]; //0: suma total; 1: suma de 5; 2: suma de 6; 3: suma de 5 i 6; 		
		//Code 
		for(int i=0;i<50;i++) {
			num[i]=(int)((Math.random()*6)+1);
		}
		//Operacions sumes 
		for(int i=0;i<50;i++) {
			sumes[0]=(sumes[0]+num[i]);
			switch(num[i]) {
			case 5:
				sumes[1] =(sumes[1]+1);
				break;
			case 6:
				sumes[2] =(sumes[2]+1);
			}

		}
		sumes[3]=sumes[1]+sumes[2];
		
		System.out.println("La suma de totes les tirades es: "+sumes[0]);
		if(sumes[0]%2 == 0) {
			System.out.println("El numero es parell");
			
		}
		else {
			System.out.println("El numero total es imparell");
		}
		
		System.out.println("La suma de les vegades que a surtit 5 i 6 es: "+sumes[3]);
		System.out.println("La suma de totes les vegades que a surtit 5 es: "+sumes[1]);
		System.out.println("La suma de totes les vegades que a surtit 6 es: "+sumes[2]);
	}

}
