package com.proyecto.abstracta;

public abstract class Figura  {
		private double area;
		
		
		public abstract void calcularArea();
		
		public double getArea() {
			return area;
		}
		
		public void setArea(double area) {
			this.area = area;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder("Figura: " + this.getClass().getSimpleName());
			builder.append("\t Area: ");
			builder.append(area);
			return builder.toString();
		}
		
		
}
