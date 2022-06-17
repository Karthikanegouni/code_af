import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


class cal extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    JTextField t1;
    public String v = "";
    public String v1 ="0";
    public String op="";
    cal()
    {
        setTitle("LAB2_Calculator");
        setSize(500,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel ui = new JPanel(new BorderLayout(5, 5));
        t1 = new JTextField(40); t1.setFont(new Font("Consolas", Font.PLAIN, 20));
        t1.setText(v);
        t1.setBackground(Color.decode("#a6eaed"));
        t1.setForeground(Color.BLACK);
        ui.add(t1, BorderLayout.NORTH);

        JPanel  p = new JPanel(new GridLayout(5, 3, 5, 5));
        b1 = new JButton("1"); b1.addActionListener(this); p.add(b1); b1.setBackground(Color.GRAY);
        b2 = new JButton("2"); b2.addActionListener(this); p.add(b2);b2.setBackground(Color.GRAY);
        b3 = new JButton("3"); b3.addActionListener(this); p.add(b3);b3.setBackground(Color.GRAY);
        b4 = new JButton("4"); b4.addActionListener(this); p.add(b4);b4.setBackground(Color.GRAY);
        b5 = new JButton("5"); b5.addActionListener(this); p.add(b5);b5.setBackground(Color.GRAY);
        b6 = new JButton("6"); b6.addActionListener(this); p.add(b6);b6.setBackground(Color.GRAY);
        b7 = new JButton("7"); b7.addActionListener(this); p.add(b7);b7.setBackground(Color.GRAY);
        b8 = new JButton("8"); b8.addActionListener(this); p.add(b8);b8.setBackground(Color.GRAY);
        b9 = new JButton("9"); b9.addActionListener(this); p.add(b9);b9.setBackground(Color.GRAY);
        b11 = new JButton("+"); b11.addActionListener(this); p.add(b11);b11.setBackground(Color.GRAY);
        b10 = new JButton("0"); b10.addActionListener(this); p.add(b10);b10.setBackground(Color.GRAY);
        b12 = new JButton("-"); b12.addActionListener(this); p.add(b12);b12.setBackground(Color.GRAY);
        b13 = new JButton("*"); b13.addActionListener(this); p.add(b13);b13.setBackground(Color.GRAY);
        b14 = new JButton("/"); b14.addActionListener(this); p.add(b14);b14.setBackground(Color.GRAY);
        b15 = new JButton("="); b15.addActionListener(this); p.add(b15);b15.setBackground(Color.GRAY);
        b16 = new JButton("Clear"); b16.addActionListener(this); ui.add(b16,BorderLayout.SOUTH);b16.setBackground(Color.decode("#4f5d63"));b16.setForeground(Color.WHITE);
        ui.add(p, BorderLayout.CENTER);
        add(ui);
        setVisible(true);
    };

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b16)
        {
            t1.setText("");
            v ="";
            v1 = "";
        }
        String b = e.getActionCommand();
        switch(b){
            case "1": { v = v+"1"; t1.setText(v); }break;
            case "2": { v = v+"2"; t1.setText(v); }break;
            case "3": { v = v+"3"; t1.setText(v); }break;
            case "4": { v = v+"4"; t1.setText(v); }break;
            case "5": { v = v+"5"; t1.setText(v); }break;
            case "6": { v = v+"6"; t1.setText(v); }break;
            case "7": { v = v+"7"; t1.setText(v); }break;
            case "8": { v = v+"8"; t1.setText(v); }break;
            case "9": { v = v+"9"; t1.setText(v); }break;
            case "0": { v = v+"0"; t1.setText(v); }break;
            case "+": { op = "+";  v1=t1.getText(); v=""; }break;
            case "-": { op = "-";  v1=t1.getText(); v=""; }break;
            case "*": { op = "*";  v1=t1.getText(); v=""; }break;
            case "/": { op = "/";  v1=t1.getText(); v=""; }break;

            case "=":{

                switch(op) {
                    case "+": {v=t1.getText(); 
                        if(v.equals("")){
                            v="0";
                        }
                        long i = Long.parseLong(v1)+Long.parseLong(v);
                        t1.setText(String.valueOf(i));
                        v="";
                    }
                        break;
                    case "-": {v=t1.getText(); 
                        if(v.equals("")){
                            v="0";
                        }
                        long i = Long.parseLong(v1)-Long.parseLong(v);
                        t1.setText(String.valueOf(i));
                        v="";
                    }
                        break;
                    case "*": {v=t1.getText(); 
                        if(v.equals("")){
                            v="0";
                        }
                        long i = Long.parseLong(v1)*Long.parseLong(v);
                        t1.setText(String.valueOf(i));
                        v="";
                    }
                        break;
                    case "/": {v=t1.getText(); 
                        if(v.equals("")){
                            v="0";
                        }
                        try{
                            long i = Long.parseLong(v1)/Long.parseLong(v);
                            t1.setText(String.valueOf(i));
                            v="";
                        }
                            catch(ArithmeticException ar){
                                JOptionPane.showMessageDialog(this,ar.toString());
                            }
                    }
                        break;
            }
        }
        }
        
    }

    

    public static void main(String[] args)
    {
        new cal();
    }
}