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
		String islemler = "1.Toplama ��lemi\n" + 
							"2.��karma ��lemi\n" + 
							"3.�arpma ��lemi\n" + 
							"4.B�lme ��lemi\n" + 
							"��k�� i�in q'ya bas�n.";
		
		System.out.println("****************************************");
		System.out.println(islemler);
		System.out.println("****************************************");

		while (true) {
			System.out.println("i�lemi se�iniz: ");
			String islem = scanner.nextLine();

			if (islem.equals("q")) {
				System.out.println("Programdan ��k�l�yor...");
				break;
			} else if (islem.equals("1")) {
				System.out.println("Ka� de�er toplayacaks�n�z? (2 veya 3):");
				int kacsayi = scanner.nextInt();
				if (kacsayi == 2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("Girilen say�lar�n toplam�: " + (toplama(a, b)));
				} else if (kacsayi == 3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					System.out.println("Girilen say�lar�n toplam�: " + (toplama(a, b, c)));

				} else {
					System.out.println("Bunun i�in uygun metot bulunmuyor..");
				}
			} else if (islem.equals("2")) {
				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				System.out.println("Girilen say�lar�n farklar�: " + cikarma(a, b));

			} else if (islem.equals("3")) {
				System.out.println("Ka� de�er �arpacaks�n�z? (2 veya 3): ");
				int kacsayi = scanner.nextInt();
				if (kacsayi == 2) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("Girilen say�lar�n �arp�m�: " + (carpma(a, b)));

				} else if (kacsayi == 3) {
					System.out.println("a:");
					int a = scanner.nextInt();
					System.out.println("b:");
					int b = scanner.nextInt();
					System.out.println("c:");
					int c = scanner.nextInt();
					System.out.println("Girilen say�lar�n �arp�m�: " + (carpma(a, b, c)));

				} else {
					System.out.println("Bunun i�in uygun metot bulunmuyor...");
				}
			} else if (islem.equals("4")) {

				System.out.println("a:");
				int a = scanner.nextInt();
				System.out.println("b:");
				int b = scanner.nextInt();
				System.out.println("Girilen say�lar�n �arp�m�: " + (carpma(a, b)));

			}

		}

	}

}
