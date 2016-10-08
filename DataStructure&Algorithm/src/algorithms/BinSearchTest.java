package algorithms;



class BinSearch{
	
	int[] A;	//用于检索匹配的数组A
	int low,high,mid;	//每次检索的上界，下界，中间值
	int j=0;	//匹配成功后的元素序号 
	int x;	//需要匹配的元素
	
	public BinSearch(int[] A,int x) {
		this.A=A;
		this.x=x;
	}
	
	public void search(){
		low=1;
		high=A.length;
		while(low<=high){
			mid=(low+high)/2;
			if(x==A[mid]){
				j=mid;
				System.out.println("需要匹配的元素是数组的第"+j+"个元素"+A[j]);
				break; 
			}else if(x<A[mid]){
				high=mid-1;
			}else if(x>A[mid]){
				low=mid+1;
			}else{
				System.out.println("该数组中没有匹配的元素");
				break;
			}
		}
		
	}
	
}

public class BinSearchTest{
	public static void main(String[] args) {
		int[] A={-15,-6,0,7,9,23,54,82,101};
		int x=0;
		BinSearch binSearch=new BinSearch(A,x);
		binSearch.search();
	}
}