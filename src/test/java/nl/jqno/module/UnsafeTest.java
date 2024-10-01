package nl.jqno.module;

import org.junit.jupiter.api.Test;

public class UnsafeTest {
    @Test
    public void sunreflect() throws Exception {
        Class.forName("sun.reflect.ReflectionFactory");
    }
}
