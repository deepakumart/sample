package Book;

import org.openqa.selenium.WebDriver;

public class Singleton_book {
public WebDriver driver;
	
	public Singleton_book(WebDriver driver1) {
		this.driver=driver1;
		
	}
	private pom_searchpg p;
	public pom_searchpg p() {
		if(p==null) {
			p=new pom_searchpg(driver);
		}
		return p;
	}
	private pom_mainpg r;
	public pom_mainpg r() {
		if(r==null) {
			r=new pom_mainpg(driver);
		}
		return r;
	}
	
	

}
