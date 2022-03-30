package yeni;

import java.util.Scanner;

public class MetotOverloading {

	public static int cikarma(int a, int b) {
		return (a - b);
	}

	public static double bolme(int a, int b) {
		return ((double) a / b);
	}

	public static int toplama(int a, int b) {
		return (a + b);
	}

	public static int toplama(int a, int b, int c) {
		return (a + b + c);
	}

	public static int carpma(int a, int b) {
		return a * b;
	}

	public static int carpma(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String islemler = "1.Toplama Ýþlemi\n" + 
							"2.Çýkarma Ýþlemi\n" + 
							"3.Çarpma Ýþlemi\n" + 
							"4.Bölme Ýþlemi\n" + 
							"Çýkýþ için q'ya basýn.";
		
		System.out.println("****************************************");
		System.out.println(islemler);
		System.out.println("****************************************");

		while (true) {
			System.out.println("iþlemi seçiniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan çýkýlýyor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Kaç deðer toplayacaksýnýz? (2 veya 3):");
				int kacsayi = scanner.nextInt();
				if (kacsayi == 2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("Girilen sayýlarýn toplamý: " + (toplama(a, b)));
				} else if (kacsayi == 3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					System.out.println("Girilen sayýlarýn toplamý: " + (toplama(a, b, c)));

				} else {
					System.out.println("Bunun için uygun metot bulunmuyor..");
				}
			} else if (islem.equals("2")) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				System.out.println("Girilen sayýlarýn farklarý: " + cikarma(a, b));

			} else if (islem.equals("3")) {
				System.out.println("Kaç deðer çarpacaksýnýz? (2 veya 3): ");
				int kacsayi = scanner.nextInt();
				if (kacsayi == 2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("Girilen sayýlarýn çarpýmý: " + (carpma(a, b)));

				} else if (kacsayi == 3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					System.out.println("Girilen sayýlarýn çarpýmý: " + (carpma(a, b, c)));

				} else {
					System.out.println("Bunun için uygun metot bulunmuyor...");
				}
			} else if (islem.equals("4")) {

				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				System.out.println("Girilen sayýlarýn çarpýmý: " + (carpma(a, b)));

			}

		}

	}

}
