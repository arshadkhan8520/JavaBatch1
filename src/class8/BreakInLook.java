package class8;

public class BreakInLook {

	public static void main(String[] args) {
		
		// Only I need to print number 8
		
		for (int i=1; i<=20; i++) {
			if (i==8) {
				System.out.println(i);
				break;
			}
		}
		
		// print in while loop
		
		int num =1;
		while (num<=20) {
			System.out.println("This is outside ");
			if(num==10) {
				break;
			}
			num++;
		}
		
		boolean rain = true;
		int temp =75;
		
		while (rain) {
			System.out.println("I will not go outside for walking");
			if (temp>75) {
				System.out.println("I wil go outside the weather is nice");
				break;
			}
			temp++;
		}

	}

}
