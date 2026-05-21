package May.May21Trinity;
import javax.swing.*;// Import Swing components (JFrame, JLabel, JTextField, JButton, etc.)
import java.awt.event.*;// Import event handling classes (ActionListener, ActionEvent)
import java.awt.*; // Import layout managers (GridLayout, etc.)
public class Main {
    public static void main(String[] args) {
        /*
        MAIN METHOD
        -----------
        Entry point of the program.
        Creates the GUI object → which runs the constructor.
        */
        new GasMileageGUI();
    }

}
/*
    CLASS: GasMileageGUI
    --------------------
    This program creates a GUI (Graphical User Interface) version of the
    Gas Mileage Calculator.
    Instead of using the console:
    - The user enters values into text fields
    - Clicks a button
    - The program calculates and displays results on the screen
    We extend JFrame because this class represents a window.
    */
class GasMileageGUI extends JFrame {
    /*
    INSTANCE VARIABLES
    ------------------
    These variables store references to GUI components so we can
    access them throughout the class (especially inside the event handler).
    */
// Text fields → used for user input
    private JTextField txtMiles;
    private JTextField txtGallons;
    private JTextField txtCost;
    // Labels → used to display output results
    private JLabel lblMPG;
    private JLabel lblTotalCost;
    private JLabel lblCostPerMile;

    /*
    CONSTRUCTOR
    -----------
    This method runs automatically when the object is created.
    It is responsible for:
    - building the GUI
    - placing components on the screen
    - connecting the button to an event
    */
    public GasMileageGUI() {
// Set the window title (top bar text)
        setTitle("Gas Mileage Calculator");
/*
LAYOUT MANAGER (feel free to get creative!)
--------------
GridLayout(7, 1) means:
- 7 rows
- 1 column
Components are added top → bottom.
*/
        setLayout(new GridLayout(7, 1));
/*
INPUT SECTION
-------------
Each input consists of:
- A label (instruction)
- A text field (user input)
*/
// Miles Driven
        add(new JLabel("Miles Driven:"));
        txtMiles = new JTextField();
        add(txtMiles);
// Gallons Used
        add(new JLabel("Gallons Used:"));
        txtGallons = new JTextField();
        add(txtGallons);
// Cost per Gallon
        add(new JLabel("Cost per Gallon:"));
        txtCost = new JTextField();
        add(txtCost);
/*
BUTTON
------
The user clicks this button to perform the calculation.
*/
        JButton btnCalculate = new JButton("Calculate");
        add(btnCalculate);
// Empty label used as spacing (visual separation)
        add(new JLabel(""));
/*
OUTPUT SECTION
--------------
These labels will be updated after the user clicks the button.
*/
        lblMPG = new JLabel("MPG: ");
        add(lblMPG);
        lblTotalCost = new JLabel("Total Fuel Cost: ");
        add(lblTotalCost);
        lblCostPerMile = new JLabel("Cost per Mile: ");
        add(lblCostPerMile);
/*
EVENT HANDLER
-------------
GUIs are event-driven → the program waits for user actions.
Here, we tell the button:
"When clicked, run this code."
*/
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
/*
STEP 1: GET INPUT
-----------------
getText() returns a String.
We convert it to double so we can perform calculations.
*/
                double miles = Double.parseDouble(txtMiles.getText());
                double gallons = Double.parseDouble(txtGallons.getText());
                double cost = Double.parseDouble(txtCost.getText());
/*
STEP 2: CALCULATIONS
-------------------
Apply formulas from the lab.
*/
                double mpg = miles / gallons;
                double totalCost = gallons * cost;
                double costPerMile = totalCost / miles;
/*
STEP 3: DISPLAY OUTPUT
----------------------
setText() updates what the user sees on the screen.
*/
                lblMPG.setText("MPG: " + mpg);
                lblTotalCost.setText("Total Fuel Cost: $" + totalCost);
                lblCostPerMile.setText("Cost per Mile: $" + costPerMile);
            }
        });
/*
WINDOW SETTINGS
---------------
*/
        setSize(350, 250); // Set window size
        setLocationRelativeTo(null); // Center window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit app on close
        setVisible(true); // Make window visible
    }
}
