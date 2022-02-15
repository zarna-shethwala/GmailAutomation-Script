package StepDefinations;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailAutomationScriptStepDefination {


		WebDriver driver = null;

		@Given("I am in gmail")
		public void gmailInboxMethod() throws InterruptedException {
			
			// To set the path of Chrome Browser driver
			String projectPath = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
			// To navigate to mail URL, enter mail address and password
			driver.navigate().to("https://mail.google.com/");
			driver.findElement(By.id("identifierId")).sendKeys("shethwala.zarna@gmail.com");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div/input[contains(@name, 'password')]")).sendKeys("Zarna@123");
			driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();

		}

		@When("I create a message")
		public void createMessage() throws InterruptedException {
			
			// Write code here that turns the phrase above into concrete actions
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[contains(text(),'Compose')]")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("to")).sendKeys("shethwala.zarna@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.name("subjectbox")).sendKeys("Test Email");
		}

		@Then("I should be able to send the message")
		public void sendMessage() throws InterruptedException {
			
			// To write a message and send it to the recipient
			Thread.sleep(3000);
			WebElement msg = driver.findElement(By.xpath("//div[contains(@class,'Am Al editable LW-avf tS-tW')]"));
			msg.sendKeys("This is Test Email");
			driver.findElement(By.xpath("//div[contains(@class,'dC')]")).click();
		}

		@Then("I should see the message in my inbox")
		public void receivedMessage() throws InterruptedException {
			
			// To check the message in mail box
			Thread.sleep(5000);
			driver.findElement(By.xpath("//tr[contains(@tabindex,'-1')]")).click();
		}

		@Then("I should see that the contents of my message is the same as what I sent")
		public void validateReceivedMessage() throws InterruptedException {
			
			// To verify the sent and received message
			String actualMsg = "This is Test Email";
			Thread.sleep(2000);
			String expectedMsg = driver.findElement(By.xpath("//div[contains(@class,'a3s aiL')]")).getText();
			assertTrue(actualMsg.matches(expectedMsg));
			System.out.println("The expected message is : " +expectedMsg);
			//To close the browser window
			driver.quit();
		}

	}

