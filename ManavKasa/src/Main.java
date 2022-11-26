import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
		double akg, ekg, dkg, mkg, pkg, toplam;

		Scanner inp = new Scanner(System.in);

		System.out.print("Armut kaç kilo olsun?: ");
		akg = inp.nextDouble();

		System.out.print("Elma kaç kilo olsun?: ");
		ekg = inp.nextDouble();

		System.out.print("Domates kaç kilo olsun?: ");
		dkg = inp.nextDouble();

		System.out.print("Muz kaç kilo olsun?: ");
		mkg = inp.nextDouble();

		System.out.print("Patlıcan kaç kilo olsun?: ");
		pkg = inp.nextDouble();

		toplam = (armut * akg) + (elma * ekg) + (domates * dkg) + (muz * mkg) + (patlican * pkg);

		System.out.println("Toplam Tutar: " + toplam);

	}

}
