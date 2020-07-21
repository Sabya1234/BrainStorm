import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public class ReadFromImage {

	public static void main(String[] args) throws TesseractException {
		// TODO Auto-generated method stub
		
		File imageFile = new File("C:\\sample1.png");
		Tesseract instance = new Tesseract();

		//In case you don't have your own tessdata, let it also be extracted for you
		//File tessDataFolder = LoadLibs.extractTessResources("tessdata");

		//Set the tessdata path
		instance.setDatapath("C:\\Users\\Sabyasachi_Nag\\eclipse-workspace\\ReadPdfPOC\\tessdata");

		try {
		    String result = instance.doOCR(imageFile);
		    System.out.println(result);
		} catch (TesseractException e) {
		    System.err.println(e.getMessage());
		}
		

	}

}
