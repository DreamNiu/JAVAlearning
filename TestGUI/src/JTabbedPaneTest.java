import java.awt.BorderLayout;

import javax.swing.*;

public class JTabbedPaneTest extends JFrame{
	private static final long serialVersionUID=8429102127216854374L;
	private JTabbedPane jTabbedPane1;
	private JPanel jPanel1;
	public static void main(String[] args) {
		JTabbedPaneTest inst=new JTabbedPaneTest();
		inst.setLocationRelativeTo(null);
		inst.setVisible(true);
	}
	public JTabbedPaneTest(){
		boolean flag=true;
		//true表示多行显示选项卡标签，false表示用卷滚方式显示选项卡标签
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		if(flag)
			jTabbedPane1=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.WRAP_TAB_LAYOUT);
		else
			jTabbedPane1=new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
			for(int i=1;i<=10;i++){
			jPanel1=new JPanel();
			jPanel1.add(new JLabel("第"+i+"个选项卡"));
			jTabbedPane1.addTab("标签"+i,null, jPanel1,null);
		}
		jTabbedPane1.setSelectedIndex(2);
		getContentPane().add(jTabbedPane1,BorderLayout.CENTER);
		pack();
		setSize(400,300);
	}
}
