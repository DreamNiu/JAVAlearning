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
		jToolBar=new JToolBar("������");
		getContentPane().add(jToolBar, BorderLayout.NORTH);
		//jToolBar.setFloatable(false);	//�����������óɲ����϶�
		jToolBar.add(new Button("��"));
		jToolBar.add(new Button("�ر�"));
		jToolBar.addSeparator();	//��Ĭ�ϴ�С�ķָ�����ӵ���������ĩβ��Ĭ�ϴ�С�ɵ�ǰ���ȷ����
		jToolBar.add(new Button("����"));
		jToolBar.add(new Button("����"));
		pack();
		setSize(400,300);
	}
}
