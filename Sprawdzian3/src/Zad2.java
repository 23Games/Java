import java.util.Scanner;

public class Zad2 {

	public static Scanner cin;
	public static int a,b;

	public static void main(String[] args) {
		cin = new Scanner(System.in);
		System.out.println("Podaj początek przedziału:");
		a = cin.nextInt();
		System.out.println("Podaj koniec przedziału:");
		b = cin.nextInt();
		System.out.println(iloczyn(a,b));
	}
	
	public static int iloczyn (int x, int y){
		int z=1;
		for (int i=x;i<=y;i++){
			if ((i%2==0) && (i%3==0)){
				z*=i;
			}
		}
		return z;
	}
}
