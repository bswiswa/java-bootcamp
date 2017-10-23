class StudentFinal{
    private  final int id; //no default - blank final
    private String name;
    private String gender = "male";
    private static int studentCount;
    
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
	
    public int getId(){
	return id;
    }

    public StudentFinal(String name, String gender){
	this.name = name;
	//id = ++studentCount; id [a final instance var]can also be defined in the instance initializer
	this.gender = gender;
    }

    {
	id = ++studentCount;
    }
}