package MenuBarUse;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class CanDataValidate {
	private static Component tree;

	public static void CanDataValidate() {
		JMenuItem validateMenuItem = new JMenuItem("Validate");
        validateMenuItem.setEnabled(false); // Disable "Validate" menu item by default
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(10, 11, 451, 608);
        
        	  // Adding the JTree nodes
              tree = new JTree();
              scrollPane.setRowHeaderView(tree);
              ((JComponent) tree).setOpaque(false);
              ((JTree) tree).setShowsRootHandles(true);
              tree.setFont(new Font("Calibri", Font.PLAIN, 18));
              ((JComponent) tree).setAutoscrolls(true);
              ((JComponent) tree).setBorder(null);
              tree.setForeground(new Color(255, 255, 255));   
              ((JTree) tree).setVisibleRowCount(30);
              ((JMenuItem) tree).setModel((ButtonModel) new DefaultTreeModel(
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
              tree.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    int row = ((JTree) tree).getClosestRowForLocation(e.getX(), e.getY());
                    ((JTree) tree).setSelectionRow(row);
                    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) ((JTree) tree).getLastSelectedPathComponent();

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
                }
                
            }
        });
                    
                  validateMenuItem.addActionListener(new ActionListener() {
                  private Component CanGeneral;
				private AbstractButton textArea;

                JComboBox comboBox = new JComboBox();
                JComboBox comboBox_1 = new JComboBox();
                JComboBox comboBox_1_1 = new JComboBox();
                JComboBox comboBox_1_2 = new JComboBox();
                JTextField textField_1 = new JTextField();
                JTextField textField_2 = new JTextField();
                JCheckBox chckbxNewCheckBox = new JCheckBox("");
                JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
                JCheckBox chckbxNewCheckBox_2 = new JCheckBox("");
                JTextField textField_12 = new JTextField();
                JTextField textField_13 = new JTextField();
                JTextField textField_14 = new JTextField();
                JTextField textField_11 = new JTextField();

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
          	    
          	    
          	    	 JTextField txtCanhardwareobject = new JTextField();
          	    	 JComboBox comboBox_2 = new JComboBox();
                     JComboBox comboBox_2_1 = new JComboBox();
                     JComboBox comboBox_2_2 = new JComboBox();
                     JTextField textField = new JTextField();
                     JTextField textField_9 = new JTextField();
                     JTextField textField_10 = new JTextField();
                     JCheckBox chckbxNewCheckBox_3 = new JCheckBox("");
                     JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("");
                     JTextField textField_16 = new JTextField();
                     JTextField textField_15 = new JTextField();

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
                  
	                  
	                  
	                  JTextField txtCangeneral = new JTextField();
	                  JTextField textField_18 = new JTextField();
	                  JCheckBox chckbxNewCheckBox_4 = new JCheckBox("");
	                  JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("");
	                  JCheckBox chckbxNewCheckBox_4_2 = new JCheckBox("");
	                  JCheckBox chckbxNewCheckBox_4_3 = new JCheckBox("");
	                  JCheckBox chckbxNewCheckBox_4_4 = new JCheckBox("");
	                  JTextField textField_19 = new JTextField();
	                  JTextField textField_20 = new JTextField();
	                  JTextField textField_21 = new JTextField();
	                  JTextField textField_22 = new JTextField();
	                  JTextField textField_23 = new JTextField();
	                  JTextField textField_24 = new JTextField();
	                  JTextField textField_25 = new JTextField();
	                  JTextField textField_26 = new JTextField();

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
        
	}

	private static Component getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}
}
