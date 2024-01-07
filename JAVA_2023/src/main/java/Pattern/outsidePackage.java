package Pattern;
import javaBasics.topLevelClassModifiers;
public class outsidePackage extends topLevelClassModifiers {
 
	public static void main(String[] args) {
		outsidePackage obj=new outsidePackage();
		obj.display();
	}

}
 class d extends outsidePackage
 {public void justmain()
	 {
	  
	 d obj=new d();
	 obj.display();
	 }
 }