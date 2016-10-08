package Sort;
//插入排序

// （直接）插入排序，通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，
//找到相应的位置并插入,该位置之后的序列一次向后移动一个单位

/*
 * 插入排序非常类似于整扑克牌。

在开始摸牌时，左手是空的，牌面朝下放在桌上。接着，一次从桌上摸起一张牌，并将它插入到左手一把牌中的正确位置上。为了找到这张牌的正确位置，要将它与手中已有的牌从右到左地进行比较。无论什么时候，左手中的牌都是排好序的。
 * */

// 期望复杂度为O(n^2)


public class InsertSort {
	public static void main(String[] args) {
		int[] A={2,3,7,1,5,6,4};
		System.out.println("排序之前的数组A：");
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");
		
		//直接插入排序
		for(int i=1;i<A.length;i++){
			int temp=A[i];	//待插入的元素
			int j;
			for(j=i-1;j>=0;j--){	
				if(A[j]>temp){
					A[j+1]=A[j];	//将大于temp的元素向后移动一位
				}
				else
					break;
			}
			A[j+1]=temp;
		}
		
		System.out.println("\n\n排序之后的数组Ａ");
		for(int i=0;i<A.length;i++)
			System.out.print(A[i]+" ");
	}

}
