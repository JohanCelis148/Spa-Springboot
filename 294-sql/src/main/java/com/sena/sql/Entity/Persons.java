package com.sena.sql.Entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "persons")

public class Persons {
	
	public enum DocumentType {CE,CC,TI,PP,DNI}
	public enum Status{Activo,Inactivo}
	public enum Gender{Hombre,Mujer}
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column (name = "first_name", nullable = false, length = 20)
	private String firstName;
	
	@Column (name = "second_name", length = 20)
	private String secondName;
	
	@Column (name = "first_last_name", nullable = false, length = 20)
	private String firstLastName;
	
	@Column (name = "second_last_name", nullable = false, length = 20)	
	private String secondLastName;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "document_type", nullable = false, length = 5)
	private DocumentType documentType;
	
	@Column (name = "document", nullable = false, unique = true, length = 12)
	private String document;
	
	@Column (name = "age", nullable = false, columnDefinition = "TINYINT")
	private Integer age;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "gender", nullable = false, columnDefinition = "ENUM('Hombre', 'Mujer')")
	private Gender gender;
	
	@Column (name = "mail", nullable = false, length = 45)
	private String mail;
	
	@Column (name = "phone_number", nullable = false, length = 10)
	private Integer phoneNumber;
	
	@Column (name = "address", nullable = false, length = 30)
	private String address;
	
	@Enumerated(EnumType.STRING)
	@Column (name = "status", nullable = false, columnDefinition = "ENUM ('0', '1')")
	private Status status;
	
	@Column (name = "user_creation_id", nullable = false)
	private Integer userCreationId;
	
	@Column (name = "user_modification_id")
	private Integer userModificationId;
	
	@Column (name = "date_creation", nullable = false, columnDefinition = "TIMESTAMP")
	private Date dateCreation;
	
	@Column (name = "date_modification", columnDefinition = "TIMESTAMP")
	private Date dateModification;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondLastName() {
		return secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
	
	
	
}