
public class FindingLeapYear {

	public static void main(String[] args) {
			int i = 2000;
			String leapyear = "";
			
			System.out.println("Leap years till 3000 are ");
			while (i <= 3000)
			{
				if (i%400 == 0)
				{
					leapyear = leapyear + i;
					System.out.print(i+", ");
				}
				else if(i%4 == 0)
					{
						leapyear = leapyear + i;
						System.out.print(i+", ");				
					}
				
				i++;
			}
	}

}
