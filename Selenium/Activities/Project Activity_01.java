package JavaSelenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProjectActivity_01 {
    WebDriver driver;
   @BeforeClass
    public void beforeMethod(){
        driver = new ChromeDriver();
        //open the browser
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void verifyWebsiteTitle() {
    //get the title
      String Title = driver.getTitle();
      //print the title
      System.out.println("The Title of the Website is : " + Title);
      //verify the title
        Assert.assertEquals("Alchemy LMS – An LMS Application", Title);
    }
    @AfterClass
    public void afterMethod(){
        //close the browser
        driver.quit();
    }

}
