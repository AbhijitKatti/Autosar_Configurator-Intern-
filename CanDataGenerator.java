package MenuBarUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

class VariableEntry {
    private String name;
    private String type;

    public VariableEntry(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getters and setters (if needed) can be added here
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
public class CanDataGenerator {
	
	public static void generateCanData() {
		JMenuItem generateMenuItem = new JMenuItem("Generate");
        generateMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                	
                    // Show a file chooser dialog to let the user select the XML file
                	JFileChooser fileChooser = new JFileChooser();
                	fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY); // Allow selection of files only
                	fileChooser.setMultiSelectionEnabled(true); // Enable multiple file selection
                	int returnValue = fileChooser.showOpenDialog(null);

                	if (returnValue == JFileChooser.APPROVE_OPTION) {
                	    File[] xmlFiles = fileChooser.getSelectedFiles(); // Get the selected files

                	    // Process each selected XML file
                	    for (File xmlFile : xmlFiles) {
                	        // Step 2: Process the XML Data (parse the XML and extract data)
                	        List<VariableEntry> variablesList = parseXMLData(xmlFile);


                        // Step 3: Generate the .h and .c Content
                        StringBuilder headerBuilder = new StringBuilder();
                        StringBuilder sourceBuilder = new StringBuilder();

                        // Generate the content for the .h file
                        headerBuilder.append("#ifndef CAN_CONTROLLER_DATA_H\n");
                        headerBuilder.append("#define CAN_CONTROLLER_DATA_H\n\n");
                        for (VariableEntry variable : variablesList) {
                            headerBuilder.append("extern ").append(variable.getType()).append(" ").append(variable.getName()).append(";\n");
                        }
                        
                        headerBuilder.append("\n#endif // CAN_CONTROLLER_DATA_H");
                        String headerContent = headerBuilder.toString();
                        
                        
                        // Generate the content for the .c file
                        for (VariableEntry variable : variablesList) {
                            sourceBuilder.append(variable.getType()).append(" ").append(variable.getName()).append(";\n");
                        }
                        String sourceContent = sourceBuilder.toString();
                        
                        // Step 4: Write to .h and .c Files
                        String desktopPath = System.getProperty("user.home") + "/Desktop";
                        String headerFilePath = desktopPath + "/CanData.h";
                        String sourceFilePath = desktopPath + "/CanData.c";

                        // Write content to the .h and .c files
                        writeToFile(headerFilePath, headerContent);
                        writeToFile(sourceFilePath, sourceContent);
                        
                        
                        JOptionPane.showMessageDialog(null, ".h and .c files generated successfully!");
                    }
                	}
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "An error occurred while generating .h and .c files: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
            
            private List<VariableEntry> parseXMLData(File xmlFile) throws Exception {
                List<VariableEntry> variablesList = new ArrayList<>();

                
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                Document doc = builder.parse(xmlFile);
                doc.getDocumentElement().normalize();

                Element rootElement = doc.getDocumentElement();
                NodeList nodeList = rootElement.getChildNodes();

                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node node = nodeList.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element element = (Element) node;
                        String tagName = element.getTagName();
                        String textContent = element.getTextContent().trim();

                        
                        if (!textContent.isEmpty()) {
                            // Add the extracted data as VariableEntry objects to the variablesList
                            variablesList.add(new VariableEntry(tagName, textContent));
                        }
                    }
                }

                return variablesList;
            }

            // Your existing writeToFile method
            private void writeToFile(String filePath, String content) {
                try (FileWriter writer = new FileWriter(filePath)) {
                    writer.write(content);
                } catch (IOException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
                }
            }
        });
        
	}
}
