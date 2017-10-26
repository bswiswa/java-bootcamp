class BasicsDemo{
    int b = 10;
    static void print(){
	System.out.println("\n\nInside print...");
	System.out.println("Hello world!");
	System.out.println();
	System.out.print("Hello, world!");
	System.out.println("Hello,");
	System.out.print(" ");
	System.out.print("world!!");
    }

    public static void main(String[] args){
	print();
	int d[3];
	for(int i = 0; i < d.length; i++){
	    d[i] = i;// d[i] = new BasicsDemo();
	}
	for(int s:d){
	    System.out.println(s);
	}
    }
}