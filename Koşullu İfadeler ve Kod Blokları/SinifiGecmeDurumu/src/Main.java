import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mat, fizik, turkce, kimya, muzik;

		Scanner inp = new Scanner(System.in);

		System.out.print("Matematik notunuzu giriniz: ");
		mat = inp.nextInt();
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = inp.nextInt();
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = inp.nextInt();
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = inp.nextInt();
		System.out.print("Müzik notunuzu giriniz: ");
		muzik = inp.nextInt();

		int count = 5;

		if (mat < 0 || mat > 100) {
			mat = 0;
			count--;
		}
		if (fizik < 0 || fizik > 100) {
			fizik = 0;
			count--;
		}
		if (turkce < 0 || turkce > 100) {
			turkce = 0;
			count--;
		}
		if (kimya < 0 || kimya > 100) {
			kimya = 0;
			count--;
		}
		if (muzik < 0 || muzik > 100) {
			muzik = 0;
			count--;
		}

		double average = 0;
		if (count > 0) {
			average = (mat + fizik + turkce + kimya + muzik) / count;
		} else {
			System.out.println("Geçerli not girilmedi.");
		}

		if (average < 55) {
			System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere :)");
		} else {
			System.out.println("Tebrikler, sınıfı geçtiniz.");
		}

		System.out.println("Ortalama: " + average);

	}

}
