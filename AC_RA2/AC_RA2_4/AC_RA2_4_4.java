package AC_RA2_4;

public class AC_RA2_4_4 {
	public static void main(String args[]) {
		//Variables
		int[] num={196, 517, 252, 865, 836, 759, 588, 166, 463, 537, 860, 404, 958, 791, 939, 321, 596, 908, 141, 511, 309, 479, 182, 852, 401, 976, 349, 343, 707, 558, 995, 151, 849, 152, 113, 163, 152, 272, 191, 893, 995, 45, 755, 155, 845, 330, 25, 508, 9, 819, 884, 142, 167, 543, 914, 504, 88, 246, 621, 682, 541, 699, 61, 284, 303, 112, 42, 314, 334, 495, 686, 321, 655, 945, 698, 950, 195, 605, 851, 830, 874, 241, 299, 672, 516, 177, 96, 312, 749, 634, 919, 428, 895, 346, 360, 597, 32, 704, 310, 396};
		int val=0;
		int move=0;
		int canvis=0;
		int compar=0;
		
		//Code
		long startTime = System.nanoTime();
		for(int i=1;i<(num.length);i++) {
			val=i;
			for(int j=i-1;j>=0;j--) {
				if(num[j]>num[i]) {
					val=j;
					canvis++;
				}
				compar++;
				
			}
			move=num[i];
			for(int j=i;j>val;j--) {
				num[j]=num[j-1];
				canvis++;
			}
			num[val]=move;
			canvis++;
			
		}
		long endTime = System.nanoTime() - startTime;
		
		System.out.println(endTime/1000);
		
	}

}
