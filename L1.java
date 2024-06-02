package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class L1 {
	ChromeDriver n ;
	@Test(priority = 0, groups="L")
	public void viswebsite() throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Pictures\\chromedriver-win64\\chromedriver.exe");
			
			n= new ChromeDriver();
			
			n.get("https://www.amazon.in/");
			
			n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			n.manage().window().maximize();
			
			
				
	}
	
	@Test(priority = 1, groups="L")
	public void sigin() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//a[@data-nav-role='signin']").click();
		
	}
	
	@Test(priority = 2, groups="L")
	public void enetrthemobilenumber() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementByName("email").sendKeys("9080483415");
			
		
	}
	
	@Test(priority = 3, groups="L")
	public void clickcontinue() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementById("continue").click();
	}
	
	@Test(priority = 4, groups="L")
	public void Enterthepassword() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementByName("password").sendKeys("Sandy@123");
	}
	
	@Test(priority = 5, groups="L")
	public void clicksigin() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementById("signInSubmit").click();
		
		System.out.println("homepage display");
	}
	
	@Test(priority = 6, groups="L")
	public void Serachthename() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementById("twotabsearchtextbox").sendKeys("redmi");
		
		Thread.sleep(1000);
		
		n.findElementById("nav-search-submit-button").click();
	
	}
	
	@Test(priority = 7, groups="L")
	public void SelectthebrandMI() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		
		n.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
	
	}
	
	@Test(priority = 8, groups="L")
	public void Addtocart() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//button[@id= 'a-autoid-2-announce']").click();
		
		
		
	}
	
	@Test(priority = 9, groups="L")
	public void viewthecart() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//a[@id= 'nav-cart']").click();
		
		Thread.sleep(2000);
		
		//select the qty 
		
		Select k = new Select(n.findElement(By.id("quantity")));
		k.selectByIndex(2);
		
	
	}
	
	@Test(priority = 10, groups="L")
	public void viewtheproductdetails() throws InterruptedException{
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//a[@href='/gp/product/B0C9J9CZR6/ref=ox_sc_act_title_1?smid=A2FS4NK0NQR709&psc=1']").click();
	}
	
	
	@Test(priority = 11, groups="L")
	public void Logout() throws InterruptedException{
		Thread.sleep(2000);
		
		n.findElementByXPath("//a[@id='nav-link-accountList']").click();
		//a[@id='nav-item-signout']
		
		Thread.sleep(2000);
		
		n.findElementByXPath("//a[@id='nav-item-signout']").click();
		
	
	}
	
	
}
