package foo;

/**
 * Foo class
 */
public class Foo {

    public int unusedInt;
    public String unusedString;

    public static int div(int a, int b) {
        
        
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
