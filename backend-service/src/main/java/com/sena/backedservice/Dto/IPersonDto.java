package com.sena.backedservice.Dto;

public interface IPersonDto {
	/**
     * Obtiene el documento de la persona.
     *
     * @return el documento de la persona
     */
	String getDocument();
    
    /**
     * Obtiene el mail de la persona.
     *
     * @return la ruta del modulo
     */
	String getMail();
    
    
    /**
     * Obtiene la cantidad de personas.
     *
     * @return la cantidad de personas
     */
    Integer getQuantity();
}
