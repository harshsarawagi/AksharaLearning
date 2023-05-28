package demo;

public class ClassB {

	public ClassB given() {
		System.out.println("Executing given()");
		return this;
	}
	
	public ClassB pathParam() {
		System.out.println("Executing pathParam()");
		return this;
	}
	
	public ClassB when() {
		System.out.println("Executing when()");
		return this;
	}
	
	public ClassC get() {
		ClassC obj = new ClassC();
		System.out.println("Executing get()");
		return obj;
	}
}
