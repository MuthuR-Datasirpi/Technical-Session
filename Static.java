class Static {

	// Case 1: Static variable
	static int i;
	// Case 2: Non-static variable
	int j;

	// Case 3: Static blocks
	static
	{
		i = 10;
		System.out.println("static block called ");
	}

	// Constructor calling
	Static() { System.out.println("Constructor called"); }
}

// Class 2
class GFG {

	public static void main(String args[])
	{

		// Although we have two objects, static block is
		// executed only once.
		Static t1 = new Static();
		Static t2 = new Static();
	}
}
