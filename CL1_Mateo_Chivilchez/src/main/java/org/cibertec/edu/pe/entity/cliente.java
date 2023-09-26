package org.cibertec.edu.pe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class cliente {
	
	@Id
	private int idcliente;
	private String nombre;
	private String apellido;
	private String correo;
	private String fechanacimiento;
	private int dni;
	private int idcategoria;
	
	
	
	public cliente() {
	}



	public cliente(int idcliente, String nombre, String apellido, String correo, String fechanacimiento, int dni, int idcategoria) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.fechanacimiento = fechanacimiento;
		this.dni = dni;
		this.idcategoria = idcategoria;
	}

	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}
	
	
	
}
