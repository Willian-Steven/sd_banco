package co.edu.campusucc.sd.modelo;
// Generated 13/04/2020 12:27:04 AM by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais implements java.io.Serializable {

	private String idPais;
	private String nombrePais;
	private Set bancos = new HashSet(0);

	public Pais() {
	}

	public Pais(String idPais) {
		this.idPais = idPais;
	}

	public Pais(String idPais, String nombrePais, Set bancos) {
		this.idPais = idPais;
		this.nombrePais = nombrePais;
		this.bancos = bancos;
	}

	public String getIdPais() {
		return this.idPais;
	}

	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}

	public String getNombrePais() {
		return this.nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}

	public Set getBancos() {
		return this.bancos;
	}

	public void setBancos(Set bancos) {
		this.bancos = bancos;
	}

}