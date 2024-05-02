package com.pruebas;

import java.util.stream.Stream;

public class Solution {
	public static String[] solve(String[] arr) {
		String ret[] = new String[arr.length];
		String guardar = "Begin";
		int j = 0;
		for (int i = ret.length - 1; i >= 0; i--) {
			
			ret[j] = arr[i].replaceFirst(arr[i].split(" ")[0], guardar);
			if (arr[i].split(" ")[0].equals("Right")) {
				guardar = "Left";
			}
			if (arr[i].split(" ")[0].equals("Left")) {
				guardar = "Right";
			}
			j++;
		}

		return ret;
	}
	
	public static int zeros(int n) {
		long fact = 1;
	      for (long i = 1; i <= n; i++) {
			fact =fact * i;
			
		}
	    int zeros = 0;
	    while (fact % 10 == 0) {
	    	zeros++;
	    	fact =fact / 10;
	    }
	      return zeros;
	  }

}
