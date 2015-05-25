import java.util.Scanner;


public class Watermelon{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int weight = s.nextInt();
		System.out.println((weight % 2 ==0 && weight > 2) ? "YES" : "NO");
	}
}