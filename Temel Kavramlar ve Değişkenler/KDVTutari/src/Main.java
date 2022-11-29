import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double para, kdvTutari, kdvliFiyat;

		System.out.print("Para miktarını giriniz: ");
		Scanner input = new Scanner(System.in);
		para = input.nextDouble();

		// Girilen sayının pozitif olduğu varsayılmıştır
		double kdvOrani = (para < 1000) ? 0.18 : 0.08;

		kdvTutari = para * kdvOrani;
		kdvliFiyat = para + kdvTutari;

		System.out.println("KDV'siz fiyat: " + para);
		System.out.println("KDV oranı: " + kdvOrani);
		System.out.println("KDV tutarı: " + kdvTutari);
		System.out.println("KDV'li fiyat: " + kdvliFiyat);

	}

}
