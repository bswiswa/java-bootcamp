class StudentL4{
    private  int id; //default 0
    private String name;
    private String gender = "male";
    private static int studentCount = initializeCount();
    
    static void reinit(){
	studentCount = initializeCount();
    }
    static void available(){
	System.out.println("\nInside available function...");
    }

    private static int initializeCount(){
	System.out.println("called initializeCount");
	return 20;
    }
    public String getName(){
	return name;
    }
    
    public void setName(String name){
	this.name = name;
    }
    
    public void setGender(String gender){
	gender = gender.toLowerCase();
	if(gender.equals("male") || gender.equals("female") || gender.equals("transgender")){
	    this.gender = gender;
	}
	else{
	    throw new IllegalArgumentException("Wrong gender passed!!");
	}
	
    }

    public String getGender(){
	return gender;
    }
	  
    public static int getStudentCount(){
	return studentCount;
    }
	
     
    public StudentL4(int id, String name, String gender){
	this.name = name;
	this.id = id;
	this.gender = gender;
	studentCount++;
    }   
}