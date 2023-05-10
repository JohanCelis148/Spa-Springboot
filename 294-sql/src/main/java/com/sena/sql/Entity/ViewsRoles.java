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
@Table (name = "views_roles")

public class ViewsRoles {

	public enum Status{Activo,Inactivo}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer Id;
	
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
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
    private Roles rolId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "view_id", referencedColumnName = "id", nullable = false)
    private Views viewId;

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

	public Roles getRolId() {
		return rolId;
	}

	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}

	public Views getViewId() {
		return viewId;
	}

	public void setViewId(Views viewId) {
		this.viewId = viewId;
	}
	
}