package documentCreation;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.xwpf.usermodel.Borders;
import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.UnderlinePatterns;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;



public class wordDocumentCreation {

	/**
	 * @param args
	 */
	
		 
		  public static void main(String[] args) throws Exception {
			  wordDocumentCreation();
		  }          
		  
		  
		  public static String wordDocumentCreation() {
			  String filePath = "D:/app-conf/";
			  String fileName = "ClinicalReport_"+Calendar.getInstance().getTimeInMillis()+".docx";
			  
			  try {
			  

		        XWPFDocument document = new XWPFDocument();
		        
		        		        
		        XWPFParagraph paragraphOne = document.createParagraph();
		        paragraphOne.setAlignment(ParagraphAlignment.CENTER);
		        paragraphOne.setBorderBottom(Borders.SINGLE);
		        paragraphOne.setBorderTop(Borders.SINGLE);
		        paragraphOne.setBorderRight(Borders.SINGLE);
		        paragraphOne.setBorderLeft(Borders.SINGLE);
		        paragraphOne.setBorderBetween(Borders.SINGLE);
		        
		        System.out.println("test 1");
		        XWPFRun paragraphOneRunOne = paragraphOne.createRun();
		        paragraphOneRunOne.setBold(true);
		        paragraphOneRunOne.setText("Patient Sequencing Analysis Report");
		        		        
		        XWPFParagraph sampleInfoTitle = document.createParagraph();
		        XWPFRun sampleInfoTitleRun = sampleInfoTitle.createRun();
		        sampleInfoTitleRun.setText("Sample Information");
		        paragraphOneRunOne.addBreak();
		        
		        XWPFParagraph sampleInfoParaGraph = document.createParagraph();
		        sampleInfoParaGraph.setAlignment(ParagraphAlignment.LEFT);
		        sampleInfoParaGraph.setBorderBottom(Borders.SINGLE);
		        sampleInfoParaGraph.setBorderTop(Borders.SINGLE);
		        sampleInfoParaGraph.setBorderRight(Borders.SINGLE);
		        sampleInfoParaGraph.setBorderLeft(Borders.SINGLE);
		        sampleInfoParaGraph.setBorderBetween(Borders.SINGLE);
		        
		        XWPFRun patientName = sampleInfoParaGraph.createRun();
		        patientName.addBreak();
		        patientName.setBold(true);
		        patientName.setText("Patient Name:");
		        patientName.addBreak();
		        
		        XWPFRun dob = sampleInfoParaGraph.createRun();
		        dob.setBold(true);
		        dob.setText("DOB:");
		        dob.addBreak();
		        
		        XWPFRun gender = sampleInfoParaGraph.createRun();
		        gender.setBold(true);
		        gender.setText("Gender:");
		        gender.addBreak();
		        
		        XWPFRun orderId = sampleInfoParaGraph.createRun();
		        orderId.setBold(true);
		        orderId.setText("Order ID/Sample ID:");
		        orderId.addBreak();
		        
		        XWPFRun sampleType = sampleInfoParaGraph.createRun();
		        sampleType.setBold(true);
		        sampleType.setText("Sample Type:");
		        sampleType.addBreak();
		        
		        XWPFRun collectionDate = sampleInfoParaGraph.createRun();
		        collectionDate.setBold(true);
		        collectionDate.setText("Collection Date:");
		        collectionDate.addBreak();
		        
		        XWPFRun sampleReceivedOn = sampleInfoParaGraph.createRun();
		        sampleReceivedOn.setBold(true);
		        sampleReceivedOn.setText("Sample Received On:");
		        sampleReceivedOn.addBreak();
		        
		        XWPFRun resultsReportedOn = sampleInfoParaGraph.createRun();
		        resultsReportedOn.setBold(true);
		        resultsReportedOn.setText("Results Reported On:");
		        resultsReportedOn.addBreak();
		        
		        XWPFParagraph clinicalInfoTitle = document.createParagraph();
		        XWPFRun clinicalInfoTitleRun = clinicalInfoTitle.createRun();
		        clinicalInfoTitleRun.setText("Clinical Information");
		        
		        XWPFParagraph clinicalInfoParaGraph = document.createParagraph();
		        clinicalInfoParaGraph.setAlignment(ParagraphAlignment.LEFT);
		        clinicalInfoParaGraph.setBorderBottom(Borders.SINGLE);
		        clinicalInfoParaGraph.setBorderTop(Borders.SINGLE);
		        clinicalInfoParaGraph.setBorderRight(Borders.SINGLE);
		        clinicalInfoParaGraph.setBorderLeft(Borders.SINGLE);
		        clinicalInfoParaGraph.setBorderBetween(Borders.SINGLE);
		        
		        XWPFRun hospitalName = clinicalInfoParaGraph.createRun();
		        hospitalName.addBreak();
		        hospitalName.setBold(true);
		        hospitalName.setText("Hospital Name:");
		        hospitalName.addBreak();
		        
		        XWPFRun requestingDoctor = clinicalInfoParaGraph.createRun();
		        requestingDoctor.setBold(true);
		        requestingDoctor.setText("Requesting Doctor:");
		        requestingDoctor.addBreak();
		        
		        XWPFRun address = clinicalInfoParaGraph.createRun();
		        address.setBold(true);
		        address.setText("Address:");
		        address.addBreak();
		        
		        XWPFRun phone = clinicalInfoParaGraph.createRun();
		        phone.setBold(true);
		        phone.setText("Phone/Fax:");
		        phone.addBreak();
		        
		        XWPFRun email = clinicalInfoParaGraph.createRun();
		        email.setBold(true);
		        email.setText("Email:");
		        email.addBreak();
		        
		        XWPFRun comments = clinicalInfoParaGraph.createRun();
		        comments.setBold(true);
		        comments.setText("Comments:");
		        comments.addBreak();
		        
		        XWPFParagraph emptyPara = document.createParagraph();
		        XWPFRun emptyParaRun = emptyPara.createRun();
		        emptyParaRun.setText("");
		       		        
		        XWPFParagraph clinicalIndicationPara = document.createParagraph();
		        clinicalIndicationPara.setBorderBottom(Borders.SINGLE);
		        clinicalIndicationPara.setBorderTop(Borders.SINGLE);
		        clinicalIndicationPara.setBorderRight(Borders.SINGLE);
		        clinicalIndicationPara.setBorderLeft(Borders.SINGLE);
		        clinicalIndicationPara.setBorderBetween(Borders.SINGLE);
		        
		        XWPFRun clinicalIndicationParaRun = clinicalIndicationPara.createRun();
		        clinicalIndicationParaRun.setBold(true);
		        clinicalIndicationParaRun.setText("Clinical Indication for Testing:");
		        clinicalIndicationParaRun.addBreak();
		        clinicalIndicationParaRun.addBreak();
		        clinicalIndicationParaRun.addBreak();
		        
		  //Creates a table
		      
		       XWPFTable variantDetailTable = document.createTable();
		       variantDetailTable.setWidth(300);
		       
		       XWPFTableRow variantDetailTableRow = variantDetailTable.getRow(0);
		       variantDetailTableRow.getCell(0).setText("Selected Variants Related to the clinical indication:");
		       if (variantDetailTableRow.getCell(0).getCTTc().getTcPr() == null) variantDetailTableRow.getCell(0).getCTTc().addNewTcPr();
		       if (variantDetailTableRow.getCell(0).getCTTc().getTcPr().getGridSpan() == null) variantDetailTableRow.getCell(0).getCTTc().getTcPr().addNewGridSpan();
		       variantDetailTableRow.getCell(0).getCTTc().getTcPr().getGridSpan().setVal(new BigInteger("7"));
		       variantDetailTableRow = variantDetailTable.createRow();
		       variantDetailTableRow.getCell(0).setText("The raw sequencing files (including the fastq as well as sequence alignment results) can be provided upon request from the referring physician.");
		       if (variantDetailTableRow.getCell(0).getCTTc().getTcPr() == null) variantDetailTableRow.getCell(0).getCTTc().addNewTcPr();
		       if (variantDetailTableRow.getCell(0).getCTTc().getTcPr().getGridSpan() == null) variantDetailTableRow.getCell(0).getCTTc().getTcPr().addNewGridSpan();
		       variantDetailTableRow.getCell(0).getCTTc().getTcPr().getGridSpan().setVal(new BigInteger("7"));
		       variantDetailTableRow = variantDetailTable.createRow();
		       variantDetailTableRow.getCell(0).setText("Analysis for:");
		       if (variantDetailTableRow.getCell(0).getCTTc().getTcPr() == null) variantDetailTableRow.getCell(0).getCTTc().addNewTcPr();
		       if (variantDetailTableRow.getCell(0).getCTTc().getTcPr().getGridSpan() == null) variantDetailTableRow.getCell(0).getCTTc().getTcPr().addNewGridSpan();
		       variantDetailTableRow.getCell(0).getCTTc().getTcPr().getGridSpan().setVal(new BigInteger("7"));
		       variantDetailTableRow = variantDetailTable.createRow();
		       variantDetailTableRow.getCell(0).setText("#:");
		       variantDetailTableRow.createCell().setText("Chromosome Position");
		       variantDetailTableRow.createCell().setText("Gene Name");
		       variantDetailTableRow.createCell().setText("Gene Function");
		       variantDetailTableRow.createCell().setText("CDS Change");
		       variantDetailTableRow.createCell().setText("AA Change");
		       variantDetailTableRow.createCell().setText("Approved Drug");
		       int rowNum = 1;
		       /*Result Set Iteration for filling in the table in Word document */
		      /* for (ClinicalReportModel clinicalReportModel : clinicalReportList) {
		    	   variantDetailTableRow = variantDetailTable.createRow();
		    	   variantDetailTableRow.getCell(0).setText(rowNum+"");
		    	   variantDetailTableRow.createCell().setText(clinicalReportModel.getChromosomeNumber()+" ("+clinicalReportModel.getChromosomeStart()+" : "+clinicalReportModel.getChromosomeEnd()+" )");
		    	   variantDetailTableRow.createCell().setText(clinicalReportModel.getGeneSymbol());
		    	   variantDetailTableRow.createCell().setText(clinicalReportModel.getGeneFunction());
		    	   variantDetailTableRow.createCell().setText(clinicalReportModel.getGeneticAlterationCDS());
		    	   variantDetailTableRow.createCell().setText(clinicalReportModel.getGeneticAlteration());
		    	   variantDetailTableRow.createCell().setText(clinicalReportModel.getApprovedDrug());
		    	   rowNum++;
		    					   
		       }*/
		       
		       XWPFParagraph emptyPara1 = document.createParagraph();
		       XWPFRun emptyParaRun1 = emptyPara1.createRun();
		       emptyParaRun1.setText("");
		       
		       XWPFParagraph clinicalRelevancePara = document.createParagraph();
		       XWPFRun clinicalRelevanceParaRun = clinicalRelevancePara.createRun();
		       String clinicalRelevanceData = "** Clinical relevance, if any, is reported from previously published reports. Relevant references will be indicated for each known clinically relevant mutation. "
		    		   +"Benign: An alteration in a gene distinct from the normal, wild-type allele that does not have a deleterious effect; Unknown: No literature available to indicate that the alteration is "
		    		   +"pathogenic or contrasting literature indicating it to be a polymorphism; Expected pathogenic: Some Literature available suggesting that the mutation leads to a disease phenotype; Known "
		    		   +"Pathogenic: Literature available clearly indicating that the mutation leads to a disease phenotype";
		       clinicalRelevanceParaRun.setBold(false);
		       clinicalRelevanceParaRun.setText(clinicalRelevanceData);
		       clinicalRelevanceParaRun.addBreak();
		       
		       XWPFParagraph backgroundPara = document.createParagraph();
		       XWPFRun backgroundParaRun = backgroundPara.createRun();
		       backgroundParaRun.setBold(true);
		       backgroundParaRun.setUnderline(UnderlinePatterns.SINGLE);
		       backgroundParaRun.setText("Background");
		       backgroundParaRun.addBreak();
		       backgroundParaRun.addBreak();
		       backgroundParaRun.addBreak();
		       backgroundParaRun.addBreak();
		       backgroundParaRun.addBreak();
		       
		       XWPFParagraph testdPara = document.createParagraph();
		       XWPFRun testdParaRun = testdPara.createRun();
		       testdParaRun.setBold(true);
		       testdParaRun.setUnderline(UnderlinePatterns.SINGLE);
		       testdParaRun.setText("Test");
		       testdParaRun.addBreak();
		       testdParaRun.addBreak();
		       testdParaRun.addBreak();
		       testdParaRun.addBreak();
		       testdParaRun.addBreak();
		       
		       XWPFParagraph interpretationPara = document.createParagraph();
		       XWPFRun interpretationParaRun = interpretationPara.createRun();
		       interpretationParaRun.setBold(true);
		       interpretationParaRun.setUnderline(UnderlinePatterns.SINGLE);
		       interpretationParaRun.setText("Interpretation");
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       interpretationParaRun.addBreak();
		       
		        XWPFParagraph disclaimerPara = document.createParagraph();
		        
		        XWPFRun disclaimerParaRun = disclaimerPara.createRun();
		        disclaimerParaRun.addBreak();
		        disclaimerParaRun.setBold(false);
		        disclaimerParaRun.setText("Disclaimer:");
		        disclaimerParaRun.addBreak();
		        
		        XWPFRun disclaimerParaRun1 = disclaimerPara.createRun();
		        disclaimerParaRun1.setBold(false);
		        disclaimerParaRun1.setText("•	The classification of variants of unknown significance can change over time. Please contact MedGenome at a later date for any change");
		        disclaimerParaRun1.addBreak();
		        
		        XWPFRun disclaimerParaRun2 = disclaimerPara.createRun();
		        disclaimerParaRun2.setBold(false);
		        disclaimerParaRun2.setText("•	Intronic variants are not assessed by this method");
		        disclaimerParaRun2.addBreak();
		        
		        XWPFRun disclaimerParaRun3 = disclaimerPara.createRun();
		        disclaimerParaRun3.setBold(false);
		        disclaimerParaRun3.setText("•	Large insertions and deletions are not assessed by this method");
		        disclaimerParaRun3.addBreak();
		        
		        XWPFRun disclaimerParaRun4 = disclaimerPara.createRun();
		        disclaimerParaRun4.setBold(false);
		        disclaimerParaRun4.setText("•	Certain genes may not be covered completely and few mutations could be missed");
		        disclaimerParaRun4.addBreak();
		 
		        XWPFParagraph emptyPara2 = document.createParagraph();
			    XWPFRun emptyParaRun2 = emptyPara2.createRun();
			    emptyParaRun2.setText("");
			    
			    XWPFParagraph verifiedByPara = document.createParagraph();
			    XWPFRun verifiedByParaRun = verifiedByPara.createRun();
			    verifiedByParaRun.setBold(false);
			    verifiedByParaRun.setText("Mutation Verified by:");
			    verifiedByParaRun.addBreak();
			    verifiedByParaRun.addBreak();
			    verifiedByParaRun.addBreak();
			    verifiedByParaRun.addBreak();
			    verifiedByParaRun.addBreak();
			    
			    XWPFParagraph reportReleasesByPara = document.createParagraph();
			    XWPFRun reportReleasesByParaRun = reportReleasesByPara.createRun();
			    reportReleasesByParaRun.setBold(false);
			    reportReleasesByParaRun.setText("Report Released by:");
			    reportReleasesByParaRun.addBreak();
			    reportReleasesByParaRun.addBreak();
			    reportReleasesByParaRun.addBreak();
			    reportReleasesByParaRun.addBreak();
			    reportReleasesByParaRun.addBreak();
			       
			    
		        document.write(new FileOutputStream(new File(filePath+fileName)));
		        System.out.println("test");
		      
		       
		  } catch (Exception e) {
			  System.out.println("catch");
			  e.printStackTrace();
		  }
			  
			  return fileName;
		  
		  }
		

			       
		  } 



