
public class AbstractionExample {

	public static void main(String[] args) {
		
		AddInterface addInterface = new RuntimePolymorpishm();
		
		String fullName = addInterface.add("Raja ", "Sri Hyderabad");
		System.out.println("fullName: "+fullName);
		
	}

}
