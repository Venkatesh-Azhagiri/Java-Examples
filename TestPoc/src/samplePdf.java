

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;


import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfWriter;

public class samplePdf {
	static PdfWriter pdfWriter  = null;
	
	public static String createPdfFile() {
		
		
		String pdfFileLocation = "c:/temp/test_samplePdf.pdf";
		Document document = new Document();		
		try {
			pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(
					pdfFileLocation));
			document.open();
			int projectId = 123,sampleBatchNo=232;
			addContent(document, projectId, sampleBatchNo);
			document.close();
		} catch (FileNotFoundException e) {
			
		} catch (DocumentException e) {			
			
		}

		return pdfFileLocation;

	}

	private static void addContent(Document document, int projectId, int sampleBatchNo)
			throws DocumentException {
		// projectId = 394; sampleBatchNo = 1141; // Harcoded for testing
		Paragraph preface = new Paragraph();
		if (sampleBatchNo > 0) {
			addEmptyLine(preface, 1);
			try {
				//preface.add(Image.getInstance("c:/temp/logo_lims.png"));
				//System.out.println("path****"+request.getSession().getServletContext().getRealPath("WEB-INF/images"));
				preface.add(Image.getInstance("c:temp/logo_lims.png"));
				//preface.add(Image.getInstance(logo.getPath()));
			} catch (MalformedURLException e) {
				
			} catch (IOException e) {
				
			}

			
			String modifiedProjectType = "DNA";
			
			// preface.setSpacingAfter(10);
			// preface.setSpacingBefore(10);
			//preface.setIndentationLeft(130);
			
			preface.add("Sample Submission Form");
			addEmptyLine(preface, 1);			
			preface.add(modifiedProjectType);
			addEmptyLine(preface, 1);
			try {
				Barcode128 code128 = new Barcode128();
				code128.setCodeType(code128.EAN13);				
				code128.setCode(String.valueOf(sampleBatchNo));				
				code128.setFont(null);				
				PdfContentByte cb = pdfWriter.getDirectContent();
				
				Image imageEAN = code128.createImageWithBarcode(cb, null, null);
				//Image image = Image.getInstance("c:/temp/barcode.png");
				imageEAN.scaleAbsolute(100, 20);
				preface.add(imageEAN);
			} catch (Exception e) {
				
			} 
			preface.add("Sample Batch  1023");
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			Date date = new Date();
			// System.out.println(dateFormat.format(date));
			addEmptyLine(preface, 1);
			preface.add("Date:" + dateFormat.format(date));

			preface.add(new Paragraph("Project:NGS2"));
			preface.add(new Paragraph("Project Name: Test Project"));
			preface.add(new Paragraph("Project Owner: admin"));
			preface.add(new Paragraph(
					"PLEASE PRINT THIS PAGE AND SUBMIT WITH YOUR SAMPLES"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("How to submit "
					+ modifiedProjectType + " for sequencing:"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph(
					"1.Confirm the SAM IDs listed at the bottom of this page"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("2.Label your tubes:"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("Tube top: SAM ID"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("Tube side: SAM ID"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("NGS123"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph(modifiedProjectType));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph(
					"3.Bring your samples to the drop-off freezer in 41-3165."));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph(
					"4.Place your tubes in one of our numbered boxes(on floor near freezer)"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("				Write down the box # here:"));

			try {
				Image rectangleImage = Image
						.getInstance("c:temp/rectangle.png");
				rectangleImage.scaleAbsolute(30, 20);
				preface.add(rectangleImage);
			} catch (MalformedURLException e) {
				
			} catch (IOException e) {
				
			}
			preface.add(new Paragraph("4.Place your box in the "
					+ modifiedProjectType
					+ " rack on the bottom shelf of the freezer"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph(
					"5.Leave this sheet on the clipboard next to the freezer"));
			PdfContentByte under = pdfWriter.getDirectContentUnder();
			 drawRectangle(under, 500, 480);
			 preface.add(new Paragraph(
						"You are submitting the following "
								+ 3 + " samples"));
				addEmptyLine(preface, 1);
			
				
			
		
			preface.add(new Paragraph("For NGS Lab use only"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("Received by:"));
			addEmptyLine(preface, 1);
			preface.add(new Paragraph("Initial and date"));			
			addEmptyLine(preface, 1);
			PdfContentByte under1 = pdfWriter.getDirectContent();
			// drawRectangle(under1, 10, 5);
		}else{
			preface.add(new Paragraph("No Samples to import"));
		}
		System.out.println("test publish**");
		document.add(preface);
	}

	private static void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

	
	
	
	 public static void drawRectangle(PdfContentByte content, float width, float height) {
	        content.saveState();
	        PdfGState state = new PdfGState();
	        state.setFillOpacity(0.6f);
	        content.setGState(state);
	        content.setRGBColorFill(0xFF, 0xFF, 0xFF);
	        content.setLineWidth(1f);
	        content.rectangle(10, 5, width, height);
	        content.fillStroke();
	        content.restoreState();
	    }
	 
	 public static void main(String are[]){
		 createPdfFile();
	 }
}
