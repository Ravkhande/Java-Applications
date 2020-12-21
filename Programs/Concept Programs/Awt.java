
import java.awt.*;
import java.awt.event.*;

import javax.swing.event.InternalFrameListener;

public class Awt {
    /// chracteristics
    Frame mainFrame;
    Label statusLabel;
    Label headerLabel;
    Panel controlPanel;
    Checkbox checkBox;

    Awt() {

        mainFrame = new Frame("Marvellous Infosystem");
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new GridLayout(3, 1));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);

        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        checkBox = new Checkbox();
        checkBox.setCheckboxGroup(g);
        ;

        mainFrame.add(headerLabel);
        mainFrame.add(statusLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(checkBox);

        mainFrame.setVisible(true);

    }

    public static void main(String arg[]) {
        Awt aobj = new Awt();
        aobj.Display();
    }

    private void Display() {
        headerLabel.setText("Please select your Batch");

        Button PPA = new Button("PPA");
        Button LSP = new Button("LSP");
        Button LB = new Button("LB");
        Button Check = new Button("Check");

        PPA.setActionCommand("PPA");
        LSP.setActionCommand("LSP");
        LB.setActionCommand("LB");
        Check.setitemCommand("Check");

        PPA.addActionListener(new Demo());
        LSP.addActionListener(new Demo());
        LB.addActionListener(new Demo());
        Check.additemListener(new Hello());

        controlPanel.add(PPA);
        controlPanel.add(LSP);
        controlPanel.add(LB);
        controlPanel.add(Check);

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

    public class Hello implements InternalFrameListener {

    }

}