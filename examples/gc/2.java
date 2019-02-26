import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

class Test {
    public static void main(String[] args) throws Exception {
        Object obj;
		int count = 0;
        while(true) {
            ClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:classfiles\\")});
            Class<?> loadedClass = classLoader.loadClass("Student");
            Constructor<?> constructor = loadedClass.getConstructor();
            obj = constructor.newInstance();
            System.out.println(++count);
        }
    }

}

