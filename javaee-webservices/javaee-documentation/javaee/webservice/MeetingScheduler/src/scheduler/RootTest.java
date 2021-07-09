package scheduler;

import java.io.IOException;

public class RootTest {
	
	public static void main(String[] args) throws IOException {
		
		root rootObject = new root();
		ScheduleFunction.clear();
		System.out.println(rootObject.post("1"));
		
		System.out.println(rootObject.post("5"));
		System.out.println("*******************");
		System.out.println(rootObject.get("1"));
		System.out.println(rootObject.get("2"));
		System.out.println(rootObject.get("3"));
		System.out.println(rootObject.get("4"));
		System.out.println(rootObject.get("5"));

	}

}
