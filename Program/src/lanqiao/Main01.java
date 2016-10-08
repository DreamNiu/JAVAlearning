package lanqiao;
/*熊怪吃核桃*/
class Test01{
	//int number;
	int div(int number){
		int count=0;
		while(number>=1){
			if(number%2!=0){
				number=number-1;
				count++;
			}
			number=number/2;
		}
		return count;
	}
}
public class Main01 {
	public static void main(String[] args) {
		System.out.println(new Test01().div(1543));
	}

}

