import javax.swing.*;

class JProgressBarTest extends JFrame implements Runnable{
	private static final long serialVersionUID=8429102127216854374L;
	private JLabel jLabel;
	private JProgressBar jProgressBar;
	private JPanel jPanel;
	private int counter=0;
	
	public static void main(String[] args) {
		JProgressBarTest myFrame=new JProgressBarTest();
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
		new Thread(myFrame).start();
	}
	public JProgressBarTest(){
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		String s="<html><font size=3>ģ�������<br><font size=3>��ʾ����</html>";
		jLabel=new JLabel(s);	//������ǩʵ��
		jPanel=new JPanel();
		jPanel.add(jLabel);		//���������ӱ�ǩ���
		jProgressBar=new JProgressBar();	//����������ʵ��
		jProgressBar.setStringPainted(true);	//���������еı�ʾ�����ı�����Ϊ�ɼ�
		jProgressBar.setMaximum(1000);	//���ý���������յ�λ�õ�ֵ
		//jProgressBar.setIndeterminate(true);
		jProgressBar.setToolTipText("���ǽ���������ʾ��Ϣ");	//���ý������Ĺ�����ʾ��Ϣ
		jPanel.add(jProgressBar);	//���������ӽ�����
		getContentPane().add(jPanel);	//������������
		pack();
		setSize(200,150);
		setResizable(false);
	}
	public void run(){	//�ö��߳�ģ�����
		while(true){	//ͨ��ѭ������������ɰٷֱ�
			counter++;
			jProgressBar.setValue(counter);
			try{
				Thread.sleep(10);	//�߳�����10ms
			}catch(Exception e){
				e.printStackTrace();
			}
			//���ȴﵽ�յ�λ�ú����¿�ʼ����
			if(counter==jProgressBar.getMaximum())
				counter=0;
		}
	}
}
