package simplilearn1;

class defAccessSpecifier{
	
	void display()
	{
	System.out.println(" This is a default access specifier");
	}
}

public class accessSpecifierDefault {
	public static void main(String[] args) {
		System.out.println("Default Access Specifier");
		
		defAccessSpecifier obj = new defAccessSpecifier();
		obj.display();
		
	}
}