class Student{
    int id; //default 0
    String name;
    String gender = "male";
    
    Student(int id, String name){
	this(name);
	this.id = id;
    }
    
    Student(String name){
	this.name = name;
    }
    
    boolean updateProfile(String name){
	this.name = name;
	return true;
    }   
}