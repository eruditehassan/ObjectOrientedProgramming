import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Telephone extends JFrame implements ActionListener{
    private JButton numbers[];
    private final String textOnButtons[] ={"1","2","3","4","5","6","7","8","9","*","0","#"};
    private GridLayout keypad;
    private Container container;
    private JLabel numToDial;
    private JTextField field;
    static String dialled="";
    Telephone(){
        keypad = new GridLayout(5,3);
        container = getContentPane();
        setLayout(keypad);
        numbers = new JButton[textOnButtons.length];
        numToDial = new JLabel();
        numToDial.setText("Number to Dial");
        field = new JTextField(10);
        for (int count = 0; count<numbers.length;count++){
            numbers[count] = new JButton(textOnButtons[count]);
            numbers[count].addActionListener(this);
            add(numbers[count]); 
        
        }
        add(numToDial);
        add(field);
        
    }
    public static void main(String args[]){
        Telephone tel = new Telephone();
        tel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tel.setSize(400,400);
        tel.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       for (int count = 0; count<numbers.length;count++){
           if (e.getSource() == numbers[count]){
               dialled = dialled + numbers[count].getText();
               field.setText(dialled);
               break;
           }
       }
    }
    
}
