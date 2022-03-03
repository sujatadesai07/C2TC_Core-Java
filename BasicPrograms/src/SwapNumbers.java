
public class SwapNumbers {

	public static void main(String[] args) {
		
		float no1= 1.70f, no2 = 2.48f;
		System.out.println("--Before Swap--");
		System.out.println("First number = " + no1);
		System.out.println("Second number = " + no2);
		
		float temporary = no1;
		no1 = no2;
		no2 = temporary;
		
		System.out.println("--After Swap--");
		System.out.println("First number = " + no1);
		System.out.println("Second number = " + no2);
		

	}

}
