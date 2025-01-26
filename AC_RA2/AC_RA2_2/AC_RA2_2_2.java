package AC_RA2_2;

public class AC_RA2_2_2 {
	public static void main(String args[]){
	//Variables
	double dau1=0;
	int valor=0;
	//Code
	for (int i=1;i<=6;i++) {
		dau1=((Math.random()*12)+1);
		System.out.println("Tirada numero: "+i+" numero de dau: "+(int)dau1);
	}
	
	for (int i=1;i<=24;i++) {
		dau1=(int)((Math.random()*12)+1);
			switch((int)(dau1)) {
			case 1:
			valor = (valor +(int)dau1);
			}
		
	}
	System.out.println(valor);
}
}
