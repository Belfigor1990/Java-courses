public class Calculate{
	
		public static void main(String[] arg) {
			System.out.println("Calculate...");
			Double first=Double.valueOf(arg[0]);
			Double second=Double.valueOf(arg[1]);
			Double third=Double.valueOf(arg[2]);
			Double fourth=Double.valueOf(arg[3]);

			Double summ=first+second;
			System.out.println("Sum(1+2) " + summ);
			
			Double min=fourth-first;
			System.out.println("Minus(4-1) " + min);
			
			Double multiplication=second*third;
			System.out.println("multiplication(2*3) " + multiplication);
			
			Double division=fourth/second;
			System.out.println("division(4/2) " + division);
		}
}