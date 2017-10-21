/* test the StudentL2 class by creating instances here */
class StudentL2Test{
    public static void main(String...args){
	int studentIds[] = {1001, 1002,1003};
	StudentL2 a = new StudentL2(studentIds[0], "Batsi", "male");
	StudentL2 b = new StudentL2(1002, "Jean", "female");
	StudentL2 c = new StudentL2(studentIds[2], "Shingi", "male");
	
	a.setName("Sonic");
	System.out.println("Student a name: "+ a.getName());
	System.out.println("Student b name: "+ b.getName());
	System.out.println("Student c gender: "+ c.getGender());
    }

} 