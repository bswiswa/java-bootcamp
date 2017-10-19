/* test the StudentDemo class by creating instances here */
class StudentTest{
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
    }

} 