
package orangehrm;

import Utility.Constant;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


/**
 *
 * @author acer
 */
public class LoginWithExcel{
    public static void main(String[] args) {
        Constant.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\NetBeansProjects\\HrmAutomation-selenium\\chromedriver.exe");
        Constant.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    try{    
        //path of the file
        File file = new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\HrmAutomation-selenium\\Credentials.xlsx");
        //Load the file
        FileInputStream fis= new FileInputStream(file);
        //Load WOrkbook
        XSSFWorkbook wb= new XSSFWorkbook(fis);
        //Load the Sheet
        XSSFSheet sheet = wb.getSheet("hrmlogin");
        
        WebElement username= Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));

        WebElement password= Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        WebElement login = Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

        
        //ROW COUNT
        int rc = sheet.getLastRowNum();

        for(int i=0;i<=rc;i++){
            
            username.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            password.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue()); 
            login.click();
        }
    }
    catch(Exception e){
        System.out.println("Issue while logging through Excel");
    }
    
}
}
