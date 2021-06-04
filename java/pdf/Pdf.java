package com.ofekbytes.test.pdf;

import java.io.IOException;

public class Pdf {

	public Pdf() {
		
		
///----[read pdf]---------------------------------------		
		try {
			ReadPdf2 readPdf2 = new ReadPdf2();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("*************");
			System.out.println("catch message");
			System.out.println("*************");
			System.out.println(e.getMessage());
		}
///-----------------------------------------------------				

		 WritePdf writePdf = new  WritePdf();
		
//		ReadPdf readPdf = new ReadPdf();

	}
}
