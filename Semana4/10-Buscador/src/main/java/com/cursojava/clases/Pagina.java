package com.cursojava.clases;

public abstract class Pagina {
	private String tematica;
	private String urlTienda;
	private String urlWeb;
	
	public Pagina() {
		super();
	}

	public Pagina(String tematica, String urlTienda, String urlWeb) {
		super();
		this.tematica = tematica;
		this.urlTienda = urlTienda;
		this.urlWeb = urlWeb;
	}

	public String getTematica() {
		return tematica;
	}

	public String getUrlTienda() {
		return urlTienda;
	}

	public String getUrlWeb() {
		return urlWeb;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public void setUrlTienda(String urlTienda) {
		this.urlTienda = urlTienda;
	}

	public void setUrlWeb(String urlWeb) {
		this.urlWeb = urlWeb;
	}
	
	
}
