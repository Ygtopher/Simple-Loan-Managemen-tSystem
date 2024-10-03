import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanManagementSystemSimple {
    public static void main(String[] args) {

        JFrame f = new JFrame("Loan Management System");


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.CYAN);
        f.setContentPane(panel);


        JLabel titleLabel = new JLabel("LOAN MANAGEMENT SYSTEM", JLabel.CENTER);
        titleLabel.setBounds(50, 10, 400, 40);
        titleLabel.setFont(titleLabel.getFont().deriveFont(18f));
        panel.add(titleLabel);


        JLabel l1 = new JLabel("LOAN AMOUNT:");
        l1.setBounds(50, 70, 150, 30);
        panel.add(l1);
        JTextField loanAmountField = new JTextField();
        loanAmountField.setBounds(250, 70, 150, 30);
        panel.add(loanAmountField);

        JLabel l2 = new JLabel("LOAN PERIOD:");
        l2.setBounds(50, 110, 150, 30);
        panel.add(l2);
        JTextField loanPeriodField = new JTextField();
        loanPeriodField.setBounds(250, 110, 150, 30);
        panel.add(loanPeriodField);

        JLabel l3 = new JLabel("INTEREST RATE IN %:");
        l3.setBounds(50, 150, 150, 30);
        panel.add(l3);
        JTextField interestRateField = new JTextField();
        interestRateField.setBounds(250, 150, 150, 30);
        panel.add(interestRateField);

        JLabel l4 = new JLabel("PROCESSING FEE:");
        l4.setBounds(50, 190, 150, 30);
        panel.add(l4);
        JTextField processingFeeField = new JTextField();
        processingFeeField.setBounds(250, 190, 150, 30);
        panel.add(processingFeeField);


        JButton calculateTotalButton = new JButton("CALCULATE TOTAL AMOUNT TO BE PAID");
        calculateTotalButton.setBounds(50, 230, 300, 30);
        panel.add(calculateTotalButton);

        JButton calculateMonthlyButton = new JButton("CALCULATE AMOUNT TO BE PAID PER MONTH");
        calculateMonthlyButton.setBounds(50, 270, 300, 30);
        panel.add(calculateMonthlyButton);


        JTextField totalAmountField = new JTextField();
        totalAmountField.setBounds(355, 230, 70, 30);
        totalAmountField.setEditable(false);
        panel.add(totalAmountField);

        JTextField monthlyAmountField = new JTextField();
        monthlyAmountField.setBounds(355, 270, 70, 30);
        monthlyAmountField.setEditable(false);
        panel.add(monthlyAmountField);


        f.setSize(550, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);


        calculateTotalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double loanAmount = Double.parseDouble(loanAmountField.getText());
                double interestRate = Double.parseDouble(interestRateField.getText());
                double processingFee = Double.parseDouble(processingFeeField.getText());


                double totalAmount = loanAmount + (loanAmount * interestRate / 100) + processingFee;


                totalAmountField.setText(String.valueOf(totalAmount));
            }
        });


        calculateMonthlyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double loanAmount = Double.parseDouble(loanAmountField.getText());
                double interestRate = Double.parseDouble(interestRateField.getText());
                double processingFee = Double.parseDouble(processingFeeField.getText());
                int loanPeriod = Integer.parseInt(loanPeriodField.getText());


                double totalAmount = loanAmount + (loanAmount * interestRate / 100) + processingFee;


                double monthlyAmount = totalAmount / loanPeriod;


                monthlyAmountField.setText(String.valueOf(monthlyAmount));
            }
        });
    }
}
