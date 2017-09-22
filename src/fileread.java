import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class fileread {
	
	
	
		public void doesFileExist(String fpath) throws IOException {
			File f = new File(fpath);
			if(f.exists()) {
				System.out.println("File existed");
			}else {
				System.out.println("File doesn't exist");
			}
			
			FileInputStream fis;
			
			fis = new FileInputStream(fpath);
			
			XWPFDocument dc = new XWPFDocument(fis);
			
			
			List<XWPFParagraph> paragraphlist = dc.getParagraphs();
			for(XWPFParagraph paragraph:paragraphlist) {
				
				System.out.println(paragraph.getText());
			}
			  
			}
		
	}
	
	


