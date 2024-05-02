package com.pruebas;

public class Conversion {

	public String solution(int n) {
		StringBuilder sb = new StringBuilder();
		do {
			if (n >= 1000) {
				n -= 1000;
				sb.append("M");
			} else if (n >= 900) {
				n -= 900;
				sb.append("CM");
			} else if (n >= 500) {
				n -= 500;
				sb.append("D");
			} else if (n >= 400) {
				n -= 400;
				sb.append("CD");
			} else if (n >= 100) {
				n -= 100;
				sb.append("C");
			} else if (n >= 90) {
				n -= 90;
				sb.append("XC");
			} else if (n >= 50) {
				n -= 50;
				sb.append("L");
			} else if (n >= 40) {
				n -= 40;
				sb.append("XL");
			} else if (n >= 10) {
				n -= 10;
				sb.append("X");
			} else if (n >= 9) {
				n -= 9;
				sb.append("IX");
			} else if (n >= 5) {
				n -= 5;
				sb.append("V");
			} else if (n >= 4) {
				n -= 4;
				sb.append("IV");
			} else if (n >= 1) {
				n -= 1;
				sb.append("I");
			}
		} while (n > 0);
		return sb.toString();
	}

}
