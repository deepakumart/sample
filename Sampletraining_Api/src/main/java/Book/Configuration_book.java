package Book;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_book {
	public static Properties p;
	public Configuration_book() throws IOException {
		File f=new File("C:\\Users\\TZ167UZ\\eclipse-workspace\\Sampletraining_Api\\src\\main\\java\\Book\\book.properties");
		FileInputStream fi=new FileInputStream(f);
		p=new Properties();
		p.load(fi);
	}
	public String geturl() {
		String url = p.getProperty("url");
		return url;
	}
	public String getbook() {
		String username = p.getProperty("bookname");
		return username;
	}
	

}
