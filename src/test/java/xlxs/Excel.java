package xlxs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Excel {
	public static void main(String [] args) throws FileNotFoundException {
		File file= new File("C:\\Users\\Admin\\eclipse-workspace\\xlxs\\vino\\Book1.xlsx");
		FileInputStream stream=new FileInputStream(file);
		
	}

}
