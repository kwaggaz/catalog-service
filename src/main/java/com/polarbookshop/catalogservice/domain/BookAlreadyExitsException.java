package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExitsException extends RuntimeException {

	private static final long serialVersionUID = 7843571616673990332L;

	public BookAlreadyExitsException() {
	}

	public BookAlreadyExitsException(String message) {
		super(message);
	}

	public BookAlreadyExitsException(Throwable cause) {
		super(cause);
	}

	public BookAlreadyExitsException(String message, Throwable cause) {
		super(message, cause);
	}

	public BookAlreadyExitsException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
