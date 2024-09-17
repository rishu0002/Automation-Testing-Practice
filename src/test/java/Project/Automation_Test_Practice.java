package Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automation_Test_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.id("name")).sendKeys("Rishabh Patel");
		driver.findElement(By.id("email")).sendKeys("rishabhpatel0002@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("9511129700");
		driver.findElement(By.id("textarea")).sendKeys("Kishangarh,Chandigarh");
		driver.findElement(By.name("gender")).click();
		List<WebElement> checkbox = driver
				.findElements(By.xpath("//*[@class='form-check-input' and @type = 'checkbox']"));

		for (int i = 0; i < checkbox.size(); i++) {
			checkbox.get(i).click();
		}

		WebElement dpdown = driver.findElement(By.xpath("//select[@id='country']"));
		dpdown.click();
		Select dpdownselect = new Select(dpdown);
		dpdownselect.selectByVisibleText("India");

		WebElement colour = driver.findElement(By.xpath("//select[@id='colors']"));
		Select colours = new Select(colour);
		colours.selectByVisibleText("Yellow");

		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("09/14/2024");

		driver.findElement(By.xpath("//*[@href='https://demo.opencart.com/']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@href='https://opensource-demo.orangehrmlive.com/web/index.php/auth/login']"))
				.click();
		driver.navigate().back();
//		driver.findElement(By.xpath("//a[@class='home-link']")).click();
//		driver.navigate().back();
		
		//tabs
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement( By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
		
		Set <String> idd=	driver.getWindowHandles();
		System.out.println(idd);
		
		ArrayList<String> all= new ArrayList(idd);
		
		String parentwindowid = all.get(0);
		
		String childWindowid = all.get(1);
		driver.switchTo().window(childWindowid);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		Set<String> Idd1 = driver.getWindowHandles();
		ArrayList<String> all1 = new ArrayList(Idd1);
		String childWindowid1 = all1.get(1);
		driver.switchTo().window(childWindowid1);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium in biology - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		Set<String> Idd2 = driver.getWindowHandles();
		ArrayList<String> all2 = new ArrayList(Idd2);
		String childWindowid2 = all2.get(1);
		driver.switchTo().window(childWindowid2);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium (software) - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		Set<String> Idd3 = driver.getWindowHandles();
		ArrayList<String> all3 = new ArrayList(Idd3);
		String childWindowid3 = all3.get(1);
		driver.switchTo().window(childWindowid3);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium disulfide - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		Set<String> Idd4 = driver.getWindowHandles();
		ArrayList<String> all4 = new ArrayList(Idd4);
		String childWindowid4 = all4.get(1);
		driver.switchTo().window(childWindowid4);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium dioxide - Wikipedia")) {
			driver.close();	
		}
	
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Set<String> Idd5 = driver.getWindowHandles();
		ArrayList<String> all5 = new ArrayList(Idd5);
		String childWindowid5 = all5.get(1);
		driver.switchTo().window(childWindowid5);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Your Store")) {
			driver.close();	
		}
		driver.switchTo().window(parentwindowid);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='myFunctionAlert()']")).click();
		Alert alerts = driver.switchTo().alert();
		Thread.sleep(3000);
		alerts.accept();
		driver.findElement(By.xpath("//button[@onclick='myFunctionConfirm()']")).click();
		Thread.sleep(3000);
		alerts.accept();
		driver.findElement(By.xpath("//button[@onclick='myFunctionPrompt()']")).click();
		alerts.sendKeys("Rishabh Patel");
		Thread.sleep(3000);
		alerts.accept();
		
		WebElement copytext = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act = new Actions(driver);
		act.doubleClick(copytext).perform();
		
		WebElement drag = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(drag, drop).perform();
		
		WebElement slidder = driver.findElement(By.xpath("//*[@id='slider']/span[1]"));
		System.out.println("Location of Slidder1 Before sliding "+slidder.getLocation());
		Thread.sleep(3000);
		act.dragAndDropBy(slidder, 150,0).perform();
		System.out.println("Location of Slidder1 After sliding "+slidder.getLocation());
		
		
				
		//frame
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.name("RESULT_TextField-0")).sendKeys("Rishabh Patel");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']")).sendKeys("09/17/2024");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='RESULT_RadioButton-3']"));
		dropdown.click();
		Select dp = new Select(dropdown);
		dp.selectByVisibleText("Automation Engineer");
		driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//resizeable
		WebElement resize = driver.findElement(By.id("resizable"));
		act.clickAndHold(resize).moveByOffset(100, 75).release().perform();
		
	}

}
