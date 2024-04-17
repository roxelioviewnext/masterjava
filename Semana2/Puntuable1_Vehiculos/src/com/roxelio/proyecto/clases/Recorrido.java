package com.roxelio.proyecto.clases;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Recorrido {
	private LocalDateTime salida;
	private LocalDateTime llegada;
	private Duration duracion;
	private double velocidadMedia;
	private double velocidadMaxima;
	private double metrosRecorridos;
	
	public Recorrido(double metros, double velocidadMaxima) {
		super();
		this.salida = LocalDateTime.now();
		this.metrosRecorridos = metros;
		this.velocidadMaxima = velocidadMaxima;
		this.llegada = calcularLleagada();
		this.duracion = calcularDuracion();
		this.velocidadMedia = cacularVelocidadMedia();
	}
	
	/**
	 * Creamos una hora de llegada aleatoria
	 * El rango puede ser desde la hora de salida de hasta 3h mas tade
	 * @return
	 */
	public LocalDateTime calcularLleagada() {
		llegada = salida.plusMinutes(new Random().nextInt(180 + 1));
		return llegada;
	}
	
	/**
	 * Metodo para calcular duracion total entre la salida y llegada del viaje
	 * 
	 */
	public Duration calcularDuracion() {
		return Duration.between(salida, llegada);
	}
	
	/**
	 * Metodo que calcula la velocidad media del viaje, si la velocidad media del vehiculo es mayor que su velocidad maxima,
	 * la velocidad media es su velocidad maxima
	 * 
	 * @return la velocidad media
	 */
	public double cacularVelocidadMedia() {
		double velocidad;
		velocidad = (metrosRecorridos / duracion.getSeconds() * 3.6)  ;
		velocidad = Math.floor(velocidad);
		if(velocidad > velocidadMaxima) {
			velocidad = velocidadMaxima;
		}
		return velocidad;
	}
	
	
	public LocalDateTime getSalida() {
		return salida;
	}

	public LocalDateTime getLlegada() {
		return llegada;
	}

	public Duration getDuracion() {
		return duracion;
	}
	/**
	 * Devuelve un string con la hora y los minutos de la duracion del recorrido
	 * 
	 */
	public String getDuracionString(){
		long segundos = duracion.getSeconds();
		
		String duracionFormateada = String.format("%dH y %02dm", segundos / 3600, (segundos % 3600) / 60);
		
		return duracionFormateada;
	}
	
	/**
	 * Devuelve un string con el mes, el dia, la hora y los minutos del LocalDateTime insertado
	 * 
	 */
	private String getLocalDateTimeFormatted(LocalDateTime tiempo) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd HH:mm");
		String ret = tiempo.format(dtf);
		
		return ret;
	}

	public double getDistanciaRecorrida() {
		return metrosRecorridos;
	}
	

	@Override
	public String toString() {
		return "Recorrido [ salida= " + getLocalDateTimeFormatted(salida) + ", llegada= " + getLocalDateTimeFormatted(llegada) + ", duracion= " + getDuracionString()+ ", velociadadMedia=" + 
					velocidadMedia + "km/h, metros recorridos=" + metrosRecorridos + "m ]";
	}
	
	
}
