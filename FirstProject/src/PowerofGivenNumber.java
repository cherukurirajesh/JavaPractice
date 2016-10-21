
public class PowerofGivenNumber {

	public static void main(String[] args) {

		int i = 0;
		int n = 10;
		int base =2;
		int power = 1;
		
	while (i<=n)
	{
		System.out.println("2 power "+ i+ " = " + power);
		power = power * base;
		i++;
	}
	
}
}

