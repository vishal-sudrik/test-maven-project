import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGClassEx4 {


    @Test
    public void test1() {
        System.out.println("In test 1 method of class 4");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("In TESTNG class ex 4 method for conclict");
        System.out.println("In test 1 method of class 4 3 print statement");
    }

}
