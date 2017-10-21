/* using escape sequences - what works, what is required */
package jpkg;

class EscapeSequences{
    static void escapeSequences(){
	String s = "\\Hello \"Mr. Swiswa\",\n How are you? ' "; // note that in string literal, it is fine to put the single quote as is but we have to escape the double quote
	System.out.println(s);

	char s2[] = { '\'', '"', 'h', 'e', 'l', 'l', 'o' }; // note that in the character type, we cannot just put the single quote on its own, we have to escape it, but we can just use the double quote without escaping it.
	for(char tmp: s2){
	    System.out.print(tmp + " ");
	}
	System.out.println();
    }
    
    public static void main(String...args){
	escapeSequences();
    }
}