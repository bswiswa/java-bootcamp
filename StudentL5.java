/* the instance initializer block gets copied to the top of each constructor
 */

class StudentL5{
    private  int id; //default 0
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
	
     
    public StudentL5(int id, String name, String gender){
	System.out.println("Inside constructor with arguments...");
	this.name = name;
	this.id = id;
	this.gender = gender;
	studentCount++;
    }
    
    public StudentL5(){
	System.out.println("Inside no-args constructor...");
	studentCount++;
    }
    
    {
	System.out.println("Inside instance initializer");
    }

    {
	System.out.println("Now in the second instance initializer");
    }
}