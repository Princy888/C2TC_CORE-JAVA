package CU;

import org.openqa.selenium.By;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRINCY\\Desktop\\eclips\\chromedriver.exe");
		org.openqa.selenium.WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("file:///C:/Users/PRINCY/Downloads/linking/index.html#");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("PRINCY");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/form/div[2]/div[1]/input")).sendKeys("pri@.com");
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/form/div[1]/div[2]/input")).sendKeys("1257489");
	}

}
