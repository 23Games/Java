package Podstawy;
import java.util.Scanner;

public class Funkcje14 {
	
	public static int a,b,c,d,x1,x2,x0;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj a:");
		a=odczyt.nextInt();
		System.out.println("Podaj b:");
		b=odczyt.nextInt();
		System.out.println("Podaj c:");
		c=odczyt.nextInt();
		System.out.println(a+"x^2+"+b+"x+"+c+"=0");
		kwadratowe(a,b,c);
	}

	public static void kwadratowe (int a, int b, int c) {
		d=b*b-4*a*c;
		if (d>0){
			x1=(int) ((-b-Math.sqrt(d))/2*a);
			x2=(int) ((-b+Math.sqrt(d))/2*a);
			System.out.println("x1="+x1+"\n"+"x2="+x2);
		} else if (d==0){
			x0=-b/(2*a);
			System.out.println("x0="+x0);
		} else { System.out.println("Brak rozwi�za� :("); }
	}
}