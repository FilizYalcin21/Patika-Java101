import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName, password, newPassword;
		String control; // şifre sıfırlama olup olmayacağını kontrol etmek için kullanılacak karakter

		Scanner input = new Scanner(System.in);

		System.out.print("Kullanıcı Adı: ");
		userName = input.nextLine();
		System.out.print("Şifre: ");
		password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş yaptınız!");
		} else {
			System.out.print("Şifreyi sıfırlamak ister misiniz (E/H)?: ");
			control = input.nextLine();
			if (control.equals("E") || control.equals("e")) {
				System.out.print("Yeni şifreyi giriniz: ");
				newPassword = input.nextLine();
				if (newPassword.equals("java123") || newPassword.equals(password)) {
					System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
				} else {
					password = newPassword;
					System.out.println("Şifre oluşturuldu.");
				}
			} else if (control.equals("H") || control.equals("h")) {
				System.out.println("Giriş yapılamadı.\nŞifre sıfırlanmadı.");
			} else {
				System.out.println("Geçersiz yanıt girdiniz.");
			}
		}

	}

}
