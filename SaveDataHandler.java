package MenuBarUse;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class SaveDataHandler {
    public static void handleSaveData(
            JComboBox<String> comboBox, JComboBox<String> comboBox_1,
            JComboBox<String> comboBox_1_1, JComboBox<String> comboBox_1_2,
            JTextField textField_1, JTextField textField_2,
            JCheckBox chckbxNewCheckBox, JCheckBox chckbxNewCheckBox_1,
            JCheckBox chckbxNewCheckBox_2, JTextField textField_11,
            JTextField textField_12, JTextField textField_13,
            JTextField textField_14 ) {
        
        JButton btnNewButton = new JButton("SAVE");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // If validation is successful, display a success message
                JOptionPane.showMessageDialog(null, "Save successful", "Success", JOptionPane.INFORMATION_MESSAGE);
                
                // Save data to an XML file
                saveDataToXML(comboBox, comboBox_1, comboBox_1_1, comboBox_1_2,
                        textField_1, textField_2, chckbxNewCheckBox, chckbxNewCheckBox_1,
                        chckbxNewCheckBox_2, textField_11, textField_12, textField_13,
                        textField_14 /* Other components as needed */);
            }
            
            private void saveDataToXML(
                    JComboBox<String> comboBox, JComboBox<String> comboBox_1,
                    JComboBox<String> comboBox_1_1, JComboBox<String> comboBox_1_2,
                    JTextField textField_1, JTextField textField_2,
                    JCheckBox chckbxNewCheckBox, JCheckBox chckbxNewCheckBox_1,
                    JCheckBox chckbxNewCheckBox_2, JTextField textField_11,
                    JTextField textField_12, JTextField textField_13,
                    JTextField textField_14 /* Other components as needed */) {
                
                try {
                    DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                    DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
                    
                    // Create a new Document
                    Document doc = docBuilder.newDocument();
                    
                    // Create the root element
                    Element rootElement = doc.createElement("CanControllerData");
                    doc.appendChild(rootElement);
                    
                    // ... (your data population and XML creation logic)
                    
                    // Write the content into an XML file
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                    DOMSource source = new DOMSource(doc);
                    
                    String desktopPath = System.getProperty("user.home") + "/Desktop";
                    String filePath = desktopPath + "/canControllerData.xml";
                    StreamResult result = new StreamResult(new File(filePath));
                    
                    transformer.transform(source, result);
                    
                    System.out.println("Data saved to XML file successfully.");
                } catch (Exception ex) {
                    System.out.println("An error occurred while saving data to XML file: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }

            private void addElementToDocument(Document doc, Element parentElement, String elementName, String elementValue) {
                Element element = doc.createElement(elementName);
                element.appendChild(doc.createTextNode(elementValue));
                parentElement.appendChild(element);
            }
        });
    }
}
