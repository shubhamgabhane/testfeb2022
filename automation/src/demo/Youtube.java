package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","F:\\Shubham testing\\SOFTWARE\\chromedriver_win32 95\\chromedriver95.exe");
	WebDriver driver=new ChromeDriver( );
	driver.get("https://www.w3schools.com/");
	
//	driver.navigate().to("https://www.w3schools.com/");
//	driver.navigate( ).refresh();
//	driver.navigate( ).back();
//	driver.navigate().forward();
//	driver.close();

//	driver.manage().window().maximize();
	//driver.manage().window().minimize();    //supported in selenium leettest 4.0000
	
//	Dimension d=new Dimension(300, 500 );
//	driver.manage().window().setSize(d);
	
//	Point p=new Point(100,250);
//	driver.manage().window().setPosition(p);
	
//WebElement id=driver.findElement(By.id("w3loginbtn"));   //log in by id
//id.click();
//WebElement t=driver.findElement(By.xpath("//a[text( )='Log in']"));     //log in by xpath by text
//t.click();
WebElement c=driver.findElement(By.xpath("(//a[contains(@class,bar)])[7]"));    //log in by xpath by contains and index
c.click();
//WebElement e=driver.findElement(By.name("email"));
//e.sendKeys("shubham");
//WebElement b=driver.findElement(By.cssSelector("input[type='text']"));
//b.sendKeys("shubham");
WebElement h=driver.findElement(By.xpath("//input[@name='email']"));
h.sendKeys("shubham");
	}

}
