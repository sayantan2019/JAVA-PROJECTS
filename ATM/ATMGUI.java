import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class ATMGUI implements ActionListener {
    private ATM atmCore;
    private JFrame frame;
    private JTextField amtField;
    private JLabel balLabel;

    public ATMGUI() {
        atmCore = new ATM();
        frame = new JFrame("ATM Machine");
        frame.setSize(800,600);
        //frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        int centerX = frame.getWidth()/2 -100;
        

        JLabel label = new JLabel("Amount:");
        label.setBounds(centerX, 10, 100, 25);
        frame.add(label);

        amtField = new JTextField();
        amtField.setBounds(centerX + 110, 10, 150, 25);
        frame.add(amtField);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(centerX, 50, 100, 25);
        depositButton.addActionListener(this);
        frame.add(depositButton);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(centerX+110, 50, 100, 25);
        withdrawButton.addActionListener(this);
        frame.add(withdrawButton);

        balLabel = new JLabel("Balance : 0.0");
        balLabel.setBounds(centerX, 90, 200, 25);
        frame.add(balLabel);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(centerX, 130, 100, 25);
        exitButton.addActionListener(e -> System.exit(0));
        frame.add(exitButton);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        double amt = Double.parseDouble(amtField.getText());

        switch (action) {
            case "Deposit":
                if (atmCore.deposit(amt)) {
                    JOptionPane.showMessageDialog(frame, "Deposit successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Amount");
                }
                break;

            case "Withdraw":
                if (atmCore.withdraw(amt)) {  // Fixed method call from deposit to withdraw
                    JOptionPane.showMessageDialog(frame, "Withdrawal successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Amount");
                }
                break;
        }

        balLabel.setText("Balance : " + atmCore.getbal());
        amtField.setText("");
    }

    public static void main(String[] args) {
        new ATMGUI();
    }
}
