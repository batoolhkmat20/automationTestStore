package automationteststore;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestStore {
	public class TestArbi {
		WebDriver driver = new ChromeDriver();
//		https://automationteststore.com/
//			1- create signup process 
//			2- create login process
//			3- go to men section and try to add all items to the cart make one assertion 
//			https://automationteststore.com/index.php?rt=product/category&path=58
//			4- make one assertion that the contact number in the footer is "+123 456 7890"
//			5- go to sitemap section in the footer and print all the items there in capital letter 
		// go to hair care section and then go to CONDITIONER add one item and skipt the next one till you finish all items 
		// print the sum of the prices for all items 
		
		String fN="batool";
		String LN="hikat";
		String eail="bhkmat2@gmail.com";
		String Phone1="078802441";
		String fa="125k";
		String Company="annna";
	String Address1="alkhadi";
	String post="0000";
	String Loginna="batool205";
	String Password="batool@205";
		
		@BeforeTest
		public void sutup() {
			//driver.get("https://automationteststore.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}
		@Test(enabled = false)
		public void signup() {
			driver.get("https://automationteststore.com/index.php?rt=account/login");
			WebElement regester=driver.findElement(By.cssSelector("button[title='Continue']"));
			regester.click();
			WebElement first=driver.findElement(By.cssSelector("#AccountFrm_firstname"));
			first.sendKeys(fN);
			WebElement last=driver.findElement(By.cssSelector("#AccountFrm_lastname"));
			last.sendKeys(LN);
			WebElement EE=driver.findElement(By.cssSelector("#AccountFrm_email"));
			EE.sendKeys(eail);
			WebElement phone=driver.findElement(By.cssSelector("#AccountFrm_telephone"));
			phone.sendKeys(Phone1);
			WebElement Fax=driver.findElement(By.cssSelector("#AccountFrm_fax"));
			Fax.sendKeys(fa);
			WebElement CompanyEle=driver.findElement(By.cssSelector("#AccountFrm_company"));
			CompanyEle.sendKeys(Company);
			WebElement Address=driver.findElement(By.cssSelector("#AccountFrm_address_1"));
			Address.sendKeys(Address1);
			WebElement City =driver.findElement(By.cssSelector("#AccountFrm_city"));
			City.sendKeys("irbed");
			WebElement Country =driver.findElement(By.id("AccountFrm_country_id"));
			Country.click();	
			Select select=new Select(Country);
			select.selectByValue("108");
			WebElement ss =driver.findElement(By.xpath("//*[@id=\"AccountFrm_zone_id\"]"));
ss.click();
Select select1=new Select(ss);
select1.selectByValue("1708");
WebElement post =driver.findElement(By.cssSelector("#AccountFrm_postcode"));
post.sendKeys("2055");
WebElement login =driver.findElement(By.cssSelector("#AccountFrm_loginname"));
login.sendKeys(Loginna);
WebElement pass =driver.findElement(By.cssSelector("#AccountFrm_password"));
pass.sendKeys(Password);
WebElement pass1 =driver.findElement(By.cssSelector("#AccountFrm_confirm"));
pass1.sendKeys(Password);
WebElement no =driver.findElement(By.cssSelector("label[for='AccountFrm_newsletter0']"));
no.click();
WebElement agree =driver.findElement(By.cssSelector("#AccountFrm_agree"));
agree.click();
WebElement regest =driver.findElement(By.cssSelector("button[title='Continue']"));
regest.click();

	}
	@Test(enabled = false)
	public void login() {
	
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		driver.findElement(By.cssSelector(".contentpanel"));
		WebElement usern =driver.findElement(By.cssSelector("#loginFrm_loginname"));
		usern.sendKeys(Loginna);
		WebElement pasword =driver.findElement(By.cssSelector("#loginFrm_password"));
		pasword.sendKeys(Password);
		WebElement login1 =driver.findElement(By.cssSelector("button[title='Login']"));
		login1.click();
		WebElement aa =driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[1]/div/h1/span[1]"));
String aual=aa.getText();
String apeted="MY ACCOUNT";
Assert.assertEquals(aual, apeted);
}
	@Test(enabled = false)
	public void addallitems() throws InterruptedException {
		driver.get("https://automationteststore.com/index.php?rt=product/category&path=58");
WebElement firstIte =driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1) > i:nth-child(1)"));
firstIte.click();
WebElement addfirstIte =driver.findElement(By.cssSelector(".cart"));
addfirstIte.click();
Thread.sleep(5000);
driver.get("https://automationteststore.com/index.php?rt=product/product&product_id=68");
WebElement add2 =driver.findElement(By.cssSelector("li:nth-child(2) a:nth-child(2)"));
add2.click();
WebElement addto =driver.findElement(By.cssSelector(".cart"));
addto.click();
driver.get("https://automationteststore.com/index.php?rt=product/product&product_id=68");
WebElement add3 =driver.findElement(By.cssSelector("li:nth-child(3) a:nth-child(2)"));
add3.click();
WebElement addto3 =driver.findElement(By.cssSelector(".cart"));
addto3.click();
driver.get("https://automationteststore.com/index.php?rt=product/product&product_id=68");
//WebElement add4 =driver.findElement(By.cssSelector("li:nth-child(4) a:nth-child(2)"));
//add4.click();
//WebElement addto4=driver.findElement(By.cssSelector(".cart"));
//addto4.click();
//driver.get("https://automationteststore.com/index.php?rt=product/product&product_id=68");
WebElement aual=driver.findElement(By.cssSelector("body > div:nth-child(1) > header:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(2)"));
String aual1=   aual.getText();
String apeted="4";
Assert.assertEquals(apeted,aual1 );

	}
	@Test(enabled = false)
	public void contactnumberinthefooter ()
	{
		driver.get("https://automationteststore.com/index.php?rt=account/login");
		WebElement phone=driver.findElement(By.cssSelector("div[id='block_frame_html_block_1807'] li:nth-child(1)"));
	String aual=phone.getText();
		String apeted="+123 456 7890";	
		Assert.assertEquals(aual,apeted);
	}
	@Test(enabled = false)
	public void  printalltheitems ()
	{		driver.get("https://automationteststore.com/index.php?rt=account/login");

	WebElement site=driver.findElement(By.cssSelector("a[href='https://automationteststore.com/index.php?rt=content/sitemap']"));
	site.click();
	  List<WebElement> elent=driver.findElements(By.cssSelector("div[id='maincontainer'] div[class='row'] div:nth-child(1)"));
	for (int i=0;i<elent.size();i++) {
		String allite=elent.get(i).getText().toUpperCase();
		System.out.println(allite);
		
	}
	  List<WebElement> elent1=driver.findElements(By.cssSelector("body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2)"));
		for (int i=0;i<elent.size();i++) {
			String allite2=elent1.get(i).getText().toUpperCase();
			System.out.println(allite2);
			
		}	
}
@Test(enabled =  false)
public void  haircaresection() {
	driver.get("https://automationteststore.com/index.php?rt=product/category&path=52_54");
	 List<WebElement> allelet=driver.findElements(By.className("list-inline"));
	for (int i=0;i<allelet.size();i+=2) {
		WebElement item=driver.findElement(By.className("thumbnail"));
		item.click();
        WebElement addToCartButton = driver.findElement(By.cssSelector(".cart")); // Adjust this selector
		addToCartButton.click();	
	driver.get("https://automationteststore.com/index.php?rt=product/category&path=52_54");

	}

}
	

@Test()
public void  sumoftheprices()
{driver.get("https://automationteststore.com/index.php?rt=product/category&path=52_54");
List<WebElement> allelet=driver.findElements(By.className("list-inline"));
List<WebElement> pri=driver.findElements(By.className("oneprice"));
double sum = 0;
String prii;
for (int i=0;i<pri.size();i++) {
	prii = pri.get(i).getText();
	double theitempriceasdouble = Double.parseDouble(prii.replace("$", ""));
	sum+=theitempriceasdouble;
	  System.out.println("The sum of the prices is: $" + sum);
}


}
		@AfterTest
		public void enftest() {
		}}}

