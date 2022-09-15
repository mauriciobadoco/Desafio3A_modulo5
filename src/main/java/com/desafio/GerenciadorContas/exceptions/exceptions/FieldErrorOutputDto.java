package com.desafio.GerenciadorContas.exceptions.exceptions;

public class FieldErrorOutputDto {

	private final String field;
	private final String message;

	public FieldErrorOutputDto(String field, String message) {
		this.field = field;
		this.message = message;
	}

	public String getField() {
		return field;
	}

	public String getMessage() {
		return message;
	}
}
