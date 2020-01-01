package es.gurugu.discollection.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="album")
public class Album implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String sello;
	private String referencia;
	private String artista;
	private String lanzamiento;
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	@Column(name="updated_at")
	@Temporal(TemporalType.DATE)
	private Date updateAt;
	
	
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getSello() {
		return sello;
	}



	public void setSello(String sello) {
		this.sello = sello;
	}



	public String getReferencia() {
		return referencia;
	}



	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}



	public String getArtista() {
		return artista;
	}



	public void setArtista(String artista) {
		this.artista = artista;
	}



	public Date getCreateAt() {
		return createAt;
	}



	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}



	public String getLanzamiento() {
		return lanzamiento;
	}



	public void setLanzamiento(String lanzamiento) {
		this.lanzamiento = lanzamiento;
	}
	
	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
