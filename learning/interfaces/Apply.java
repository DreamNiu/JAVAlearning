package learning.interfaces;

import java.util.Arrays;

class Process{
	public String name(){
		return getClass().getName();
	}
	Object process(Object input){return input;}
}

class Upcase extends Process{
	String process(Object input){
		return ((String)input).toUpperCase();
		
	}
}

class Downcase extends Process{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class splitter extends Process{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply {
	public static void process(Process p,Object s){
		System.out.println("using process "+p.name());
		System.out.println(p.process(s));
	}
	public static String s="Disagreement With Denefits is by definition incorrect";
	public static void main(String[] args) {
		process(new Upcase(),s);
		process(new Downcase(),s);
		process(new splitter(),s);
	}
}





