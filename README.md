# Simple-Loan-Managemen-tSystem
simple java program for loaning management
This simple Java program, titled Loan Management System, creates a graphical user interface (GUI) for managing basic loan calculations. It uses Java's Swing library to display a form where users can input loan details and calculate both the total amount to be paid and the monthly payment.

Here’s a detailed breakdown of the code:

 1. Frame and Panel Setup
- `JFrame f = new JFrame("Loan Management System");`
  - This creates the main window (or frame) for the application, titled "Loan Management System."
  
- `JPanel panel = new JPanel();`
  - A panel is added inside the frame to hold all the components (like labels, buttons, and text fields). The panel uses a null layout, which allows custom positioning of components.
  
- `panel.setBackground(Color.CYAN);`
  - The background color of the panel is set to cyan, providing a visually appealing interface.

 2. Title and Labels
- `JLabel titleLabel = new JLabel("LOAN MANAGEMENT SYSTEM", JLabel.CENTER);`
  - This is the title label of the application. It's centered and displayed at the top of the panel.
  
- The next few lines add labels and input fields (text boxes) for various loan details:
  - LOAN AMOUNT: The principal amount of the loan.
  - LOAN PERIOD: The number of months over which the loan is to be repaid.
  - INTEREST RATE: The interest rate (in percentage) applied to the loan.
  - PROCESSING FEE: Any additional fees associated with processing the loan.

Each label is positioned using absolute coordinates (`setBounds(x, y, width, height)`), and corresponding `JTextField`s allow the user to input data.

 3. Buttons for Calculations
- `JButton calculateTotalButton = new JButton("CALCULATE TOTAL AMOUNT TO BE PAID");`
  - This button triggers the calculation of the total loan amount (principal + interest + processing fee).
  
- `JButton calculateMonthlyButton = new JButton("CALCULATE AMOUNT TO BE PAID PER MONTH");`
  - This button calculates the monthly payment amount based on the total loan amount and the loan period.

 4. Output Fields
- `JTextField totalAmountField` and `JTextField monthlyAmountField`
  - These are text fields that display the calculated total loan amount and the monthly payment amount. They are set as non-editable to prevent user modification after the calculations.

 5. Event Handling (Button Actions)
When a button is clicked, an `ActionListener` is triggered:
- For total amount calculation:
  - The button reads the loan amount, interest rate, and processing fee entered by the user.
  - It computes the total amount using this formula:  
    `totalAmount = loanAmount + (loanAmount * interestRate / 100) + processingFee`.
  - The result is displayed in the `totalAmountField`.

- For monthly payment calculation:
  - It reads the same fields plus the loan period.
  - The total amount is divided by the loan period to get the monthly payment:  
    `monthlyAmount = totalAmount / loanPeriod`.
  - The result is displayed in the `monthlyAmountField`.

 6. Finalizing the Application
- The window size is set to 550x400, and the frame is made visible using `f.setVisible(true)`.
- The default close operation is set to EXIT_ON_CLOSE, so the program terminates when the window is closed.

 Summary of Functionality
1. Users enter the loan amount, loan period, interest rate, and processing fee.
2. By pressing one of the two buttons, users can either:
   - Calculate the total amount to be paid (loan + interest + fees).
   - Calculate the monthly payment amount (total amount divided by the loan period).
3. The results are displayed in dedicated text fields for easy reference.

This code serves as a basic introduction to loan management, allowing users to perform simple loan-related calculations through a user-friendly graphical interface.
