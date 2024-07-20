import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class ReadingdataFromPDF {

	public static void main(String[] args) throws IOException {

 File pdffile = new File("./src/test/resources/Selenium Full Material Updated Greens.pdf");
PDDocument doc = PDDocument.load(pdffile);
int pages = doc.getNumberOfPages();
System.out.println(pages);

PDFTextStripper pdfdata = new PDFTextStripper();
//String data =pdfdata.getText(doc);
//System.out.println(data);
pdfdata.setStartPage(4);
pdfdata.setEndPage(5);


String data =pdfdata.getText(doc);

System.out.println(data);
	}

}
