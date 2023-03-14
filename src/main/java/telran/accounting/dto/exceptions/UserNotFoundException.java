package telran.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.CONFLICT)
public class UserNotFoundException extends RuntimeException 
{
	public UserNotFoundException()
	{
		super("User not exists");
	}
}
