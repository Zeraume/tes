import static org.junit.Assert.*;
import uas.mkepl.*;
import org.junit.Test;

public class CodeSmellsExampleTest {

    @Test
    public void testLongMethod() {
        CodeSmellsExample example = new CodeSmellsExample();
        int result = example.longMethod();
        assertEquals(141, result);
    }

    @Test
    public void testHelperClassField() {
        CodeSmellsExample example = new CodeSmellsExample();
        CodeSmellsExample.Helper helper = example.new Helper();
        helper.field = "Test";
        assertEquals("Test", helper.field);
    }

    @Test
    public void testDataClass() {
        CodeSmellsExample example = new CodeSmellsExample();
        CodeSmellsExample.DataClass data = example.new DataClass();
        data.field1 = "Test1";
        data.field2 = "Test2";
        assertEquals("Test1", data.field1);
        assertEquals("Test2", data.field2);
    }

    @Test
    public void testMagicNumbers() {
        int a = 42;
        int b = 58;
        int c = 17;
        int d = 24;
        int sum1 = a + b;
        int sum2 = c + d;
        assertEquals(100, sum1);
        assertEquals(41, sum2);
    }

    @Test
    public void testSwitchStatement() {
        String userType = "admin";
        String result;
        switch (userType) {
            case "admin":
                result = "Admin user";
                break;
            case "guest":
                result = "Guest user";
                break;
            default:
                result = "Unknown user";
        }
        assertEquals("Admin user", result);
    }

    @Test
    public void testPhoneNumber() {
        String phoneNumber = "123-456-7890";
        assertEquals("123-456-7890", phoneNumber);
    }

    @Test
    public void testDuplicatedCode() {
        int a = 42;
        int b = 58;
        int c = 17;
        int d = 24;
        int sum1 = a + b;
        int sum2 = c + d;
        assertEquals(100, sum1);
        assertEquals(41, sum2);
    }

    @Test
    public void testComments() {
        int a = 42;
        int b = 58;
        int sum = a + b;
        assertEquals(100, sum);
    }

    @Test
    public void testLargeClass() {
        CodeSmellsExample example = new CodeSmellsExample();
        assertNotNull(example);
    }
}
