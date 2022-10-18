
package orangehrm;
import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Constant;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 *
 * @author DELL
 */
public class HrmLogin {
    
    
    public void browser_set(){
        Constant.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\NetBeansProjects\\selenium-testing\\chromedriver.exe");
        
        
        Constant.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        
    }
//    public void login_credentails(){
//        //explicit wait
//        WebDriverWait wait=new WebDriverWait(ReUse.driver, Duration.ofSeconds(100));
//        //for explicit wait
//        WebElement username  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
////        WebElement username = driver.findElement(By.xpath("\"//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input\""));    
//        username.sendKeys("admin");
//        WebElement password=ReUse.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//        password.sendKeys("admin123");
////        for pressing the icons
//        ReUse.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
////        
//    }
    public void login_credentails_array(){
        String array[][]={{"Achyut","achyut123"},{"achyut","admin123"},{"Admin","admin123"}};
        for(int i=0;i<array.length;i++){
        WebDriverWait wait=new WebDriverWait(Constant.driver, Duration.ofSeconds(100));
//        for explicit wait
        WebElement username  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
        username.sendKeys(array[i][0]);
//            Thread.sleep(1000);
            WebElement password = Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
            password.sendKeys(array[i][1]);
            //for pressing the icons
            Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        }}};
    //login with excel data with apache poi maven dependency
        
    
    
    

