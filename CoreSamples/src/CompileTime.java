
public class CompileTime {

	public static void main(String[] args) {
	
		CompileTime compileTime = new CompileTime();
		
		String fullName = compileTime.Sub("navya","sri");
		int totalMarks = compileTime.Sub(40,70);
		String time = compileTime.time("time1","time2");
		String room = compileTime.room("className", 4);
		 
		System.out.println("fullName: "+fullName);
		System.out.println("totalMarks: "+totalMarks);
		System.out.println("time:  "+time);
		System.out.println("room: "+room);
	}
		
		public String Sub(String firstName, String lastName){
		  return firstName + lastName;
		}
		public int Sub(int teluguMarks, int englishMarks){
			return teluguMarks + englishMarks;
		
		}
	public String time(String time1, String time2 ){
		 return time1 =  time2;
	}
	public String room(String className, int classNumber){
		   return className + classNumber;
	}

}
