/* test the StudentL5 class by creating instances here */
class StudentL5Test{
    public static void main(String...args){
	int studentIds[] = {1001, 1002,1003};
	StudentL5 a = new StudentL5(studentIds[0], "Batsi", "male");
	StudentL5 b = new StudentL5(1002, "Jean", "female");
	StudentL5 c = new StudentL5(studentIds[2], "Shingi", "male");
	StudentL5 d = new StudentL5();
	a.setName("Sonic");
	System.out.println("Student a name: "+ a.getName());
	System.out.println("Student b name: "+ b.getName());
	System.out.println("Student c gender: "+ c.getGender());
	System.out.println("# of students created: "+ StudentL5.getStudentCount());
    }

} 