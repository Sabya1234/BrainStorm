import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class ReadFromPdf {

	public static void main(String[] args) throws InvalidPasswordException, IOException {
		
		PDDocument docu=PDDocument.load(new File("C:\\Users\\Sabyasachi_Nag\\Documents\\sample.pdf"));
		
		if(!docu.isEncrypted())
		{
			PDFTextStripperByArea pr=new PDFTextStripperByArea();
			pr.setSortByPosition(true);
			
			PDFTextStripper text=new PDFTextStripper();
			String textFromPDF=text.getText(docu);
			System.out.println(textFromPDF);
		}
		
		// TODO Auto-generated method stub

	}

}
