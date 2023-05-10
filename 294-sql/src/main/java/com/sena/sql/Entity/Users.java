package com.sena.sql.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "users")

public class Users {
	
	public enum Status{Activo,Inactivo}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column (name = "user", nullable = false, length = 20)
	private String user;
	
	@Column (name = "password", nullable = false, length = 20)
	private String password;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "status", nullable = false, columnDefinition = "ENUM ('0', '1')")
	private Status status;
	
	@Column (name = "user_creation_id", nullable = false)
	private Integer userCreationId;
	
	@Column (name = "user_modification_id")
	private Integer userModificationId;
	
	@Column (name = "date_creation", nullable = false, columnDefinition = "TIMESTAMP")
	private Integer dateCreation;
	
	@Column (name = "date_modification", columnDefinition = "TIMESTAMP")
	private String dateModification;
	
	@OneToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "person_id", nullable = false, unique = true)
    private Persons personId;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setContrasenia(String password) {
		this.password = password;
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

	public Integer getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Integer dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateModification() {
		return dateModification;
	}

	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
	}

	public Persons getPersonId() {
		return personId;
	}

	public void setPersonId(Persons personId) {
		this.personId = personId;
	}
	
	
	
}