package May.May21Trinity2nd;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Main {
    public static void main(String[] Args){
        new BMIGUI();
    }
}

class BMIGUI extends JFrame{
    // user input
    private JTextField txtHeight;
    private JTextField txtWeight;

    // display output
    private JLabel lblHeight;
    private JLabel lblWeight;

    public BMIGUI(){
        // creates window title
        setTitle("BMI Calculator");

        // determines how much space each thing will take up
        setLayout(new GridLayout(7,1));


        // get input
        add (new JLabel("User Height:"));
        txtHeight = new JTextField();
        add(txtHeight);

        add ( new JLabel(("User Weight:")));
        txtWeight = new JTextField();
        add(txtWeight);


        JButton btnCalculate = new JButton("Calculate");
        add(btnCalculate);

        add(new JLabel(""));

        lblHeight = new JLabel("Height:");
        add(lblHeight);
        lblWeight = new JLabel("Weight:");
        add(lblWeight);


        setSize(350, 250); // Set window size
        setLocationRelativeTo(null); // Center window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit app on close
        setVisible(true); // Make window visible
    }
}
