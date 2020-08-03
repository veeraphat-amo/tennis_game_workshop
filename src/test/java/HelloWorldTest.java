import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_hello_World() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("Hello World", result);
    }

    @Test
    public void sayHi_should_return_hello_Somkiat() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("somkiat");
        assertEquals("Hello Somkiat", result);
    }

    @Test
    public void sayHi_should_return_hello_Pui() {
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("pui");
        assertEquals("Hello Pui", result);
    }

}