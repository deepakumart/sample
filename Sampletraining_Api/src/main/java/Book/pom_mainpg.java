package Book;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_mainpg {
	public WebDriver driver;

	public pom_mainpg (WebDriver element) {
		this.driver=element;
		PageFactory.initElements(driver, this);
	}
	public WebElement getRating() {
		return rating;
	}

	public WebElement getReview() {
		return review;
	}

	public WebElement getName() {
		return name;
	}
	@FindBy(xpath="//div[@class='fG8Fp uo4vr']/child::span[contains(text(),'Rating: 4.6')]")
	private WebElement  rating;
	
	@FindBy(xpath="//div[@class='fG8Fp uo4vr']/child::span[contains(text(),' reviews')]")
	private WebElement  review;
	
	@FindBy(xpath="//span[@role='text']")
	private WebElement  name;

}


