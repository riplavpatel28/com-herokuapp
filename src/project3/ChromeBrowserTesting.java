package project3;
/** Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseURL = "http://the-internet.herokuapp.com/login";
        WebDriver driver=new ChromeDriver();
        //Get URL
        driver.get(baseURL);
        //Maximise page
        driver.manage().window().maximize();
        //Give driver to Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title
        String title =driver.getTitle();
        System.out.println("Page title"+title);
        //get the page resource
        System.out.println("page resource"+driver.getPageSource());
        //get the Email field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("tomsmith");
        WebElement PasswordField = driver.findElement(By.name("password"));
        PasswordField.sendKeys("SuperSecretPassword!");

    }
}
