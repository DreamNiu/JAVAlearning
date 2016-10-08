package lanqiao;

class Test{
	int year;
	int month;
	int day;
	int number;
	//构造函数，用于初始化类
	Test(int year,int month,int day,int bumber){
		this.year=year;
		this.month=month;
		this.day=day;
		this.number=number;
	}
	
	//用于计算闰年的函数
	public boolean run(){
		//boolean y=false;
		if((year%4==0)&&(year%400!=0))
			return true;
		else
			return false;
		//return y;
	}
	
	//用于计算具体日期的函数
	public String calculate(){
		while(number!=0){
			switch(month){
			
			}
		}
		
		return null;
	}
	
}

public class Main02 {

}
