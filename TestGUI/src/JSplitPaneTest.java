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
		//�������jPanel1�����а����а�ť
		jPanel1=new JPanel();
		jButton1=new JButton();
		jPanel1.add(jButton1);
		jButton1.setText("��ť");
		//�������jPanel2,���а����б�ǩ
		jPanel2=new JPanel();
		jLabel1=new JLabel();
		jPanel2.add(jLabel1);
		jLabel1.setText("��ǩ");
		/*����һ����ֱ���ֵ�jSplitPane2��
		 * ����ʾ���е����Ϊ���jPanel1��jPanel2
		 * �����С�ı���Ϊ����������*/
		jSplitPane2=new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, jPanel1, jPanel2);
		//����������壬���а������ı���
		jTextArea1=new JTextArea("�ı���");
		jScrollPane1=new JScrollPane(jTextArea1);
		/*����ˮƽ���ֵķָ����jSplitPane1��
		 * ��������ʾ��������jSplitPane2�͹������jScrollPane1*/
		jSplitPane1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jSplitPane2,jScrollPane1);
		//���ָ����jScrollPane1��ӵ�������
		getContentPane().add(jSplitPane1,BorderLayout.CENTER);
		//���ô����С
		pack();
		setSize(400,300);
	}
}