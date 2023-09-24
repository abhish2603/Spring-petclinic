package org.springframework.samples.petclinic.owner.error;
public class InvalidBirthDateException extends RuntimeException{
	public InvalidBirthDateException(String message) {
		super(message);
	}
}
