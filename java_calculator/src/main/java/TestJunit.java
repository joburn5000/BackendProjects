import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("in test case 1");

    }
    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        System.out.println("in test case 2");
    }
}