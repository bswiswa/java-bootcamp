package jpkg2;
/*setup the package statement in the same folder structure
companies use their reversed internet domain names to begin their package names\
 eg com.precipio.share
Package name may not be valid because of hyphens or other special characters. A\
lso if package name begins with a digit or a reserved keyword eg "int". In this\
 case teh suggested convention is to add an underscore
eg java_bootcamp.StudentPackage above
*/
public class StudentP{
    int id; //default 0
    static protected String name = "Batsi";
    static  protected String gender = "male";

    public StudentP(int id, String name){
        this(name);
        this.id = id;
    }

    public StudentP(String name){
        this.name = name;
    }

    public StudentP(){}

    public static void updateGender(){
	gender = "female";
	name = "Dzwitz";
    }

    public boolean updateProfile(String name){
        this.name = name;
        return true;
    }

    public static void main(String...args){
        System.out.println("Student P is Inna Di Red");
    }
}