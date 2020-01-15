import com.excel.reflection.Animal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        //1、加载类 ，指定类的完全限定名：包名+类名
        Class c1 = Class.forName("com.excel.reflection.Animal");
        System.out.println(c1);//打印c1，发现值和字节码中的类的名称一样

        //2、获取(反射)类c1的公开构造函数，且参数为null
        Constructor ctor1= c1.getConstructor();

        //3、构造函数的用途，就是创建类的对象（实例）的
        //除了私有构造函数外（单列模式，禁止通过构造函数创建类的实例，保证一个类只有一个实例）
        //ctor1.newInstance()默认生成一个Object对象,我们需要转化成我们要的Animal类对象
        Animal a1 = (Animal)ctor1.newInstance();

        //4. 通过反射调用Animal的方法
        Method method = c1.getMethod("sayName", String.class);
        String name = (String) method.invoke(a1, "狗狗");
        System.out.println(name);

        //5、直接访问类中的方法
        System.out.println(a1.sayName("猫猫"));

        //6、访问类中的变量
        System.out.println(a1.name);

    }
}
