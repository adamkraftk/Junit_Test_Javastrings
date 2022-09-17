import static org.junit.jupiter.api.Assertions.*;

class JavaStringTest {

    @org.junit.jupiter.api.Test
    void main() {
        //Create string
        //Test each of the java.lang methods.
        String string = "one";
        char charString = string.charAt(0);
        assertEquals(3,string.length());
        assertEquals('o',charString);
        assertEquals("one",string.substring(0,3));
        assertEquals(0, 0);
    }
}