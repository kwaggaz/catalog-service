package com.polarbookshop.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -7795179750341893537L;

	public BookNotFoundException() {
	}

	public BookNotFoundException(String message) {
		super(message);
	}

	public BookNotFoundException(Throwable cause) {
		super(cause);
	}

	public BookNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
