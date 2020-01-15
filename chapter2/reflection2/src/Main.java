import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(new FileReader("properties.txt"));
        String classname = properties.getProperty("classname");
        String methodname = properties.getProperty("methodname");
        Class<?> animalClass = null;
        try {
            animalClass = Class.forName(classname);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Method method = animalClass.getMethod(methodname, String.class);
        String name = (String) method.invoke(animalClass.newInstance(), "狗狗");
        System.out.println(name);
    }
}
