package com.data.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class smallui extends JFrame {
	public void CreateJFrame(String title) { // ����һ��CreateJFrame()����
		JFrame jf = new JFrame(title); // ʵ����һ��JFrame����
		Container container = jf.getContentPane(); // ��ȡһ������
		JLabel jl = new JLabel("�ı��¼̬");
		jl.setHorizontalAlignment(SwingConstants.NORTH_EAST);
		container.add(jl);
		container.setBackground(Color.white);// ���������ı�����ɫ
		jf.setVisible(true); // ʹ�������
		jf.setSize(400, 200); // ���ô����С
		// ���ô���رշ�ʽ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton myButton = new JButton("�������uin��skey");  
		JPanel myPanel = new JPanel();
	    //����һ��JPanel��myPanel  
        //��myButton������myPanel��  
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
	

	public static void main(String args[]) {// ���������е���createJFrame()����
		new smallui().CreateJFrame("����һ��JFrame����");
	}

}
