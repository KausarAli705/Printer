
import java.awt.event.*;
import java.security.KeyRep;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Printer extends WindowAdapter {
    JFrame f;
    Printer(){
        f=new JFrame("Printer");
        f.addWindowListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JButton b1=new JButton("OK");
        JButton b2=new JButton("Cancel");
        JButton b3=new JButton("setup");
        JButton b4=new JButton("Help");
        b1.setBounds(570,80,95,30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == b1)
                {
                    // Code To popup an ERROR_MESSAGE Dialog.
                    JOptionPane.showMessageDialog(f, "Do want start printing",
                            "Start", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        b2.setBounds(570,130,95,30);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == b2)
                {
                    // Code To popup an ERROR_MESSAGE Dialog.
                    JOptionPane.showMessageDialog(f, "Chick above X icon for Exit ",
                            "EXIT", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        b3.setBounds(570,180,95,30);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == b3)
                {
                    // Code To popup an ERROR_MESSAGE Dialog.
                    JOptionPane.showMessageDialog(f, "Setup has not been Updated, try late",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        b4.setBounds(570,230,95,30);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (e.getSource() == b4)
                {
                    // Code To popup an ERROR_MESSAGE Dialog.
                    JOptionPane.showMessageDialog(f, "Cantact with admin",
                            "HELP", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JLabel l1=new JLabel("Printer: My printer");
        l1.setBounds(100,70,110,30);

        DefaultListModel<String> List1= new DefaultListModel<>();
        List1.addElement("");
        List1.addElement("");
        List1.addElement("");
        List1.addElement("");
        JList<String>list1 = new JList<>(List1);
        list1.setBounds(100,100,100,150);

        JCheckBox cb1=new JCheckBox("Image");
        JCheckBox cb2=new JCheckBox("Text");
        JCheckBox cb3=new JCheckBox("code");
        cb1.setBounds(200,100, 60,50);
        cb2.setBounds(200,150, 60,50);
        cb3.setBounds(200,200, 60,50);

        DefaultListModel<String> List2= new DefaultListModel<>();
        List2.addElement("");
        List2.addElement("");
        List2.addElement("");
        List2.addElement("");
        JList<String>list2 = new JList<>(List2);
        list2.setBounds(260,100,80,150);

        JRadioButton r1=new JRadioButton("Selection");
        JRadioButton r2=new JRadioButton("all");
        JRadioButton r3=new JRadioButton("applets");
        r1.setBounds(350,100, 80,50);
        r2.setBounds(350,150, 75,50);
        r3.setBounds(350,200, 75,50);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);bg.add(r3);

//        JTextArea ta3 =new JTextArea("");
//        ta3.setBounds(450,100,100,150);
        DefaultListModel<String> List3= new DefaultListModel<>();
        List3.addElement("");
        List3.addElement("");
        List3.addElement("");
        List3.addElement("");
        JList<String>list3 = new JList<>(List3);
        list3.setBounds(450,100,100,150);

        JLabel l2=new JLabel("Print Qualtiy : ");
        l2.setBounds(165,260,110,30);

        String items[]={"High","Midium","low"};
        JComboBox cmb=new JComboBox(items);
        cmb.setBounds(250,266,90,20);

        JCheckBox cb4=new JCheckBox("Print All");
        cb4.setBounds(380,250, 90,50);



        f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.add(l1);f.add(l2);
        f.add(list1);f.add(list2);f.add(list3);
        f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);
        f.add(r1);f.add(r2);f.add(r3);
        f.add(cmb);
        f.setSize(720,350);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void windowClosing(WindowEvent e) {
        int a=JOptionPane.showConfirmDialog(f,"Are you sure?");
        if(a==JOptionPane.YES_OPTION){
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    public static void main(String[] args) {
        new Printer();

    }
}
