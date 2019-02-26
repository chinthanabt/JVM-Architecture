class Test{
	public static void main(String[] args){
		Student s = null;
		int count=0;
		while(true){
			s = new Student();
			System.out.println(++count);
		}
	}
}
class Student{}
