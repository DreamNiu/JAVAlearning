package learning.innerclass;


public class Parcel2 {
	class Contents{
		private int i=11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		public Destination(String whereto) {
			label=whereto;
		}
		String readLabel(){
			return label;
		}
	}
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents(){
		return new Contents();
	}
	void ship(String dest){
		//Contents c=new Contents();
		Destination d=new Destination(dest);
		System.out.println(d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel2 p=new Parcel2();
		p.ship("qijie");
		//Parcel2 q=new Parcel2();
		//Parcel2.Contents c=q.contents();
		//Parcel2.Destination d=q.to("qijie");
	}

}
