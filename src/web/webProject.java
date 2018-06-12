package web;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/vladislavgazaev/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.linkText("Order")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys(Keys.BACK_SPACE);

		Random r = new Random();
		int RandNum = r.nextInt(100) + 1;
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("" + RandNum);
		int ran = r.nextInt(26) + 65;
		char randLater = (char) ran;
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("John " + randLater + ". Smithg");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys("5618 15ht");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys("Gulfpor");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys("Florida");
		String zip = "";
		for (int i = 0; i < 5; i++) {
			zip += r.nextInt(5);
		}

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(zip);
		int randCard = r.nextInt(3);
		if (randCard == 0) {
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
			String cardNum = "4";
			for (int i = 0; i < 15; i++) {
				int randNum = r.nextInt(10);
				// randCard=randCard+randNum;
				cardNum += randNum;
			}

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardNum);

		} else if (randCard == 1) {
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
			String cardNum = "5";
			for (int i = 0; i < 15; i++) {
				int randNum = r.nextInt(10);
				// randCard=randCard+randNum;
				cardNum += randNum;
			}

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardNum);

		} else if (randCard == 2) {
			driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_2")).click();
			String cardNum = "3";
			for (int i = 0; i < 14; i++) {
				int randNum = r.nextInt(10);
				// randCard=randCard+randNum;
				cardNum += randNum;
			}

			driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(cardNum);
			
		}
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("03/20");
driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
	}

}
