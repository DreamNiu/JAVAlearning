//接口定义
interface BookComparable{
	String name="BookComparable";
	public void isLarge(BookComparable book);
	public boolean isOld(BookComparable book);
	public boolean isCheaper(BookComparable book);
}
//
public class Book implements BookComparable{
	//Book类的成员变量
	private String title;
	private String pubYear;
	private float price;
	
	//构造方法
	Book(String title,String pubYear,float price){
		this.title=title;
		this.pubYear=pubYear;
		this.price=price;
	}
	//Book的方法
	String showTitle(){
		return title;
	}
	String showPubYear(){
		return pubYear;
	}
	float showPrice(){
		return price;
	}
	
	//实现接口中的方法
	public void isLarge(BookComparable book){}
	public boolean isOld(BookComparable book){
		Book aBook=(Book)book;
		int thisBookYear=Integer.parseInt(this.showPubYear());
		int aBookYear=Integer.parseInt(aBook.showPubYear());
		if(thisBookYear<=aBookYear)
			return true;
		else
			return false;
	}
	public boolean isCheaper(BookComparable book){
		Book aBook=(Book)book;
		if(this.price<=aBook.price)
			return true;
		else
			return false;
	}
	//main方法
	public static void main(String args[]){
		System.out.println("接口的名称是："+BookComparable.name);
		Book book1=new Book("Book1","2015",15.5f);
		Book book2=new Book("Book2","1980",20.6f);
		System.out.println("与"+book2.showTitle()+"相比,"+book1.showTitle()+
				"是"+(book1.isOld(book2)?"旧书":"新书"));
		System.out.println("与"+book2.showTitle()+"相比,"+book1.showTitle()+
				" "+(book1.isCheaper(book2)?"便宜":"昂贵"));
	}
	

}
