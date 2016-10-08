import java.awt.BorderLayout;
import javax.swing.*;
public class JSplitPaneTest extends JFrame{
	private static final long serialVersionUID=8429102127216854374L;
	private JSplitPane jSplitPane1,jSplitPane2;
	private JPanel jPanel1,jPanel2;
	private JButton jButton1;
	private JLabel jLabel1;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea1;
	public static void main(String[] args) {
		JSplitPaneTest mytest=new JSplitPaneTest();
		mytest.setLocationRelativeTo(null);
		mytest.setVisible(true);
	}
	public JSplitPaneTest(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//创建面板jPanel1，其中包含有按钮
		jPanel1=new JPanel();
		jButton1=new JButton();
		jPanel1.add(jButton1);
		jButton1.setText("按钮");
		//创建面板jPanel2,其中包含有标签
		jPanel2=new JPanel();
		jLabel1=new JLabel();
		jPanel2.add(jLabel1);
		jLabel1.setText("标签");
		/*创建一个垂直布局的jSplitPane2，
		 * 其显示区中的组件为面板jPanel1和jPanel2
		 * 组件大小改变行为是连续布局*/
		jSplitPane2=new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, jPanel1, jPanel2);
		//创建滚动面板，其中包含有文本区
		jTextArea1=new JTextArea("文本区");
		jScrollPane1=new JScrollPane(jTextArea1);
		/*创建水平布局的分隔面板jSplitPane1，
		 * 其左右显示区包含了jSplitPane2和滚动面板jScrollPane1*/
		jSplitPane1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jSplitPane2,jScrollPane1);
		//将分隔面板jScrollPane1添加到窗体上
		getContentPane().add(jSplitPane1,BorderLayout.CENTER);
		//设置窗体大小
		pack();
		setSize(400,300);
	}
}