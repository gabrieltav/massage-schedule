package com.msoft.agendmass.controllers.execeptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String fielName, String message) {
		this.fieldName = fielName;
		this.message = message;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
