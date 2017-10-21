/* String concatenation */
package jpkg;

class StringConcat{
    static void stringConcat(){
	String s = "hello "+ "world!";
	System.out.println("s: "+ s);
	System.out.println("s is a String and so the object it refers to is immutable.\nLuckily we can use StringBuffer or the faster StringBuilder classes");
	
	System.out.println("\n\n Using StringBuffer [obsolete, slower]");
	StringBuffer sbf = new StringBuffer(s);
	sbf.append(" good").append(" morning :)");
	System.out.println("sbf: "+ sbf.toString());
	System.out.println("sbf.length: "+ sbf.length());
	sbf.delete(1,5); //1 is inclusive but 5 is exclusive so from 1 to less than 5
	System.out.println("sbf.delete(1,5): "+ sbf.toString());
	System.out.println("sbf.length(): "+ sbf.length());
	sbf.insert(1, "ey");
	System.out.println("sbf.insert(1, \"ey\") : "+ sbf.toString());
	System.out.println("sbf.length(): "+ sbf.length());
	
	System.out.println("\n\n Using StringBuilder");
	StringBuilder sb = new StringBuilder(s);
	sb.append(" good").append(" morning :)");
	System.out.println("sb: "+ sb.toString());
	System.out.println("sb.length: "+ sb.length());
	sb.delete(1,5); //1 is inclusive but 5 is exclusive so from 1 to less than 5
	System.out.println("sb.delete(1,5): "+ sb.toString());
	System.out.println("sb.length(): "+ sb.length());
	sb.insert(1, "ey");
	System.out.println("sb.insert(1, \"ey\") : "+ sb.toString());
	System.out.println("sb.length(): "+ sb.length());

    }

    public static void main(String...args){

	stringConcat();
    }
}