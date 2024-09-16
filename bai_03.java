package java_week_01;
import java.util.Scanner;
public class bai_03 {
	public static void main(String[] args) {
		int width, length;
		Scanner sc = new Scanner(System.in);
		System.out.println("input width: ");
		width = sc.nextInt();
		System.out.println("input length: ");
		length = sc.nextInt();
		System.out.println("Area of rectangle: " + (width * length));
		System.out.println("perimeter of rectangle: " + ((width + length)*2));
	}
}
