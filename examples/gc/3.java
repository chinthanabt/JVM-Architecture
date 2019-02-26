import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

class Test {
    public static void main(String[] args) throws Exception {
        Object obj;
		int count = 0;
        while(true) {
            ClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:classfiles\\")});
            Class<?>[] loadedClasses = new Class[]{
				classLoader.loadClass("Student"),
				classLoader.loadClass("Animal"),
				classLoader.loadClass("Cat"),
				classLoader.loadClass("Customer"),
				classLoader.loadClass("Dog")
				
				};
			
			Constructor<?> constructor = null;
			for(Class clazz : loadedClasses){
				constructor = clazz.getConstructor();
				obj = constructor.newInstance();
			}
         	
			Thread.sleep(10);
            System.out.println(++count);
        }
    }
}


