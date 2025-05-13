import java.awt.*;
import java.awt.event.*;
public class Counter{
    public static void main(String[] args) {
        Display call = new Display();
        call.output();
    }
}
class Display extends Frame{
    public void output(){
        //creating the frame protocols
        setSize(500,400);
        setLayout(null);
        setTitle("Simple Counter");
        setBackground(Color.BLACK);
        //LABEL 
        Label lb = new Label("DEVELOPED BY SRIHARSHA ");
        lb.setBounds(100,300,300,40);
        lb.setFont(new Font("ARIAL",Font.BOLD|Font.ITALIC,20));
        lb.setForeground(Color.black);
        lb.setBackground(Color.WHITE);

        //INCREASE BUTTON
         Button b1 = new Button("+");
         b1.setBounds(360,130,90,85);
         b1.setFont(new Font("Times New Roman Bold",Font.BOLD,50));
         b1.setBackground(Color.GREEN);  
        //DECREASE BUTTON
        Button b2 = new Button("-");
         b2.setBounds(50,130,90,85);
         b2.setFont(new Font("Times New Roman Bold",Font.BOLD,50));
         b2.setBackground(Color.red);
         //TEXTFIELD FOR THE OUTPUT
         TextField field= new TextField("   0");
         field.setFont(new Font("Arial",Font.BOLD,75));
         field.setBounds(150,130,200,85);
         //RESET BUTTON 
         Button b3 = new Button("RESET");
         b3.setBounds(200,230,100,50);
         b3.setFont(new Font("Arial",Font.BOLD,20));
         b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                field.setText("    0");
            }
         });
         b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                field.setText("   0");
            }
        });
        //actionperforming
        b1.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent E){
            String get=field.getText().trim();
            int num=Integer.parseInt(get);
            StringBuilder sb1= new StringBuilder();
            sb1.append("   ");
            sb1.append(++num);
            String result=sb1.toString();
            field.setText(result);
           }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String get=field.getText().trim();
                int num=Integer.parseInt(get);
                StringBuilder sb2=new StringBuilder();
                sb2.append("   ");
                sb2.append(--num);
                String result=sb2.toString();
                field.setText(result);
                
            }
            
        });
         //inserting the item to frame 
         add(lb);
         add(b1);//plus icon
         add(b2);//minus icon
         add(field);//resulted text
         add(b3);//reset button
        //closing the window 
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
}
