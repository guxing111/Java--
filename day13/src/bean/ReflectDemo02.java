package bean;

public class ReflectDemo02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("bean.User");
            Object obj = c.newInstance();
            System.out.println(obj);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
