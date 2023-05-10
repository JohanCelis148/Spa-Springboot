package com.sena.sql.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "users_roles")

public class UsersRoles {

	public enum Status{Activo,Inactivo}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "status", nullable = false, columnDefinition = "ENUM ('Inactivo', 'Activo')")
	private Status status;
	
	@Column (name = "user_creation_id", nullable = false)
	private Integer userCreationId;
	
	@Column (name = "user_modification_id")
	private Integer userModificationId;
	
	@Column (name = "date_creation", nullable = false, columnDefinition = "TIMESTAMP")
	private Date dateCreation;
	
	@Column (name = "date_modification", columnDefinition = "TIMESTAMP")
	private Date dateModification;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private Users userId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    private Roles rol;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Integer getUserCreationId() {
		return userCreationId;
	}

	public void setUserCreationId(Integer userCreationId) {
		this.userCreationId = userCreationId;
	}

	public Integer getUserModificationId() {
		return userModificationId;
	}

	public void setUserModificationId(Integer userModificationId) {
		this.userModificationId = userModificationId;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}
	
}