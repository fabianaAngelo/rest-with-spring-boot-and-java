package br.com.spring.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private Date timespan;
	private String message;
	private String details;
	
	public ExceptionResponse(Date timespan, String message, String details) {
		super();
		this.timespan = timespan;
		this.message = message;
		this.details = details;
	}

	public Date getTimespan() {
		return timespan;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
}
