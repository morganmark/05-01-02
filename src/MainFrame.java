import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame(){
        init();
    }

    private JButton jbnleft=new JButton("<--");
    private JButton jbnright=new JButton("-->");
    private JButton jbn=new JButton("EXIT");
    private JTextField jtf=new JTextField("10");
    private JLabel jlb=new JLabel(">-<");
    private int x;


    private void init(){

        this.setBounds(0,0,800,800);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);


        this.add(jbn);
        jbn.setBounds(400,400,200,200);

        this.add(jbnright);
        jbnright.setBounds(200,400,200,200);

        this.add(jtf);
        jtf.setBounds(200,200,200,200);

        this.add(jlb);
        jlb.setBounds(x,0,200,200);

        this.add(jbnleft);
        jbnleft.setBounds(0,400,200,200);


        jbnleft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  x-=Integer.parseInt(jtf.getText());
                jlb.setBounds(x,0,200,200);
            }
        });


        jbnright.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  x+=Integer.parseInt(jtf.getText());
                jlb.setBounds(x,0,200,200); }
        });


        jbn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


    }
}
