package com.data.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;  
import javax.swing.JOptionPane;  
/* 
 * Java Swing����¼�������һ�������ڲ��෽ʽ 
 * */  
public class ActionListennerOne {  
  
    public static void main(String[] args) {  
        
    	//1.����һ��JFrame��myFrame  
        JFrame myFrame = new JFrame("�ı��¼̬");  
        //1.1
		Container container = myFrame.getContentPane(); // ��ȡһ������
		JLabel jl = new JLabel("�ı��¼̬");
		jl.setHorizontalAlignment(SwingConstants.NORTH_EAST);
		container.add(jl);
		container.setBackground(Color.white);// ���������ı�����ɫ
        //2.����myFrame�����ԣ��ɼ�����С  
        myFrame.setVisible(true);  
        myFrame.setSize(600, 400);  
        //3.����һ��JPanel��myPanel  
        JPanel myPanel = new JPanel();  
        //4.��myPanel������myFrame��  
        myFrame.add(myPanel);  
        //5.����һ��JButton��myButton  
        JButton myButton = new JButton("�������uin��skey");  
        //6����myButton������myPanel��  
        myPanel.add(myButton);  
          
        //7.��myButton����¼��������ڲ��෽ʽ����ϸ�����ر��Ǳ����ţ�  
        myButton.addMouseListener(new MouseListener() {  
                  
            public void mouseReleased(MouseEvent e) {}            
            public void mousePressed(MouseEvent e) {}             
            public void mouseExited(MouseEvent e) {}          
            public void mouseEntered(MouseEvent e) {}         
            public void mouseClicked(MouseEvent e) {  
                //һ�����򣬴˴���ϸ˵���﷨  
                JOptionPane.showMessageDialog(null,"�ڲ����¼���������","ע��",0,null);  
            }  
        });  
    }  
}  
