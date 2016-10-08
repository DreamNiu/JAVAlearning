
import javax.swing.*;

import java.awt.event.*;
import java.awt.*;
public class Calculator {
	JFrame jf;
	JTextField jt;
	JPanel jp;
	JButton[] buttons;
	boolean isMistake=false;
	ActionListener bl=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String btext=((JButton)e.getSource()).getText();
				String text=new String(jt.getText());
				     if(btext.matches("(\\+|-|\\*|/|\\=)")){
				    	 String ltext=new String(text.substring(text.length()-1));
				    	 if(ltext.matches("(\\+|-|\\*|/)")){
							mistake(1);
							isMistake=false;
							return;
							}
						}
				if(!btext.equals("=")){
					if(!isMistake){
						text=text+btext;
						jt.setText(text);
						}
					//isMistake=false;
				}
				else {
					float result=compute2(text);
					jt.setText(String.format("%f", result) );
					if(isMistake){
						jt.setText("0.00");
						isMistake=false;
					}
				}
			}
		};
	boolean point(String s){
        int x=0;  
        //遍历数组的每个元素    
        for(int i=0;i<=s.length()-1;i++) {  
            String getstr=s.substring(i,i+1);  
            if(getstr.equals(".")){  
                x++;  
            }  
        }
        if(x<2)
        	return true;
        return false;
	}
	float compute2(String text){
		try{
		float a1=0;
		if(text.indexOf("+")!=-1){
			String[] s=text.split("\\+");
			for(String s1:s){
				if(text.indexOf("+")==0){
					return compute2("0"+text);
					}
				a1+=compute2(s1);
				}
			return a1;
			}
		else if(text.indexOf("-")!=-1){
			if(text.indexOf("-")==0){
				return compute2("0"+text);
				}
			String[] s=text.split("-");
			int i=1;
			for(String s1:s){
				a1=a1-compute2(s1);
				if(i==1){
					a1=-a1;
					i++;
					}
				}
			return a1;
			}
		else if(text.indexOf("*")!=-1){
			String[] s=text.split("\\*");
			a1=1;
			for(String s1:s){
			 a1=a1*Float.valueOf(s1);
			}
			return a1;
		}
		else if(text.indexOf("/")!=-1){
			String[] s=text.split("/");
			float a=1;
			int first=1;
			if(Float.valueOf(s[0])==0){
				return 0;
			}
			for(String s1:s){
				if(Float.valueOf(s1)==0){
					mistake(0);
				    return 0;
				}
				else{
					if(first==1){
						a=Float.valueOf(s1);
						first++;
					}
					else
						a=a/Float.valueOf(s1);
				}
				}
			return a;
		}
		else if(!point(text)){
			mistake(2);
			return 0;
		}
		else if(text.length()==1||text.indexOf("0")==0)
			return Float.valueOf(text);
		return Float.valueOf(text);
		}catch(Exception e){
			//mistake(0);
			return 0;
		}
		}
	void mistake(int mistake){
		isMistake=true;
		ImageIcon image=new ImageIcon(getClass().getResource("error"+mistake+".png"));
		JLabel background=new JLabel(image);
		JFrame warning=new JFrame();
		warning.setLocation(500, 200);
		warning.setAlwaysOnTop(true);
		warning.setResizable(false);
		warning.setSize(300,200);
		background.setSize(warning.getWidth(),warning.getHeight());
		warning.setLayout(new FlowLayout());
		warning.add(background);
		warning.setTitle("输入错误");
		warning.setVisible(true);
	}
	void compute(){
		//point=true;
		String[] bt={"7","8","9","/","4","5","6","*","1","2","3","+","0",".","=","-"};
		 buttons=new JButton[16];
		 for(int i=0;i<16;++i){
			 buttons[i]=new JButton(bt[i]);
			 buttons[i].addActionListener(bl);
			 }
		 jf=new JFrame("计算器");
		 jf.setLocation(500, 100);
		 jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 jf.setSize(300, 400);
		 jf.setLayout(new BorderLayout());
		 jf.setResizable(false);
		 jt=new JTextField(1); 
		 jt.setText("0");
		 jt.setEditable(false);
		 jf.add(BorderLayout.NORTH,jt);
		 jp=new JPanel();
		 jp.setLayout(new GridLayout(4,4));
		 for(int i=0;i<16;++i)
			 jp.add(buttons[i]);
		 jf.add(BorderLayout.CENTER,jp);
		 jf.setVisible(true);
	}
	public static void main(String[] args){
	 Calculator t5=new Calculator();
	 t5.compute();
	 }
}
