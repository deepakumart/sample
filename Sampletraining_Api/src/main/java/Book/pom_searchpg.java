package Book;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_searchpg {
	public WebDriver driver;

	public pom_searchpg (WebDriver element) {
		this.driver=element;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	private WebElement  search;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getClick() {
		return click;
	}

	
	@FindBy(xpath="(//input[@value='Google Search'])[2]")
	private WebElement  click;
	
	
	

}



