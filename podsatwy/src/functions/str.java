package functions;

import java.util.Scanner;

public class str {
	
	public static Scanner cin=new Scanner(System.in);

	public static int load(String text){	//wypisanie textu i wczytanie inta 
		System.out.print(text);
		return cin.nextInt();
	}
		
	public static String load_S(String text){	//wypisanie textu i wczytanie inta 
		System.out.print(text);
		return cin.nextLine();
	}
	
	public static void out_S(String str){
	System.out.println(str);
	}
	
	public static String string_r(String source){
		String str="";
		for (String part : source.split(" ")) {
		    System.out.print(new StringBuilder(part).reverse().toString());
		    System.out.print(" ");
		}
		return str;
	}
	public static void plec (String str){
		if(str.endsWith("a")){
			System.out.print(str+" jestes kobiet�!!!");
		}	
	}
}
