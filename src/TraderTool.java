import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TraderTool extends JFrame implements ActionListener {
    JLabel lbRate, lbBuy, lbSell, lbBuyUnit, lbSellUnit;
    JTextField rateField, buyField, sellField, buyUnitField, sellUnitField;
    JButton calculalteButton;

    JPanel mainPanel = new JPanel(new BorderLayout());
    JPanel inputPanel = new JPanel(new GridLayout(7, 2));

    public TraderTool() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("TraderTool");
        setSize(450, 400);

        lbRate = new JLabel("Rate(%)");
        lbBuyUnit = new JLabel("Buy Unit(x100)");
        lbBuy = new JLabel("Buy Price($)");
        lbSellUnit = new JLabel("Sell Unit(x100)");
        lbSell = new JLabel("Sell Price($)");
        rateField = new JTextField(20);
        buyField = new JTextField(20);
        buyUnitField = new JTextField(20);
        sellField = new JTextField(20);
        sellUnitField = new JTextField(20);

        calculalteButton = new JButton("Calculate");
        calculalteButton.addActionListener(this);
        
        inputPanel.add(lbRate);
        inputPanel.add(rateField);
        inputPanel.add(lbBuyUnit);
        inputPanel.add(buyUnitField);
        inputPanel.add(lbBuy);
        inputPanel.add(buyField);
        inputPanel.add(lbSellUnit);
        inputPanel.add(sellUnitField);
        inputPanel.add(lbSell);
        inputPanel.add(sellField);
        inputPanel.add(new JLabel()); // Empty cell for spacing
        inputPanel.add(new JLabel()); // Empty cell for spacing
        inputPanel.add(new JLabel()); // Empty cell for spacing
        inputPanel.add(calculalteButton); // Button in the center

        mainPanel.add(inputPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        TraderTool g = new TraderTool();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double rate, buyPrice, buyFee;
        rate = Double.parseDouble(rateField.getText()); 
        buyPrice = Double.parseDouble(buyField.getText());
        buyFee = rate * buyPrice;
        String result = "Buy Fee: " + buyFee;
        JOptionPane.showMessageDialog(this, result);
    }
}