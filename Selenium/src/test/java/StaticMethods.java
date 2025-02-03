
class ABC {
	
	static int a=65;
	int b=78;
	
	void  m1() {
		
		int c=45; 
		System.out.println(a+b);
	}
	
	static void m2() {
		int i=5;
	}
	
}

class DEF extends ABC{
	
	static int a =55;
	
	void print() {
		System.out.println(ABC.a + DEF.a);
	}
	
}
public class StaticMethods {

	public static void main(String[] args) {
		
	 System.out.println(DEF.a);

	}

}
