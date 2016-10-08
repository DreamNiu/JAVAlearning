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
		String s="<html><font size=3>模拟进度条<br><font size=3>演示程序</html>";
		jLabel=new JLabel(s);	//创建标签实例
		jPanel=new JPanel();
		jPanel.add(jLabel);		//向面板上添加标签组件
		jProgressBar=new JProgressBar();	//创建进度条实例
		jProgressBar.setStringPainted(true);	//将进度条中的表示进度文本设置为可见
		jProgressBar.setMaximum(1000);	//设置进度条填充终点位置的值
		//jProgressBar.setIndeterminate(true);
		jProgressBar.setToolTipText("这是进度条的提示信息");	//设置进度条的工具提示信息
		jPanel.add(jProgressBar);	//向面板上添加进度条
		getContentPane().add(jPanel);	//向窗体上添加面板
		pack();
		setSize(200,150);
		setResizable(false);
	}
	public void run(){	//用多线程模拟进度
		while(true){	//通过循环更新任务完成百分比
			counter++;
			jProgressBar.setValue(counter);
			try{
				Thread.sleep(10);	//线程休眠10ms
			}catch(Exception e){
				e.printStackTrace();
			}
			//进度达到终点位置后重新开始计数
			if(counter==jProgressBar.getMaximum())
				counter=0;
		}
	}
}
