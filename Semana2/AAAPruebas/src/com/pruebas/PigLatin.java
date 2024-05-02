package com.pruebas;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatin {

	public static String pigIt(String str) {
		
		String cadena = Stream.of(str.split(" "))
				.map(s -> 
					(s.contains("?") || s.endsWith("!")) ? (s) : (s.substring(1) + s.charAt(0) + "ay ")  )
				.collect(Collectors.joining());

		return cadena.strip();	
	}

}
