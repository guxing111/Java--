package peflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectDemo05 {
    public static void main(String[] args) throws Exception {
        Class studentClass = Class.forName("bean.Student");

        Field[] fields = studentClass.getFields();
        Field f = fields[0];
        String fieldName = f.getName();
        System.out.println(fieldName);
        Field[] fields1 = studentClass.getDeclaredFields();
        System.out.println(fields1.length);
        System.out.println("__________________________");
        for (Field field : fields1){
            int i = field.getModifiers();
            System.out.println(i);
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString);

            Class fieldType = field.getType();
            String fName = fieldType.getName();
            System.out.println(fName);
            System.out.println(field.getName());
        }
        System.out.println("_________________________");

    }
}
