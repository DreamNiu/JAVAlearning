import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//按钮类综合实例
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
		//创建并添加标签
		label=new JLabel("操作说明",SwingConstants.CENTER);	//标签标题居中
		label.setPreferredSize(new Dimension(230,100));
		getContentPane().add(label);
		//创建并添加两个复选框
		checkBox1=new JCheckBox("复选框1");
		checkBox2=new JCheckBox("复选框2");
		checkBox1.setPreferredSize(new Dimension(110,19));
		checkBox2.setPreferredSize(new Dimension(110,19));
		getContentPane().add(checkBox1);
		getContentPane().add(checkBox2);
		//创建并添加4个单选按钮
		radio1=new JRadioButton("单选按钮1");
		radio2=new JRadioButton("单选按钮2");
		radio3=new JRadioButton("单选按钮3");
		radio4=new JRadioButton("单选按钮4");
		radio1.setPreferredSize(new Dimension(110,19));
		radio2.setPreferredSize(new Dimension(110,19));
		radio3.setPreferredSize(new Dimension(110,19));
		radio4.setPreferredSize(new Dimension(110,19));
		getContentPane().add(radio1);
		getContentPane().add(radio2);
		getContentPane().add(radio3);
		getContentPane().add(radio4);
		//将单选按钮分组
		buttonGroup1=new ButtonGroup();
		buttonGroup1.add(radio1);
		buttonGroup1.add(radio2);
		buttonGroup2=new ButtonGroup();
		buttonGroup2.add(radio3);
		buttonGroup2.add(radio4);
		//创建并添加切换按钮
		toggleBtn=new JToggleButton("切换按钮");
		getContentPane().add(toggleBtn);
		toggleBtn.setPreferredSize(new Dimension(190,22));
		toggleBtn.setSelected(true);	//将切换按钮的状态设置为“按下”状态
		//创建并添加普通按钮
		button=new JButton("普通按钮");
		button.setMnemonic(KeyEvent.VK_A);	//设置按钮的记忆键
		getContentPane().add(button);
		//为按钮添加监听器
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
	//普通按钮被激活时执行的代码
	private void btnActionPerformed(ActionEvent e){
		String s="";
		if(checkBox1.isSelected())
			s+="“复选框1”被选中";
		if(checkBox2.isSelected())
			s+="<br>“复选框2”被选中";
		if(radio1.isSelected())
			s+="<br>“单选按钮1‘被选中";
		if(radio2.isSelected())
			s+="<br>“单选按钮2‘被选中";
		if(radio3.isSelected())
			s+="<br>“单选按钮3‘被选中";
		if(radio4.isSelected())
			s+="<br>“单选按钮4‘被选中";
		if(toggleBtn.isSelected())
			s+="<br>”切换按钮“被按下";
		label.setText("<html>"+s+"</html>");
	}
}
