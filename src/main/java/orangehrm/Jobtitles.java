/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orangehrm;
import Utility.Constant;
import org.openqa.selenium.By;

/**
 *
 * @author DELL
 */
public class Jobtitles {
    public void addTitle(){
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
        //for job title
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Quality Assurance Engineer");
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("Engineer should find and verify a bugs ");
//        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[1]")).click();
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys("Please be dedicated towards the work");
        //it will add the job titles 
        Constant.driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
        
    }
    
    
}
