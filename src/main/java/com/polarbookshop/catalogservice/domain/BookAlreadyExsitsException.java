package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExsitsException extends RuntimeException {

	private static final long serialVersionUID = -6960979661671631844L;

	public BookAlreadyExsitsException() {
	}

	public BookAlreadyExsitsException(String message) {
		super(message);
	}

	public BookAlreadyExsitsException(Throwable cause) {
		super(cause);
	}

	public BookAlreadyExsitsException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookAlreadyExsitsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
