public class Operators {
    // Main Function
    public static void main (String[] args) {
        
        //! Arithmetic operators
        int a = 10;
        int b = 3;
    
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        //! increment and decrement  
        // Interger declared
        int c = 10;
        int d = 10;

        // Using uniary operators
        System.out.println("Postincrement : " + (c++));
        System.out.println("Preincrement : " + (++c));
        
        System.out.println("Postdecrement : " + (d--));
        System.out.println("Predecrement : " + (--d));

        //! Assignment operators
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));

        //!Relational operators
        int l = 10;
        int m = 3;
        int n = 5;
 
        System.out.println("a > b: " + (l > m));
        System.out.println("a < b: " + (l < m));
        System.out.println("a >= b: " + (l >= m));
        System.out.println("a <= b: " + (l <= m));
        System.out.println("a == c: " + (l == n));
        System.out.println("a != c: " + (l != n));

        //! Logical operators
        boolean x = true;
        boolean y = false;
        
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        //! ternary operator.
        int h = 20, b1 = 10, c1 = 30, result;

		// result holds max of three
		// numbers
		result= ((h > b1) ? (h > c1) ? h : c1 : (b1 > c1) ? b1 : c1);
		System.out.println("Max of three numbers = "+ result);

    }
}
