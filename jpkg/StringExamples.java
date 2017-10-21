package jpkg;

/* basics of Strings */
class StringExamples{

static void stringExamples(){
    System.out.println("\nInside stringExamples...");
    String s = "hello world!";
    System.out.println("s: "+ s);
    
    System.out.println("\ns.length(): "+ s.length());
    System.out.println("\ns.isEmpty(): "+ s.isEmpty());
    //Comparison
    System.out.println("\nComparison Methods");
    System.out.println("s.equals(\"HELLO WORLD!\"): "+ s.equals("HELLO WORLD!"));
    System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\"): "+ s.equalsIgnoreCase("HELLO WORLD!"));
    System.out.println("s.compareTo(\"HELLO WORLD!\"): "+ s.compareTo("HELLO WORLD!"));

    //Search methods
    System.out.println("\nSearch methods");
    System.out.println("s.contains(\"HELLO WORLD!\"): "+ s.contains("HELLO WORLD!"));
    System.out.println("s.contains(\"world!\"): "+ s.contains("world!"));
    System.out.println("s.startsWith(\"HELLO WORLD!\"): "+ s.startsWith("HELLO WORLD!"));
    System.out.println("s.endsWith(\"!\"): "+ s.endsWith("!"));
    System.out.println("s.indexOf(\"lo\"): "+ s.indexOf("lo"));
    System.out.println("s.indexOf(\"o\"): "+ s.indexOf('o'));
    System.out.println("s.lastIndexOf(\"o\"): "+ s.lastIndexOf('o'));
		       
    //Examiningi individual characters
    System.out.println("\nExamining individual characters");
    System.out.println("s.charAt(4): "+ s.charAt(4));
    
    //Extracting substrings
    System.out.println("\nExtracting substrings");
    System.out.println("s.substring(4): " + s.substring(4));
    System.out.println("s.substring(4,9): "+ s.substring(4, 9));

    //Case conversion
    System.out.println("\nCase Conversion");
    System.out.println("s.toUpperCase(): "+ s.toUpperCase()); // remember that String is immutable so s.toUpperCase() will return a copy of the string in upper cases.
    System.out.println("s.toLowerCase(): "+ s.toLowerCase());
    System.out.println("\n s.trim: "+ s.trim()); // returns a copy of the string after trimming any leading & and train with whitespace
     
    System.out.println("\nReplacing");
    System.out.println("s.replaceAll(\"o\", \"r\": " + s.replaceAll("o", "r"));
    // Static method (includes overloaded methods)
    System.out.println("\nString.valueOf(1,3): "+ String.valueOf(1.3));

    //Split
    System.out.println("\nSplit");
    System.out.println("\ns.split(\"o\"): ");
    String sa[] = s.split("o");
    for(String temp: sa){
	System.out.println(temp);
    }
}
      
    public static void main(String...args){
	stringExamples();
    }

}    