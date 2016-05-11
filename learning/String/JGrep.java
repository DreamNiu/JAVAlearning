package learning.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class JGrep {
	public static void main(String[] args) {
		if(args.length<2){
			System.out.println("Usage:java JGrep file regex");
			System.exit(0);
		}
		Pattern p=Pattern.compile(args[1]);
		int index=0;
		Matcher m=p.matcher("");
			
	}

}
