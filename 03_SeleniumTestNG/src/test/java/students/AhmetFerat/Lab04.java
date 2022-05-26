package students.AhmetFerat;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Lab04 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement eachBox : checkBoxes) {
            if (!eachBox.isSelected()) {
                System.out.println("Verification Passed");
            } else {
                System.out.println("Verification failed");
            }
        }

        WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));
        checkbox3.click();

        if (checkbox3.isSelected()){
            System.out.println("Checkbox 3 is selected");
        }else{
            System.out.println("Checkbox 3 is not selected");
        }
    }
}