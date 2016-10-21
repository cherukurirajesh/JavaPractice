package com.rajesh.practice;

public class StringAndStringBufferExamples {

	public static void main(String[] args) {
		String myname = new String();
		System.out.println("Length of the Name at the start: " + myname.length());
		System.out.println("Hash Codeat the start: " + myname.hashCode());
		
		myname = myname.concat("Game");
		System.out.println("My Name at the second run : " + myname);
		System.out.println("My Name at the second run : " + myname.length());
		System.out.println("Hash Codeat the Second run " + ": " + myname.hashCode());

		myname = myname.concat("Of");
		System.out.println("My Name at the second run : " + myname);
		System.out.println("My Name at the Third run : " + myname.length());
		System.out.println("Hash Codeat the Third run " + ": " + myname.hashCode());

		
		myname = myname.concat("Thrones");
		System.out.println("My Name at the second run : " + myname);
		System.out.println("My Name at the Fourth run : " + myname.length());
		System.out.println("Hash Codeat the Fourth run " + ": " + myname.hashCode());
		System.out.println("Final Length of the Name"+ ": " + myname.length());

		System.out.println(myname.charAt(7));
		
		int mynameLength = myname.length();
		int count = 0;
		for(int i=0; i<mynameLength; i++) {
			count = 0;
			char character = myname.charAt(i);
			
			for(int j=0; j<mynameLength; j++) {
				char characterTemp = myname.charAt(j);
				if(character == characterTemp) {
					count++;
				}
			}
			
			System.out.println("Character: "+character+" had "+count+" references");
		}	
	
	}
		
	
}


/*
int mynameLength = myname.length();
int count = 0;
for(int i=0; i<mynameLength; i++) {
	count = 0;
	String character = ""+myname.charAt(i);
	
	for(int j=0; j<mynameLength; j++) {
		String characterTemp = ""+myname.charAt(j);
		if(character.equalsIgnoreCase(characterTemp)) {
			count++;
		}
	}
	
	System.out.println("Character: "+character+" had "+count+" references");
}	

}

*/