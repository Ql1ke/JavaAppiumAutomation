import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test

    public void testGetLocalNumber ()
    {
        int a = this.getLocalNumber();

        if (a == 14) {
            System.out.println("Return 14, it`s true");
        } else {
            System.out.println("a != number, it`s false");
        }
    }
}
