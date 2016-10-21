public class PrimeNumbersfrom1to100 {

	public static void main(String[] args) {
		int i = 0;
		int counter;
		int n;
		String primenumbers = "";

		{
			counter = 0;
			for (i = 1; i <= 100; i++) 
			for (n = i; i % n == 0; n--) 
			{
				counter = counter + 1;
				if (counter == 2) 
				{
					primenumbers = primenumbers + i + "";
					System.out.println("The Primenumbrs from 1 to 100 are" + primenumbers);
				}

			}
		}
	}

}
