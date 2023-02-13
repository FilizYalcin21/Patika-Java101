import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int yil;
		boolean artikYilMi = false;

		Scanner input = new Scanner(System.in);

		System.out.print("Yıl girin: ");
		yil = input.nextInt();

		if (yil % 100 == 0) {
			if (yil % 400 == 0) {
				artikYilMi = true;
			}
		} else if (yil % 4 == 0) {
			artikYilMi = true;
		}

		System.out.println("Artık yıl mı?: " + artikYilMi);

	}

}
