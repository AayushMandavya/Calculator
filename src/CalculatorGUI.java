import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {
    JFrame frame= new JFrame();
    JTextField t1= new JTextField();
    JButton add =new JButton("Add");
    JButton sub =new JButton("Subtract");
    JButton div =new JButton("Divide");

    void renderForm(){
        t1.setBounds(10,10,800,50);
        add.setBounds(10,70,100,30);
        sub.setBounds(10,120,100,30);
        div.setBounds(10,170,100,30);

        sub.addActionListener(this);
        div.addActionListener(this);

        add.addActionListener(this);
        frame.add(add);
        frame.add(sub);
        frame.add(div);

        frame.add(t1);
    }
    void render(){
        renderForm();
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setTitle("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        t1.setText("aayush");
    }
}
