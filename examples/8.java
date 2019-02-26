import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Test {
	public static void main(String[] args) {
		
		Student s = new Student();
		Class c = s.getClass();
		
		System.out.println("------------ methods -----------\n");
		Method[] methods = c.getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}
		
		System.out.println("------------ fields -----------\n");
		
		Field[] fields = c.getDeclaredFields();
		for(Field f : fields){
			System.out.println(f.getName());
		}
		
		System.out.println("------------ constructors -----------\n");
		
		Constructor[] constructors = c.getDeclaredConstructors();
		for(Constructor ct : constructors){
			System.out.println(ct);
		}
		
	}
}

class Student {
	private int id;
	private String name;
	
	Student(){
		super();
	}
	
	Student(int id){
		this.id = id;
	}
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return this.id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}





