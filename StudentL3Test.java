/* test the StudentL3 class by creating instances here */
class StudentL3Test{
    public static void main(String...args){
	int studentIds[] = {1001, 1002,1003};
	StudentL3 a = new StudentL3(studentIds[0], "Batsi", "male");
	StudentL3 b = new StudentL3(1002, "Jean", "female");
	StudentL3 c = new StudentL3(studentIds[2], "Shingi", "male");
	
	a.setName("Sonic");
	System.out.println("Student a name: "+ a.getName());
	System.out.println("Student b name: "+ b.getName());
	System.out.println("Student c gender: "+ c.getGender());
	System.out.println("# of students created: "+ StudentL3.getStudentCount());
    }

} 