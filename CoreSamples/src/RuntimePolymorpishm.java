
public class RuntimePolymorpishm implements AddInterface{

	public static void main(String[] args) {
		
		//Interface objectname = keyword classname
		AddInterface addInterface = new RuntimePolymorpishm();
		
		String fullName = addInterface.add("Raja ", "Sri Hyderabad");
		System.out.println("fullName: "+fullName);
		
	}

	@Override
	public String add(String firstName, String lastName) {
		return firstName + lastName;
	}

}
