package Book;

import java.io.IOException;

public class File_rederbook {
private File_rederbook() {
		
	}
	
	public static File_rederbook getFrm() {
		File_rederbook r=new File_rederbook();
		return r;
	}
	public Configuration_book getCr() throws IOException {
		Configuration_book r=new Configuration_book();
		return r;
		
	}

}
