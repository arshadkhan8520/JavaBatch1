package class8;

public class ForLoopPractice {

	public static void main(String[] args) {
		
		// Print the number from 1 - 100 in one line with space
		
		for (int k=1; k<=100; k++) {
			System.out.print(k+" ");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		// Print the number from 100 - 1 in one line add $ in each number
		
		for (int j=100; j>=1; j--) {
			System.out.print(j+"$ ");
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		// Print even numbers from 20 - 1 (2 ways)
		// This is one way
		
		for (int i=20; i>1; i-=2) {
			System.out.print(i+" ");
		}
		// Other way
		
		System.out.println();
		for (int i =20; i>50; i--) {
			if (i%2==0)
			System.out.print(i+" ");
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		// Print odd numbers between 20 and 50 (2 ways)
		
		for (int a=20; a<=50; a++) {
			if (a%2!=0)
			System.out.print(a+" ");
		}
		
		System.out.println();
		for (int b =50; b>20; b--) {
			if (b%3==0)
			System.out.print(b+" ");
		
	
		}
		
	}

}
