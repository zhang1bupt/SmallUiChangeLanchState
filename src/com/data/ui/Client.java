package com.data.ui;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Client extends JFrame {

	private JTextField jTextFieldUser;
	private JTextField jTextFieldUser1;
	private JTextField jTextFieldUser2;
	private JTextField jTextFieldUser3;
	private JPanel jContentPane;
	private JLabel jLabelUser;
	private JButton jButtonInput;
	private JLabel Uin;
	private JLabel Skey;
	private JLabel SourceData;
	private JLabel Destination;
	
	public Client() {
		this.setTitle("�ı��¼̬");
		this.setSize(600, 400);
		this.setLayout(null);
		//this.add
		this.add(getUin(),null);
		this.add(getSkey(),null);
		this.add(getSourceData(),null);
		this.add(getDestinationData(),null);
		this.add(getJTextFieldUser(), null);
		this.add(getJTextFieldUser1(), null);
		this.add(getJTextFieldUser2(), null);
		this.add(getJTextFieldUser3(), null);
		this.add(getJButtonInput(), null);
		this.setVisible(true);
		
	}
	public JLabel getUin(){
		if (Uin == null) {
			Uin = new JLabel();
			Uin.setText("������Uin��");
			Uin.setLocation(75, 30);
			Uin.setSize(new Dimension(200, 35));
		}
		return Uin;
	}
	public JLabel getSkey(){
		if (Skey == null) {
			Skey = new JLabel();
			Skey.setText("������Skey��");
			Skey.setSize(new Dimension(200, 35));
			Skey.setLocation(75, 60);
		}
		return Skey;
	}
	public JLabel getSourceData(){
		if (SourceData == null) {
			SourceData = new JLabel();
			SourceData.setText("������Դ�ļ���ַ��");
			SourceData.setLocation(40, 90);
			SourceData.setSize(new Dimension(200, 35));
		}
		return SourceData;
	}
	public JLabel getDestinationData(){
		if (Destination == null) {
			Destination = new JLabel();
			Destination.setText("������Ŀ���ļ���ַ��");
			Destination.setLocation(28, 120);
			Destination.setSize(new Dimension(200, 35));
		}
		return Destination;
	}
	private JTextField getJTextFieldUser() {
		if (jTextFieldUser == null) {
			jTextFieldUser = new JTextField();
			jTextFieldUser.setBounds(new Rectangle(150, 30, 150, 30));
			
			jTextFieldUser.setLocation(150, 30);

		}
		return jTextFieldUser;
	}
	private JTextField getJTextFieldUser1() {
		if (jTextFieldUser1 == null) {
			jTextFieldUser1 = new JTextField();
			jTextFieldUser1.setBounds(new Rectangle(150, 30, 150, 30));
			jTextFieldUser1.setLocation(150, 60);
		}
		return jTextFieldUser1;
	}
	private JTextField getJTextFieldUser2() {
		if (jTextFieldUser2 == null) {
			jTextFieldUser2 = new JTextField();
			jTextFieldUser2.setBounds(new Rectangle(150, 30, 150, 30));
			jTextFieldUser2.setLocation(150, 90);
		}
		return jTextFieldUser2;
	}
	private JTextField getJTextFieldUser3() {
		if (jTextFieldUser3 == null) {
			jTextFieldUser3 = new JTextField();
			jTextFieldUser3.setBounds(new Rectangle(150, 30, 150, 30));
			jTextFieldUser3.setLocation(150, 120);
		}
		return jTextFieldUser3;
	}

	private JButton getJButtonInput() {
		
		if (jButtonInput == null) {
			jButtonInput = new JButton();
			jButtonInput.setText("��������¼̬");
			jButtonInput.setSize(new Dimension(200, 35));
			jButtonInput.setLocation(new Point(50, 300));
			jButtonInput.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String uin = jTextFieldUser.getText().trim();// ��ȡUin
					String skey = jTextFieldUser1.getText().trim();// ��ȡSkey
					String sourceData = jTextFieldUser2.getText().trim();// ��ȡSkey
					String destination = jTextFieldUser3.getText().trim();// ��ȡSkey
					System.out.println(uin);
					System.out.println(skey);
					System.out.println(sourceData);
					System.out.println(destination);
					Change change = new Change();
					change.readFileByLines(sourceData, uin, skey, destination);
					// if (chromeob.userId.equals(""))
					// {
					// JOptionPane.showMessageDialog(null, "�����������");
					// }
					// else
					// {
					// JOptionPane.showMessageDialog(null, "��������ɹ�");
					// }
				}
			});
		}
		return jButtonInput;
	}

	public static void main(String[] args) {
		new Client();
	}
}