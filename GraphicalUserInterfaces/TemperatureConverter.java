import javax.swing.*;
import java.awt.event.*;

public class TemperatureConverter implements ActionListener{


    public static void main(String args[]) {
        JFrame frame = new JFrame();
        frame.setSize(500, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        JLabel fahren = new JLabel("Fahrenheight");
        panel.add(fahren);
        JTextField fText = new JTextField(10);
        panel.add(fText);
        JButton convertButton = new JButton("Convert");
        panel.add(convertButton);
        JLabel celcius = new JLabel("Celcius");
        panel.add(celcius);
        JTextField cText = new JTextField(10);
        panel.add(cText);
        convertButton.addActionListener(new ActionListener(){
            @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == convertButton){
            double fdouble = Double.parseDouble(fText.getText());
            double cdouble =(double) 0.555555 * (fdouble - 32);
            cText.setText(Double.toString(cdouble));
            
        }
              }
        });
        frame.setVisible(true);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
