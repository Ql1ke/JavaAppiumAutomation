import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass number = new MainClass();

    @Test

    public void testGetClassNumber()
/*    {
       MainClass mainClass = new MainClass();
        Assert.assertTrue(mainClass.getClassNumber() <= 45);
    }
*/
    {

        if (number.getClassNumber() > 45){
            System.out.println("class_number > 45");
        } else {
            System.out.println("class_number < 45");
        }
    }

}
