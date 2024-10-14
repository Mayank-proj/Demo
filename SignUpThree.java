
package bankmanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignUpThree extends JFrame {
    
    JRadioButton  r1,r2,r3,r4;
    
    SignUpThree(){
        
        
        setLayout(null);
        
        
         JLabel additionaldetails=new JLabel("Page 3 : Account Details");
       additionaldetails.setFont(new Font("Railway",Font.BOLD,22));
         additionaldetails.setBounds(280,40,600,40);
        add( additionaldetails);
        
        JLabel type=new JLabel("Account Type:");
        type.setBounds(100,140,200,30);
        type.setFont(new Font("Railway",Font.BOLD,25));
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Railway",Font.BOLD,16));
        r1.setBackground(Color.white);
        r1.setBounds(100,180,150,20);
        add(r1);
        
         r2=new JRadioButton("Current Account");
        r2.setFont(new Font("Railway",Font.BOLD,16));
        r2.setBackground(Color.white);
        r2.setBounds(300,180,250,20);
        add(r2);
        
        
         r3=new JRadioButton("Fixed Account");
        r3.setFont(new Font("Railway",Font.BOLD,16));
        r3.setBackground(Color.white);
        r3.setBounds(100,220,150,20);
        add(r3);
        
         r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Railway",Font.BOLD,16));
        r4.setBackground(Color.white);
        r4.setBounds(300,220,350,20);
        add(r4);
        
        ButtonGroup b1=new ButtonGroup();
        b1.add(r1);
         b1.add(r3);
          b1.add(r3);
           b1.add(r4);
        
        
        JLabel card=new JLabel("Card Number:");
        card.setBounds(100,280,200,30);
        card.setFont(new Font("Railway",Font.BOLD,25));
        add(card);
       
        
         JLabel number=new JLabel("XXXX-XXXX-XXXX-8765");
        number.setBounds(350,280,600,30);
        number.setFont(new Font("Railway",Font.BOLD,25));
        add(number);
        
        
        JLabel cardn=new JLabel("Your 16 Digit Card Number");
        cardn.setBounds(100,310,600,25);
        cardn.setFont(new Font("Railway",Font.BOLD,12));
        add(cardn);
        
         JLabel Pin=new JLabel("Pin:");
        Pin.setBounds(100,340,200,30);
        Pin.setFont(new Font("Railway",Font.BOLD,25));
        add(Pin);
        
         JLabel pnum=new JLabel("XXXX");
        pnum.setBounds(350,340,600,30);
        pnum.setFont(new Font("Railway",Font.BOLD,25));
        add(pnum);
        
        JLabel pinn=new JLabel("Your 4 Digit Pin");
        pinn.setBounds(100,370,600,25);
        pinn.setFont(new Font("Railway",Font.BOLD,12));
        add(pinn);
        
        JLabel services=new JLabel("Services Requried:");
        services.setBounds(100,420,600,30);
         services.setFont(new Font("Railway",Font.BOLD,25));
        add(services);
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,10);
        setVisible(true);
        
    }
      public static void main(String args[]){
          new SignUpThree();
      }   
}
