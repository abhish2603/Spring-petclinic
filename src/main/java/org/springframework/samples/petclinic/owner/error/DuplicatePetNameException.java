package org.springframework.samples.petclinic.owner.error;
public class DuplicatePetNameException extends RuntimeException{
	public DuplicatePetNameException(String message) {
		super(message);
	}
}
