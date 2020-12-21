
import java.swing.*;
import java.swing.event.*;

public class Swing {

    /// chracteristics
    JFrame mainFrame;
    JLabel statusLabel;
    JLabel headerLabel;
    JPanel controlPanel;

    Swing() {

        mainFrame = new JFrame("Marvellous Infosystem");
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        headerLabel = new JLabel();
        headerLabel.setAlignment(JLabel.CENTER);

        statusLabel = new JLabel();
        statusLabel.setAlignment(JLabel.CENTER);

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(statusLabel);
        mainFrame.add(controlPanel);

        mainFrame.setVisible(true);

    }

    public static void main(String arg[]) {
        Swing sobj = new Swing();
        sobj.Display();
    }

    private void Display() {
        headerLabel.setText("Please select your Batch");

        JButton PPA = new JButton("PPA");
        JButton LSP = new JButton("LSP");
        JButton LB = new JButton("LB");

        PPA.setActionCommand("PPA");
        LSP.setActionCommand("LSP");
        LB.setActionCommand("LB");

        PPA.addActionListener(new Demo());
        LSP.addActionListener(new Demo());
        LB.addActionListener(new Demo());

        controlPanel.add(PPA);
        controlPanel.add(LSP);
        controlPanel.add(LB);

    }

    public class Demo implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("PPA")) {
                statusLabel.setText("PPA batch is selected");
            } else if (command.equals("LSP")) {
                statusLabel.setText("LSP batch is selected");
            } else {
                statusLabel.setText("LB batch is selected");

            }
        }

    }

}