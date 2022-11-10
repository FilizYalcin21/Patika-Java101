import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int r, alpha;
		double pi = 3.14;

		Scanner inp = new Scanner(System.in);

		System.out.print("Dairenin yarıçapını giriniz: ");
		r = inp.nextInt();

		System.out.print("Daire diliminin merkez açısını giriniz: ");
		alpha = inp.nextInt();

		double dilimAlan = (pi * (r * r) * alpha) / 360;
		System.out.println("Daire diliminin alanı: " + dilimAlan);

	}

}
