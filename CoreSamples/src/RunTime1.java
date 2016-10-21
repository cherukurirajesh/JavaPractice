
public class RunTime1 implements RunTime{

	public static void main(String[] args) {
		//Interface objectname = keyword classname
		RunTime runtime = new RunTime1();
		
		String fullName = runtime.Add("Amrita", "sai");
		System.out.println("fullName: "+fullName);
		
		String addName = runtime.Sub("bus", "driver");
		System.out.println("addName:  "+addName);
		
		String place = runtime.Door("Number", 30);
		System.out.println("place:  "+place);

		int boundary = runtime.Mul(7,20);
		System.out.println("boundary:  "+boundary);
		
	}

	@Override
	public String Add(String Amrita, String sai) {
		return Amrita + sai;
	}

	@Override
	public String Sub(String bus, String driver) {
		return bus + driver;
	}

	@Override
	public int Mul(int day, int year) {
		return day - year;
	}

	@Override
	public String Door(String Number, int series) {
		return Number + series;
	}

	

	
	}

