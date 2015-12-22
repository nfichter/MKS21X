import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener {
    private Container pane;
    private JLabel output;
    private JTextField input;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	JButton toF = new JButton("to F");
	toF.addActionListener(this);
	toF.setActionCommand("f");
	JButton toC = new JButton("to C");
	toC.addActionListener(this);
	toC.setActionCommand("c");

	input = new JTextField(10);
	output = new JLabel("");

	pane = this.getContentPane();
	pane.setLayout(new GridBagLayout());

	GridBagConstraints c = new GridBagConstraints();

	c.fill = GridBagConstraints.HORIZONTAL;
	c.gridx = 0;
	c.gridy = 0;
	pane.add(input);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 0;
	c.gridy = 1;
	pane.add(toF);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridx = 1;
	c.gridy = 1;
	pane.add(toC);

	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 1;
	c.gridx = 0;
	c.gridy = 2;
	pane.add(output);
    }
    
    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	
	if (event.equals("f")) {
	    try {
		output.setText(""+CtoF(Double.parseDouble(input.getText())));
	    }
	    catch (Exception a) {
		output.setText("Please type in a number.");
	    }
	}

	if (event.equals("c")) {
	    try {
		output.setText(""+FtoC(Double.parseDouble(input.getText())));
	    }
	    catch (Exception a) {
		output.setText("Please type in a number.");
	    }
	}
    }

    public double CtoF(double t) {
	return t * 9 / 5 + 32;
    }

    public double FtoC(double t) {
	return (t - 32) * 5 / 9;
    }
}