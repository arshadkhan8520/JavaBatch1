package class10;

public class Arrays {
	
	public static void main(String[]args) {
		
		int [] numbers = new int [5];
		
		numbers[0] =5;
		numbers[1] =10;
		numbers[2] =15;
		numbers[3] =25;
		numbers[4] =30;
		
		System.out.println(numbers[3]);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		double [] num1 = new double [3];
		
		num1 [0]=10.11;
		num1 [1]=5.56;
		num1 [2]=60;
		
		System.out.println("number3 "+num1[2]+" number1 " +num1[0]+ " number2 "+num1[1]);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		String [] nameofArray = new String [2];
		
		nameofArray[0]= "Ahamd ";
		nameofArray[1]= "Ali";
		
		System.out.println(nameofArray[0] + nameofArray[1]);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		boolean [] b = new boolean [3];
		
		b[0]= true;
		b[1]= false;
		b[2]= true;
		
		System.out.println(b[2]);
		
		
		int size = b.length;
		System.out.println("Array size is "+size);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
				
	}

}
