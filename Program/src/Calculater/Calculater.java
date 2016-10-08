package Calculater;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.reflect.InvocationTargetException;

public class Calculater extends JPanel{
	public Calculater(){
		 GridBagLayout layout = new GridBagLayout();
	     GridBagConstraints c = new GridBagConstraints();
	     setLayout(layout);
	     add(new JButton("7"),layout,c);
	     add(new JButton("8"),layout,c);
	     add(new JButton("9"),layout,c);
	     c.gridwidth = GridBagConstraints.REMAINDER;
	     add(new JButton("/"),layout,c);    
	}
	void add(String name,GridBagLayout layout,GridBagConstraints c,ActionEvent a){
		JButton button = new JButton(name);
		layout.setConstraints(button, c);
        add(button);
	}
	void add(JButton button,GridBagLayout layout,GridBagConstraints c){
		layout.setConstraints(button, c);
        add(button);
	}
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		EventQueue.invokeAndWait(new Runnable(){
			public void run(){
				JFrame frame = new JFrame();
				frame.add(new Calculater());
				frame.setVisible(true);
			}
		});	
	}
}