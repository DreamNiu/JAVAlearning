package Calculater;
import javax.swing.JFrame;

public class View extends JFrame {

	private static final long serialVersionUID = 1107071160334381724L;
	public View(){
		add(new Calculater2());
		setVisible(true);
		setSize(300,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(true);
	}
	public static void main(String[] args){
		View view = new View(); 
	}
}