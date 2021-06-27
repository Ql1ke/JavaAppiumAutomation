import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass string = new MainClass();

    @Test
    public void testGetClassString() {
        boolean str1 = string.getClassString().contains("Hello");
        boolean str2 = string.getClassString().contains("hello");

        if (str1 == str2) {
            Assert.fail("Not exist Hello, hello");
        }

        System.out.println(str1);
        System.out.println(str2);

    }

}
