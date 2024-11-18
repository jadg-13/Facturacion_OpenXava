package org.jadg13.facturacion.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Producto {
	
	@Id @Column(length=9)
	int numero;
	
	@Column(length = 50) @Required
	String descripcion;
	
	@ManyToOne
	(fetch=FetchType.LAZY, optional = true)
	@DescriptionsList //Visualizar en combo
	Categoria categoria;
	
	@Money
	BigDecimal precio;
	
	@File
	@Column(length=32)
	String foto;
	
	@TextArea
	String observaciones;

}
