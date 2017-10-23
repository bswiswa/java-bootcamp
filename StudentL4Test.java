/* test the StudentL4 class by creating instances here */
class StudentL4Test{
    public static void main(String...args){
	int studentIds[] = {1001, 1002,1003};
	System.out.println("Student count is already initialized to: "+ StudentL4.getStudentCount());
	
	StudentL4 a = new StudentL4(studentIds[0], "Batsi", "male");
	StudentL4 b = new StudentL4(1002, "Jean", "female");
	StudentL4 c = new StudentL4(studentIds[2], "Shingi", "male");
	
	a.setName("Sonic");
	System.out.println("Student a name: "+ a.getName());
	System.out.println("Student b name: "+ b.getName());
	System.out.println("Student c gender: "+ c.getGender());
	System.out.println("# of students created: "+ StudentL4.getStudentCount());
	StudentL4.reinit();
	System.out.println("Student Count reinitialized "+ StudentL4.getStudentCount());
    }

} 