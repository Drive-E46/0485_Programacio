package AC_RA2_2;

public class AC_RA2_2_1 {
 public static void main(String args[]) {
	 //Variables
	 double dau1=0;
	 double dau2=0;
	 int suma=0;
	 //Code 
	 dau1=((Math.random()*6)+1);
	 System.out.println("Primer dau: "+(int)dau1);
	 
	 dau2=((Math.random()*6)+1);
	 System.out.println("Segon dau: "+(int)dau2);	 
	 
	 suma=(int)(dau1 + dau2);
	 
	 System.out.println("La suma es: "+suma);
 }
}
