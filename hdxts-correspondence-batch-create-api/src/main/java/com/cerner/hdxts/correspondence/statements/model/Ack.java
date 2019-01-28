//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.02 at 03:01:16 PM IST 
//


package com.cerner.hdxts.correspondence.statements.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value={"interchangeId", "errors"})
public class Ack 
{
	@JsonProperty
	@JsonInclude(JsonInclude.Include.NON_NULL)
    protected String interchangeId;
	
	@JsonProperty
	@JsonInclude(JsonInclude.Include.NON_NULL)
    protected Errors errors;

    /**
     * Gets the value of the interchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterchangeId() {
        return interchangeId;
    }

    /**
     * Sets the value of the interchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterchangeId(String value) {
        this.interchangeId = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}