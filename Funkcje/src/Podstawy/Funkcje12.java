package Podstawy;
import java.util.Scanner;

public class Funkcje12 {
	
	public static int n,x;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczn�:");
		n=odczyt.nextInt();
		System.out.println("Suma cyfr z liczby "+n+" wynosi: "+suma_cyfr(n));
	}

	public static int suma_cyfr (int a) {
		x=0;
		for (int i=a;i>=0;i--){
			x+=i;
		}
		return x;
	}
}