import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int heat;

		Scanner inp = new Scanner(System.in);
		System.out.print("Sıcaklığı giriniz: ");
		heat = inp.nextInt();

		if (heat > 25) {
			System.out.println("Yüzmeye gidebilirsin.");
		} else if (heat >= 5) {
			if (heat >= 10) {
				System.out.println("Pikniğe gidebilirsin.");
			}
			if (heat <= 15) {
				System.out.println("Sinemaya gidebilirsin.");
			}
		} else { // 5'ten küçükse
			System.out.println("Kayak yapmaya gidebilirsin.");
		}

	}

}
