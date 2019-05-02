package fourBasicCalculations;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {

		int s1, s2;
		String k = "";
		Scanner scn = new Scanner(System.in);

		System.out.print("1.Sayý : ");
		s1 = scn.nextInt();
		System.out.print("2.Sayý : ");
		s2 = scn.nextInt();
		System.out.println("Ýþlem Seçiniz + - * /: ");
		k = scn.next();

		Calculator c = new Calculator();

		try {
			double result = c.calculate(k, s1, s2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
