/* see how reassigning object references works */
class ReassignObjectReferences{
    public static void main(String...args){
	int studentIds[] = {1001, 1002,1003};
	Student a = new Student(studentIds[0], "Batsi");
	Student b = new Student("Jean");
	Student c = new Student(studentIds[2], "Shingi");
	
	Student a2 = a;
	System.out.println("Student a2 name: "+ a2.name);
	a2.updateProfile("Mick");
	System.out.println("Student a name: "+ a.name);
	a2 = b;
	a2.updateProfile("Jill");
	System.out.println("Student b name: "+ b.name);
	a2 = new Student(1004,"Sam");
	System.out.println("Student a2 name: "+ a2.name);

    }

} 