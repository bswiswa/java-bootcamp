/* test the StudentFinal class by creating instances here */
class StudentFinalTest{
    public static void main(String...args){
	/* int studentIds[] = {1001, 1002,1003}; We were setting the ids manually as shown above, now we want to autogenerate them and store them as constants in the students */
	StudentFinal a = new StudentFinal("Batsi", "male");
	StudentFinal b = new StudentFinal("Jean", "female");
	StudentFinal c = new StudentFinal("Shingi", "male");
	
	a.setName("Sonic");
	System.out.println("Student a name: "+ a.getName() + " SID: "+ a.getId());
	System.out.println("Student b name: "+ b.getName()+ " SID: "+ b.getId());
	System.out.println("Student c gender: "+ c.getGender() + " SID: "+ c.getId());
	System.out.println("# of students created: "+ StudentFinal.getStudentCount());
    }

} 