package com.ofekbytes.test.pdf;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

import java.io.IOException;


public class ReadPdf {
	
	private static final String FILE_NAME = "/home/ofekbytes/write.pdf"; // htmlcheatsheet.pdf
	
	public ReadPdf() {
	      PdfReader reader;

	        try {

	            reader = new PdfReader(FILE_NAME);

	            // pageNumber = 1
	            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);

	            System.out.println(textFromPage);

	            reader.close();

	        } catch (IOException e) {
//	            e.printStackTrace();
				System.out.println("*************");
				System.out.println("catch message");
				System.out.println("*************");
				System.out.println(e.getMessage());
				//
				// Error Message: "Illegal reflective access...."
				//
				
	        }
	}

}
