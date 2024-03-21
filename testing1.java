import org.example.selenium1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testing1 {
    @Test
    public void TestGender() {
        selenium1 s = new selenium1();
        boolean result = s.testgender();
        Assert.assertEquals(result, true);
    }


    @Test
    public void TestHeader() {
        selenium1 s = new selenium1();
       String result = s.headerCheck();
       Assert.assertEquals(result, "Automation Demo Site");
    }

    @Test
    public void TestTitle() {
        selenium1 s = new selenium1();
        String result = s.titleCheck();
        Assert.assertEquals(result, "Register");
    }
}
