package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;



public class Testing {

	public static void main(String[] args) throws InterruptedException {
		//Launch Firefox Browser
		System.setProperty("webdriver.edge.driver","C:\\Users\\syntel\\Downloads\\TNEpds\\TNEpds\\src\\test\\driver\\msedgedriver.exe");
		FirefoxOptions p=new FirefoxOptions();		
		p.setBinary("C:\\Users\\syntel\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		//Open the URL "https://tnpds.gov.in"
		driver.get("https://tnpds.gov.in");
		
		//Wait for 5 seconds
		TimeUnit.SECONDS.sleep(5);
		
		//Change the language to English
		driver.findElement(By.xpath("//*[@id=\"masterForm:languageSelectMenu\"]/tbody/tr/td[2]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/form[2]/div[2]/div/div/div[2]/ul[1]/li[2]/a")).click();
		TimeUnit.SECONDS.sleep(5);
		
		//Select the Prefixes in English
		Select name=new Select(driver.findElement(By.id("form:j_idt153")));
		name.selectByIndex(0);
		driver.findElement(By.id("form:j_idt153")).submit();
		TimeUnit.SECONDS.sleep(2);
		//Upload the Image
		 driver.findElement(By.id("form:uploadimageUpload_input")).sendKeys("C:\\Users\\syntel\\Pictures\\OIP.jpg");
		//Enter the Name of the head in English
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("form:aname")).sendKeys("Son");
		driver.findElement(By.id("form:aname")).submit();
		TimeUnit.SECONDS.sleep(2);
		
		//Enter the Name of the head in Tamil
		driver.findElement(By.id("form:laname")).sendKeys("Son");
		driver.findElement(By.id("//*[@id=\"form:laname_panel\"]/ul/li[1]")).click();
		driver.findElement(By.id("form:laname")).submit();
		
		
		Select tname=new Select(driver.findElement(By.id("form:j_idt195")));
		tname.selectByIndex(0);
		driver.findElement(By.id("form:j_idt195")).submit();
		
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("form:laname_input")).sendKeys("Son");
		driver.findElement(By.id("form:laname_input")).submit();
		TimeUnit.SECONDS.sleep(3);
		//Enter Father name
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("form:fhname")).sendKeys("Dad");
		//Enter the Address line 1
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("form:address1")).sendKeys("India");
		
		//Enter the Address line 2
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("form:address2")).sendKeys("Asia");
		
		//Enter the Address line 3
		TimeUnit.SECONDS.sleep(2);
		driver.findElement(By.id("form:address3")).sendKeys("Earth");
		
				
		//Select the District
		Select district=new Select(driver.findElement(By.id("form:districts")));
		district.selectByValue("29");
		driver.findElement(By.id("form:districts")).submit();
		TimeUnit.SECONDS.sleep(2);
		
		//Select the Taluk
		Select Taluk=new Select(driver.findElement(By.id("form:taluks")));
		Taluk.selectByValue("720");
		driver.findElement(By.id("form:taluks")).submit();
		TimeUnit.SECONDS.sleep(2);
		
		//Select the Villages
		Select Village=new Select(driver.findElement(By.id("form:villages")));
		Village.selectByValue("501476");
		driver.findElement(By.id("form:villages")).submit();
		TimeUnit.SECONDS.sleep(2);
		
		//Enter the Pincode
		driver.findElement(By.id("form:pin")).sendKeys("600001");
		TimeUnit.SECONDS.sleep(1);
		//Enter the Mobile Number
		driver.findElement(By.id("form:mobile")).sendKeys("9614314300");
		TimeUnit.SECONDS.sleep(1);
		//Enter the STD Code
		driver.findElement(By.id("form:stdCode")).sendKeys("462");
		TimeUnit.SECONDS.sleep(1);
		//Enter the Land Line Number
		driver.findElement(By.id("form:landLineNo")).sendKeys("111143");
		TimeUnit.SECONDS.sleep(1);
		//Enter the Email Address
		driver.findElement(By.id("form:mail")).sendKeys("son143@gmail.com");
		TimeUnit.SECONDS.sleep(1);
		//click the Add Member Button
		driver.findElement(By.id("form:addfamilymember")).click();
		TimeUnit.SECONDS.sleep(1);
		//select the Gender
		Select gender=new Select(driver.findElement(By.id("form:pmemgender")));
		gender.selectByValue("Male");
		driver.findElement(By.id("form:pmemgender")).click();
		
		//Select the Nationality
		Select nation=new Select(driver.findElement(By.id("form:pmemnationality")));
		nation.selectByValue("Indian");
		driver.findElement(By.id("form:pmemnationality")).click();
		
		// Select the Profession
		Select pro=new Select(driver.findElement(By.id("form:pmemprofession")));
		pro.selectByValue("Private");
		driver.findElement(By.id("form:pmemprofession")).click();
		//Enter the Salary Details
		driver.findElement(By.id("form:monincome")).sendKeys("15,000");
		
		//Enter the Election card Details
		driver.findElement(By.id("form:elecidnum")).sendKeys("APY143143");
		
		//Select the Disability
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/form[2]/div[1]/div/div/div/div[3]/div/div[5]/div/div/div/div[3]/div[2]/div/table/tbody/tr/td[2]/div/div[2]/span")).click();
		//
		driver.findElement(By.id("form:j_idt403")).sendKeys("APY143143");
		
		
		// Select date picker
		driver.findElement(By.id("form:pmemdob_input")).click();
		
		
		TimeUnit.SECONDS.sleep(1);
		Select month=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div/select[1]")));
		month.selectByValue("1");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/select[1]")).click();
		
		TimeUnit.SECONDS.sleep(1);
		Select year=new Select(driver.findElement(By.xpath("/html/body/div[4]/div/div/select[2]")));
		year.selectByValue("2001");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/select[2]")).click();
		TimeUnit.SECONDS.sleep(3);
		
		
		
		TimeUnit.SECONDS.sleep(1);
		driver.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[4]/td[7]"));
		driver.findElement(By.linkText("24")).click();
					
		//Close the browser
	
		driver.quit();
	}
	
}
