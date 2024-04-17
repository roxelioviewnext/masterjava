package com.proyecto.principal;

import com.proyecto.varargs.Media;

public class MediaTest {
	
	
	
	public static void main(String[] args) {
		Media m1 = new Media();
		float f0 = m1.media();
		System.out.println("Float 0 parametros " + f0);
		
		float f1 = m1.media(10);
		System.out.println("Float 1 parametros " + f1);
		
		float f2 = m1.media(10,20);
		System.out.println("Float 2 parametros " + f2);
		
		float f3 = m1.media(10,20,30);
		System.out.println("Float 0 parametros " + f3);
	
		float f10 = m1.media(10,20,30,40,50,60,70,80,90,100);
		System.out.println("Float 10 parametros " + f10);
	}
	
	
}
