/* working with String pool */
package jpkg;

class StringPool{
    static void stringPool(){
	System.out.println("\nInside stringPool...");
	String s1 = "hello!";
	String s2 = "hello!";
	String s3 = "hello!".intern();
	String s4 = new String("hello!"); // will create new object in heap outside of string pool but this object will reference hello in string pool.
	String s5 = "lo!";
	final String s6 = "lo!"; // note that constants are evaluated at compile time so the value of s6 is preassigned to it unlike s5
	System.out.println("s1 == s2: "+ (s1 == s2));
	System.out.println("s1 == s3: "+ (s1 == s3));
	System.out.println("s1 == s4: "+ (s1 == s4));
	System.out.println("s1 == s4.intern(): "+ (s1 == s4.intern()));
	System.out.println("s1 == \"hel\"+\"lo!\": "+ (s1 == "hel" + "lo!"));
	System.out.println("s1 == \"hel\"+ s5: "+ (s1 == "hel" + s5));
	System.out.println("s1 == \"hel\" + s6 (a constant): "+ (s1 == "hel" + s6));
    }

    public static void main(String...args){
	stringPool();
    }

}