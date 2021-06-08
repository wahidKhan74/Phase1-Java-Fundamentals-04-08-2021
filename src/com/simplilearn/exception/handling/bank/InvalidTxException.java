package com.simplilearn.exception.handling.bank;

public class InvalidTxException extends RuntimeException {
	
	String message;
	
	InvalidTxException(String message){
		this.message = message;
	}

	@Override
	public String toString() {
		return "Invalid Transaction Exception [message=" + message + "]";
	}

}
