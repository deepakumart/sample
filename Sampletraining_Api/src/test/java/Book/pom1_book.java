package Book;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class pom1_book extends base_clsbook {
	public static WebDriver driver=base_clsbook.getBrowser("chrome");
	public static  Singleton_book Bd = new Singleton_book(driver);
	
	public static void main(String[] args) throws IOException {
		
		String url = File_rederbook.getFrm().getCr().geturl();
		geturl(url);

        maximize();
        
        String name=File_rederbook.getFrm().getCr().getbook();
        inputvalue(Bd.p().getSearch(),name);
        ClickOnElement(Bd.p().getClick());
        ass(Bd.r().getRating(),"Rating: 4.6");
        
    	ass(Bd.r().getReview(), "36,812 reviews");
    	
    	ass(Bd.r().getName(), "› Ikigai-Héctor-García");
      
	}

}
