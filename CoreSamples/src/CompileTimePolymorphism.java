
public class CompileTimePolymorphism {

	public static void main(String[] args) {
		
		CompileTimePolymorphism compileTimePolymorphism = new CompileTimePolymorphism();
		
		String fullName = compileTimePolymorphism.add("Raja ", "Sri");
		int totalMarks = compileTimePolymorphism.add(50, 45);
		
		System.out.println("fullName: "+fullName);
		System.out.println("totalMarks: "+totalMarks);
		
	}
	
	public String add(String firstName, String lastName) {
		return firstName + lastName;
	}
	
	public int add(int teluguMarks, int hindiMarks) {
		return teluguMarks + hindiMarks;
	}

}
