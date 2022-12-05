import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int month, day;
		String zodiacSign = "";
		boolean isError = false;

		Scanner input = new Scanner(System.in);

		System.out.print("Doğduğunuz ayı sayı olarak girin: ");
		month = input.nextInt();
		System.out.print("Doğduğunuz günü girin: ");
		day = input.nextInt();

		if (month < 1 || month > 12) {
			isError = true;
		} else {
			if (month == 1) {
				if (day >= 1 && day <= 31) {
					if (day < 21) {
						zodiacSign = "oğlak";
					} else {
						zodiacSign = "kova";
					}
				} else {
					isError = true;
				}
			} else if (month == 2) {
				if (day >= 1 && day <= 29) {
					if (day < 20) {
						zodiacSign = "kova";
					} else {
						zodiacSign = "balık";
					}
				} else {
					isError = true;
				}
			} else if (month == 3) {
				if (day >= 1 && day <= 31) {
					if (day < 21) {
						zodiacSign = "balık";
					} else {
						zodiacSign = "koç";
					}
				} else {
					isError = true;
				}
			} else if (month == 4) {
				if (day >= 1 && day <= 30) {
					if (day < 21) {
						zodiacSign = "koç";
					} else {
						zodiacSign = "boğa";
					}
				} else {
					isError = true;
				}
			} else if (month == 5) {
				if (day >= 1 && day <= 31) {
					if (day < 21) {
						zodiacSign = "boğa";
					} else {
						zodiacSign = "ikizler";
					}
				} else {
					isError = true;
				}
			} else if (month == 6) {
				if (day >= 1 && day <= 30) {
					if (day < 22) {
						zodiacSign = "ikizler";
					} else {
						zodiacSign = "yengeç";
					}
				} else {
					isError = true;
				}
			} else if (month == 7) {
				if (day >= 1 && day <= 31) {
					if (day < 23) {
						zodiacSign = "yengeç";
					} else {
						zodiacSign = "aslan";
					}
				} else {
					isError = true;
				}
			} else if (month == 8) {
				if (day >= 1 && day <= 31) {
					if (day < 24) {
						zodiacSign = "aslan";
					} else {
						zodiacSign = "başak";
					}
				} else {
					isError = true;
				}
			} else if (month == 9) {
				if (day >= 1 && day <= 30) {
					if (day < 24) {
						zodiacSign = "başak";
					} else {
						zodiacSign = "terazi";
					}
				} else {
					isError = true;
				}
			} else if (month == 10) {
				if (day >= 1 && day <= 31) {
					if (day < 24) {
						zodiacSign = "terazi";
					} else {
						zodiacSign = "akrep";
					}
				} else {
					isError = true;
				}
			} else if (month == 11) {
				if (day >= 1 && day <= 30) {
					if (day < 23) {
						zodiacSign = "akrep";
					} else {
						zodiacSign = "yay";
					}
				} else {
					isError = true;
				}
			} else if (month == 12) {
				if (day >= 1 && day <= 31) {
					if (day < 22) {
						zodiacSign = "yay";
					} else {
						zodiacSign = "oğlak";
					}
				} else {
					isError = true;
				}
			} else {
				isError = false;
			}
		}

		if (isError) {
			System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
		} else {
			System.out.println("Burcunuz " + zodiacSign + " burcu.");
		}

	}

}
