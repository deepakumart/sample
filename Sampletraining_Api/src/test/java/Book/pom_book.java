package Book;

import org.openqa.selenium.WebDriver;
public class pom_book extends base_clsbook {
    public static WebDriver driver=base_clsbook.getBrowser("chrome");
	public static pom_mainpg A=new pom_mainpg(driver);
	public static pom_searchpg B=new pom_searchpg(driver);
		
	public static void main(String[] args) {
	implicit();
	geturl("https://www.google.co.in/");
			
	maximize();
							
	inputvalue(B.getSearch(), "Ikigai: The Japanese secret to a long and happy life");
	
	ClickOnElement(B.getClick());
	
	ass(A.getRating(),"Rating: 4.6");
	
   
	ass(A.getReview(), "36,812 reviews");
	
	ass(A.getName(), "› Ikigai-Héctor-García");
  
	
	}

}
