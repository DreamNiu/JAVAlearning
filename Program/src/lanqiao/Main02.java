package lanqiao;

class Test{
	int year;
	int month;
	int day;
	int number;
	//���캯�������ڳ�ʼ����
	Test(int year,int month,int day,int bumber){
		this.year=year;
		this.month=month;
		this.day=day;
		this.number=number;
	}
	
	//���ڼ�������ĺ���
	public boolean run(){
		//boolean y=false;
		if((year%4==0)&&(year%400!=0))
			return true;
		else
			return false;
		//return y;
	}
	
	//���ڼ���������ڵĺ���
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
