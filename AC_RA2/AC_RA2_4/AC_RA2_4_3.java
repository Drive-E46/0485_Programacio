package AC_RA2_4;

public class AC_RA2_4_3 {
	public static void main(String args[]) {
		//Variables
		int[] num={196, 517, 252, 865, 836, 759, 588, 166, 463, 537, 860, 404, 958, 791, 939, 321, 596, 908, 141, 511, 309, 479, 182, 852, 401, 976, 349, 343, 707, 558, 995, 151, 849, 152, 113, 163, 152, 272, 191, 893, 995, 45, 755, 155, 845, 330, 25, 508, 9, 819, 884, 142, 167, 543, 914, 504, 88, 246, 621, 682, 541, 699, 61, 284, 303, 112, 42, 314, 334, 495, 686, 321, 655, 945, 698, 950, 195, 605, 851, 830, 874, 241, 299, 672, 516, 177, 96, 312, 749, 634, 919, 428, 895, 346, 360, 597, 32, 704, 310, 396};
		int ok=1;
		int move=0;
		int val=0;
		int rep=0;
		int con=0;
		
		//Code
		long startTime = System.nanoTime();
		while(ok != 0) {
			ok=0;
			rep++;
			for(int i=0;i<(num.length);i++) {
				move=num[i];
				val=i;
				
				for(int j=i;j<(num.length);j++) {
					if(num[j]<num[val]) {
						val=j;
					}
					

				}
				if(val>i) {
				num[i]=num[val];
				num[val]=move;
				}
			}
		}
			
	
		long endTime = System.nanoTime() - startTime;
		System.out.print("{");
		for(int i=0;i<99;i++) {
			System.out.print(num[i]+", ");
		}
		System.out.println(num[99]+"}");
		System.out.println("Time: "+endTime);
		System.out.println("Repeticions del bucle: " +rep);
 }
}
