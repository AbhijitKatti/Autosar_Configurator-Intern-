package MenuBarUse;

import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.event.AdjustmentListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.AdjustmentEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCarbonIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import com.formdev.flatlaf.intellijthemes.FlatDraculaIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterContrastIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlContrastIJTheme;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.Border;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Nextwork extends JFrame {
	private JTree tree;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField txtCancontrollerbaudrateconfig;
	private JTextField txtCanhardwareobject;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField txtCangeneral;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_17;
	private JTextField txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig;
	private JTextField txtProperties;
	private JPanel panel_7;

	public static void main(String[] args) {
		CanDataGenerator.generateCanData();
		EventQueue.invokeLater(() -> {
			try {
				//Added a Look and feel from the FlatLaf for the UI

				FlatNightOwlContrastIJTheme.setup();
						Nextwork frame = new Nextwork();
						frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}); 
	}


	public Nextwork() {
		getContentPane().setFont(new Font("Calibri", Font.PLAIN, 12));
		getContentPane().setForeground(Color.BLACK);
		getContentPane().setBackground(new Color(1, 22, 39));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1612, 903);


		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 0, 0));			
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		mnNewMenu.setBackground(Color.BLUE);
		mnNewMenu.setFont(new Font("Calibri", Font.BOLD, 18));
		menuBar.add(mnNewMenu);

		JButton btnQuit = new JButton("Quit ");
		btnQuit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				quitAction();
			}

			private void quitAction() {
				System.exit(0);
			}
		});
		mnNewMenu.add(btnQuit);

		// Menu contents added
		JMenu mnNewMenu_1 = new JMenu("Script");
		mnNewMenu_1.setFont(new Font("Calibri", Font.BOLD, 18));
		menuBar.add(mnNewMenu_1);

		JMenu mnNewMenu_3 = new JMenu("Can");
		mnNewMenu_1.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Check");
		mnNewMenu_3.add(mntmNewMenuItem_3);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Fix");
		mnNewMenu_3.add(mntmNewMenuItem_4);

		JMenu mnNewMenu_2 = new JMenu("CanIf");
		mnNewMenu_1.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Check");
		mnNewMenu_2.add(mntmNewMenuItem_5);

		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Fix");
		mnNewMenu_2.add(mntmNewMenuItem_6);

		JMenuBar menuBar_1 = new JMenuBar();
		menuBar.add(menuBar_1);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBackground(new Color(12, 5, 11));
		layeredPane.setBounds(463, 12, 851, 607);
		getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));

/************************************************* CANCONTROLLER AND ITS MODULE START***********************************************************************/

		JPanel CanControllerPanel = new JPanel();
		CanControllerPanel.setBackground(new Color(12, 5, 11));
		layeredPane.add(CanControllerPanel, "name_174383184745100");
		CanControllerPanel.setLayout(null);

		JInternalFrame CanControllerinternalFrame = new JInternalFrame("Reference");
		CanControllerinternalFrame.getContentPane().setBackground(new Color(1, 22, 39));
		CanControllerinternalFrame.setBounds(0, 0, 844, 559);
		CanControllerPanel.add(CanControllerinternalFrame);
		CanControllerinternalFrame.getContentPane().setLayout(null);

		textField_17 = new JTextField();
		textField_17.setBounds(10, 11, 808, 30);
		CanControllerinternalFrame.getContentPane().add(textField_17);
		textField_17.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("CanControllerDefaultBaudrate");
		lblNewLabel_3.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 52, 324, 30);
		CanControllerinternalFrame.getContentPane().add(lblNewLabel_3);

		txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig = new JTextField();
		txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig.setBorder(null);
		txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig.setText("/AutosarConfigurator/Can/CanConfigSet/CanController/CanControllerBaudrateConfig");
		txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig.setBounds(10, 78, 808, 30);
		CanControllerinternalFrame.getContentPane().add(txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig);
		txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig.setColumns(10);

		JButton btnNewButton_4 = new JButton("CLOSE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CanControllerinternalFrame.setVisible(false);
			}
		});

		btnNewButton_4.setBounds(395, 359, 89, 23);
		CanControllerinternalFrame.getContentPane().add(btnNewButton_4);
		CanControllerinternalFrame.setVisible(false);

		final JTextField textField_11 = new JTextField();
		textField_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (SwingUtilities.isRightMouseButton(e)) {
					JPopupMenu popupMenu = new JPopupMenu();

					// Create menu items
					JMenuItem menuItem = new JMenuItem("Create Parameter");
					menuItem.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							// Handle the action when "Create Parameter" is selected
							// Add your logic here

							// Make the CanControllerinternalFrame visible
							CanControllerinternalFrame.setVisible(true);
						}
					});
					popupMenu.add(menuItem);

					// Show the pop-up menu
					popupMenu.show(textField_11, e.getX(), e.getY());
				}
			}
		});

		textField_11.setEnabled(false); // Ensure the text field is enabled
		textField_11.setColumns(10);
		textField_11.setBounds(312, 371, 258, 25);
		CanControllerPanel.add(textField_11);

		txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.getClickCount() == 2) { // Check for double-click event
					textField_11.setText(txtautosarconfiguratorcancanconfigsetcancontrollercancontrollerbaudrateconfig.getText());
					CanControllerinternalFrame.setVisible(false); // Hide the internal frame
				}
			}
		});




		JLabel lblNewLabel_1_10 = new JLabel("CanControllerDefaultBaudrate");
		lblNewLabel_1_10.setEnabled(false);
		lblNewLabel_1_10.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_10.setBounds(43, 373, 185, 27);
		CanControllerPanel.add(lblNewLabel_1_10);

		JLabel lblNewLabel_1_1 = new JLabel("CanBusoffProcessing");
		lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(43, 31, 156, 27);
		CanControllerPanel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("CanRxProcessing");
		lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(43, 69, 107, 27);
		CanControllerPanel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("CanTxProcessing");
		lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(43, 107, 107, 27);
		CanControllerPanel.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("CanWakeupProcessing");
		lblNewLabel_1_4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(43, 145, 156, 27);
		CanControllerPanel.add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("CanControllerBaseAddress");
		lblNewLabel_1_5.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(43, 183, 202, 27);
		CanControllerPanel.add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("CanControllerId");
		lblNewLabel_1_6.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(43, 221, 107, 27);
		CanControllerPanel.add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("CanControllerActivation");
		lblNewLabel_1_7.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_7.setBounds(43, 259, 156, 27);
		CanControllerPanel.add(lblNewLabel_1_7);

		JLabel lblNewLabel_1_8 = new JLabel("CanWakeupFunctionalityAPI");
		lblNewLabel_1_8.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_8.setBounds(43, 297, 259, 27);
		CanControllerPanel.add(lblNewLabel_1_8);

		JLabel lblNewLabel_1_9 = new JLabel("CanWakeupSupport");
		lblNewLabel_1_9.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_9.setBounds(43, 335, 244, 27);
		CanControllerPanel.add(lblNewLabel_1_9);

		JLabel lblNewLabel_1_11 = new JLabel("CanControllerEcucPartitionRef");
		lblNewLabel_1_11.setEnabled(false);
		lblNewLabel_1_11.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_11.setBounds(43, 411, 185, 27);
		CanControllerPanel.add(lblNewLabel_1_11);



		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"NONE", "INTERRUPT", "POLLING"}));
		comboBox.setBounds(312, 31, 258, 25);
		CanControllerPanel.add(comboBox);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "INTERRUPT", "MIXED", "POLLING"}));
		comboBox_1.setBounds(312, 69, 258, 25);
		CanControllerPanel.add(comboBox_1);

		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "INTERRUPT", "MIXED", "POLLING"}));
		comboBox_1_1.setBounds(312, 108, 258, 25);
		CanControllerPanel.add(comboBox_1_1);

		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox_1_2.setModel(new DefaultComboBoxModel(new String[] {"NONE", "INTERRUPT", "POLLING"}));
		comboBox_1_2.setBounds(312, 145, 258, 25);
		CanControllerPanel.add(comboBox_1_2);

		textField_1 = new JTextField();
		textField_1.setBounds(312, 181, 258, 25);
		CanControllerPanel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(312, 219, 258, 25);
		CanControllerPanel.add(textField_2);

		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(Color.BLACK);
		chckbxNewCheckBox.setBounds(312, 258, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBackground(Color.BLACK);
		chckbxNewCheckBox_1.setBounds(312, 300, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
		chckbxNewCheckBox_2.setBackground(Color.BLACK);
		chckbxNewCheckBox_2.setBounds(312, 334, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox_2);

		textField_12 = new JTextField();
		textField_12.setEnabled(false);
		textField_12.setColumns(10);
		textField_12.setBounds(312, 412, 258, 25);
		CanControllerPanel.add(textField_12);

		textField_13 = new JTextField();
		textField_13.setEnabled(false);
		textField_13.setColumns(10);
		textField_13.setBounds(312, 447, 258, 25);
		CanControllerPanel.add(textField_13);

		textField_14 = new JTextField();
		textField_14.setEnabled(false);
		textField_14.setColumns(10);
		textField_14.setBounds(312, 485, 258, 25);
		CanControllerPanel.add(textField_14);


		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// If validation is successful, display a success message
				JOptionPane.showMessageDialog(null, "Save successful", "Success", JOptionPane.INFORMATION_MESSAGE);
				// Save data to an XML file
				saveDataToXML();

			}
			private void saveDataToXML() {
				try {
					// Create a new DocumentBuilder
					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

					// Create a new Document
					Document doc = docBuilder.newDocument();

					// Create the root element
					Element rootElement = doc.createElement("CanControllerData");
					doc.appendChild(rootElement);

					String CanBusoffProcessing = comboBox.getSelectedItem().toString();
					String CanRxProcessing = comboBox_1.getSelectedItem().toString();
					String CanTxProcessing = comboBox_1_1.getSelectedItem().toString();
					String CanWakeupProcessing = comboBox_1_2.getSelectedItem().toString();
					String CanControllerBaseAddress = textField_1.getText().toString();
					String CanControllerId = textField_2.getText().toString();
					boolean CanControllerActivation = chckbxNewCheckBox.isSelected();
					boolean CanWakeupFunctionalityAPI = chckbxNewCheckBox_1.isSelected();
					boolean CanWakeupSupport = chckbxNewCheckBox_2.isSelected();
					String CanControllerDefaultBaudrate = textField_11.getText().toString();
					String CanControllerEcucPartitionRef = textField_12.getText().toString();
					String CanCpuClockRef = textField_13.getText().toString();
					String CanWakeupSourceRef = textField_14.getText().toString();

					// Get the model of the JTable in CanControllerDisplayPanel
					DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

					// Update the rows in the table model
					tableModel.setValueAt(CanBusoffProcessing, 1, 1);
					tableModel.setValueAt(CanRxProcessing, 2, 1);
					tableModel.setValueAt(CanTxProcessing, 3, 1);
					tableModel.setValueAt(CanWakeupProcessing, 4, 1);
					tableModel.setValueAt(CanControllerBaseAddress, 5, 1);
					tableModel.setValueAt(CanControllerId, 6, 1);
					String CanControllerActivationValue = CanControllerActivation ? "Selected" : "Not Selected";
					tableModel.setValueAt(CanControllerActivationValue, 7, 1);
					String CanWakeupFunctionalityAPIValue = CanWakeupFunctionalityAPI ? "Selected" : "Not Selected";
					tableModel.setValueAt(CanWakeupFunctionalityAPIValue, 8, 1);
					String CanWakeupSupportValue = CanWakeupSupport ? "Selected" : "Not Selected";
					tableModel.setValueAt(CanWakeupSupportValue, 9, 1);
					tableModel.setValueAt(CanControllerDefaultBaudrate, 10, 1);
					tableModel.setValueAt(CanControllerEcucPartitionRef, 11, 1);
					tableModel.setValueAt(CanCpuClockRef, 12, 1);
					tableModel.setValueAt(CanWakeupSourceRef, 13, 1);

					// ...

					// Repaint the table to reflect the changes
					table.repaint();

					// Add the data as child elements to the root element
					addElementToDocument(doc, rootElement, "CanBusoffProcessing", comboBox.getSelectedItem().toString());
					addElementToDocument(doc, rootElement, "CanRxProcessing", comboBox_1.getSelectedItem().toString());
					addElementToDocument(doc, rootElement, "CanTxProcessing", comboBox_1_1.getSelectedItem().toString());
					addElementToDocument(doc, rootElement, "CanWakeupProcessing", comboBox_1_2.getSelectedItem().toString());
					addElementToDocument(doc, rootElement, "CanControllerBaseAddress", textField_1.getText());
					addElementToDocument(doc, rootElement, "CanControllerId", textField_2.getText());
					addElementToDocument(doc, rootElement, "CanControllerActivation", String.valueOf(chckbxNewCheckBox.isSelected()));
					addElementToDocument(doc, rootElement, "CanWakeupFunctionalityAPI", String.valueOf(chckbxNewCheckBox_1.isSelected()));
					addElementToDocument(doc, rootElement, "CanWakeupSupport", String.valueOf(chckbxNewCheckBox_2.isSelected()));
					addElementToDocument(doc, rootElement, "CanControllerDefaultBaudrate", textField_11.getText());
					addElementToDocument(doc, rootElement, "CanControllerEcucPartitionRef", textField_12.getText());
					addElementToDocument(doc, rootElement, "CanCpuClockRef", textField_13.getText());
					addElementToDocument(doc, rootElement, "CanWakeupSourceRef", textField_14.getText());

					// Add other elements here...

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

		btnNewButton.setBounds(377, 521, 107, 38);
		CanControllerPanel.add(btnNewButton);                                                        
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("");
		chckbxNewCheckBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_5.isSelected()) {
					lblNewLabel_1_10.setEnabled(true);
					textField_11.setEnabled(true);
				} else {
					lblNewLabel_1_10.setEnabled(false);
					textField_11.setEnabled(false);
					textField_11.setText(""); // Clear the text field's content
				}
			}
		});
		chckbxNewCheckBox_5.setBackground(Color.BLACK);
		chckbxNewCheckBox_5.setBounds(18, 373, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox_5);


		JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("");
		chckbxNewCheckBox_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_5_1.isSelected()) {
					lblNewLabel_1_11.setEnabled(true);
					textField_12.setEnabled(true);
				} else {
					lblNewLabel_1_11.setEnabled(false);
					textField_12.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox_5_1.setBackground(Color.BLACK);
		chckbxNewCheckBox_5_1.setBounds(18, 411, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox_5_1);

		JLabel lblNewLabel_1_12 = new JLabel("CanCpuClockRef");
		lblNewLabel_1_12.setEnabled(false);
		lblNewLabel_1_12.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_12.setBounds(43, 449, 107, 27);
		CanControllerPanel.add(lblNewLabel_1_12);

		JCheckBox chckbxNewCheckBox_5_2 = new JCheckBox("");
		chckbxNewCheckBox_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_5_2.isSelected()) {
					lblNewLabel_1_12.setEnabled(true);
					textField_13.setEnabled(true);
				} else {
					lblNewLabel_1_12.setEnabled(false);
					textField_13.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox_5_2.setBackground(Color.BLACK);
		chckbxNewCheckBox_5_2.setBounds(18, 449, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox_5_2);


		JLabel lblNewLabel_1_13 = new JLabel("CanWakeupSourceRef");
		lblNewLabel_1_13.setEnabled(false);
		lblNewLabel_1_13.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_13.setBounds(43, 487, 145, 27);
		CanControllerPanel.add(lblNewLabel_1_13);

		JCheckBox chckbxNewCheckBox_5_3 = new JCheckBox("");
		chckbxNewCheckBox_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_5_3.isSelected()) {
					lblNewLabel_1_13.setEnabled(true);
					textField_14.setEnabled(true);
				} else {
					lblNewLabel_1_13.setEnabled(false);
					textField_14.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox_5_3.setBackground(Color.BLACK);
		chckbxNewCheckBox_5_3.setBounds(18, 483, 21, 23);
		CanControllerPanel.add(chckbxNewCheckBox_5_3);
/************************************************* CANCONTROLLER AND ITS MODULE END***********************************************************************/


		JPanel CanControllerDisplayPanel = new JPanel();
		CanControllerDisplayPanel.setBorder(new LineBorder(Color.WHITE, 2));
		CanControllerDisplayPanel.setBackground(new Color(12, 5, 11));
		layeredPane.add(CanControllerDisplayPanel, "name_174385345211100");
		CanControllerDisplayPanel.setLayout(null);

		table = new JTable();
		table.setBorder(new LineBorder(Color.WHITE, 2));
		table.setFont(new Font("Calibri", Font.PLAIN, 16));
		table.setRowHeight(29);
		table.setModel(new DefaultTableModel(
				new Object[][] {
					{"ShortName", "CanController", null, null, null},
					{"CanBusoffProcessing", null, null, null, null},
					{"CanRxProcessing", null, null, null, null},
					{"CanTxProcessing", null, null, null, null},
					{"CanWakeupProcessing", null, null, null, null},
					{"CanControllerBaseAddress", null, null, null, null},
					{"CanControllerId", null, null, null, null},
					{"CanControllerActivation", null, null, null, null},
					{"CanWakeupFunctionalityAPI", null, null, null, null},
					{"CanWakeupSupport", null, null, null, null},
					{"CanControllerDefaultBaudrate", null, null, null, null},
					{"CanControllerEcucPartitionRef", "", null, null, null},
					{"CanCpuClockRef", null, null, null, null},
					{"CanWakeupSourceRef", null, null, null, null},
				},
				new String[] {
						"New column", "New column", "New column", "New column", "New column"
				}
				) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			boolean[] columnEditables = new boolean[] {
					true, false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(299);
		table.getColumnModel().getColumn(0).setMinWidth(16);
		table.getColumnModel().getColumn(1).setPreferredWidth(248);
		table.setBounds(0, 0, 851, 563);
		CanControllerDisplayPanel.add(table);
/************************************************* BAUDRATECONFIG AND ITS MODULE START***********************************************************************/

		JPanel BaudrateConfigPanel = new JPanel();
		BaudrateConfigPanel.setBackground(new Color(12, 5, 11));
		layeredPane.add(BaudrateConfigPanel, "name_174387160415800");
		BaudrateConfigPanel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("CanControllerBaudRateConfigId");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 90, 199, 30);
		BaudrateConfigPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_14 = new JLabel("CanControllerPropSeg");
		lblNewLabel_1_14.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_14.setBounds(10, 131, 130, 30);
		BaudrateConfigPanel.add(lblNewLabel_1_14);

		JLabel lblNewLabel_1_15 = new JLabel("CanControllerSeg1");
		lblNewLabel_1_15.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_15.setBounds(10, 172, 130, 30);
		BaudrateConfigPanel.add(lblNewLabel_1_15);

		JLabel lblNewLabel_1_16 = new JLabel("CanControllerSeg2");
		lblNewLabel_1_16.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_16.setBounds(10, 213, 130, 30);
		BaudrateConfigPanel.add(lblNewLabel_1_16);

		JLabel lblNewLabel_1_17 = new JLabel("CanControllerSyncJumpWidth");
		lblNewLabel_1_17.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_17.setBounds(10, 254, 180, 30);
		BaudrateConfigPanel.add(lblNewLabel_1_17);

		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setBounds(217, 214, 318, 25);
		BaudrateConfigPanel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(217, 255, 318, 25);
		BaudrateConfigPanel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(217, 173, 318, 25);
		BaudrateConfigPanel.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(217, 132, 318, 25);
		BaudrateConfigPanel.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(217, 95, 318, 25);
		BaudrateConfigPanel.add(textField_7);

		JLabel lblNewLabel_1_17_1 = new JLabel("CanControllerSyncJumpWidth");
		lblNewLabel_1_17_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_17_1.setBounds(10, 295, 180, 30);
		BaudrateConfigPanel.add(lblNewLabel_1_17_1);

		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(217, 296, 318, 25);
		BaudrateConfigPanel.add(textField_8);

		JLabel lblNewLabel_1_18 = new JLabel("ShortName");
		lblNewLabel_1_18.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel_1_18.setBounds(10, 49, 199, 30);
		BaudrateConfigPanel.add(lblNewLabel_1_18);

		txtCancontrollerbaudrateconfig = new JTextField();
		txtCancontrollerbaudrateconfig.setText("CanControllerBaudrateConfig");
		txtCancontrollerbaudrateconfig.setColumns(10);
		txtCancontrollerbaudrateconfig.setBounds(217, 50, 318, 25);
		BaudrateConfigPanel.add(txtCancontrollerbaudrateconfig);

/************************************************* BAUDRATECONFIG AND ITS MODULE END***********************************************************************/

		JPanel BaudrateConfigDisplayPanel = new JPanel();
		BaudrateConfigDisplayPanel.setBackground(new Color(12, 5, 11));
		layeredPane.add(BaudrateConfigDisplayPanel, "name_6796761632100");
		BaudrateConfigDisplayPanel.setLayout(null);

		table_1 = new JTable();
		table_1.setBorder(new LineBorder(Color.WHITE, 2));
		table_1.setFont(new Font("Calibri", Font.PLAIN, 16));
		table_1.setRowHeight(38);
		table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{"ShortName", "CanControllerBaudrateConfig"},
					{"CanControllerBaudRateConfigId", null},
					{"CanControllerPropSeg", null},
					{"CanControllerSeg1", null},
					{"CanControllerSeg2", null},
					{"CanControllerSyncJumpWidth", null},
					{"CanControllerBaudRate", null},
				},
				new String[] {
						"New column", "New column"
				}
				));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(181);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(168);
		table_1.setBounds(0, 0, 851, 563);
		BaudrateConfigDisplayPanel.add(table_1);

		//Created a default panels naming from 2-5

		JButton btnNewButton_1 = new JButton("SAVE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the values from the input components in BaudrateConfig value
				String ShortName = txtCancontrollerbaudrateconfig.getText().toString();
				String CanControllerBaudRateConfigId = textField_7.getText().toString();
				String CanControllerPropSeg = textField_6.getText().toString();
				String CanControllerSeg1 = textField_5.getText().toString();
				String CanControllerSeg2 = textField_3.getText().toString();
				String CanControllerSyncJumpWidth = textField_4.getText().toString();
				String CanControllerBaudRate = textField_8.getText().toString();


				// Get the model of the JTable in BaudrateConfig 
				DefaultTableModel tableModel = (DefaultTableModel) table_1.getModel();

				tableModel.setValueAt(ShortName, 0, 1);
				tableModel.setValueAt(CanControllerBaudRateConfigId, 1, 1);
				tableModel.setValueAt(CanControllerPropSeg, 2, 1);
				tableModel.setValueAt(CanControllerSeg1, 3, 1);
				tableModel.setValueAt(CanControllerSeg2, 4, 1);
				tableModel.setValueAt(CanControllerSyncJumpWidth, 5, 1);
				tableModel.setValueAt(CanControllerBaudRate, 6, 1);

				// Repaint the table to reflect the changes
				table_1.repaint();

				// Validation for each nodes
				if (ShortName.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ShortName is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				if (CanControllerBaudRateConfigId.isEmpty()) {
					JOptionPane.showMessageDialog(null, "CanControllerBaudRateConfigId is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				if (CanControllerPropSeg.isEmpty()) {
					JOptionPane.showMessageDialog(null, "CanControllerPropSeg is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				if (CanControllerSeg1.isEmpty()) {
					JOptionPane.showMessageDialog(null, "CanControllerSeg1 is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				if (CanControllerSeg2.isEmpty()) {
					JOptionPane.showMessageDialog(null, "CanControllerSeg2 is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				if (CanControllerSyncJumpWidth.isEmpty()) {
					JOptionPane.showMessageDialog(null, "CanControllerSyncJumpWidth is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				if (CanControllerBaudRate.isEmpty()) {
					JOptionPane.showMessageDialog(null, "CanControllerBaudRate is required", "Validation Error", JOptionPane.ERROR_MESSAGE);
					return; // Exit the method if validation fails
				}
				// If validated a message will pop up "Validation success.
				JOptionPane.showMessageDialog(null, "Validation successful", "Success", JOptionPane.INFORMATION_MESSAGE);

				// The text fields and the labels are set to visible only when the save action is performed
				boolean isBaudrateConfigSaved = true;
				textField_11.setEnabled(isBaudrateConfigSaved);
				lblNewLabel_1_10.setEnabled(isBaudrateConfigSaved);

			}

		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_1.setBounds(313, 364, 89, 23);
		BaudrateConfigPanel.add(btnNewButton_1);
		
/************************************************* CANHARDWARE AND ITS MODULE START***********************************************************************/
		JPanel CanHardwareObjectPanel = new JPanel();
		CanHardwareObjectPanel.setBackground(new Color(12, 5, 11));
		layeredPane.add(CanHardwareObjectPanel, "name_174389128932200");
		CanHardwareObjectPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("CanHandleType");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 77, 127, 19);
		CanHardwareObjectPanel.add(lblNewLabel);

		JLabel lblCanidtype = new JLabel("CanIdType");
		lblCanidtype.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanidtype.setBounds(10, 120, 127, 19);
		CanHardwareObjectPanel.add(lblCanidtype);

		JLabel lblCanobjecttype = new JLabel("CanObjectType");
		lblCanobjecttype.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanobjecttype.setBounds(10, 159, 127, 19);
		CanHardwareObjectPanel.add(lblCanobjecttype);

		JLabel lblCanfdpaddingvalue = new JLabel("CanFdPaddingValue");
		lblCanfdpaddingvalue.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanfdpaddingvalue.setBounds(10, 211, 127, 19);
		CanHardwareObjectPanel.add(lblCanfdpaddingvalue);

		JLabel lblCanhwobjectcount = new JLabel("CanHwObjectCount");
		lblCanhwobjectcount.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanhwobjectcount.setBounds(10, 246, 127, 19);
		CanHardwareObjectPanel.add(lblCanhwobjectcount);

		JLabel lblCanobjectid = new JLabel("CanObjectId");
		lblCanobjectid.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanobjectid.setBounds(10, 287, 127, 19);
		CanHardwareObjectPanel.add(lblCanobjectid);

		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"NONE", "BASIC ", "FULL"}));
		comboBox_2.setBounds(232, 72, 308, 28);
		CanHardwareObjectPanel.add(comboBox_2);

		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"NONE", "EXTENDED ", "MIXED", "STANDARD"}));
		comboBox_2_1.setBounds(232, 115, 308, 28);
		CanHardwareObjectPanel.add(comboBox_2_1);

		JComboBox comboBox_2_2 = new JComboBox();
		comboBox_2_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		comboBox_2_2.setModel(new DefaultComboBoxModel(new String[] {"NONE", "RECIEVE", "TRANSMIT"}));
		comboBox_2_2.setBounds(232, 154, 308, 28);
		CanHardwareObjectPanel.add(comboBox_2_2);

		textField = new JTextField();
		textField.setBounds(232, 208, 308, 20);
		CanHardwareObjectPanel.add(textField);
		textField.setColumns(10);

		textField_9 = new JTextField();
		textField_9.setText("1");
		textField_9.setColumns(10);
		textField_9.setBounds(232, 243, 308, 20);
		CanHardwareObjectPanel.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(232, 284, 308, 20);
		CanHardwareObjectPanel.add(textField_10);

		JLabel lblShortname = new JLabel("ShortName");
		lblShortname.setFont(new Font("Calibri", Font.BOLD, 14));
		lblShortname.setBounds(10, 33, 127, 19);
		CanHardwareObjectPanel.add(lblShortname);

		txtCanhardwareobject = new JTextField();
		txtCanhardwareobject.setText("CanHardwareObject");
		txtCanhardwareobject.setColumns(10);
		txtCanhardwareobject.setBounds(232, 30, 308, 20);
		CanHardwareObjectPanel.add(txtCanhardwareobject);

		JLabel lblCanfdpaddingvalue_1 = new JLabel("CanHardwareObjectUsesPolling");
		lblCanfdpaddingvalue_1.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanfdpaddingvalue_1.setBounds(10, 328, 186, 19);
		CanHardwareObjectPanel.add(lblCanfdpaddingvalue_1);

		JLabel lblCanfdpaddingvalue_2 = new JLabel("CanTriggerTransmitEnable");
		lblCanfdpaddingvalue_2.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanfdpaddingvalue_2.setBounds(10, 373, 186, 19);
		CanHardwareObjectPanel.add(lblCanfdpaddingvalue_2);

		JLabel lblCanfdpaddingvalue_3 = new JLabel("CanControllerRef");
		lblCanfdpaddingvalue_3.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanfdpaddingvalue_3.setBounds(10, 416, 127, 19);
		CanHardwareObjectPanel.add(lblCanfdpaddingvalue_3);

		JLabel lblCanfdpaddingvalue_4 = new JLabel("CanMainFunctionRWPeriodRef");
		lblCanfdpaddingvalue_4.setFont(new Font("Calibri", Font.BOLD, 14));
		lblCanfdpaddingvalue_4.setBounds(10, 461, 186, 19);
		CanHardwareObjectPanel.add(lblCanfdpaddingvalue_4);

		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(232, 458, 308, 20);
		CanHardwareObjectPanel.add(textField_15);

		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(232, 413, 308, 20);
		CanHardwareObjectPanel.add(textField_16);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
		chckbxNewCheckBox_3.setBackground(Color.BLACK);
		chckbxNewCheckBox_3.setBounds(232, 324, 21, 23);
		CanHardwareObjectPanel.add(chckbxNewCheckBox_3);

		JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("");
		chckbxNewCheckBox_3_1.setBackground(Color.BLACK);
		chckbxNewCheckBox_3_1.setBounds(232, 373, 21, 23);
		CanHardwareObjectPanel.add(chckbxNewCheckBox_3_1);

		JButton btnNewButton_2 = new JButton("SAVE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get the values from the input components in CanControllerPanel
				String ShortName = txtCanhardwareobject.getText().toString();
				String CanHandleType = comboBox_2.getSelectedItem().toString();
				String CanIdType = comboBox_2_1.getSelectedItem().toString();
				String CanObjectType = comboBox_2_2.getSelectedItem().toString();
				String CanFdPaddingValue = textField.getText().toString();
				String CanHwObjectCount = textField_9.getText().toString();
				String CanObjectId = textField_10.getText().toString();
				boolean CanHardwareObjectUsesPolling = chckbxNewCheckBox_3.isSelected();
				boolean CanTriggerTransmitEnable = chckbxNewCheckBox_3_1.isSelected();
				String CanControllerRef = textField_16.getText().toString();
				String CanMainFunctionRWPeriodRef = textField_15.getText().toString();

				// Get the model of the JTable in CanControllerDisplayPanel
				DefaultTableModel tableModel = (DefaultTableModel) table_2.getModel();

				// Update the rows in the table model

				tableModel.setValueAt(ShortName, 0, 1);
				tableModel.setValueAt(CanHandleType, 1, 1);
				tableModel.setValueAt(CanIdType, 2, 1);
				tableModel.setValueAt(CanObjectType, 3, 1);
				tableModel.setValueAt(CanFdPaddingValue, 4, 1);
				tableModel.setValueAt(CanHwObjectCount, 5, 1);
				tableModel.setValueAt(CanObjectId, 6, 1);
				String CanHardwareObjectUsesPollingValue = CanHardwareObjectUsesPolling ? "Selected" : "Not Selected";
				tableModel.setValueAt(CanHardwareObjectUsesPollingValue, 7, 1);
				String CanTriggerTransmitEnableValue = CanTriggerTransmitEnable ? "Selected" : "Not Selected";
				tableModel.setValueAt(CanTriggerTransmitEnableValue, 8, 1);
				tableModel.setValueAt(CanControllerRef, 9, 1);
				tableModel.setValueAt(CanMainFunctionRWPeriodRef, 10, 1);

				// Refresh the table to reflect the changes
				table_2.repaint();
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		btnNewButton_2.setBounds(280, 529, 104, 38);
		CanHardwareObjectPanel.add(btnNewButton_2);


		JPanel CanHardwareDisplay = new JPanel();
		CanHardwareDisplay.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		CanHardwareDisplay.setForeground(new Color(12, 5, 11));
		CanHardwareDisplay.setBackground(new Color(12, 5, 11));
		layeredPane.add(CanHardwareDisplay, "name_7186895270100");
		CanHardwareDisplay.setLayout(null);
/************************************************* CANHARDWARE AND ITS MODULE END***********************************************************************/

		table_2 = new JTable();
		table_2.setSize(new Dimension(2, 2));
		table_2.setBorder(new LineBorder(Color.WHITE));
		table_2.setFont(new Font("Calibri", Font.PLAIN, 16));
		table_2.setRowHeight(36);
		table_2.setModel(new DefaultTableModel(
				new Object[][] {
					{"ShortName", "CanHardwareObject"},
					{"CanHandleType", null},
					{"CanIdType", null},
					{"CanObjectType", null},
					{"CanFdPaddingValue", null},
					{"CanHwObjectCount", null},
					{"CanObjectId", null},
					{"CanHardwareObjectUsesPolling", null},
					{"CanTriggerTransmitEnable", null},
					{"CanControllerRef", null},
					{"CanMainFunction", null},
				},
				new String[] {
						"New column", "New column"
				}
				));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(170);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(149);
		table_2.setBounds(0, 0, 851, 563);
		CanHardwareDisplay.add(table_2);
/************************************************* CANGENERAL AND ITS MODULE START***********************************************************************/

		JPanel CanGeneral = new JPanel();
		CanGeneral.setBackground(Color.BLACK);
		layeredPane.add(CanGeneral, "name_520327058197200");
		CanGeneral.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("ShortName");
		lblNewLabel_2.setBounds(10, 26, 100, 31);
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("CanIndex");
		lblNewLabel_2_1.setBounds(10, 73, 100, 31);
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("CanDevErrorDetect");
		lblNewLabel_2_2.setBounds(10, 115, 108, 31);
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_2);

		JLabel lblNewLabel_2_3 = new JLabel("CanMultiplexedTransmission");
		lblNewLabel_2_3.setBounds(310, 115, 175, 31);
		lblNewLabel_2_3.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_3);

		JLabel lblNewLabel_2_4 = new JLabel("CanPublicIcomSupport");
		lblNewLabel_2_4.setBounds(601, 115, 147, 31);
		lblNewLabel_2_4.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_4);

		JLabel lblNewLabel_2_5 = new JLabel("CanSetBaudrateApi");
		lblNewLabel_2_5.setBounds(10, 147, 108, 31);
		lblNewLabel_2_5.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_5);

		JLabel lblNewLabel_2_6 = new JLabel("CanVersionInfoApi");
		lblNewLabel_2_6.setBounds(310, 147, 147, 31);
		lblNewLabel_2_6.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_6);

		JLabel lblNewLabel_2_7 = new JLabel("CanMainFunctionBusoffPeriod");
		lblNewLabel_2_7.setBounds(69, 184, 175, 31);
		lblNewLabel_2_7.setEnabled(false);
		lblNewLabel_2_7.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_7);

		JLabel lblNewLabel_2_8 = new JLabel("CanMainFunctionModePeriod");
		lblNewLabel_2_8.setBounds(69, 221, 175, 31);
		lblNewLabel_2_8.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_8);

		JLabel lblNewLabel_2_9 = new JLabel("CanMainFunctionWakeupPeriod");
		lblNewLabel_2_9.setBounds(69, 263, 213, 31);
		lblNewLabel_2_9.setEnabled(false);
		lblNewLabel_2_9.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_9);

		JLabel lblNewLabel_2_10 = new JLabel("CanTimeoutDuration");
		lblNewLabel_2_10.setBounds(69, 305, 185, 31);
		lblNewLabel_2_10.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_10);

		JLabel lblNewLabel_2_11 = new JLabel("CanLPduReceiveCalloutFunction");
		lblNewLabel_2_11.setBounds(69, 347, 213, 31);
		lblNewLabel_2_11.setEnabled(false);
		lblNewLabel_2_11.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_11);

		JLabel lblNewLabel_2_12 = new JLabel("CanEcucPartitionRef");
		lblNewLabel_2_12.setBounds(69, 390, 175, 31);
		lblNewLabel_2_12.setEnabled(false);
		lblNewLabel_2_12.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_12);

		JLabel lblNewLabel_2_13 = new JLabel("CanOsCounterRef");
		lblNewLabel_2_13.setBounds(69, 430, 147, 31);
		lblNewLabel_2_13.setEnabled(false);
		lblNewLabel_2_13.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_13);

		JLabel lblNewLabel_2_14 = new JLabel("CanSupportTTCANRef");
		lblNewLabel_2_14.setBounds(69, 466, 147, 31);
		lblNewLabel_2_14.setEnabled(false);
		lblNewLabel_2_14.setFont(new Font("Calibri", Font.PLAIN, 13));
		CanGeneral.add(lblNewLabel_2_14);

		txtCangeneral = new JTextField();
		txtCangeneral.setBounds(300, 29, 376, 28);
		txtCangeneral.setText("CanGeneral");
		CanGeneral.add(txtCangeneral);
		txtCangeneral.setColumns(10);

		textField_18 = new JTextField();
		textField_18.setBounds(300, 76, 376, 28);
		textField_18.setColumns(10);
		CanGeneral.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setBounds(300, 179, 376, 28);
		textField_19.setEnabled(false);
		textField_19.setColumns(10);
		CanGeneral.add(textField_19);

		textField_20 
		= new JTextField();
		textField_20.setBounds(300, 222, 376, 28);
		textField_20.setColumns(10);
		CanGeneral.add(textField_20);

		textField_21 = new JTextField();
		textField_21.setBounds(300, 264, 376, 28);
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
		CanGeneral.add(textField_21);

		textField_22 = new JTextField();
		textField_22.setBounds(300, 306, 376, 28);
		textField_22.setColumns(10);
		CanGeneral.add(textField_22);

		textField_23 = new JTextField();
		textField_23.setBounds(300, 348, 376, 28);
		textField_23.setEnabled(false);
		textField_23.setColumns(10);
		CanGeneral.add(textField_23);

		textField_24 = new JTextField();
		textField_24.setBounds(300, 390, 376, 28);
		textField_24.setEnabled(false);
		textField_24.setColumns(10);
		CanGeneral.add(textField_24);

		textField_25 = new JTextField();
		textField_25.setBounds(300, 429, 376, 28);
		textField_25.setEnabled(false);
		textField_25.setColumns(10);
		CanGeneral.add(textField_25);

		textField_26 = new JTextField();
		textField_26.setBounds(300, 468, 376, 28);
		textField_26.setEnabled(false);
		textField_26.setColumns(10);
		CanGeneral.add(textField_26);

		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("\r\n");
		chckbxNewCheckBox_4.setBounds(154, 115, 97, 23);
		chckbxNewCheckBox_4.setBackground(Color.BLACK);
		CanGeneral.add (chckbxNewCheckBox_4);

		JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("\r\n");
		chckbxNewCheckBox_4_1.setBounds(498, 117, 97, 23);
		chckbxNewCheckBox_4_1.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_4_1);

		JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("\r\n");
		chckbxNewCheckBox_4_2.setBounds(754, 117, 97, 23);
		chckbxNewCheckBox_4_2.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_4_2);

		JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("\r\n");
		chckbxNewCheckBox_4_3.setBounds(154, 147, 97, 23);
		chckbxNewCheckBox_4_3.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_4_3);

		JCheckBox chckbxNewCheckBox_4_4 = new JCheckBox("\r\n");
		chckbxNewCheckBox_4_4.setBounds(498, 149, 97, 23);
		chckbxNewCheckBox_4_4.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_4_4);

		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("");
		chckbxNewCheckBox_6.setBounds(12, 267, 23, 23);
		chckbxNewCheckBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_6.isSelected()) {
					lblNewLabel_2_9.setEnabled(true);
					textField_21.setEnabled(true);
				} else {
					lblNewLabel_2_9.setEnabled(false);
					textField_21.setEnabled(false);
					textField_21.setText("");
				}
			}
		});
		chckbxNewCheckBox_6.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_6);

		JCheckBox chckbxNewCheckBox_6_1 = new JCheckBox("");
		chckbxNewCheckBox_6_1.setBounds(10, 349, 23, 23);
		chckbxNewCheckBox_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_6_1.isSelected()) {
					textField_23.setEnabled(true);
					lblNewLabel_2_11.setEnabled(true);
				} else {
					lblNewLabel_2_11.setEnabled(false);
					textField_23.setEnabled(false);
					textField_23.setText("");
				}
			}
		});
		chckbxNewCheckBox_6_1.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_6_1);

		JCheckBox chckbxNewCheckBox_6_2 = new JCheckBox("");
		chckbxNewCheckBox_6_2.setBounds(10, 392, 23, 23);
		chckbxNewCheckBox_6_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_6_2.isSelected()) {
					lblNewLabel_2_12.setEnabled(true);
					textField_24.setEnabled(true);
				} else {
					lblNewLabel_2_12.setEnabled(false);
					textField_24.setEnabled(false);
					textField_24.setText("");
				}
			}
		});
		chckbxNewCheckBox_6_2.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_6_2);

		JCheckBox chckbxNewCheckBox_6_3 = new JCheckBox("");
		chckbxNewCheckBox_6_3.setBounds(10, 432, 23, 23);
		chckbxNewCheckBox_6_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_6_3.isSelected()) {
					lblNewLabel_2_13.setEnabled(true);
					textField_25.setEnabled(true);
				} else {
					lblNewLabel_2_13.setEnabled(false);
					textField_25.setEnabled(false);
					textField_25.setText("");

				}
			}
		});
		chckbxNewCheckBox_6_3.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_6_3);

		JCheckBox chckbxNewCheckBox_6_4 = new JCheckBox("");
		chckbxNewCheckBox_6_4.setBounds(10, 468, 23, 23);
		chckbxNewCheckBox_6_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_6_4.isSelected()) {
					lblNewLabel_2_14.setEnabled(true);
					textField_26.setEnabled(true);
				} else {
					lblNewLabel_2_14.setEnabled(false);
					textField_26.setEnabled(false);
					textField_26.setText("");

				}
			}
		});
		chckbxNewCheckBox_6_4.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_6_4);
/************************************************* CANGENERAL AND ITS MODULE END***********************************************************************/

		JCheckBox chckbxNewCheckBox_6_5 = new JCheckBox("");
		chckbxNewCheckBox_6_5.setBounds(10, 185, 23, 23);
		chckbxNewCheckBox_6_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_6_5.isSelected()) {
					lblNewLabel_2_7.setEnabled(true);
					textField_19.setEnabled(true);
				} else {
					lblNewLabel_2_7.setEnabled(false);
					textField_19.setEnabled(false);
					textField_19.setText("");

				}
			}
		});
		chckbxNewCheckBox_6_5.setBackground(Color.BLACK);
		CanGeneral.add(chckbxNewCheckBox_6_5);



		JButton btnSave = new JButton("Save ");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveAction();
			}
			private void saveAction() {
				try {
					// Create a new DocumentBuilder
					DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
					DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

					// Create a new Document
					Document doc = docBuilder.newDocument();

					// Create the root element
					Element rootElement = doc.createElement("Root");
					doc.appendChild(rootElement);
					// Create the root element
					JOptionPane.showMessageDialog(null, "XML file saved successfully!");

					Element canControllerDataElement = doc.createElement("ECUextract");
					rootElement.appendChild(canControllerDataElement);

					String CanBusoffProcessing = comboBox.getSelectedItem().toString();
					String CanRxProcessing = comboBox_1.getSelectedItem().toString();
					String CanTxProcessing = comboBox_1_1.getSelectedItem().toString();
					String CanWakeupProcessing = comboBox_1_2.getSelectedItem().toString();
					String CanControllerBaseAddress = textField_1.getText().toString();
					String CanControllerId = textField_2.getText().toString();
					boolean CanControllerActivation = chckbxNewCheckBox.isSelected();
					boolean CanWakeupFunctionalityAPI = chckbxNewCheckBox_1.isSelected();
					boolean CanWakeupSupport = chckbxNewCheckBox_2.isSelected();
					String CanControllerDefaultBaudrate = textField_11.getText().toString();
					String CanControllerEcucPartitionRef = textField_12.getText().toString();
					String CanCpuClockRef = textField_13.getText().toString();
					String CanWakeupSourceRef = textField_14.getText().toString();

					// Get the model of the JTable in CanControllerDisplayPanel

					// Add the data as child elements to the root element
					addElement(doc, rootElement, "CanBusoffProcessing", comboBox.getSelectedItem().toString());
					addElement(doc, rootElement, "CanRxProcessing", comboBox_1.getSelectedItem().toString());
					addElement(doc, rootElement, "CanTxProcessing", comboBox_1_1.getSelectedItem().toString());
					addElement(doc, rootElement, "CanWakeupProcessing", comboBox_1_2.getSelectedItem().toString());
					addElement(doc, rootElement, "CanControllerBaseAddress", textField_1.getText());
					addElement(doc, rootElement, "CanControllerId", textField_2.getText());
					addElement(doc, rootElement, "CanControllerActivation", String.valueOf(chckbxNewCheckBox.isSelected()));
					addElement(doc, rootElement, "CanWakeupFunctionalityAPI", String.valueOf(chckbxNewCheckBox_1.isSelected()));
					addElement(doc, rootElement, "CanWakeupSupport", String.valueOf(chckbxNewCheckBox_2.isSelected()));
					addElement(doc, rootElement, "CanControllerDefaultBaudrate", textField_11.getText());
					addElement(doc, rootElement, "CanControllerEcucPartitionRef", textField_12.getText());
					addElement(doc, rootElement, "CanCpuClockRef", textField_13.getText());
					addElement(doc, rootElement, "CanWakeupSourceRef", textField_14.getText());

					Element canGeneralConfigurationElement = doc.createElement("CanGeneralConfiguration");
					rootElement.appendChild(canGeneralConfigurationElement);

					String ShortName = txtCangeneral.getText();
					String CanIndex = textField_18.getText();
					boolean CanDevErrorDetect = chckbxNewCheckBox_4.isSelected();
					boolean CanMultiplexedTransmission = chckbxNewCheckBox_4_1.isSelected();
					boolean CanPublicIcomSupport = chckbxNewCheckBox_4_2.isSelected();
					boolean CanSetBaudrateApi = chckbxNewCheckBox_4_3.isSelected();
					boolean CanVersionInfoApi = chckbxNewCheckBox_4_4.isSelected();
					String CanMainFunctionBusoffPeriod = textField_19.getText();
					String CanMainFunctionModePeriod = textField_20.getText();
					String CanMainFunctionWakeupPeriod = textField_21.getText();
					String CanTimeoutDuration = textField_22.getText();
					String CanLPduReceiveCalloutFunction = textField_23.getText();
					String CanEcucPartitionRef = textField_24.getText();
					String CanOsCounterRef = textField_25.getText();
					String CanSupportTTCANRef = textField_26.getText();

					// Get the data from UI elements

					// Add the input fields as child elements of <CanConfiguration>
					addElement(doc, rootElement, "ShortName", ShortName);
					addElement(doc, rootElement, "CanIndex", CanIndex);
					addElement(doc, rootElement, "CanDevErrorDetect", String.valueOf(CanDevErrorDetect));
					addElement(doc, rootElement, "CanMultiplexedTransmission", String.valueOf(CanMultiplexedTransmission));
					addElement(doc, rootElement, "CanPublicIcomSupport", String.valueOf(CanPublicIcomSupport));
					addElement(doc, rootElement, "CanSetBaudrateApi", String.valueOf(CanSetBaudrateApi));
					addElement(doc, rootElement, "CanVersionInfoApi", String.valueOf(CanVersionInfoApi));
					addElement(doc, rootElement, "CanMainFunctionBusoffPeriod", CanMainFunctionBusoffPeriod);
					addElement(doc, rootElement, "CanMainFunctionModePeriod", CanMainFunctionModePeriod);
					addElement(doc, rootElement, "CanMainFunctionWakeupPeriod", CanMainFunctionWakeupPeriod);
					addElement(doc, rootElement, "CanTimeoutDuration", CanTimeoutDuration);
					addElement(doc, rootElement, "CanLPduReceiveCalloutFunction", CanLPduReceiveCalloutFunction);
					addElement(doc, rootElement, "CanEcucPartitionRef", CanEcucPartitionRef);
					addElement(doc, rootElement, "CanOsCounterRef", CanOsCounterRef);
					addElement(doc, rootElement, "CanSupportTTCANRef", CanSupportTTCANRef);


					//CanHardwareObjectPanel components
					Element CanHardwareObjectElement = doc.createElement("CanHardwareObject");
					rootElement.appendChild(CanHardwareObjectElement);


					String CanHandleType = comboBox_2.getSelectedItem().toString();
					String CanIdType = comboBox_2_1.getSelectedItem().toString();
					String CanObjectType = comboBox_2_2.getSelectedItem().toString();
					String CanFdPaddingValue = textField.getText().toString();
					String CanHwObjectCount = textField_9.getText().toString();
					String CanObjectId = textField_10.getText().toString();
					boolean CanHardwareObjectUsesPolling = chckbxNewCheckBox_3.isSelected();
					boolean CanTriggerTransmitEnable = chckbxNewCheckBox_3_1.isSelected();
					String CanControllerRef = textField_16.getText().toString();
					String CanMainFunctionRWPeriodRef = textField_15.getText().toString();

					addElement(doc, rootElement, "CanHandleType", comboBox_2.getSelectedItem().toString());
					addElement(doc, rootElement, "CanIdType", comboBox_2_1.getSelectedItem().toString());
					addElement(doc, rootElement, "CanObjectType", comboBox_2_2.getSelectedItem().toString());
					addElement(doc, rootElement, "CanFdPaddingValue", textField.getText());
					addElement(doc, rootElement, "CanHwObjectCount", textField_9.getText());
					addElement(doc, rootElement, "CanObjectId", textField_10.getText());
					addElement(doc, rootElement, "CanHardwareObjectUsesPolling", String.valueOf(chckbxNewCheckBox_3.isSelected()));
					addElement(doc, rootElement, "CanTriggerTransmitEnable", String.valueOf(chckbxNewCheckBox_3_1.isSelected()));
					addElement(doc, rootElement, "CanControllerRef", textField_16.getText());
					addElement(doc, rootElement, "CanMainFunctionRWPeriodRef", textField_15.getText());

					// Write the content into an XML file
					TransformerFactory transformerFactory = TransformerFactory.newInstance();
					Transformer transformer = transformerFactory.newTransformer();
					transformer.setOutputProperty(OutputKeys.INDENT, "yes");
					DOMSource source = new DOMSource(doc);

					String desktopPath = System.getProperty("user.home") + "/Desktop";
					String filePath = desktopPath + "/ECU_Extract.xml" ;
					StreamResult result = new StreamResult(new File(filePath));

					transformer.transform(source, result);
					System.out.println("Data saved to XML file successfully.");

				} catch (Exception ex) {
					System.out.println("An error occurred while saving data to XML file: " + ex.getMessage());
					ex.printStackTrace();
				}
			}
			private void addElement(Document doc2, Element parentElement, String elementName, String elementValue) {
				Document doc = parentElement.getOwnerDocument();
				Element element = doc.createElement(elementName);
				element.appendChild(doc.createTextNode(elementValue));
				parentElement.appendChild(element);

			}
		});
		mnNewMenu.add(btnSave);

/************************************************* JTREE AND ITS MODULES START***********************************************************************/

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 11, 451, 608);
		getContentPane().add(scrollPane);

		// Adding the JTree nodes
		tree = new JTree();
		scrollPane.setRowHeaderView(tree);
		tree.setOpaque(false);
		
		tree.setShowsRootHandles(true);
		tree.setFont(new Font("Calibri", Font.PLAIN, 18));
		tree.setAutoscrolls(true);
		tree.setBorder(null);
		tree.setForeground(new Color(255, 255, 255));   
		tree.setVisibleRowCount(30);
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("ECU Configuration") {
				{
					DefaultMutableTreeNode node_1;
					DefaultMutableTreeNode node_2;
					DefaultMutableTreeNode node_3;
					DefaultMutableTreeNode node_4;
					DefaultMutableTreeNode node_5;
					add(new DefaultMutableTreeNode("Adc"));
					add(new DefaultMutableTreeNode("ArtiOs"));
					add(new DefaultMutableTreeNode("Bswm"));
					node_1 = new DefaultMutableTreeNode("Can\t");
						node_2 = new DefaultMutableTreeNode("CanConfigSet");
							node_3 = new DefaultMutableTreeNode("CanController_");
								node_4 = new DefaultMutableTreeNode("CanController_00");
									node_5 = new DefaultMutableTreeNode("CanControllerBaudrateConfig_");
										node_5.add(new DefaultMutableTreeNode("CanControllerBaudrateConfig"));
									node_4.add(node_5);
								node_3.add(node_4);
							node_2.add(node_3);
							node_3 = new DefaultMutableTreeNode("CanHardwareObject_");
								node_3.add(new DefaultMutableTreeNode("CanHardwareObject"));
							node_2.add(node_3);
						node_1.add(node_2);
					add(node_1);
					add(new DefaultMutableTreeNode("CanIf"));
					add(new DefaultMutableTreeNode("CanSm"));
					add(new DefaultMutableTreeNode("CanTp"));
					add(new DefaultMutableTreeNode("CanTrcv "));
					add(new DefaultMutableTreeNode("Cdd"));
					add(new DefaultMutableTreeNode("Com"));
					add(new DefaultMutableTreeNode("ComM"));
					add(new DefaultMutableTreeNode("Dcm"));
					add(new DefaultMutableTreeNode("Dem"));
					add(new DefaultMutableTreeNode("Dio"));
					add(new DefaultMutableTreeNode("EcuC"));
					add(new DefaultMutableTreeNode("Eth\t"));
					add(new DefaultMutableTreeNode("Fee"));
					add(new DefaultMutableTreeNode("IpduM"));
					add(new DefaultMutableTreeNode("PduR"));
				}
			}
		));
		tree.setBackground(new Color(1, 22, 39));
/************************************************* JTREE AND ITS MODULES END***********************************************************************/

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(1315, 310, 278, 527);
		getContentPane().add(scrollPane_2);

		JLayeredPane layeredPane_Desc = new JLayeredPane();
		scrollPane_2.setViewportView(layeredPane_Desc);
		layeredPane_Desc.setBackground(new Color(1, 22, 39));
		layeredPane_Desc.setLayout(new CardLayout(0, 0));

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel, "name_367383531422300");
		panel.setLayout(null);

		JTextPane txtpnModuleNameCan = new JTextPane();
		txtpnModuleNameCan.setText("Module Name : Can\r\nModule Description : This container holds the configuration of a single CAN Driver.\r\nPost-Build Variant Support : true \r\nSupported Config Variants : VARIANT-POST-BUILD, VARIANT-PRE-COMPILE\r\n\r\nIncluded Containers\r\nContainer Name : CanConfigSet\r\nMultiplicity\t: 1\r\nScope / Dependency : This container contains the configuration parameters and sub \r\ncontainers of the AUTOSAR Can module\r\n\r\nContainer Name : CanGeneral\r\nMultiplicity : 1\r\nScope / Dependency : This container contains the parameters related each CAN \r\nDriver Unit.");
		txtpnModuleNameCan.setBounds(0, 0, 277, 567);
		panel.add(txtpnModuleNameCan);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_1, "name_367386905579200");
		panel_1.setLayout(null);

		JTextPane txtpnSwsItemEcuccan = new JTextPane();
		txtpnSwsItemEcuccan.setText("SWS Item ECUC_Can_00354 : \r\nContainer Name : CanController \r\nDescription : This container contains the configuration parameters of the CAN \r\ncontroller(s).\r");
		txtpnSwsItemEcuccan.setBounds(0, 0, 275, 569);
		panel_1.add(txtpnSwsItemEcuccan);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_2, "name_368579468044600");
		panel_2.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_1 = new JTextPane();
		txtpnSwsItemEcuccan_1.setText("SWS Item ECUC_Can_00314 :\r\nName CanBusoffProcessing\r\nParent Container : CanController\r\nDescription : Enables / disables API Can_MainFunction_BusOff() for handling busoff events in polling mode.\r\nMultiplicity : 1\r\nType : EcucEnumerationParamDef\r\nRange: INTERRUPT Interrupt Mode of operation.\r\nPOLLING Polling Mode of operation");
		txtpnSwsItemEcuccan_1.setBounds(0, 11, 259, 562);
		panel_2.add(txtpnSwsItemEcuccan_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_3, "name_368838882496100");
		panel_3.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_2 = new JTextPane();
		txtpnSwsItemEcuccan_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_2.setText("SWS Item ECUC_Can_00387 : \r\nContainer Name : CanControllerBaudrateConfig \r\nDescription : This container contains bit timing related configuration parameters of the \r\nCAN controller(s)");
		txtpnSwsItemEcuccan_2.setBounds(0, 0, 277, 559);
		panel_3.add(txtpnSwsItemEcuccan_2);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_4, "name_439763434935100");

		JTextPane txtpnSwsItemEcuccan_3 = new JTextPane();
		txtpnSwsItemEcuccan_3.setText("SWS Item ECUC_Can_00005 : \r\nName : CanControllerBaudRate\r\nParent Container : CanControllerBaudrateConfig\r\nDescription : Specifies the baudrate of the controller in kbps.\r\nMultiplicity : 1\r\nType : EcucIntegerParamDef\r\nRange : 0 .. 2000\r\nDefault value : --\r\nPost-Build Variant Value : true \r\nValue Configuration \r\nClass Pre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / Dependency scope : local\r");
		txtpnSwsItemEcuccan_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_3.setBounds(0, 0, 279, 556);
		panel_4.add(txtpnSwsItemEcuccan_3);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		layeredPane_Desc.add(panel_8, "name_1123783024676099");
		panel_8.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_3_1 = new JTextPane();
		txtpnSwsItemEcuccan_3_1.setText("SWS Item ECUC_Can_00320 : \r\nName CanIndex\r\nParent Container CanGeneral\r\nDescription Specifies the InstanceId of this module instance. If only one instance is \r\npresent it shall have the Id 0.\r\nMultiplicity 1\r\nType EcucIntegerParamDef\r\nRange 0 .. 255\r\nDefault value --\r\nPost-Build Variant Value false");
		txtpnSwsItemEcuccan_3_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_3_1.setBounds(0, 0, 279, 556);
		panel_8.add(txtpnSwsItemEcuccan_3_1);

		JPanel panel_81 = new JPanel();
		panel_81.setBackground(new Color(255, 255, 255));
		layeredPane_Desc.add(panel_81, "name_1123783024676099");
		panel_81.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_3_11 = new JTextPane();
		txtpnSwsItemEcuccan_3_11.setText("SWS Item ECUC_Can_00320 : \r\nName CanIndex\r\nParent Container CanGeneral\r\nDescription Specifies the InstanceId of this module instance. If only one instance is \r\npresent it shall have the Id 0.\r\nMultiplicity 1\r\nType EcucIntegerParamDef\r\nRange 0 .. 255\r\nDefault value --\r\nPost-Build Variant Value false");
		txtpnSwsItemEcuccan_3_11.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_3_11.setBounds(0, 0, 279, 556);
		panel_81.add(txtpnSwsItemEcuccan_3_11);

		JPanel panel_8_1 = new JPanel();
		panel_8_1.setLayout(null);
		panel_8_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_8_1, "name_175848163455100");

		JTextPane txtpnSwsItemEcuccan_3_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_3_1_1.setText("SWS Item ECUC_Can_00064 : \r\nName CanDevErrorDetect\r\nParent Container CanGeneral\r\nDescription Switches the development error detection and notification on or off.\r\n true: detection and notification is enabled.\r\n false: detection and notification is disabled.\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local\r");
		txtpnSwsItemEcuccan_3_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_3_1_1.setBounds(0, 0, 279, 556);
		panel_8_1.add(txtpnSwsItemEcuccan_3_1_1);

		JPanel panel_8_1_1 = new JPanel();
		panel_8_1_1.setLayout(null);
		panel_8_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_8_1_1, "name_176135882991800");

		JTextPane txtpnSwsItemEcuccan_3_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_3_1_1_1.setText("SWS Item ECUC_Can_00095 : \r\nName CanMultiplexedTransmission\r\nParent Container CanGeneral\r\nDescription Specifies if multiplexed transmission shall be supported.ON or OFF\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: ECU\r\ndependency: CAN Hardware Unit supports multiplexed transmission");
		txtpnSwsItemEcuccan_3_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_3_1_1_1.setBounds(0, 0, 279, 556);
		panel_8_1_1.add(txtpnSwsItemEcuccan_3_1_1_1);

		JPanel panel_8_1_1_1 = new JPanel();
		panel_8_1_1_1.setLayout(null);
		panel_8_1_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_8_1_1_1, "name_177688299772800");

		JTextPane txtpnSwsItemEcuccan_3_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_3_1_1_1_1.setText("SWS Item ECUC_Can_00483 : \r\nName CanPublicIcomSupport\r\nParent Container CanGeneral\r\nDescription Selects support of Pretended Network features in Can driver.\r\nTrue: Enabled\r\nFalse: Disabled\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time -Post-build time --\r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_3_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		txtpnSwsItemEcuccan_3_1_1_1_1.setBounds(0, 0, 279, 556);
		panel_8_1_1_1.add(txtpnSwsItemEcuccan_3_1_1_1_1);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_9, "name_178035043954200");

		JTextPane txtpnSwsItemEcuccan_4 = new JTextPane();
		txtpnSwsItemEcuccan_4.setText("SWS Item ECUC_Can_00482 : \r\nName CanSetBaudrateApi\r\nParent Container CanGeneral\r\nDescription The support of the Can_SetBaudrate API is optional.\r\nIf this parameter is set to true the Can_SetBaudrate API shall be \r\nsupported. Otherwise the API is not supported.\r\nMultiplicity 0..1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nPost-Build Variant \r\nMultiplicity false \r\nPost-Build Variant Value false \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_4.setBounds(0, 0, 277, 567);
		panel_9.add(txtpnSwsItemEcuccan_4);

		JPanel panel_9_1 = new JPanel();
		panel_9_1.setLayout(null);
		panel_9_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_9_1, "name_178261683881700");

		JTextPane txtpnSwsItemEcuccan_4_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1.setText("SWS Item ECUC_Can_00106 : \r\nName CanVersionInfoApi\r\nParent Container CanGeneral\r\nDescription Switches the Can_GetVersionInfo() API ON or OFF.\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local\r");
		txtpnSwsItemEcuccan_4_1.setBounds(0, 0, 277, 567);
		panel_9_1.add(txtpnSwsItemEcuccan_4_1);

		JTree tree_1 = new JTree();
		tree_1.setVisibleRowCount(30);
		tree_1.setShowsRootHandles(true);
		tree_1.setOpaque(false);
		tree_1.setForeground(Color.WHITE);
		tree_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		tree_1.setBorder(null);
		tree_1.setBackground(new Color(1, 22, 39));
		tree_1.setAutoscrolls(true);
		layeredPane_Desc.add(tree_1, "name_178550018928100");

		JPanel panel_9_1_1 = new JPanel();
		panel_9_1_1.setLayout(null);
		panel_9_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_9_1_1, "name_178550459406000");

		JTextPane txtpnSwsItemEcuccan_4_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1.setText("SWS Item ECUC_Can_00355 : \r\nName CanMainFunctionBusoffPeriod\r\nParent Container CanGeneral\r\nDescription This parameter describes the period for cyclic call to \r\nCan_MainFunction_Busoff. Unit is seconds.\r\nMultiplicity 0..1\r\nType EcucFloatParamDef\r\nRange ]0 .. INF[\r\nDefault value --\r\nPost-Build Variant \r\nMultiplicity false \r\nPost-Build Variant Value false \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency");
		txtpnSwsItemEcuccan_4_1_1.setBounds(0, 0, 277, 567);
		panel_9_1_1.add(txtpnSwsItemEcuccan_4_1_1);

		JPanel panel_9_1_1_1 = new JPanel();
		panel_9_1_1_1.setLayout(null);
		panel_9_1_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_9_1_1_1, "name_178718082405700");

		JTextPane txtpnSwsItemEcuccan_4_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1.setText("SWS Item ECUC_Can_00376 : \r\nName CanMainFunctionModePeriod\r\nParent Container CanGeneral\r\nDescription This parameter describes the period for cyclic call to \r\nCan_MainFunction_Mode. Unit is seconds.\r\nMultiplicity 1\r\nType EcucFloatParamDef\r\nRange ]0 .. INF[\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency ");
		txtpnSwsItemEcuccan_4_1_1_1.setBounds(0, 0, 277, 567);
		panel_9_1_1_1.add(txtpnSwsItemEcuccan_4_1_1_1);

		JPanel panel_9_1_1_1_1 = new JPanel();
		panel_9_1_1_1_1.setLayout(null);
		panel_9_1_1_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_9_1_1_1_1, "name_179226993245900");

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_1.setText("SWS Item ECUC_Can_00357 : \r\nName CanMainFunctionWakeupPeriod\r\nParent Container CanGeneral\r\nDescription This parameter describes the period for cyclic call to \r\nCan_MainFunction_Wakeup. Unit is seconds.\r\nMultiplicity 0..1\r\nType EcucFloatParamDef\r\nRange ]0 .. INF[\r\nDefault value --\r\nPost-Build Variant \r\nMultiplicity false \r\nPost-Build Variant Value false \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency ");
		txtpnSwsItemEcuccan_4_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_9_1_1_1_1.add(txtpnSwsItemEcuccan_4_1_1_1_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_1_1, "name_179405049533000");

		JTextPane txtpnSwsItemEcuccan_6 = new JTextPane();
		txtpnSwsItemEcuccan_6.setText("SWS Item ECUC_Can_00113 : \r\nName CanTimeoutDuration\r\nParent Container CanGeneral\r\nDescription Specifies the maximum time for blocking function until a timeout is \r\ndetected. Unit is seconds.\r\nMultiplicity 1\r\nType EcucFloatParamDef\r\nRange [1E-6 .. 65.535]\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local");
		txtpnSwsItemEcuccan_6.setBounds(0, 0, 275, 569);
		panel_1_1.add(txtpnSwsItemEcuccan_6);

		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBackground(Color.WHITE);
		layeredPane_Desc.add(panel_1_1_1, "name_179598162438800");

		JTextPane txtpnSwsItemEcuccan_6_1 = new JTextPane();
		txtpnSwsItemEcuccan_6_1.setText("SWS Item ECUC_Can_00434 : \r\nName CanLPduReceiveCalloutFunction\r\nParent Container CanGeneral\r\nDescription This parameter defines the existence and the name of a callout function \r\nthat is called after a successful\r\nreception of a received CAN Rx L-PDU. If this parameter is omitted no \r\ncallout shall take place.\r\nMultiplicity 0..1\r\nType EcucFunctionNameDef\r\nDefault value --\r\nmaxLength --\r\nminLength --\r\nregularExpression --\r\nPost-Build Variant \r\nMultiplicity false \r\nPost-Build Variant Value false \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local\r");
		txtpnSwsItemEcuccan_6_1.setBounds(0, 0, 275, 569);
		panel_1_1_1.add(txtpnSwsItemEcuccan_6_1);

		panel_7 = new JPanel();
		layeredPane_Desc.add(panel_7, "name_1045163634204300");

		JTextPane txtpnSwsItemEcuccan_6_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_6_1_1.setText("SWS Item ECUC_Can_00314 :\r\nName CanBusoffProcessing\r\nParent Container CanController\r\nDescription Enables / disables API Can_MainFunction_BusOff() for handling busoff events in \r\npolling mode.\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange INTERRUPT Interrupt Mode of operation.\r\nPOLLING Polling Mode of operation.\r\nPost-Build Variant \r\nValue false \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / \r\nDependency \r\nscope: local\r");
		panel_7.add(txtpnSwsItemEcuccan_6_1_1);

		JPanel panel_10 = new JPanel();
		layeredPane_Desc.add(panel_10, "name_1047297336125100");
		panel_10.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_7 = new JTextPane();
		txtpnSwsItemEcuccan_7.setText("SWS Item ECUC_Can_00317 : \r\nName CanRxProcessing\r\nParent Container CanController\r\nDescription Enables / disables API Can_MainFunction_Read() for handling PDU reception\r\nevents in polling mode.\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange INTERRUPT Interrupt Mode of operation.\r\nMIXED Mixed Mode of operation\r\nPOLLING Polling Mode of operation.\r\nPost-Build Variant \r\nValue false \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / \r\nDependency \r\nscope: local\r");
		txtpnSwsItemEcuccan_7.setBounds(0, 0, 505, 360);
		panel_10.add(txtpnSwsItemEcuccan_7);

		JPanel panel_11 = new JPanel();
		layeredPane_Desc.add(panel_11, "name_1047689775139700");
		panel_11.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2.setText("SWS Item ECUC_Can_00318 : \r\nName CanTxProcessing\r\nParent Container CanController\r\nDescription Enables / disables API Can_MainFunction_Write() for handling PDU transmission \r\nevents in polling mode.\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange INTERRUPT Interrupt Mode of operation.\r\nMIXED Mixed Mode of operation\r\nPOLLING Polling Mode of operation.\r\nPost-Build Variant \r\nValue false \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / \r\nDependency \r\nscope: local");
		txtpnSwsItemEcuccan_4_1_1_1_2.setBounds(0, 0, 277, 567);
		panel_11.add(txtpnSwsItemEcuccan_4_1_1_1_2);

		JPanel panel_12 = new JPanel();
		layeredPane_Desc.add(panel_12, "name_1047940065045400");
		panel_12.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1.setText("SWS Item ECUC_Can_00319 : \r\nName CanWakeupProcessing\r\nParent Container CanController\r\nDescription Enables / disables API Can_MainFunction_Wakeup() for handling wakeup events \r\nin polling mode.\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange INTERRUPT Interrupt Mode of operation.\r\nPOLLING Polling Mode of operation.\r\nPost-Build Variant \r\nValue false \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / \r\nDependency \r\nscope: local");
		txtpnSwsItemEcuccan_4_1_1_1_2_1.setBounds(0, 0, 277, 567);
		panel_12.add(txtpnSwsItemEcuccan_4_1_1_1_2_1);

		JPanel panel_13 = new JPanel();
		layeredPane_Desc.add(panel_13, "name_1048095911949200");
		panel_13.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1.setText("SWS Item ECUC_Can_00382 : \r\nName CanControllerBaseAddress\r\nParent Container CanController\r\nDescription Specifies the CAN controller base address.\r\nMultiplicity 1\r\nType EcucIntegerParamDef\r\nRange 0 .. 4294967295\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1.setBounds(0, 0, 277, 567);
		panel_13.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1);

		JPanel panel_14 = new JPanel();
		layeredPane_Desc.add(panel_14, "name_1048388200751700");
		panel_14.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1.setText("SWS Item ECUC_Can_00316 : \r\nName CanControllerId\r\nParent Container CanController\r\nDescription This parameter provides the controller ID which is unique in a given CAN \r\nDriver. The value for this parameter starts with 0 and continue without any \r\ngaps.\r\nMultiplicity 1\r\nType EcucIntegerParamDef (Symbolic Name generated for this parameter)\r\nRange 0 .. 255\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1.setBounds(0, 0, 277, 567);
		panel_14.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1);

		JPanel panel_15 = new JPanel();
		layeredPane_Desc.add(panel_15, "name_1048447640260700");
		panel_15.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1.setText("SWS Item ECUC_Can_00315 : \r\nName CanControllerActivation\r\nParent Container CanController\r\nDescription Defines if a CAN controller is used in the configuration.\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_15.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1);

		JPanel panel_16 = new JPanel();
		layeredPane_Desc.add(panel_16, "name_1053110258631500");
		panel_16.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1.setText("SWS Item ECUC_Can_00466 : \r\nName CanWakeupFunctionalityAPI\r\nParent Container CanController\r\nDescription Adds / removes the service Can_CheckWakeup() from the code.\r\nTrue: Can_CheckWakeup can be used. \r\nFalse: Can_CheckWakeup cannot be used.\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local\r\ndependency: H/W should support the wakeup functionality to enable this \r\nparameter.");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_16.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1);

		JPanel panel_17 = new JPanel();
		layeredPane_Desc.add(panel_17, "name_1053178017565300");
		panel_17.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00330 : \r\nName CanWakeupSupport\r\nParent Container CanController\r\nDescription CAN driver support for wakeup over CAN Bus.\r\nMultiplicity 1\r\nType EcucBooleanParamDef\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency ");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_17.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1);

		JPanel panel_18 = new JPanel();
		layeredPane_Desc.add(panel_18, "name_1053466832441800");
		panel_18.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00313 : \r\nName CanCpuClockRef\r\nParent Container CanController\r\nDescription Reference to the CPU clock configuration, which is set in the MCU driver \r\nconfiguration\r\nMultiplicity 1\r\nType Reference to [ McuClockReferencePoint ]\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local\r");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_18.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1);

		JPanel panel_19 = new JPanel();
		layeredPane_Desc.add(panel_19, "name_1053889672260399");
		panel_19.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00359 : \r\nName CanWakeupSourceRef\r\nParent Container CanController\r\nDescription This parameter contains a reference to the Wakeup Source for this \r\ncontroller as defined in the ECU State Manager\r\nImplementation Type: reference to EcuM_WakeupSourceType\r\nMultiplicity 0..1\r\nType Symbolic name reference to [ EcuMWakeupSource ]\r\nPost-Build Variant \r\nMultiplicity false \r\nPost-Build Variant Value false \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: local");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_19.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1);

		JPanel panel_20 = new JPanel();
		layeredPane_Desc.add(panel_20, "name_1054158666090600");
		panel_20.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00323 : \r\nName CanHandleType\r\nParent Container CanHardwareObject\r\nDescription Specifies the type (Full-CAN or Basic-CAN) of a hardware object.\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange BASIC For several L-PDUs are hadled by the \r\nhardware object\r\nFULL For only one L-PDU (identifier) is handled \r\nby the hardware object\r\nPost-Build Variant \r\nValue true \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / \r\nDependency \r\nscope: ECU\r\ndependency: This configuration element is used as information for the CAN \r\nInterface only. The relevant CAN driver configuration is done with the filter mask \r\nand identifier");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_20.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1);

		JPanel panel_21 = new JPanel();
		layeredPane_Desc.add(panel_21, "name_1054206373114500");
		panel_21.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00065 : \r\nName CanIdType\r\nParent Container CanHardwareObject\r\nDescription Specifies whether the IdValue is of type\r\n standard identifier\r\n- extended identifier\r\n- mixed mode\r\nImplementationType: Can_IdType\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange EXTENDED All the CANIDs are of type extended only \r\n(29 bit).\r\nMIXED The type of CANIDs can be both \r\nStandard or Extended.\r\nSTANDARD All the CANIDs are of type standard only \r\n(11bit).\r\nPost-Build Variant \r\nValue true \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / \r\nDependency \r\nscope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_21.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_22 = new JPanel();
		layeredPane_Desc.add(panel_22, "name_1054210285525200");
		panel_22.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00327 : \r\nName CanObjectType\r\nParent Container CanHardwareObjec\r\nDescription Specifies if the HardwareObject is used as Transmit or as Receive object\r\nMultiplicity 1\r\nType EcucEnumerationParamDef\r\nRange RECEIVE Receive HOH\r\nTRANSMIT Transmit HOH\r\nPost-Build Variant \r\nValue true \r\nValue \r\nConfiguration \r\nClass \r\nPre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / \r\nDependency \r\nscope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_22.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_23 = new JPanel();
		layeredPane_Desc.add(panel_23, "name_1054212869092400");
		panel_23.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00485 : \r\nName CanFdPaddingValue\r\nParent Container CanHardwareObject\r\nDescription Specifies the value which is used to pad unspecified data in CAN FD \r\nframes > 8 bytes for transmission. This is necessary due to the discrete \r\npossible values of the DLC if > 8 bytes.\r\nIf the length of a PDU which was requested to be sent does not match the \r\nallowed DLC values, the remaining bytes up to the next possible value \r\nshall be padded with this value.\r\nMultiplicity 0..1\r\nType EcucIntegerParamDef\r\nRange 0 .. 255\r\nDefault value 0\r\nPost-Build Variant \r\nMultiplicity true\r\nPost-Build Variant Value true \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nValue Configuration Class Pre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_23.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_24 = new JPanel();
		layeredPane_Desc.add(panel_24, "name_1054216189233599");
		panel_24.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00467 : \r\nName CanHwObjectCount\r\nParent Container CanHardwareObject\r\nDescription Number of hardware objects used to implement one HOH. In case of a \r\nHRH this parameter defines the number of elements in the hardware FIFO \r\nor the number of shadow buffers, in case of a HTH it defines the number of \r\nhardware objects used for multiplexed transmission or for a hardware FIFO \r\nused by a FullCAN HTH.\r\nMultiplicity 1\r\nType EcucIntegerParamDef\r\nRange 1 .. 65535\r\nDefault value 1\r\nPost-Build Variant \r\nMultiplicity true \r\nPost-Build Variant Value true \r\nMultiplicity Configuration Pre-compile time X VARIANT-PRE-COMPILE\r\nClass Link time --\r\nPost-build time X VARIANT-POST-BUILD \r\nValue Configuration Class Pre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_24.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_25 = new JPanel();
		layeredPane_Desc.add(panel_25, "name_1054218621936100");
		panel_25.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00326 : \r\nName CanObjectId\r\nParent Container CanHardwareObject\r\nDescription Holds the handle ID of HRH or HTH. The value of this parameter is unique \r\nin a given CAN Driver, and it should start with 0 and continue without any \r\ngaps.\r\nThe HRH and HTH Ids share a common ID range.\r\nExample: HRH0-0, HRH1-1, HTH0-2, HTH1-3\r\nMultiplicity 1\r\nType EcucIntegerParamDef (Symbolic Name generated for this parameter)\r\nRange 0 .. 65535\r\nDefault value --\r\nPost-Build Variant Value false \r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_25.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_26 = new JPanel();
		layeredPane_Desc.add(panel_26, "name_1054221340987199");
		panel_26.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00490 : \r\nName CanHardwareObjectUsesPolling\r\nParent Container CanHardwareObject\r\nDescription Enables polling of this hardware object.\r\nMultiplicity 0..1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nScope / Dependency dependency: This parameter shall exist if \r\nCanRxProcessing/CanTxProcessing is set to Mixed.");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_26.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_27 = new JPanel();
		layeredPane_Desc.add(panel_27, "name_1054223852859900");
		panel_27.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00486 : \r\nName CanTriggerTransmitEnable\r\nParent Container CanHardwareObject\r\nDescription This parameter defines if or if not Can supports the trigger-transmit API for \r\nthis handle.\r\nMultiplicity 0..1\r\nType EcucBooleanParamDef\r\nDefault value false\r\nValue Configuration Class Pre-compile time X All Variants \r\nLink time --\r\nPost-build time --\r\nScope / Dependency scope: ECU");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_27.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_28 = new JPanel();
		layeredPane_Desc.add(panel_28, "name_1054226292879600");
		panel_28.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00322 : \r\nName CanControllerRef\r\nParent Container CanHardwareObject\r\nDescription Reference to CAN Controller to which the HOH is associated to.\r\nMultiplicity 1\r\nType Reference to [ CanController ]\r\nPost-Build Variant Value true \r\nValue Configuration Class Pre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / Dependency scope: loca");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_28.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);

		JPanel panel_29 = new JPanel();
		layeredPane_Desc.add(panel_29, "name_1054229445270000");
		panel_29.setLayout(null);

		JTextPane txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1 = new JTextPane();
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setText("SWS Item ECUC_Can_00438 : \r\nName CanMainFunctionRWPeriodRef\r\nParent Container CanHardwareObject\r\nDescription Reference to CanMainFunctionPeriod\r\nMultiplicity 0..1\r\nType Reference to [ CanMainFunctionRWPeriods ]\r\nPost-Build Variant \r\nMultiplicity true \r\nPost-Build Variant Value true \r\nMultiplicity Configuration \r\nClass \r\nPre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nValue Configuration Class Pre-compile time X VARIANT-PRE-COMPILE \r\nLink time --\r\nPost-build time X VARIANT-POST-BUILD \r\nScope / Dependency scope: loca\r\nIncluded Containers \r\nContainer Name Multiplicity Scope / Dependency \r\nCanHwFilter 0..* This container is only valid for HRHs and contains the \r\nconfiguration (parameters) of one hardware filter.\r\nCanTTHardwareObjectTrigge\r\nr \r\n0..* \r\nCanTTHardwareObjectTrigger is specified in the SWS \r\nTTCAN and contains the configuration (parameters) of \r\nTTCAN triggers for Hardware Objects, which are additional to \r\nthe configuration (parameters) of CAN Hardware Objects.\r\nThis container is only included and valid if TTCAN is \r\nsupported by the controller and, enabled (see \r\nCanSupportTTCANRef, ECUC_Can_00430), and used");
		txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1.setBounds(0, 0, 277, 567);
		panel_29.add(txtpnSwsItemEcuccan_4_1_1_1_2_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1_1);


		// Add a ComponentListener to resize the image when the label is resized
		JLabel lblNewLabel_4 = new JLabel("");
		try {
			// Load the original image from the resource stream
			BufferedImage originalImage = ImageIO.read(Nextwork.class.getResourceAsStream("/Images/Amtronics_Logo-removebg-preview.png"));
			// Get the dimensions of the label
			int labelWidth = 276; 
			int labelHeight = 269; 
			// Resize the image to fit the label size
			Image resizedImage = originalImage.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
			// Create a new ImageIcon with the resized image and set it as the label's icon
			lblNewLabel_4.setIcon(new ImageIcon(resizedImage));
		} catch (IOException e) {
			e.printStackTrace();
		}
		lblNewLabel_4.setBounds(1317, 12, 276, 269);
		getContentPane().add(lblNewLabel_4);

		txtProperties = new JTextField();
		txtProperties.setHorizontalAlignment(SwingConstants.CENTER);
		txtProperties.setText("PROPERTIES");
		txtProperties.setBounds(1315, 283, 278, 36);
		getContentPane().add(txtProperties);
		txtProperties.setColumns(10);
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(10, 622, 451, 213);
		getContentPane().add(scrollPane_1);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		scrollPane_1.setViewportView(tabbedPane);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Console", null, panel_5, null);
		panel_5.setLayout(null);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_3.setBounds(460, 620, 426, 217);
		getContentPane().add(scrollPane_3);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		scrollPane_3.setViewportView(tabbedPane_1);
/************************************************* ERROR RESOLVE FUNCTION START***********************************************************************/
//DESCRIPTION: The errors which appears in Validate Tab are being resolved using the mouse click function(Double click) in the Text area present in the Validate Tab.
		JTextArea textArea = new JTextArea();
		textArea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) { // Check for double-click
					int offset = textArea.viewToModel(e.getPoint()); // Get the clicked position in the JTextArea
					int line;
					try {
						line = textArea.getLineOfOffset(offset); // Get the line number from the offset
						int start = textArea.getLineStartOffset(line); // Get the start offset of the clicked line
						int end = textArea.getLineEndOffset(line); // Get the end offset of the clicked line
						String errorMessage = textArea.getText(start, end - start).trim(); // Extract the error message

						Border errorBorder = BorderFactory.createLineBorder(Color.RED, 2);
						boolean isErrorBorderShown = false;

						// Navigate based on the error message
						switch (errorMessage) {
						case "- Please select a valid option for CanBusoffProcessing":
							comboBox.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox.setBorder(null); // Remove the error border
								}
							});
							timer.setRepeats(false); // Set to execute only once
							timer.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);
							break;

						case "- Please select a valid option for CanRxProcessing":
							comboBox_1.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer1 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox_1.setBorder(null); // Remove the error border
								}
							});
							timer1.setRepeats(false); // Set to execute only once
							timer1.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);
							break;

						case "- Please select a valid option for CanTxProcessing":
							comboBox_1_1.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer2 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox_1_1.setBorder(null); // Remove the error border
								}
							});
							timer2.setRepeats(false); // Set to execute only once
							timer2.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);
							break;

						case "- Please select a valid option for CanWakeupProcessing":
							comboBox_1_2.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer3 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox_1_2.setBorder(null); // Remove the error border
								}
							});
							timer3.setRepeats(false); // Set to execute only once
							timer3.start(); // Start the timer
							break;

						case "- CanControllerBaseAddress is not filled, Refer MicroController Data sheet for CanControllerBaseAddress":
							textField_1.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer4 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_1.setBorder(null); // Remove the error border
								}
							});
							timer4.setRepeats(false); // Set to execute only once
							timer4.start(); // Start the timer
							break;

						case "- CanControllerId is required":
							textField_2.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer5 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_2.setBorder(null); // Remove the error border
								}
							});
							timer5.setRepeats(false); // Set to execute only once
							timer5.start(); // Start the timer
							break;

						case "- CanControllerDefaultBaudrate is required":
							textField_11.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer6 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_11.setBorder(null); // Remove the error border
								}
							});
							timer6.setRepeats(false); // Set to execute only once
							timer6.start(); // Start the timer
							isErrorBorderShown = true; // Set the flag to true

							break;
						case "- CanControllerEcucPartitionRef is required":
							textField_12.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer7 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_12.setBorder(null); // Remove the error border
								}
							});
							timer7.setRepeats(false); // Set to execute only once
							timer7.start(); // Start the timer
							break;
						case "- CanCpuClockRef is required":
							textField_13.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer8 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_13.setBorder(null); // Remove the error border
								}
							});
							timer8.setRepeats(false); // Set to execute only once
							timer8.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);
							break;
						case "- CanWakeupSourceRef is required":
							textField_14.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer9 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_14.setBorder(null); // Remove the error border
								}
							});
							timer9.setRepeats(false); // Set to execute only once
							timer9.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);	
							break;
						case "- CanControllerActivation checkbox must be selected":
							chckbxNewCheckBox.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer10 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									chckbxNewCheckBox.setBorder(null); // Remove the error border
								}
							});
							timer10.setRepeats(false); // Set to execute only once
							timer10.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);
							break;

						case "- CanWakeupFunctionalityAPI checkbox must be selected":
							chckbxNewCheckBox_1.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer11 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									chckbxNewCheckBox_1.setBorder(null); // Remove the error border
								}
							});
							timer11.setRepeats(false); // Set to execute only once
							timer11.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(true);
							break;
						case "- CanWakeupSupport checkbox must be selected":
							chckbxNewCheckBox_2.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer12 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									chckbxNewCheckBox_2.setBorder(null); // Remove the error border
								}
							});
							timer12.setRepeats(false); // Set to execute only once
							timer12.start(); // Start the timer
							break;
						}
						CanGeneral.setVisible(false);
						CanHardwareObjectPanel.setVisible(false);
						CanControllerPanel.setVisible(true);



						switch (errorMessage) {

						case "- Please select a valid option for CanHandleType":
							comboBox_2.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer13 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox_2.setBorder(null); // Remove the error border
								}
							});
							timer13.setRepeats(false); // Set to execute only once
							timer13.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							break;
						case "- Please select a valid option for CanIdType":
							comboBox_2_1.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer15 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox_2_1.setBorder(null); // Remove the error border
								}
							});
							timer15.setRepeats(false); // Set to execute only once
							timer15.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							break;
						case "- Please select a valid option for CanObjectType":
							comboBox_2_2.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer16 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									comboBox_2_2.setBorder(null); // Remove the error border
								}
							});
							timer16.setRepeats(false); // Set to execute only once
							timer16.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							break;

						case "- CanFdPaddingValue is required":
							textField.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer17 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField.setBorder(null); // Remove the error border
								}
							});
							timer17.setRepeats(false); // Set to execute only once
							timer17.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanControllerRef is required":
							textField_16.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer18 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_16.setBorder(null); // Remove the error border
								}
							});
							timer18.setRepeats(false); // Set to execute only once
							timer18.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanMainFunctionRWPeriodRef is required":
							textField_15.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer19 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_15.setBorder(null); // Remove the error border
								}
							});
							timer19.setRepeats(false); // Set to execute only once
							timer19.start(); // Start the timer
							CanGeneral.setVisible(false);
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							break;

						case "- CanHardwareObjectUsesPolling checkbox must be selected":
						case "- CanTriggerTransmitEnable checkbox must be selected":
							CanHardwareObjectPanel.setVisible(true);
							CanControllerPanel.setVisible(false);
							CanGeneral.setVisible(false);

							break;
						}

						switch (errorMessage) {

						case "- CanIndex is required":
							textField_18.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer20 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_18.setBorder(null); // Remove the error border
								}
							});
							timer20.setRepeats(false); // Set to execute only once
							timer20.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanMainFunctionBusoffPeriod is required":
							textField_19.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer21 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_19.setBorder(null); // Remove the error border
								}
							});
							timer21.setRepeats(false); // Set to execute only once
							timer21.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanMainFunctionModePeriod is required":
							textField_20.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer22 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_20.setBorder(null); // Remove the error border
								}
							});
							timer22.setRepeats(false); // Set to execute only once
							timer22.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanMainFunctionWakeupPeriod is required":
							textField_21.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer23 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_21.setBorder(null); // Remove the error border
								}
							});
							timer23.setRepeats(false); // Set to execute only once
							timer23.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanTimeoutDuration is required":
							textField_22.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer24 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_22.setBorder(null); // Remove the error border
								}
							});
							timer24.setRepeats(false); // Set to execute only once
							timer24.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanLPduReceiveCalloutFunction is required":
							textField_23.setBorder(errorBorder);

							// Us e a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer25 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_23.setBorder(null); // Remove the error border
								}
							});
							timer25.setRepeats(false); // Set to execute only once
							timer25.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanEcucPartitionRef is required":
							textField_24.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer26 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_24.setBorder(null); // Remove the error border
								}
							});
							timer26.setRepeats(false); // Set to execute only once
							timer26.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanOsCounterRef is required":
							textField_25.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer27 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_25.setBorder(null); // Remove the error border
								}
							});
							timer27.setRepeats(false); // Set to execute only once
							timer27.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanSupportTTCANRef is required":
							textField_26.setBorder(errorBorder);

							// Use a Timer to remove the border after a delay (e.g., 2 seconds)
							Timer timer28 = new Timer(2000, new ActionListener() {
								@Override
								public void actionPerformed(ActionEvent e) {
									textField_26.setBorder(null); // Remove the error border
								}
							});
							timer28.setRepeats(false); // Set to execute only once
							timer28.start(); // Start the timer
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
							break;
						case "- CanDevErrorDetect checkbox must be selected":
						case "- CanMultiplexedTransmission checkbox must be selected":
						case "- CanPublicIcomSupport checkbox must be selected":
						case "- CanSetBaudrateApi checkbox must be selected":
						case "- CanVersionInfoApi checkbox must be selected":
							CanGeneral.setVisible(true);
							CanHardwareObjectPanel.setVisible(false);
							CanControllerPanel.setVisible(false);
						}

					} catch (BadLocationException ex) {
						ex.printStackTrace();
					}
				}
			}
		});

		tabbedPane_1.addTab("Validate", null, textArea, null);
/************************************************* ERROR RESOLVE FUNCTION END***********************************************************************/


		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(884, 618, 430, 217);
		getContentPane().add(scrollPane_4);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		scrollPane_4.setViewportView(tabbedPane_2);

		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("Generate", null, panel_6, null);

		lblNewLabel_4.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent e) {
				JLabel label = (JLabel) e.getComponent();
				Image image = ((ImageIcon) label.getIcon()).getImage();
				int labelWidth = label.getWidth();
				int labelHeight = label.getHeight();
				Image resizedImage = image.getScaledInstance(labelWidth, labelHeight, Image.SCALE_SMOOTH);
				ImageIcon resizedIcon = new ImageIcon(resizedImage);
				label.setIcon(resizedIcon);
			}
		});


		//Multiple Jpanels appears when you single click on the subnodes respectively, All the jpanels and its functional codes
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Check if it's a double-click event/ Single click
				if (e.getClickCount() == 1) {
					// Get the selected tree node
					TreePath path = tree.getPathForLocation(e.getX(), e.getY());
					if (path != null) {
						DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();
						if (selectedNode != null) {
							String nodeText = selectedNode.toString();


							// Check which node was double-clicked and perform the action (Shows the Panel)
							if (nodeText.equals("CanController_00")) {
								// Set the visibility of panels accordingly
								CanControllerPanel.setVisible(true);
								CanHardwareObjectPanel.setVisible(false);
								BaudrateConfigPanel.setVisible(false);
								BaudrateConfigDisplayPanel.setVisible(false);
								CanControllerDisplayPanel.setVisible(false);
								CanHardwareDisplay.setVisible(false);
								CanGeneral.setVisible(false);

								panel.setVisible(true);
								panel_1.setVisible(false);
								panel_3.setVisible(false);
								panel_4.setVisible(false);
								panel_81.setVisible(false);

							} else if (nodeText.equals("CanHardwareObject")) {
								// Set the visibility of panels accordingly
								CanControllerPanel.setVisible(false);
								CanHardwareObjectPanel.setVisible(true);
								BaudrateConfigPanel.setVisible(false);
								BaudrateConfigDisplayPanel.setVisible(false);
								CanControllerDisplayPanel.setVisible(false);
								CanHardwareDisplay.setVisible(false);
								panel_81.setVisible(false);
								CanGeneral.setVisible(false);

							} else if (nodeText.equals("CanControllerBaudrateConfig")) {
								// Set the visibility of panels accordingly
								CanControllerPanel.setVisible(false);
								CanHardwareObjectPanel.setVisible(false);
								BaudrateConfigPanel.setVisible(true);
								BaudrateConfigDisplayPanel.setVisible(false);
								CanControllerDisplayPanel.setVisible(false);
								CanHardwareDisplay.setVisible(false);
								panel_4.setVisible(true);
								panel.setVisible(false);
								panel_1.setVisible(false);
								panel_3.setVisible(false);
								panel_81.setVisible(false);
							} else if (nodeText.equals("CanControllerBaudrateConfig_")) {
								// Set the visibility of panels accordingly
								CanControllerPanel.setVisible(false);
								CanHardwareObjectPanel.setVisible(false);
								BaudrateConfigPanel.setVisible(false);
								BaudrateConfigDisplayPanel.setVisible(true);
								CanControllerDisplayPanel.setVisible(false);
								CanHardwareDisplay.setVisible(false);
								panel_3.setVisible(true);
								panel_4.setVisible(false);
								panel.setVisible(false);
								panel_1.setVisible(false);
								panel_81.setVisible(false);
							} else if (nodeText.equals("CanController_")) {
								// Set the visibility of panels accordingly
								CanControllerPanel.setVisible(false);
								CanHardwareObjectPanel.setVisible(false);
								BaudrateConfigPanel.setVisible(false);
								BaudrateConfigDisplayPanel.setVisible(false);
								CanControllerDisplayPanel.setVisible(true);
								CanHardwareDisplay.setVisible(false);
								panel_1.setVisible(true);
								panel_3.setVisible(false);
								panel_4.setVisible(false);
								panel.setVisible(false);
								panel_81.setVisible(false);
							} else if (nodeText.equals("CanHardwareObject_")) {
								// Set the visibility of panels accordingly
								CanControllerPanel.setVisible(false);
								CanHardwareObjectPanel.setVisible(false);
								BaudrateConfigPanel.setVisible(false);
								BaudrateConfigDisplayPanel.setVisible(false);
								CanControllerDisplayPanel.setVisible(false);
								CanHardwareDisplay.setVisible(true);
								panel_81.setVisible(false);
								CanGeneral.setVisible(false);

							} else if (nodeText.equals("CanGeneral")) {
								// Set the visibility of panels accordingly
								CanGeneral.setVisible(true);
								CanControllerPanel.setVisible(false);
								CanHardwareObjectPanel.setVisible(false);
								BaudrateConfigPanel.setVisible(false);
								BaudrateConfigDisplayPanel.setVisible(false);
								CanControllerDisplayPanel.setVisible(false);
								CanHardwareDisplay.setVisible(false);
								panel_81.setVisible(false);
							} 

							else {

								// Handle other Panel nodes if needed 
							}
						}
					}
				}
			}
		});
/************************************************* SWITCH BETWEEN PANELS START***********************************************************************/
//DESCRIPTION: Switch between Panels and its properties scrollpane (Properties section)
		lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_3.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_4.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_5.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_6.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_7.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_8.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_9.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_10.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});
		lblNewLabel_2_11.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(true);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
			}
		});

		lblNewLabel_1_1.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(true);
			}
		});

		lblNewLabel_1_2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(true);
			}
		});

		lblNewLabel_1_3.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(true);
			}
		});

		lblNewLabel_1_4.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(true);
			}
		});
		lblNewLabel_1_5.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(true);
			}
		});

		lblNewLabel_1_6.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(true);
			}
		});

		lblNewLabel_1_7.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(true);
			}
		});

		lblNewLabel_1_8.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(true);
			}
		});

		lblNewLabel_1_9.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(true);
			}
		});

		lblNewLabel_1_12.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(true);
			}
		});


		lblNewLabel_1_13.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(true);
			}
		});

		lblNewLabel_1_13.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(false);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(true);
			}
		});

		lblNewLabel.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(true);
			}
		});

		lblCanidtype.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(true);

			}
		});
		lblCanobjecttype.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(true);
			}
		});

		lblCanfdpaddingvalue.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(true);
			}
		});

		lblCanhwobjectcount.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(false);
				panel_24.setVisible(true);
			}
		});

		lblCanobjectid.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(false);
				panel_24.setVisible(false);
				panel_25.setVisible(true);
			}
		});

		lblCanfdpaddingvalue_1.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(false);
				panel_24.setVisible(false);
				panel_25.setVisible(false);
				panel_26.setVisible(true);
			}
		});

		lblCanfdpaddingvalue_2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(false);
				panel_24.setVisible(false);
				panel_25.setVisible(false);
				panel_26.setVisible(false);
				panel_27.setVisible(true);

			}
		});
		lblCanfdpaddingvalue_3.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(false);
				panel_24.setVisible(false);
				panel_25.setVisible(false);
				panel_26.setVisible(false);
				panel_27.setVisible(false);
				panel_28.setVisible(true);

			}
		});

		lblCanfdpaddingvalue_4.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseClicked(MouseEvent e) {
				// Set the visibility of panel_8 to true and others to false
				panel_81.setVisible(false);
				panel_8_1.setVisible(false);
				panel_8_1_1.setVisible(false);
				panel_8_1_1_1.setVisible(false);
				panel_9.setVisible(false);
				panel_9_1.setVisible(false);
				panel_9_1_1.setVisible(false);
				panel_9_1_1_1.setVisible(false);
				panel_9_1_1_1_1.setVisible(false);
				panel_1_1.setVisible(false);
				panel_1_1_1.setVisible(false);
				CanControllerPanel.setVisible(false);
				CanHardwareObjectPanel.setVisible(true);
				BaudrateConfigPanel.setVisible(false);
				BaudrateConfigDisplayPanel.setVisible(false);
				CanControllerDisplayPanel.setVisible(false);
				CanHardwareDisplay.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				panel_7.setVisible(false);
				panel_10.setVisible(false);
				panel_11.setVisible(false);
				panel_12.setVisible(false);
				panel_13.setVisible(false);
				panel_14.setVisible(false);
				panel_15.setVisible(false);
				panel_16.setVisible(false);
				panel_17.setVisible(false);
				panel_18.setVisible(false);
				panel_19.setVisible(false);
				panel_20.setVisible(false);
				panel_21.setVisible(false);
				panel_22.setVisible(false);
				panel_23.setVisible(false);
				panel_24.setVisible(false);
				panel_25.setVisible(false);
				panel_26.setVisible(false);
				panel_27.setVisible(false);
				panel_28.setVisible(false);
				panel_29.setVisible(true);

			}
		});
/************************************************* SWITCH BETWEEN PANELS END***********************************************************************/


		JButton btnReload = new JButton("Import");
		btnReload.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnReload.setHorizontalAlignment(SwingConstants.RIGHT);
		btnReload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				importAndSetValuesFromXML();
			}
			String[] variableNames = {
			        "CanBusoffProcessing", "CanRxProcessing", "CanTxProcessing", "CanWakeupProcessing",
			        "CanControllerBaseAddress", "CanControllerId", "CanControllerActivation",
			        "CanWakeupFunctionalityAPI", "CanWakeupSupport", "CanControllerDefaultBaudrate",
			        "CanControllerEcucPartitionRef", "CanCpuClockRef", "CanWakeupSourceRef"
			};

			// Define the getElementValue method
			private String getElementValue(Document doc, String elementName) {
			    NodeList nodeList = doc.getElementsByTagName(elementName);
			    if (nodeList.getLength() > 0) {
			        return nodeList.item(0).getTextContent();
			    }
			    return null;
			}

			private void importAndSetValuesFromXML() {
			    try {
			        String desktopPath = System.getProperty("user.home") + "/Desktop";
			        String filePath = desktopPath + "/CanData.xml";

			        File xmlFile = new File(filePath);
			        if (!xmlFile.exists()) {
			            JOptionPane.showMessageDialog(Nextwork.this, "XML file does not exist.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }

			        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			        Document doc = docBuilder.parse(xmlFile);

			        // Update GUI components based on the XML content
			       			            // Update the corresponding GUI component based on the variable name
			        comboBox.setSelectedItem(getElementValue(doc, "CanBusoffProcessing"));
		            comboBox_1.setSelectedItem(getElementValue(doc, "CanRxProcessing"));
		            comboBox_1_1.setSelectedItem(getElementValue(doc, "CanTxProcessing"));

			        JOptionPane.showMessageDialog(Nextwork.this, "XML file loaded and GUI updated successfully.");
			    } catch (Exception ex) {
			        JOptionPane.showMessageDialog(Nextwork.this, "An error occurred while loading XML file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			        ex.printStackTrace();
			    }
			}

		});
		

		mnNewMenu.add(btnReload);



		// Add a mouse listener to the tree
		tree.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showPopupMenu(e);
				}
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showPopupMenu(e);
				}
			}

			private void showPopupMenu(MouseEvent e) {
				// Get the selected tree node
				TreePath path = tree.getPathForLocation(e.getX(), e.getY());
				if (path != null) {
					DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();

					// Create a popup menu

					JPopupMenu popupMenu = new JPopupMenu();

					if (selectedNode.toString().equals("CanConfigSet")) {
						// Create sub-menus for CanConfigSet
/************************************************* ADD FUNCTION START***********************************************************************/

						JMenu addMenu = new JMenu("Add");
						JMenuItem addSubMenu1 = new JMenuItem("CanController");
						addSubMenu1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								int existingControllerCount = 0;
								int childCount = selectedNode.getChildCount();
								for (int i = 0; i < childCount; i++) {
									DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) selectedNode.getChildAt(i);
									if (childNode.getUserObject().toString().startsWith("CanController")) {
										existingControllerCount++;
									}
								}

								// Create the new CanController node with an incremental number
								String controllerNodeText = "CanController_" + String.format("%02d", existingControllerCount + 0);
								DefaultMutableTreeNode controllerNode = new DefaultMutableTreeNode(controllerNodeText);
								selectedNode.add(controllerNode);

								// Create the CanControllerBaudrateConfig_ and CanControllerBaudrateConfig nodes
								DefaultMutableTreeNode baudrateConfigNode = new DefaultMutableTreeNode("CanControllerBaudrateConfig_");
								controllerNode.add(baudrateConfigNode);
								baudrateConfigNode.add(new DefaultMutableTreeNode("CanControllerBaudrateConfig"));

								((DefaultTreeModel) tree.getModel()).reload(selectedNode);
							}
						});
						addMenu.add(addSubMenu1);

						JMenuItem addSubMenu2 = new JMenuItem("CanHardwareObject");
						addSubMenu2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// Add action logic for submenu 2
								DefaultMutableTreeNode submenu2Node = new DefaultMutableTreeNode("CanHardwareObject");
								selectedNode.add(submenu2Node);
								((DefaultTreeModel) tree.getModel()).reload(selectedNode);
							}
						});
						addMenu.add(addSubMenu2);

						JMenuItem addSubMenu3 = new JMenuItem("CanIcom");
						addSubMenu3.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// Add action logic for submenu 3
								DefaultMutableTreeNode submenu3Node = new DefaultMutableTreeNode("CanIcom");
								selectedNode.add(submenu3Node);
								((DefaultTreeModel) tree.getModel()).reload(selectedNode);
							}
						});
						// Add a MouseListener to the JTree
						tree.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								// Get the selected tree node
								TreePath path = tree.getPathForLocation(e.getX(), e.getY());
								if (path != null) {
									DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();
									String selectedNodeText = selectedNode.getUserObject().toString();


									if (selectedNodeText.startsWith("CanController_0")) {
										// Show the CanControllerPanel for any node starting with "CanController_"
										CanControllerPanel.setVisible(true);
									} else {
										// Hide the CanControllerPanel for other nodes
										CanControllerPanel.setVisible(false);
									}

								}
							} 
						});

/************************************************* ADD FUNCTION END***********************************************************************/

						addMenu.add(addSubMenu3);
						JMenuItem renameMenuItem = new JMenuItem("Rename");
						renameMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// Get the selected tree node
								TreePath path = tree.getSelectionPath();
								if (path != null) {
									DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();

									// Prompt for a new name
									String newName = JOptionPane.showInputDialog(null, "Enter a new name", selectedNode.toString());
									if (newName != null && !newName.isEmpty()) {
										selectedNode.setUserObject(newName);

										// Update the tree model
										((DefaultTreeModel) tree.getModel()).nodeChanged(selectedNode);
									}
								}
							}
						});

						JMenuItem deleteMenuItem = new JMenuItem("Delete");
						deleteMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// Add action logic for deleting a node
								DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) selectedNode.getParent();

								// Check if the selected node is one of the nodes that should not be deleted
								String nodeText = selectedNode.toString();
								if (parentNode != null && !isNodeExcluded(nodeText)) {
									deleteNode(selectedNode);

									// Update the tree model
									((DefaultTreeModel) tree.getModel()).reload(parentNode);
								}
							}

							// Custom method to check if the node should not be deleted
							private boolean isNodeExcluded(String nodeText) {
								// List of nodes to be excluded from deletion
								String[] excludedNodes = {
										"ECU Configuration",
										"CanControllerBaudrateConfig_",
										"CanConfigSet"
										// Add other node text here that you want to exclude
								};

								// Check if the node's text matches any of the excluded nodes
								for (String excludedNode : excludedNodes) {
									if (nodeText.equals(excludedNode)) {
										return true;
									}
								}
								return false;
							}

							// Recursive method to delete a node and its child nodes (if not excluded)
							private void deleteNode(DefaultMutableTreeNode node) {
								for (int i = node.getChildCount() - 1; i >= 0; i--) {
									DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) node.getChildAt(i);
									String nodeText = childNode.toString();
									if (!isNodeExcluded(nodeText)) {
										deleteNode(childNode);
										node.remove(i);
									}
								}
							}
						});

						popupMenu.add(addMenu);
						popupMenu.add(renameMenuItem);
						popupMenu.add(deleteMenuItem);
						popupMenu.addSeparator();

						popupMenu.show(tree, e.getX(), e.getY());



					} else {
						// Add menu option for ADD
						JMenuItem addMenuItem = new JMenuItem("Add");
						addMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String selectedNodeText = selectedNode.getUserObject().toString();

								if (selectedNodeText.equals("ArtiOs")) {
									selectedNode.add(new DefaultMutableTreeNode("ArtiOsClass"));
									selectedNode.add(new DefaultMutableTreeNode("ArtiOsInstance"));
									selectedNode.add(new DefaultMutableTreeNode("ArtiOsTaskClass"));
									selectedNode.add(new DefaultMutableTreeNode("ArtiOsTaskInstance"));
								} else if (selectedNodeText.equals("Bswm")) {
									selectedNode.add(new DefaultMutableTreeNode("BswmConfig"));
									selectedNode.add(new DefaultMutableTreeNode("BswmGenral"));
								} else if (selectedNodeText.equals("CanIf")) {
									selectedNode.add(new DefaultMutableTreeNode("CanIfCtrlDruCfg"));
									selectedNode.add(new DefaultMutableTreeNode("CanIfDispatchCfg"));
									selectedNode.add(new DefaultMutableTreeNode("CanIfInitCfg"));
									selectedNode.add(new DefaultMutableTreeNode("CanIfPrivateCfg"));
									selectedNode.add(new DefaultMutableTreeNode("CanIfPubliCfg"));
									selectedNode.add(new DefaultMutableTreeNode("CanIfTrcvCfg"));
								} else if (selectedNodeText.equals("CanSm")) {
									selectedNode.add(new DefaultMutableTreeNode("CanSmConfiguration"));
									selectedNode.add(new DefaultMutableTreeNode("CanSmGeneral"));
								} else if (selectedNodeText.equals("CanTp")) {
									selectedNode.add(new DefaultMutableTreeNode("CanTpConfig"));
									selectedNode.add(new DefaultMutableTreeNode("CanTpGeneral"));
								} else if (selectedNodeText.equals("CanTrcv ")) {
									selectedNode.add(new DefaultMutableTreeNode("CanTrcvConfiguration"));
									selectedNode.add(new DefaultMutableTreeNode("CanTrcvGeneral"));
								} else if (selectedNodeText.equals("Cdd")) {
									selectedNode.add(new DefaultMutableTreeNode("CddComStackContribution"));
									selectedNode.add(new DefaultMutableTreeNode("CddEcucPartitionInteraction"));
									selectedNode.add(new DefaultMutableTreeNode("CddGeneral"));
									selectedNode.add(new DefaultMutableTreeNode("CddGlobalTimeContribution"));
								} else if (selectedNodeText.equals("Com")) {
									selectedNode.add(new DefaultMutableTreeNode("ComMConfig"));
									selectedNode.add(new DefaultMutableTreeNode("ComMGeneral"));
								} else if (selectedNodeText.equals("Dcm")) {
									selectedNode.add(new DefaultMutableTreeNode("DcmConfigSet"));
									selectedNode.add(new DefaultMutableTreeNode("DcmGeneral"));
								} else if (selectedNodeText.equals("Dem")) {
									selectedNode.add(new DefaultMutableTreeNode("DemConfigSet"));
									selectedNode.add(new DefaultMutableTreeNode("DemGeneral"));
								} else if (selectedNodeText.equals("Dio")) {
									selectedNode.add(new DefaultMutableTreeNode("DioConfiSet"));
									selectedNode.add(new DefaultMutableTreeNode("DioGenaral"));
								} else if (selectedNodeText.equals("EcuC")) {
									selectedNode.add(new DefaultMutableTreeNode("EcuCConfigSet"));
									selectedNode.add(new DefaultMutableTreeNode("EcuCHardware"));
									selectedNode.add(new DefaultMutableTreeNode("EcuCPartitionCollection"));
									selectedNode.add(new DefaultMutableTreeNode("EcuCPostBuildVariants"));
									selectedNode.add(new DefaultMutableTreeNode("EcuCUnitGroupAssignment"));
									selectedNode.add(new DefaultMutableTreeNode("EcuCVariationResolver"));
								} else if (selectedNodeText.equals("Eth\t")) {
									selectedNode.add(new DefaultMutableTreeNode("EthConfigSet"));
									selectedNode.add(new DefaultMutableTreeNode("EthGeneral"));
								} else if (selectedNodeText.equals("Fee")) {
									selectedNode.add(new DefaultMutableTreeNode("FeeBlockConfiguration"));
									selectedNode.add(new DefaultMutableTreeNode("FeeGeneral"));
									selectedNode.add(new DefaultMutableTreeNode("FeePublishedInformation"));
								} else if (selectedNodeText.equals("IpduM")) {
									selectedNode.add(new DefaultMutableTreeNode("IpduMConfig"));
									selectedNode.add(new DefaultMutableTreeNode("IpduMGeneral"));
									selectedNode.add(new DefaultMutableTreeNode("IpduMPublishedInformation"));
								} else if (selectedNodeText.equals("PduR")) {
									selectedNode.add(new DefaultMutableTreeNode("PduRBswModules"));
									selectedNode.add(new DefaultMutableTreeNode("PduRRoutingPaths"));
								} else if (selectedNodeText.equals("Can\t")) {
									// Check if "CanGeneral" node already exists
									boolean canGeneralExists = false;
									int childCount = selectedNode.getChildCount();
									for (int i = 0; i < childCount; i++) {
										DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) selectedNode.getChildAt(i);
										if (childNode.getUserObject().equals("CanGeneral")) {
											canGeneralExists = true;
											break;
										}
									}

									// Add "CanGeneral" node only if it doesn't already exist
									if (!canGeneralExists) {
										DefaultMutableTreeNode canGeneralNode = new DefaultMutableTreeNode("CanGeneral");
										selectedNode.add(canGeneralNode);
									}
								}

								// Update the tree model
								((DefaultTreeModel) tree.getModel()).reload(selectedNode);
							}
						});
/************************************************* RENAME FUNCTION START***********************************************************************/
//DESCRIPTION: The Rename function performs the RENAME functioanlities  as per the user requirements. 
						JMenuItem renameMenuItem = new JMenuItem("Rename");
						renameMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// Get the selected tree node
								TreePath path = tree.getSelectionPath();
								if (path != null) {
									DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path.getLastPathComponent();

									// Prompt for a new name
									String newName = JOptionPane.showInputDialog(null, "Enter a new name", selectedNode.toString());
									if (newName != null && !newName.isEmpty()) {
										selectedNode.setUserObject(newName);

										// Update the tree model
										((DefaultTreeModel) tree.getModel()).nodeChanged(selectedNode);

									}
/************************************************* RENAME FUNCTION END***********************************************************************/

								}
							}
						});
/************************************************* DELETE FUNCTION START***********************************************************************/
//DESCRIPTION: Delete function cannot be performed
						JMenuItem deleteMenuItem = new JMenuItem("Delete");
						deleteMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								// Add action logic for deleting a node
								DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode) selectedNode.getParent();

								// Check if the selected node is one of the nodes that should not be deleted
								String nodeText = selectedNode.toString();
								if (parentNode != null && !isNodeExcluded(nodeText)) {
									deleteNode(selectedNode);

									// Update the tree model
									((DefaultTreeModel) tree.getModel()).reload(parentNode);
								}
							}

							// Custom method to check if the node should not be deleted
							private boolean isNodeExcluded(String nodeText) {
								// List of nodes to be excluded from deletion
								String[] excludedNodes = {
										"ECU Configuration",
										"CanControllerBaudrateConfig_",
										"CanConfigSet"
										// Add other node text here that you want to exclude
								};

								// Check if the node's text matches any of the excluded nodes
								for (String excludedNode : excludedNodes) {
									if (nodeText.equals(excludedNode)) {
										return true;
									}
								}
								return false;
							}

							// Recursive method to delete a node and its child nodes (if not excluded)
							private void deleteNode(DefaultMutableTreeNode node) {
								for (int i = node.getChildCount() - 1; i >= 0; i--) {
									DefaultMutableTreeNode childNode = (DefaultMutableTreeNode) node.getChildAt(i);
									String nodeText = childNode.toString();
									if (!isNodeExcluded(nodeText)) {
										deleteNode(childNode);
										node.remove(i);
									}
								}
							}
						});
/************************************************* DELETE FUNCTION END***********************************************************************/

						// Create the "Validate" menu item
						JMenuItem validateMenuItem = new JMenuItem("Validate");
						validateMenuItem.setEnabled(false); // Disable "Validate" menu item by default

						tree.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseReleased(MouseEvent e) {
								if (SwingUtilities.isRightMouseButton(e)) {
									int row = tree.getClosestRowForLocation(e.getX(), e.getY());
									tree.setSelectionRow(row);
									DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

									if (selectedNode != null) {
										String nodeLabel = selectedNode.getUserObject().toString();
										if (nodeLabel.equals("CanController_00") ||
												nodeLabel.equals("CanConfigSet") ||
												nodeLabel.equals("CanGeneral") ||
												nodeLabel.equals("CanControllerBaudrateConfig_") ||
												nodeLabel.equals("CanController_") ||
												nodeLabel.equals("CanHardwareObject_") ||
												nodeLabel.equals("CanHardwareObject") ||
												nodeLabel.equals("CanControllerBaudrateConfig")) {
											// Disable the "Validate" menu item for the specified nodes
											validateMenuItem.setEnabled(false);
										} else {
											// Enable the "Validate" menu item for other nodes
											validateMenuItem.setEnabled(true);
										}
									} else {
										// Disable the "Validate" menu item if no node is selected
										validateMenuItem.setEnabled(false);
									}
									popupMenu.show(tree, e.getX(), e.getY());
								}

							}
						});

							validateMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								String CanBusoffProcessing = comboBox.getSelectedItem().toString();
								String CanRxProcessing = comboBox_1.getSelectedItem().toString();
								String CanTxProcessing = comboBox_1_1.getSelectedItem().toString();
								String CanWakeupProcessing = comboBox_1_2.getSelectedItem().toString();
								String CanControllerBaseAddress = textField_1.getText().toString();
								String CanControllerId = textField_2.getText().toString();
								boolean CanControllerActivation = chckbxNewCheckBox.isSelected();
								boolean CanWakeupFunctionalityAPI = chckbxNewCheckBox_1.isSelected();
								boolean CanWakeupSupport = chckbxNewCheckBox_2.isSelected();
								String CanControllerDefaultBaudrate = textField_11.getText().toString();
								String CanControllerEcucPartitionRef = textField_12.getText().toString();
								String CanCpuClockRef = textField_13.getText().toString();
								String CanWakeupSourceRef = textField_14.getText().toString();

								String ShortName = txtCanhardwareobject.getText().toString();
								String CanHandleType = comboBox_2.getSelectedItem().toString();
								String CanIdType = comboBox_2_1.getSelectedItem().toString();
								String CanObjectType = comboBox_2_2.getSelectedItem().toString();
								String CanFdPaddingValue = textField.getText().toString();
								String CanHwObjectCount = textField_9.getText().toString();
								String CanObjectId = textField_10.getText().toString();
								boolean CanHardwareObjectUsesPolling = chckbxNewCheckBox_3.isSelected();
								boolean CanTriggerTransmitEnable = chckbxNewCheckBox_3_1.isSelected();
								String CanControllerRef = textField_16.getText().toString();
								String CanMainFunctionRWPeriodRef = textField_15.getText().toString();

								String ShortName_ = txtCangeneral.getText();
								String CanIndex = textField_18.getText();
								boolean CanDevErrorDetect = chckbxNewCheckBox_4.isSelected();
								boolean CanMultiplexedTransmission = chckbxNewCheckBox_4_1.isSelected();
								boolean CanPublicIcomSupport = chckbxNewCheckBox_4_2.isSelected();
								boolean CanSetBaudrateApi = chckbxNewCheckBox_4_3.isSelected();
								boolean CanVersionInfoApi = chckbxNewCheckBox_4_4.isSelected();
								String CanMainFunctionBusoffPeriod = textField_19.getText();
								String CanMainFunctionModePeriod = textField_20.getText();
								String CanMainFunctionWakeupPeriod = textField_21.getText();
								String CanTimeoutDuration = textField_22.getText();
								String CanLPduReceiveCalloutFunction = textField_23.getText();
								String CanEcucPartitionRef = textField_24.getText();
								String CanOsCounterRef = textField_25.getText();
								String CanSupportTTCANRef = textField_26.getText();

								// Create a StringBuilder to accumulate the error messages
								StringBuilder errorMessages = new StringBuilder();
/************************************************* VALIDATE START***********************************************************************/
//DESCRIPTION: First creates a errorlog file if any errors found, and the Errors are shown in the Validate Tab. Double click function on the Validate tab navigates the usere to the specific location
								//// CanController validation codes
								if (CanBusoffProcessing.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanBusoffProcessing\n");
								}
								if (CanRxProcessing.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanRxProcessing\n");
								}
								if (CanTxProcessing.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanTxProcessing\n");
								}
								if (CanWakeupProcessing.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanWakeupProcessing\n");
								}
								if (CanControllerBaseAddress.isEmpty()) {
									errorMessages.append("- CanControllerBaseAddress is not filled, Refer MicroController Data sheet for CanControllerBaseAddress\n");
								}
								if (CanControllerId.isEmpty()) {
									errorMessages.append("- CanControllerId is required\n");
								}
								if (CanControllerDefaultBaudrate.isEmpty()) {
									errorMessages.append("- CanControllerDefaultBaudrate is required\n");
								}
								if (CanControllerEcucPartitionRef.isEmpty()) {
									errorMessages.append("- CanControllerEcucPartitionRef is required\n");
								}
								if (CanCpuClockRef.isEmpty()) {
									errorMessages.append("- CanCpuClockRef is required\n");
								}
								if (CanWakeupSourceRef.isEmpty()) {
									errorMessages.append("- CanWakeupSourceRef is required\n");
								}
								if (!CanControllerActivation) {
									errorMessages.append("- CanControllerActivation checkbox must be selected\n");
								}
								if (!CanWakeupFunctionalityAPI) {
									errorMessages.append("- CanWakeupFunctionalityAPI checkbox must be selected\n");
								}
								if (!CanWakeupSupport) {
									errorMessages.append("- CanWakeupSupport checkbox must be selected\n");
								}

								String selectedValue = comboBox.getSelectedItem().toString();
								if (selectedValue.equals("NONE")) {
									errorMessages.append("- Please select a valid option\n");
								}

								// CanHardware validation codes
								if (ShortName.isEmpty()) {
									errorMessages.append("- ShortName is required\n");
								}
								if (CanHandleType.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanHandleType\n");
								}
								if (CanIdType.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanIdType\n");
								}
								if (CanObjectType.equals("NONE")) {
									errorMessages.append("- Please select a valid option for CanObjectType\n");
								}
								if (CanFdPaddingValue.isEmpty()) {
									errorMessages.append("- CanFdPaddingValue is required\n");
								}
								if (CanHwObjectCount.isEmpty()) {
									errorMessages.append("- CanHwObjectCount is required\n");
								}
								if (CanObjectId.isEmpty()) {
									errorMessages.append("- CanObjectId is required\n");
								}
								if (CanControllerRef.isEmpty()) {
									errorMessages.append("- CanControllerRef is required\n");
								}
								if (CanMainFunctionRWPeriodRef.isEmpty()) {
									errorMessages.append("- CanMainFunctionRWPeriodRef is required\n");
								}

								// Check the checkbox selections
								if (!CanHardwareObjectUsesPolling) {
									errorMessages.append("- CanHardwareObjectUsesPolling checkbox must be selected\n");
								}
								if (!CanTriggerTransmitEnable) {
									errorMessages.append("- CanTriggerTransmitEnable checkbox must be selected\n");
								}


								// CanGeneral validation codes
								if (CanGeneral.isVisible()) {

									if (ShortName_.isEmpty()) {
										errorMessages.append("- ShortName is required\n");
									}
									if (CanIndex.isEmpty()) {
										errorMessages.append("- CanIndex is required\n");
									}
									if (CanMainFunctionBusoffPeriod.isEmpty()) {
										errorMessages.append("- CanMainFunctionBusoffPeriod is required\n");
									}
									if (CanMainFunctionModePeriod.isEmpty()) {
										errorMessages.append("- CanMainFunctionModePeriod is required\n");
									}
									if (CanMainFunctionWakeupPeriod.isEmpty()) {
										errorMessages.append("- CanMainFunctionWakeupPeriod is required\n");
									}
									if (CanTimeoutDuration.isEmpty()) {
										errorMessages.append("- CanTimeoutDuration is required\n");
									}
									if (CanLPduReceiveCalloutFunction.isEmpty()) {
										errorMessages.append("- CanLPduReceiveCalloutFunction is required\n");
									}
									if (CanEcucPartitionRef.isEmpty()) {
										errorMessages.append("- CanEcucPartitionRef is required\n");
									}
									if (CanOsCounterRef.isEmpty()) {
										errorMessages.append("- CanOsCounterRef is required\n");
									}
									if (CanSupportTTCANRef.isEmpty()) {
										errorMessages.append("- CanSupportTTCANRef is required\n");
									}

									// Add other specific validation checks for the boolean fields if needed

									if (!CanDevErrorDetect) {
										errorMessages.append("- CanDevErrorDetect checkbox must be selected\n");
									}
									if (!CanMultiplexedTransmission) {
										errorMessages.append("- CanMultiplexedTransmission checkbox must be selected\n");
									}
									if (!CanPublicIcomSupport) {
										errorMessages.append("- CanPublicIcomSupport checkbox must be selected\n");
									}
									if (!CanSetBaudrateApi) {
										errorMessages.append("- CanSetBaudrateApi checkbox must be selected\n");
									}
									if (!CanVersionInfoApi) {
										errorMessages.append("- CanVersionInfoApi checkbox must be selected\n");
									}

								}
/************************************************* VALIDATE END***********************************************************************/
								// Display the error messages in a single pop-up dialog
								if (errorMessages.length() > 0) {
									JOptionPane.showMessageDialog(null, errorMessages.toString(), "Validation Errors", JOptionPane.ERROR_MESSAGE);

									// Display the error messages in the text area of the "Validate" tabbed panel
									textArea.setText(errorMessages.toString());

									// Convert error messages to a text file
									String desktopPath = System.getProperty("user.home") + "/Desktop";
									String filePath = desktopPath + "/errorLog.txt";
									saveErrorLogToFile(errorMessages.toString(), filePath);
								}
								else {
									textArea.setText(""); // Clear the text area
									JOptionPane.showMessageDialog(null, "Configuration validated successfully!");
								}

							}


							private void saveErrorLogToFile(String errorLog, String filePath) {
								try {
									// Create a FileWriter to write the error log to a text file
									FileWriter writer = new FileWriter(filePath);

									// Write the error log to the text file
									writer.write(errorLog);

									// Close the writer
									writer.close();

									System.out.println("Error log saved to text file successfully.");
								} catch (IOException ex) {
									System.out.println("An error occurred while saving the error log to a text file: " + ex.getMessage());
									ex.printStackTrace(); // Print the stack trace for detailed error information
								}
								// Add action logic for validating the configuration
								// Implement the validation logic here
								JOptionPane.showMessageDialog(null, "Configuration validated successfully!");

							}
						});
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
						JMenuItem saveMenuItem = new JMenuItem("Save");
						JMenu fileMenu = new JMenu("File");

						saveMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								saveDataToXML();
							}

							private void saveDataToXML() {
								try {

									// Create a new DocumentBuilder
									DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
									DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

									// Create a new Document
									Document doc = docBuilder.newDocument();
									Element canControllerDataElement = doc.createElement("CanData");
									// Create the root element
									JOptionPane.showMessageDialog(null, "XML file saved successfully!");
									
/************************************************* XML CREATION START ***********************************************************************/
//DESCRIPTION: The initiation of structured data setup, where XML files are crafted to organize and store information effectively within your software.
									
									Element arPackagesElement = doc.createElement("AR-PACKAGES");
									doc.appendChild(arPackagesElement);

									// Create the <AR-PACKAGE> element
									Element arPackageElement = doc.createElement("AR-PACKAGE");
									arPackagesElement.appendChild(arPackageElement);

									// Create the <SHORT-NAME> element inside <AR-PACKAGE>
									Element shortNameElement = doc.createElement("SHORT-NAME");
									shortNameElement.setTextContent("AutosarConfigurator");
									arPackageElement.appendChild(shortNameElement);

									// Create the <ELEMENTS> element inside <AR-PACKAGE>
									Element elementsElement = doc.createElement("ELEMENTS");
									arPackageElement.appendChild(elementsElement);

									// Create the <ECUC-MODULE-CONFIGURATION-VALUES> element inside <ELEMENTS>
									Element ecucModuleConfigValuesElement = doc.createElement("ECUC-MODULE-CONFIGURATION-VALUES");
									ecucModuleConfigValuesElement.setAttribute("UUID", "88315b75-2e55-4e07-8a67-e958b2d4694f");
									elementsElement.appendChild(ecucModuleConfigValuesElement);

									// Create the <SHORT-NAME> element inside <ECUC-MODULE-CONFIGURATION-VALUES>
									Element shortNameCanElement = doc.createElement("SHORT-NAME");
									shortNameCanElement.setTextContent("Can");
									ecucModuleConfigValuesElement.appendChild(shortNameCanElement);

									// ... Continue building your XML structure ...

									// Create the <ECUC-CONTAINER-VALUE> element inside <ECUC-MODULE-CONFIGURATION-VALUES>
									Element ecucContainerValueElement = doc.createElement("ECUC-CONTAINER-VALUE");
									ecucContainerValueElement.setAttribute("UUID", "ad4de159-f2be-4bed-986c-6c9d61bc4362");
									ecucModuleConfigValuesElement.appendChild(ecucContainerValueElement);

									Element containersElement = doc.createElement("CONTAINERS");
									// Create the <ECUC-CONTAINER-VALUE> element inside <CONTAINERS>
									Element subContainerElement = doc.createElement("ECUC-CONTAINER-VALUE");
									subContainerElement.setAttribute("UUID", "dcb1bf43-7819-4197-aefe-6033492a87d8");
									containersElement.appendChild(subContainerElement);
									// Create the <SHORT-NAME> element inside <ECUC-CONTAINER-VALUE>
									Element shortNameContainerElement = doc.createElement("SHORT-NAME");
									shortNameContainerElement.setTextContent("CanConfigSet");
									subContainerElement.appendChild(shortNameContainerElement);
									// Append the <CONTAINERS> element to the <ECUC-CONTAINER-VALUE> element
									ecucContainerValueElement.appendChild(containersElement);

									Element subContainersElement = doc.createElement("SUB-CONTAINERS");

									// Create the <ECUC-CONTAINER-VALUE> element inside <SUB-CONTAINERS>
									Element ecucContainerValueElement1 = doc.createElement("ECUC-CONTAINER-VALUE");
									ecucContainerValueElement1.setAttribute("UUID", "dcb1bf43-7819-4197-aefe-6033492a87d8");
									subContainersElement.appendChild(ecucContainerValueElement1);

									// Create the <SHORT-NAME> element inside <ECUC-CONTAINER-VALUE>
									Element shortNameContainerElement1 = doc.createElement("SHORT-NAME");
									shortNameContainerElement1.setTextContent("CanController");
									ecucContainerValueElement1.appendChild(shortNameContainerElement1);

									// Append the <SUB-CONTAINERS> element to its parent
									containersElement.appendChild(subContainersElement);

									Element ecucTextualParamValue = doc.createElement("ECUC-TEXTUAL-PARAM-VALUE");
									Element definitionRef = doc.createElement("DEFINITION-REF");
									definitionRef.setAttribute("DEST", "ECUC-ENUMERATION-PARAM-DEF");
									definitionRef.setTextContent("/AUTOSAR/EcucDefs/Can/CanConfigSet/CanController/CanBusoffProcessing");


									String[] variableNames = {
											"CanBusoffProcessing", "CanRxProcessing", "CanTxProcessing", "CanWakeupProcessing",
											"CanControllerBaseAddress", "CanControllerId", "CanControllerActivation",
											"CanWakeupFunctionalityAPI", "CanWakeupSupport", "CanControllerDefaultBaudrate",
											"CanControllerEcucPartitionRef", "CanCpuClockRef", "CanWakeupSourceRef"
									};

									String[] variableValues = {
											comboBox.getSelectedItem().toString(),
											comboBox_1.getSelectedItem().toString(),
											comboBox_1_1.getSelectedItem().toString(),
											comboBox_1_2.getSelectedItem().toString(),
											textField_1.getText(),
											textField_2.getText(),
											String.valueOf(chckbxNewCheckBox.isSelected()),
											String.valueOf(chckbxNewCheckBox_1.isSelected()),
											String.valueOf(chckbxNewCheckBox_2.isSelected()),
											textField_11.getText(),
											textField_12.getText(),
											textField_13.getText(),
											textField_14.getText()
									};

									for (int i = 0; i < variableNames.length; i++) {
										Element paramValueElement = doc.createElement("ECUC-TEXTUAL-PARAM-VALUE");
										Element definitionRefElement = doc.createElement("DEFINITION-REF");
										definitionRefElement.setAttribute("DEST", "ECUC-ENUMERATION-PARAM-DEF");
										definitionRefElement.appendChild(doc.createTextNode("/AUTOSAR/EcucDefs/Can/CanConfigSet/CanController/" + variableNames[i]));
										paramValueElement.appendChild(definitionRefElement);

										Element valueElement = doc.createElement("VALUE");
										valueElement.appendChild(doc.createTextNode(variableValues[i]));
										paramValueElement.appendChild(valueElement);
										ecucContainerValueElement1.appendChild(paramValueElement); // Append to the appropriate parent element

									}

									Element subContainersElement1 = doc.createElement("SUB-CONTAINERS");

									// Create the <ECUC-CONTAINER-VALUE> element inside <SUB-CONTAINERS>
									Element ecucContainerValueElement11 = doc.createElement("ECUC-CONTAINER-VALUE");
									ecucContainerValueElement11.setAttribute("UUID", "dcb1bf43-7819-4197-aefe-6033492a87d8");
									subContainersElement1.appendChild(ecucContainerValueElement11);

									// Create the <SHORT-NAME> element inside <ECUC-CONTAINER-VALUE>
									Element shortNameContainerElement11 = doc.createElement("SHORT-NAME");
									shortNameContainerElement11.setTextContent("CanGeneral");
									ecucContainerValueElement11.appendChild(shortNameContainerElement11);

									// Append the <SUB-CONTAINERS> element to its parent
									containersElement.appendChild(subContainersElement1);                                                                                                

									String[] variableNames1 = {
											"ShortName", "CanIndex", "CanDevErrorDetect", "CanMultiplexedTransmission", "CanPublicIcomSupport",
											"CanSetBaudrateApi", "CanVersionInfoApi", "CanMainFunctionBusoffPeriod", "CanMainFunctionModePeriod",
											"CanMainFunctionWakeupPeriod", "CanTimeoutDuration", "CanLPduReceiveCalloutFunction",
											"CanEcucPartitionRef", "CanOsCounterRef", "CanSupportTTCANRef"
									};

									String[] variableValues1 = {
											txtCangeneral.getText(),
											textField_18.getText(),
											String.valueOf(chckbxNewCheckBox_4.isSelected()),
											String.valueOf(chckbxNewCheckBox_4_1.isSelected()),
											String.valueOf(chckbxNewCheckBox_4_2.isSelected()),
											String.valueOf(chckbxNewCheckBox_4_3.isSelected()),
											String.valueOf(chckbxNewCheckBox_4_4.isSelected()),
											textField_19.getText(),
											textField_20.getText(),
											textField_21.getText(),
											textField_22.getText(),
											textField_23.getText(),
											textField_24.getText(),
											textField_25.getText(),
											textField_26.getText()
									};

									for (int i = 0; i < variableNames1.length; i++) {
										Element paramValueElement = doc.createElement("ECUC-TEXTUAL-PARAM-VALUE");
										Element definitionRefElement = doc.createElement("DEFINITION-REF");
										definitionRefElement.setAttribute("DEST", "ECUC-ENUMERATION-PARAM-DEF");
										definitionRefElement.appendChild(doc.createTextNode("/AUTOSAR/EcucDefs/Can/CanConfigSet/CanGeneral/" + variableNames1[i]));
										paramValueElement.appendChild(definitionRefElement);

										Element valueElement = doc.createElement("VALUE");
										valueElement.appendChild(doc.createTextNode(variableValues1[i]));
										paramValueElement.appendChild(valueElement);

										ecucContainerValueElement11.appendChild(paramValueElement); // Append to the appropriate parent element

									}


									//CanHardwareObjectPanel components
									Element CanHardwareObjectElement = doc.createElement("CanHardwareObject");
									Element subContainersElement11 = doc.createElement("SUB-CONTAINERS");

									// Create the <ECUC-CONTAINER-VALUE> element inside <SUB-CONTAINERS>
									Element ecucContainerValueElement111 = doc.createElement("ECUC-CONTAINER-VALUE");
									ecucContainerValueElement111.setAttribute("UUID", "dcb1bf43-7819-4197-aefe-6033492a87d8");
									subContainersElement11.appendChild(ecucContainerValueElement111);

									// Create the <SHORT-NAME> element inside <ECUC-CONTAINER-VALUE>
									Element shortNameContainerElement111 = doc.createElement("SHORT-NAME");
									shortNameContainerElement111.setTextContent("CanHardwareObject");
									ecucContainerValueElement111.appendChild(shortNameContainerElement111);

									// Append the <SUB-CONTAINERS> element to its parent
									containersElement.appendChild(subContainersElement11);  


									String[] variableNames2 = {
											"CanHandleType", "CanIdType", "CanObjectType", "CanFdPaddingValue", "CanHwObjectCount",
											"CanObjectId", "CanHardwareObjectUsesPolling", "CanTriggerTransmitEnable",
											"CanControllerRef", "CanMainFunctionRWPeriodRef"
									};

									String[] variableValues2 = {
											comboBox_2.getSelectedItem().toString(),
											comboBox_2_1.getSelectedItem().toString(),
											comboBox_2_2.getSelectedItem().toString(),
											textField.getText(),
											textField_9.getText(),
											textField_10.getText(),
											String.valueOf(chckbxNewCheckBox_3.isSelected()),
											String.valueOf(chckbxNewCheckBox_3_1.isSelected()),
											textField_16.getText(),
											textField_15.getText()
									};

									for (int i = 0; i < variableNames1.length; i++) {
										Element paramValueElement = doc.createElement("ECUC-TEXTUAL-PARAM-VALUE");
										Element definitionRefElement = doc.createElement("DEFINITION-REF");
										definitionRefElement.setAttribute("DEST", "ECUC-ENUMERATION-PARAM-DEF");
										definitionRefElement.appendChild(doc.createTextNode("/AUTOSAR/EcucDefs/Can/CanConfigSet/CanHardwareObject/" + variableNames1[i]));
										paramValueElement.appendChild(definitionRefElement);

										Element valueElement = doc.createElement("VALUE");
										valueElement.appendChild(doc.createTextNode(variableValues1[i]));
										paramValueElement.appendChild(valueElement);
										ecucContainerValueElement111.appendChild(paramValueElement); // Append to the appropriate parent element

									}
/************************************************* XML CREATION END ***********************************************************************/


									// Write the content into an XML file
									TransformerFactory transformerFactory = TransformerFactory.newInstance();
									Transformer transformer = transformerFactory.newTransformer();
									transformer.setOutputProperty(OutputKeys.INDENT, "yes");
									DOMSource source = new DOMSource(doc);

									String desktopPath = System.getProperty("user.home") + "/Desktop";
									String filePath = desktopPath + "/CanData.xml" ;
									StreamResult result = new StreamResult(new File(filePath));

									transformer.transform(source, result);
									System.out.println("Data saved to XML file successfully.");

								} catch (Exception ex) {
									System.out.println("An error occurred while saving data to XML file: " + ex.getMessage());
									ex.printStackTrace();
								}
							}
							private void addElement(Document doc2, Element parentElement, String elementName, String elementValue) {
								Document doc = parentElement.getOwnerDocument();
								Element element = doc.createElement(elementName);
								element.appendChild(doc.createTextNode(elementValue));
								parentElement.appendChild(element);
							}

						});


						// Create the "Generate" menu item
						JMenuItem generateMenuItem = new JMenuItem("Generate");
						generateMenuItem.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								try {
									if (errorLogIsEmpty() && textAreaIsEmpty()) {
										JFileChooser fileChooser = new JFileChooser();
										fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
										fileChooser.setMultiSelectionEnabled(true);
										int returnValue = fileChooser.showOpenDialog(null);

										if (returnValue == JFileChooser.APPROVE_OPTION) {
											File[] xmlFiles = fileChooser.getSelectedFiles();
/************************************************* GENERATION START ***********************************************************************/
/* DESCRIPTION :The GENERATE feature automates the creation of code snippets of the XML files based on your software's specifications, *  */	
											for (File xmlFile : xmlFiles) {
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

												JOptionPane.showMessageDialog(null, ".h and .c files generated successfully!");                                                                          }
/************************************************* GENERATION END *************************************************************************************/
										}
									} else {
										if (!errorLogIsEmpty()) {
											JOptionPane.showMessageDialog(null, "Validate before you Generate.");
										} else {
											JOptionPane.showMessageDialog(null, "Resolve Validation errors & then proceed with Generation.");
										}
									}
								} catch (Exception ex) {
									JOptionPane.showMessageDialog(null, "An error occurred while generating .h and .c files: " + ex.getMessage());
									ex.printStackTrace();
								}
							}

							private boolean errorLogIsEmpty() {
								return true; 
							}

							private boolean textAreaIsEmpty() {
								return textArea.getText().trim().isEmpty();
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

							private void writeToFile(String filePath, String content) {
								try (FileWriter writer = new FileWriter(filePath)) {
									writer.write(content);
								} catch (IOException e) {
									e.printStackTrace();
									JOptionPane.showMessageDialog(null, "Error writing to file: " + e.getMessage());
								}
							}
						});

						popupMenu.add(addMenuItem);
						popupMenu.add(renameMenuItem);
						popupMenu.add(deleteMenuItem);
						popupMenu.addSeparator();
						popupMenu.add(validateMenuItem);
						popupMenu.add(saveMenuItem);
						popupMenu.add(generateMenuItem);
						popupMenu.show(tree, e.getX(), e.getY());

					}


					// Show the popup menu at the mouse location
				}
			}
		});

	}
}
