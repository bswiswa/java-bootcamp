package jpkg; 
/*setup the package statement in the same folder structure
companies use their reversed internet domain names to begin their package names eg com.precipio.share
Package name may not be valid because of hyphens or other special characters. Also if package name begins with a digit or a reserved keyword eg "int". In this case teh suggested convention is to add an underscore
eg java_bootcamp.StudentPackage above
 */
class StudentP{
    int id; //default 0
    String name;
    String gender = "male";
    
    StudentP(int id, String name){
	this(name);
	this.id = id;
    }
    
    StudentP(String name){
	this.name = name;
    }
    
    boolean updateProfile(String name){
	this.name = name;
	return true;
    }

    public static void main(String...args){
	System.out.println("Inna Di Red");
    }
}