/* testing access modifiers between classes Lecturer.java & StudentP.java */ 
import jpkg2.StudentP;
public class Lecturer extends StudentP{
    public static void main(String...args){
	Lecturer b = new Lecturer();	
	StudentP a = new StudentP(2, "Batsi");
	StudentP.updateGender();
	System.out.println("b.name: "+ name);
	//	a.updateProfile("Swiss");
	
	System.out.println("gender b.gender: "+ b.gender);
	System.out.println("A Wha Dis? Lecturer Anuh Inna Di Red");
    }
}