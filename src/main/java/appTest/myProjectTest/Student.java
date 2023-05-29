package appTest.myProjectTest;

public class Student {

	private String name;
	
	public Student(String name){
		
		this.name = name;
	}
	String getName() {
		return name;
	}
	void check(String name) {
		
		if(name != "") 
		{
		System.out.print("Welcome "+name);
		} else {
			
			System.out.print("No valid user ");
		}
	}
}
