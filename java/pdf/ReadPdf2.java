package com.ofekbytes.test.pdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;

public class ReadPdf2 {

	private static final String FILE_NAME = "/home/ofekbytes/write.pdf"; // htmlcheatsheet.pdf
	
	public ReadPdf2() throws IOException {
		
        try (PDDocument document = PDDocument.load(new File(FILE_NAME))) {

            document.getClass();

            if (!document.isEncrypted()) {
            
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition(true);

                PDFTextStripper tStripper = new PDFTextStripper();

                String pdfFileInText = tStripper.getText(document);
                //System.out.println("Text:" + st);

                // split by whitespace
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                }

            }

        }

	}

}
