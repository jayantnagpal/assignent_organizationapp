package com.assignment.organizationdemo.exception;





import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

 

@ResponseStatus(value =HttpStatus.NOT_FOUND )
public class ProjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6117542027186324051L;

	public ProjectNotFoundException (String message) {
        super(message);
       
    }

 

}