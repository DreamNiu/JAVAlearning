import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//��ť���ۺ�ʵ��
public class BntDemo extends JFrame{
	private static final long serialVersionUID=8429102127216854374L;
	private JCheckBox checkBox1,checkBox2;
	private ButtonGroup buttonGroup1,buttonGroup2;
	private JLabel label;
	private JButton button;
	private JToggleButton toggleBtn;
	private JRadioButton radio1,radio2,radio3,radio4;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				BntDemo bntFrame=new BntDemo();
				bntFrame.setLocationRelativeTo(null);
				bntFrame.setVisible(true);
			}
		});
	}
	public BntDemo(){
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//��������ӱ�ǩ
		label=new JLabel("����˵��",SwingConstants.CENTER);	//��ǩ�������
		label.setPreferredSize(new Dimension(230,100));
		getContentPane().add(label);
		//���������������ѡ��
		checkBox1=new JCheckBox("��ѡ��1");
		checkBox2=new JCheckBox("��ѡ��2");
		checkBox1.setPreferredSize(new Dimension(110,19));
		checkBox2.setPreferredSize(new Dimension(110,19));
		getContentPane().add(checkBox1);
		getContentPane().add(checkBox2);
		//���������4����ѡ��ť
		radio1=new JRadioButton("��ѡ��ť1");
		radio2=new JRadioButton("��ѡ��ť2");
		radio3=new JRadioButton("��ѡ��ť3");
		radio4=new JRadioButton("��ѡ��ť4");
		radio1.setPreferredSize(new Dimension(110,19));
		radio2.setPreferredSize(new Dimension(110,19));
		radio3.setPreferredSize(new Dimension(110,19));
		radio4.setPreferredSize(new Dimension(110,19));
		getContentPane().add(radio1);
		getContentPane().add(radio2);
		getContentPane().add(radio3);
		getContentPane().add(radio4);
		//����ѡ��ť����
		buttonGroup1=new ButtonGroup();
		buttonGroup1.add(radio1);
		buttonGroup1.add(radio2);
		buttonGroup2=new ButtonGroup();
		buttonGroup2.add(radio3);
		buttonGroup2.add(radio4);
		//����������л���ť
		toggleBtn=new JToggleButton("�л���ť");
		getContentPane().add(toggleBtn);
		toggleBtn.setPreferredSize(new Dimension(190,22));
		toggleBtn.setSelected(true);	//���л���ť��״̬����Ϊ�����¡�״̬
		//�����������ͨ��ť
		button=new JButton("��ͨ��ť");
		button.setMnemonic(KeyEvent.VK_A);	//���ð�ť�ļ����
		getContentPane().add(button);
		//Ϊ��ť��Ӽ�����
		button.addActionListener(new ActionListener() {
			
			//@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnActionPerformed(e);
			}
		});
		pack();
		setSize(240,280);
		setResizable(false);
	}
	//��ͨ��ť������ʱִ�еĴ���
	private void btnActionPerformed(ActionEvent e){
		String s="";
		if(checkBox1.isSelected())
			s+="����ѡ��1����ѡ��";
		if(checkBox2.isSelected())
			s+="<br>����ѡ��2����ѡ��";
		if(radio1.isSelected())
			s+="<br>����ѡ��ť1����ѡ��";
		if(radio2.isSelected())
			s+="<br>����ѡ��ť2����ѡ��";
		if(radio3.isSelected())
			s+="<br>����ѡ��ť3����ѡ��";
		if(radio4.isSelected())
			s+="<br>����ѡ��ť4����ѡ��";
		if(toggleBtn.isSelected())
			s+="<br>���л���ť��������";
		label.setText("<html>"+s+"</html>");
	}
}
