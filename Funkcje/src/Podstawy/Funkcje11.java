package Podstawy;
import java.util.Scanner;

public class Funkcje11 {
	
	public static int n,m,x;
	public static Scanner odczyt;

	public static void main(String[] args) {
		odczyt = new Scanner(System.in);
		System.out.println("Podaj liczn�:");
		n=odczyt.nextInt();
		System.out.println("Podaj pot�g�:");
		m=odczyt.nextInt();
		System.out.println("Potega liczby "+n+"^"+m+" wynosi: "+potega(n,m));
	}

	public static int potega (int a, int b) {
		x=n;
		for (int i=n;i<=m;i++){
			x*=n;
		}
		return x;
	}
}