public class No_Switch
{
	public static void main(String[] args) {
		int day = 3;
		switch(day)
		{

		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("No day");
			/* if there is no default case 
			then if the case 
			to b found is not found then no
			 output will be displayed but if
			  default case is there then if
			   the case not found then 
			   default case will be printed
			    as the output .*/

		}

		//System.out.println("Stop");
			
	}
}