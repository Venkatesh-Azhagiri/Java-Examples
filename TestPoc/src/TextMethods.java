import java.io.FileOutputStream;
import java.io.IOException;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
public class TextMethods {
 
    /** The resulting PDF. */
    public static final String RESULT = "c:/temp/text_methods.pdf";
 
    /**
     * Creates a PDF document.
     * @param filename the path to the new PDF document
     * @throws DocumentException 
     * @throws IOException
     */
    public void createPdf(String filename) throws IOException, DocumentException {
    	Document document = new Document();
    	 PdfWriter writer = PdfWriter.getInstance(document,
                 new FileOutputStream(filename));
    	  document.open();
    	 
        // step 1
      /*  Document document = new Document();
        // step 2
        PdfWriter writer = PdfWriter.getInstance(document,
                new FileOutputStream(filename));
        // step 3
        document.open();
        // step 4
        // draw helper lines
        PdfContentByte cb = writer.getDirectContent();
        cb.setLineWidth(0f);
        cb.moveTo(150, 600);
        cb.lineTo(150, 800);
        cb.moveTo(50, 760);
        cb.lineTo(250, 760);
        cb.moveTo(50, 700);
        cb.lineTo(250, 700);
        cb.moveTo(50, 640);
        cb.lineTo(250, 640);
        cb.stroke();
        // draw text
        String text = "AWAY again ";
        BaseFont bf = BaseFont.createFont();
        cb.beginText();
        cb.setFontAndSize(bf, 12);
        cb.setTextMatrix(50, 800);
        cb.showText(text);
        cb.showTextAligned(PdfContentByte.ALIGN_CENTER, text + " Center", 150, 760, 0);
        cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, text + " Right", 150, 700, 0);
        cb.showTextAligned(PdfContentByte.ALIGN_LEFT, text + " Left", 150, 640, 0);
        cb.showTextAlignedKerned(PdfContentByte.ALIGN_LEFT, text + " Left", 150, 628, 0);
        cb.setTextMatrix(0, 1, -1, 0, 300, 600);
        cb.showText("Position 300,600, rotated 90 degrees.");
        for (int i = 0; i < 360; i += 30) {
            cb.showTextAligned(PdfContentByte.ALIGN_LEFT, text, 400, 700, i);
        }
        cb.endText();
        // step 5
        document.close();*/
    	PdfPTable tbl = new PdfPTable(4);
    	tbl.setWidthPercentage(90);
    	//tbl.
    		//tbl.setHorizontalAlignment(25);
    	
    	//Row 1
    	  PdfPCell cell = new PdfPCell(Image.getInstance("c:/temp/logo_lims.png"));
    	  
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);   	  
    	  tbl.addCell(cell);   	  
    	
    	  addEmptyCell(1, tbl);
    	  
    	  cell = new PdfPCell(new Phrase("Sample Submission Form"));
    	  cell.setColspan(2);
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);    	  
    	  tbl.addCell(cell);
    	  
    	  //End Row1
    	  
    	  //Row 2	
    	  
    	  addEmptyCell(3, tbl);
    	  
    	  cell = new PdfPCell(new Phrase("DNA"));
    	  cell.setHorizontalAlignment(Element.ALIGN_CENTER);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  
    	  //End Row2
    	  
    	  
    	  //Row3
    	  cell = new PdfPCell(new Phrase("Date:2/27/2102"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell); 	  
    	
    	  
    	  addEmptyCell(2, tbl);
    	  
    	  cell = new PdfPCell(Image.getInstance("c:/temp/barcode.png"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);  	  
    	  
    	  //End Row 3
    	  
    	  //Row 4
    	  cell = new PdfPCell(new Phrase("Project:NGS196"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);  	 
    	  
    	  addEmptyCell(2, tbl);
    	  
    	  cell = new PdfPCell(new Phrase("Sample Batch 834"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  
    	  //End Row 4
    	  
    	  
    	  //Row 5
    	  cell = new PdfPCell(new Phrase("Project Name:Colon Test"));    	  
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	 // cell.setColspan(2);
    	  tbl.addCell(cell);
    	  
    	  addEmptyCell(3, tbl);   	  
    	  //End Row 5
    	  
    	  //Row 6
    	  cell = new PdfPCell(new Phrase("Project Owner:Catherine Foo"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	 // cell.setColspan(2);
    	  tbl.addCell(cell);
    	  
    	  addEmptyCell(3, tbl);   	  
    	  //End Row 6
    	  
    	  //Row 7
    	
    	  addEmptyCell(4, tbl);
    	  //End Row 7
    	  
    	  //Row 8
    	  addEmptyCell(4, tbl); 
    	  //End Row8
    	  
    	  
    	  //Row 9
    	  cell = new PdfPCell(new Phrase("PLEASE PRINT THIS PAGE AND SUBMIT WITH YOUR SAMPLES"));
    	 // cell.setColspan(2);
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  
    	  addEmptyCell(3, tbl);
    	  //End Row 9
    	  
    	  //Row 10
    	  addEmptyCell(4, tbl);
    	  //End 10;
    	  
    	  //Row 11
    	  addEmptyCell(4, tbl);
    	  //End 11;
    	  
    	  //Row 12
    	  cell = new PdfPCell(new Phrase("How to Submit DNA for Sequencing:"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(3, tbl);
    	  //End row 12
    	  
    	  //Row 13
    	  cell = new PdfPCell(new Phrase("1.Confirm the SAM IDs listed at the bottom of this page."));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(3, tbl);
    	  //End row 13
    	  
    	  //Row 14
    	  cell = new PdfPCell(new Phrase("2.Label your tubes:"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  cell = new PdfPCell(new Phrase("Tube top:"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  cell = new PdfPCell(new Phrase("SAM ID"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(1, tbl);
    	  //End row 14
    	  
    	  //Row15
    	  addEmptyCell(1, tbl);
    	  cell = new PdfPCell(new Phrase("Tube Side:"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  cell = new PdfPCell(new Phrase("SAM ID"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(1, tbl);
    	  //End 15
    	  
    	  
    	  //Row 16
    	  addEmptyCell(2, tbl);
    	  cell = new PdfPCell(new Phrase("NGS196"));
    	  cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(1, tbl);
    	  //End 16
    	  
    	  //Row 15
    	  cell = new PdfPCell(new Phrase("3.Bring your samples to the drop-off freezer in 42-3165"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(3, tbl);
    	  //End row 15
    	  
    	  //Row 16
    	  cell = new PdfPCell(new Phrase("4.Place your tubes in one of our numbered boxes(on floor near freezer)"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(3, tbl); 
    	  //End row 16
    	  
    	  //Row 17
    	  addEmptyCell(4, tbl);    	  
    	  //End 17
    	  
    	  //Row 18
    	  addEmptyCell(1, tbl);
    	  cell = new PdfPCell(new Phrase("Write down the box # here:"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  cell = new PdfPCell(Image.getInstance("c:/temp/rectangle.png"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);   	  
    	  addEmptyCell(1, tbl);
    	//End 18
    	  
    	  PdfContentByte under = writer.getDirectContentUnder();
			 drawRectangle(under, 500, 480);
    	  
		  //Row 19
    	  cell = new PdfPCell(new Phrase("5.Place your box in the DNA rack on the bottom shelf of the freezer"));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  addEmptyCell(3, tbl);
    	  //End 19
    	  
    	  //Row 20
    	  cell = new PdfPCell(new Phrase("6.Leave this sheet on the clipboard next to the freezer."));
    	  cell.setHorizontalAlignment(Element.ALIGN_LEFT);
    	  cell.disableBorderSide(Rectangle.BOX);
    	  tbl.addCell(cell);
    	  //End 20
    	  
    	  addEmptyCell(3, tbl);
    	  document.add(tbl);
    	  document.close();
    }
    
    public static void addEmptyCell(int a, PdfPTable tbl){    	
    	for(int i = 0; i< a; ++i){
    		PdfPCell cell = new PdfPCell(new Phrase(" "));    		 
    		cell.disableBorderSide(Rectangle.BOX);
    		 tbl.addCell(cell);
    	}
    }
    
    public static void drawRectangle(PdfContentByte content, float width, float height) {
        content.saveState();
        PdfGState state = new PdfGState();
        state.setFillOpacity(0.6f);
        content.setGState(state);    
        content.setRGBColorFill(0xFF, 0xFF, 0xFF);
        content.setLineWidth(1f);
        content.rectangle(60, 45, width, height);
        content.fillStroke();
        content.restoreState();
    }
 
    /**
     * Main method.
     *
     * @param    args    no arguments needed
     * @throws DocumentException 
     * @throws IOException
     */
    public static void main(String[] args) throws IOException, DocumentException {
        new TextMethods().createPdf(RESULT);
    }
}