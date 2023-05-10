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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "views")

public class Views {
	
	public enum Status{Activo,Inactivo}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column (name = "route", length = 150)
	private String route;
	
	@Column (name = "label", nullable = false, length = 100)
	private String label;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "status", nullable = false, columnDefinition = "ENUM ('Inactivo', 'Activo')")
	private Status status;
	
	@Column (name = "user_creation_id", nullable = false)
	private Integer userCreationId;
	
	@Column (name = "user_modification_id")
	private Integer userModificationId;
	
	@Column (name = "date_creation", nullable = false, columnDefinition = "TIMESTAMP")
	private Integer dateCreation;
	
	@Column (name = "date_modification", columnDefinition = "TIMESTAMP")
	private String dateModification;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "module_id", referencedColumnName = "id", nullable = false)
    private Modules moduleId;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
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

	public Modules getModuleId() {
		return moduleId;
	}

	public void setModuleId(Modules moduleId) {
		this.moduleId = moduleId;
	}
	
}