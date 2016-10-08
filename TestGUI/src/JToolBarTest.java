import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.*;

public class JToolBarTest extends JFrame{
	private static final long serialVersionUID=8429102127216854374L;
	private JToolBar jToolBar;
	public static void main(String[] args) {
		JToolBarTest myFrame=new JToolBarTest();
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
	}
	public JToolBarTest(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jToolBar=new JToolBar("工具栏");
		getContentPane().add(jToolBar, BorderLayout.NORTH);
		//jToolBar.setFloatable(false);	//将工具栏设置成不可拖动
		jToolBar.add(new Button("打开"));
		jToolBar.add(new Button("关闭"));
		jToolBar.addSeparator();	//将默认大小的分隔符添加到工具栏的末尾。默认大小由当前外观确定。
		jToolBar.add(new Button("帮助"));
		jToolBar.add(new Button("关于"));
		pack();
		setSize(400,300);
	}
}
