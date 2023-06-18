import java.util.Scanner;

public class Day3_Assignemnt3 {
	public static void main(String[] args) {
		
		//cmd 
		if(args.length == 3){
			int m1 = Integer.parseInt(args[0]);
			float m2 = Float.parseFloat(args[1]);
			double m3 = Double.parseDouble(args[2]);

			calculate(m1,m2,m3);
		}
		else{
			System.out.println("pass 3 score");
		}

		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st score");
		int m1 = s.nextInt();

		System.out.println("Enter 2nd score");
		float m2 = s.nextFloat();


		System.out.println("Enter 3rd score");
		double m3 = s.nextDouble();

		calculate(m1,m2,m3);

		s.close();
	}

	public static void calculate(int m1, float m2 , double m3){
		double total = m1+m2+m3;
		double avg = total/3;
	

	    System.out.println("\nInputs:");
        System.out.println("Score 1: " + m1);
        System.out.println("Score 2: " + m2);
        System.out.println("Score 3: " + m3);

        System.out.println("\nOutput:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}


