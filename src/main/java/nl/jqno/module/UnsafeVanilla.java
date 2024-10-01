package nl.jqno.module;

public class UnsafeVanilla {
    public static void main(String[] args) throws Exception {
        Class.forName("sun.reflect.ReflectionFactory");
    }
}
