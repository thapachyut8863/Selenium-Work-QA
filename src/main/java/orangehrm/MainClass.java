
package orangehrm;



/**
 *
 * @author DELL
 */
public class MainClass {
    public static void main(String[] args){
        HrmLogin login = new HrmLogin();
        login.browser_set();
//        login.login_credentails();
        login.login_credentails_array();
        Jobtitles title = new Jobtitles();
        title.addTitle();
//        Pim pim = new Pim();
//        pim.addPim();

//        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\NetBeansProjects\\selenium-testing\\chromedriver.exe");
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        WebElement username = driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//        username.sendKeys("achyut12");
//        WebElement password = driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//        password.sendKeys("achyut12");
//        //for pressing the icons
//        driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        //login with the array values
        //Implicit wait in selenium
//        
        //explicit wait
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
//        try{
//        //sending the values of username and password in the form of array
//        
//        String arr[][]={{"Achyut","achyut123"},{"achyut","admin123"},{"Admin","admin123"}};
//        for(int i = 0;i<arr.length;i++)
//        {
//            //for explicit wait
//            WebElement username  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
//            
////            WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
//            username.sendKeys(arr[i][0]);
////            Thread.sleep(1000);
//            WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
//            password.sendKeys(arr[i][1]);
//            //for pressing the icons
//            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//            //selenium wait
//            // implicit wait: wait for entire components or simply it works for entire page which increases the exucution time 
//            //explicit wait: wait for specific components or the field
//            //Threat.sleep(time durations): sleep or wait for certain times
//            
//        }}
//        catch (Exception e){
//            System.out.println("Something went wrong!!, please wait or quit");
//            
//        }
//            
//    }
//    
//    
//    
//};
    }};