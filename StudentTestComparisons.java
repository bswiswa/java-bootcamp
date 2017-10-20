/* test the comparisons */
class StudentTestComparisons{
    public static void main(String...args){
	int studentIds[] = {1001, 1002,1003};
	Student a = new Student(studentIds[0], "Batsi");
	Student b = new Student("Jean");
	Student c = new Student(studentIds[2], "Shingi");
	
	a.gender = "male";
	b.gender = "female";
	a.updateProfile("Sonic");
	System.out.println("Student a name: "+ a.name);
	System.out.println("Student b name: "+ b.name);
	System.out.println("Student c gender: "+ c.gender);
	
	if(a == b){
	    System.out.println("Student a and b are referencing the same objects");
    }
	if(a != b){
	    System.out.println("Student a and b are referring to different objects");
	}

	Student d = null;
	if(d != null)
	    System.out.println("Student d's name: "+ d.name);
       
    }

} 