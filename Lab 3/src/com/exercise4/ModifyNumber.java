package com.exercise4;

import java.util.Scanner;

public class ModifyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = Integer.parseInt(sc.nextLine());
		String strNum = String.valueOf(number);

		char[] ch = new char[strNum.length()];

		int num = 0;
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < strNum.length(); i++) {
			ch[i] = strNum.charAt(i);

		}

		int[] no = new int[ch.length];
		System.out.println("NO::" + no.length);
		for (int i = 0; i < ch.length; i++) {
			no[i] = Integer.parseInt(String.valueOf(ch[i]));
		}

		for (int j = 1; j < no.length; j++) {
			int diff = j == 0 ? 0 : no[j] - no[j - 1];
			sb.append(diff);

		}
		String s = sb.toString();
		s.split("-");

		System.out.println(s);

	}

}
