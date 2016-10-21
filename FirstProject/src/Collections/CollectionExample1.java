package Collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample1 {

	public static void main(String[] args) throws Exception
	{

		
		Collection values = new ArrayList();
		values.add(0);
		values.add(99);
		values.add("Testing");
		values.add(38.4);
		values.add(0.28f);
		
		System.out.println("size: " + values.size());
		System.out.println();
		
	}

}
