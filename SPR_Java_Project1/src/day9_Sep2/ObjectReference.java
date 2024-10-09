package day9_Sep2;

public class ObjectReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjectreferenceVariable obj = new ObjectreferenceVariable();
		obj.stuid=101;
		obj.stuname="Surya";
		obj.sal=1000f;
		obj.Job="Master";
		obj.display();
		
		System.out.println();
		
		ObjectreferenceVariable obj1 = new ObjectreferenceVariable();
		obj1.stuid=102;
		obj1.stuname="Prakash";
		obj1.sal=2000f;
		obj1.Job="Boss";
		obj1.display();
		
		

	}

}
