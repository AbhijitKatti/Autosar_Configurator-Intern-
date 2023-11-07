package MenuBarUse;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;




public class HomeUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	int xx,xy;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	protected Object passWord;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeUI frame = new HomeUI();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeUI() {
		setAlwaysOnTop(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 438);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-30, 0, 364, 399);
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Empowering Technology and Innovation");
		lblNewLabel_3.setBounds(102, 0, 197, 24);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				  xx = e.getX();

			      xy = e.getY();
			}
		});
		lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				int x = e.getXOnScreen();
				int y = e.getYOnScreen(); 
				HomeUI.this.setLocation(x - xx, y - xy);  
			}
		});
		lblNewLabel_2.setBounds(-319, 0, 748, 414);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setIcon(new ImageIcon(HomeUI.class.getResource("/Images/4223896_6ec1_2.jpg")));
		
		Button button = new Button("SignUp");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					String userName = textField.getText();
			        String email = textField_1.getText();
			        String password = new String(passwordField.getPassword());
			        String repeatPassword = new String(passwordField_1.getPassword());

			        boolean isValidUsername = validateUsername(userName);
			        boolean isValidEmail = validateEmail(email);
			        boolean isValidPassword = validatePassword(password);

			        if (isValidUsername && isValidEmail && isValidPassword && password.equals(repeatPassword)) {
			            saveUserDataToXML(userName, email, password);
			            JOptionPane.showMessageDialog(HomeUI.this, "Sign up successful");


			            // Close the HomeUI frame
			            setVisible(false);
			            dispose();

			            // Open the Nextwork frame
			            Nextwork nextworkFrame = new Nextwork();
			            nextworkFrame.setVisible(true);
			        } else {
			            JOptionPane.showMessageDialog(HomeUI.this, "Invalid input or passwords do not match");
			        }
			    }


			private boolean validateUsername(String username) {
		        // Username validation logic
		        return !username.isEmpty();
		    }

		    private boolean validateEmail(String email) {
		        // Email validation logic
		        return !email.isEmpty();
		    }

		    private boolean validatePassword(String password) {
		        // Password validation logic
		        return !password.isEmpty();
		    }
			});
			button.setBounds(344, 334, 265, 37);
			button.setForeground(SystemColor.text);
			button.setBackground(new Color(0, 74, 111));
			contentPane.add(button);
		button.setBounds(344, 334, 265, 37);
		button.setForeground(SystemColor.text);
		button.setBackground(new Color(0, 74, 111));
		contentPane.add(button);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String userName = textField.getText();
		        handleUserName(userName);
		    }

		    private boolean validateUsername(String username) {
		      return !username.isEmpty();
		    }
		});

	
		textField.setBounds(344, 76, 265, 32);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(344, 106, 265, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setBounds(344, 48, 194, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setBounds(344, 119, 62, 32);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String email = textField_1.getText();
		        handleEmail(email);
		        }
		    private void handleEmail(String Email) {
		        // Add your code here to process the email
		        // For example, you can validate the email format or save it to a database
		    	   boolean isValidEmail = validateEmail(Email);
		           if (isValidEmail) {
		               JOptionPane.showMessageDialog(HomeUI.this, "Email is valid: " + Email);
		           } else {
		               JOptionPane.showMessageDialog(HomeUI.this, "Invalid Email format" +Email);
		           }
		       }


		    // Function to validate email format
		    private boolean validateEmail(String email) {
		        // Implement your email validation logic here
		        // You can use regular expressions or other validation techniques
		        // For simplicity, let's assume any non-empty string is considered a valid email
		        return !email.isEmpty();
		    }
		});
		
		textField_1.setBounds(344, 146, 265, 32);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(344, 176, 265, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setBounds(344, 188, 62, 32);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(344, 242, 265, 2);
		contentPane.add(separator_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Repeat Password");
		lblNewLabel_1_1_1.setBounds(344, 255, 143, 32);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1_1_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(344, 311, 265, 2);
		contentPane.add(separator_1_1_1);
		
		JLabel lbl_Close = new JLabel("X");
		lbl_Close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl_Close.setForeground(Color.RED);
		lbl_Close.setBackground(new Color(0, 0, 0));
		lbl_Close.setBounds(596, 0, 73, 59);
		contentPane.add(lbl_Close);
		
		passwordField = new JPasswordField();
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passWord = passwordField.getText();
			}

		    private boolean validatePassword(String password) {
		       
		       return !password.isEmpty();
		    }
		});
		passwordField.setBounds(344, 212, 265, 32);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passWord = passwordField_1.getText();
			}
		});
		passwordField_1.setBounds(344, 281, 265, 32);
		contentPane.add(passwordField_1);
	}
	private void saveUserDataToXML(String userName, String email, String password) {
	    try {
	        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

	        // Create the root element for the XML document
	        Document doc = docBuilder.newDocument();
	        Element rootElement = doc.createElement("Users");
	        doc.appendChild(rootElement);

	        // Create a new user element
	        Element user = doc.createElement("User");
	        rootElement.appendChild(user);

	        // Create elements for the user's data
	        Element usernameElement = doc.createElement("Username");
	        usernameElement.setTextContent(userName);
	        user.appendChild(usernameElement);

	        Element emailElement = doc.createElement("Email");
	        emailElement.setTextContent(email);
	        user.appendChild(emailElement);

	        Element passwordElement = doc.createElement("Password");
	        passwordElement.setTextContent(password);
	        user.appendChild(passwordElement);

	        // Create a Transformer object to write the XML document to a file
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        DOMSource source = new DOMSource(doc);

	        // Choose the file path and name to save the XML data
	        File file = new File("user_data.xml");
	        StreamResult result = new StreamResult(file);

	        // Write the XML data to the file
	        transformer.transform(source, result);

	        System.out.println("User data saved to XML file.");

	    } catch (ParserConfigurationException | TransformerException e) {
	        e.printStackTrace();
	    }
	}


	protected void handleEmail(String email) {
		// TODO Auto-generated method stub
		
	}

	protected void handleUserName(String userName) {
		// TODO Auto-generated method stub
		
	}
}
