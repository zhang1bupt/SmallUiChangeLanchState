package com.data.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class smallui extends JFrame {
	public void CreateJFrame(String title) { // 定义一个CreateJFrame()方法
		JFrame jf = new JFrame(title); // 实例化一个JFrame对象
		Container container = jf.getContentPane(); // 获取一个容器
		JLabel jl = new JLabel("改变登录态");
		jl.setHorizontalAlignment(SwingConstants.NORTH_EAST);
		container.add(jl);
		container.setBackground(Color.white);// 设置容器的背景颜色
		jf.setVisible(true); // 使窗体可视
		jf.setSize(400, 200); // 设置窗体大小
		// 设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JButton myButton = new JButton("点击输入uin和skey");  
		JPanel myPanel = new JPanel();
	    //创建一个JPanel：myPanel  
        //把myButton放置在myPanel上  
        myPanel.add(myButton);  
        //7.给myButton添加事件监听：内部类方式（仔细看，特别是标点符号）  
        myButton.addMouseListener(new MouseListener() {  
                  
            public void mouseReleased(MouseEvent e) {}            
            public void mousePressed(MouseEvent e) {}             
            public void mouseExited(MouseEvent e) {}          
            public void mouseEntered(MouseEvent e) {}         
            public void mouseClicked(MouseEvent e) {  
                //一个弹框，此处不细说其语法  
                JOptionPane.showMessageDialog(null,"内部类事件监听监听","注意",0,null);  
            }  
        });  
    }  
	

	public static void main(String args[]) {// 在主方法中调用createJFrame()方法
		new smallui().CreateJFrame("创建一个JFrame窗体");
	}

}
