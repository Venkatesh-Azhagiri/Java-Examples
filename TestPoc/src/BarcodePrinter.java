

/**
 * @author bchow
 * @description
 */

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class BarcodePrinter {
    private static final String host = "";
    private static final String login = "";
    private static final String password = "";

    private String address;

    public BarcodePrinter() {
        this.address = host;
    }

    public BarcodePrinter(String address) {
        this.address = address;                                                                            
    }

    public void print(ArrayList<Label> labels) {
        print(labels, 1);
    }

    public void print(ArrayList<Label> labels, int qty) {
        FTPClient ftp = new FTPClient();

        try {
            //connect to printer FTP server;
            ftp.connect(this.address);
            ftp.login(login, password);

            //generate xml
            ByteArrayOutputStream out = this.generateXmlStream(labels, qty);

            //upload XML to server
            if (!ftp.storeFile("label.xml", new ByteArrayInputStream(out.toByteArray()))) {
                throw new Exception("Could not store file.");
            }

            out.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //Logout from the FTP Server and disconnect
            try {
                ftp.logout();
                ftp.disconnect();
            }
            catch(Exception e) {

            }
        }
    }

    private ByteArrayOutputStream generateXmlStream(ArrayList<Label> labels, int qty) throws TransformerException, ParserConfigurationException {
        //generate label XML DOM model
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();
        Element root = doc.createElement("labels");
        root.setAttribute("_FORMAT", "E:PLATELAB.ZPL");
        root.setAttribute("_QUANTITY", String.valueOf(qty));
        root.setAttribute("_PRINTERNAME", "1");
        doc.appendChild(root);

        for (Label label : labels) {
            //entry for new label
            Element newLabel = doc.createElement("label");
            root.appendChild(newLabel);

            //add barcode data to encode
            Element newLabelTextTag = doc.createElement("variable");
            newLabelTextTag.setAttribute("name", "barcodeID");
            Text newLabelText = doc.createTextNode(label.getLabelText());
            newLabel.appendChild(newLabelTextTag);
            newLabelTextTag.appendChild(newLabelText);

            //add login to add to label
            Element newLoginTag = doc.createElement("variable");
            newLoginTag.setAttribute("name", "login");
            Text newLogin = doc.createTextNode(label.getLogin());
            newLabel.appendChild(newLoginTag);
            newLoginTag.appendChild(newLogin);
        }

        //generate XML and place onto stream;
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        StreamResult result = new StreamResult(out);
        DOMSource source = new DOMSource(doc);
        transformer.transform(source, result);

        return out;
    }

    public static void main(String[] args) {
        BarcodePrinter printer = new BarcodePrinter("");
        ArrayList<Label> labels = new ArrayList<Label>(1);

        Label label = new Label("", "");
        labels.add(label);

        System.out.println("test in progress...");
        try {
            printer.print(labels);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
