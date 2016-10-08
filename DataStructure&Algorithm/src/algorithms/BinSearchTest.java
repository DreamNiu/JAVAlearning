package algorithms;



class BinSearch{
	
	int[] A;	//���ڼ���ƥ�������A
	int low,high,mid;	//ÿ�μ������Ͻ磬�½磬�м�ֵ
	int j=0;	//ƥ��ɹ����Ԫ����� 
	int x;	//��Ҫƥ���Ԫ��
	
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
				System.out.println("��Ҫƥ���Ԫ��������ĵ�"+j+"��Ԫ��"+A[j]);
				break; 
			}else if(x<A[mid]){
				high=mid-1;
			}else if(x>A[mid]){
				low=mid+1;
			}else{
				System.out.println("��������û��ƥ���Ԫ��");
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