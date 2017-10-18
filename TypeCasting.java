class TypeCasting{
    static void typeCasting(){
	System.out.println("\nInside typeCasting...");
	//Explicit casting
	long y = 42;
	int x = (int)y;

	//Information loss due to out of range assignment
	byte narrowByte = (byte)123456;
	System.out.println("narrowByte: "+ narrowByte);

	//Truncation
	int isTruncated = (int)0.99;
	System.out.println("isTruncated: "+ isTruncated);

	//Implicit cast (int to long)
	y = x;

	//Implicit cast (char to int)
	char charA = 'A';
	int isInt = charA;
	System.out.println("isInt: "+ isInt);
	
	//byte to char using an explicit cast
	byte bByte = 65;
	charA = (char)bByte; // special conversion (widening from byte
	// to int followed by narrowing from int to char)
	System.out.println("charA: "+ charA);
    }
    
    public static void main(String[] args){
	typeCasting();
    }
	
}
