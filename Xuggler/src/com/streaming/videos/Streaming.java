package com.streaming.videos;

import java.io.DataInputStream;  
import java.io.File;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.PrintWriter;  
import java.math.BigInteger;  
import java.security.SecureRandom;  
import java.util.Random;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
import java.awt.Image;  
  
  
/** 
 * 
 * @author JD 
 */  
public class Streaming extends HttpServlet {  
     
    /**  
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods. 
     * @param request servlet request 
     * @param response servlet response 
     * @throws ServletException if a servlet-specific error occurs 
     * @throws IOException if an I/O error occurs 
     */  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
        HttpSession session = request.getSession(true);  
        String user = "";  
        //to get the content type information from JSP Request Header  
        /*String contentType = request.getContentType();  
        if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {  
            DataInputStream in = new DataInputStream(request.getInputStream());  
            int formDataLength = request.getContentLength();  
            byte dataBytes[] = new byte[formDataLength];  
            int byteRead = 0;  
            int totalBytesRead = 0;  
            while (totalBytesRead < formDataLength) {  
                byteRead = in.read(dataBytes, totalBytesRead, formDataLength);  
                totalBytesRead += byteRead;  
            }  
            String file = new String(dataBytes);  
  
            // out.println(file);  
  
            String saveFile = file.substring(file.indexOf("filename=\"") + 10);  
            saveFile = saveFile.substring(0, saveFile.indexOf("\n"));  
            saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1, saveFile.indexOf("\""));  
            int lastIndex = contentType.lastIndexOf("=");  
            String boundary = contentType.substring(lastIndex + 1, contentType.length());  
            int pos;  
            pos = file.indexOf("filename=\"");  
            pos = file.indexOf("\n", pos) + 1;  
            pos = file.indexOf("\n", pos) + 1;  
            pos = file.indexOf("\n", pos) + 1;  
            int boundaryLocation = file.indexOf(boundary, pos) - 4;  
            int startPos = ((file.substring(0, pos)).getBytes()).length;  
            int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;  
  
            String rootPath = "C:\\Users\\JD\\Documents\\NetBeansProjects\\xuggler\\web";  
  
            //SecureRandom srandom = new SecureRandom();  
            //String rand = new BigInteger(11, srandom).toString(5);  
            //String mysavedFile = rand.concat(saveFile);  
  
            session.setAttribute("myFolderpath", rootPath);  
            FileOutputStream fileOut = new FileOutputStream(rootPath + "\\" + saveFile);  
  
            //FileOutputStream fileOut = new FileOutputStream("c:\\"+saveFile);  
            fileOut.write(dataBytes, startPos, (endPos - startPos));  
            fileOut.flush();  
            fileOut.close();*/  
          //  String myFile = "rootPath".concat("\\").concat(saveFile);  
            //Main main=new Main();  
            //main.main(myFile);  
  
  
            // String currentFile=rootPath.concat("\\").concat(mysavedFile);  
            // session.setAttribute("mysavedFile", mysavedFile);  
            //  session.setAttribute("currentFile", currentFile);  
  
  
            //RequestDispatcher rd = request.getRequestDispatcher("access.jsp");  
            //DBHandler d = new DBHandler();  
            //d.insertfile(saveFile, rootPath.concat("\\").concat(saveFile), "admin", "0");  
  
  
  
  
  
            RequestDispatcher rd = request.getRequestDispatcher("index2.jsp");  
  
  
  
            rd.forward(request, response);  
        //}  
  
    }  
  
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">  
    /**  
     * Handles the HTTP <code>GET</code> method. 
     * @param request servlet request 
     * @param response servlet response 
     * @throws ServletException if a servlet-specific error occurs 
     * @throws IOException if an I/O error occurs 
     */  
    @Override  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
        processRequest(request, response);  
    }   
  
    /**  
     * Handles the HTTP <code>POST</code> method. 
     * @param request servlet request 
     * @param response servlet response 
     * @throws ServletException if a servlet-specific error occurs 
     * @throws IOException if an I/O error occurs 
     */  
    @Override  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
    throws ServletException, IOException {  
        processRequest(request, response);  
    }  
  
    /**  
     * Returns a short description of the servlet. 
     * @return a String containing servlet description 
     */  
    @Override  
    public String getServletInfo() {  
        return "Short description";  
    }// </editor-fold>  
  
}  