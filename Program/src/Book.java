//�ӿڶ���
interface BookComparable{
	String name="BookComparable";
	public void isLarge(BookComparable book);
	public boolean isOld(BookComparable book);
	public boolean isCheaper(BookComparable book);
}
//
public class Book implements BookComparable{
	//Book��ĳ�Ա����
	private String title;
	private String pubYear;
	private float price;
	
	//���췽��
	Book(String title,String pubYear,float price){
		this.title=title;
		this.pubYear=pubYear;
		this.price=price;
	}
	//Book�ķ���
	String showTitle(){
		return title;
	}
	String showPubYear(){
		return pubYear;
	}
	float showPrice(){
		return price;
	}
	
	//ʵ�ֽӿ��еķ���
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
	//main����
	public static void main(String args[]){
		System.out.println("�ӿڵ������ǣ�"+BookComparable.name);
		Book book1=new Book("Book1","2015",15.5f);
		Book book2=new Book("Book2","1980",20.6f);
		System.out.println("��"+book2.showTitle()+"���,"+book1.showTitle()+
				"��"+(book1.isOld(book2)?"����":"����"));
		System.out.println("��"+book2.showTitle()+"���,"+book1.showTitle()+
				" "+(book1.isCheaper(book2)?"����":"����"));
	}
	

}
