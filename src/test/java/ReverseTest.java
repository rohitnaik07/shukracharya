import junit.framework.TestCase;
import org.junit.Test;


public class ReverseTest extends TestCase {
    @Test
    public <String> void testStringrev() {
        Reverse tester = new Reverse();
        assertEquals("Enter String", "dcba", tester.stringrev("abcd"));
    }

    @Test
    public <String> void testStringrev1() {
        Reverse tester = new Reverse();
        assertEquals("Enter String without spaces", "dcba", tester.stringrev("  abcd "));
    }

    @Test
    public <String> void testStringrev2() {
        Reverse tester = new Reverse();
        assertEquals("Enter String without numbers", "dcba", tester.stringrev("ab45c"));
    }
    @Test
    public <String> void testStringrev3() {
        Reverse tester = new Reverse();
        assertEquals("Enter String without numbers", "dcba", tester.stringrev(""));
    }
}