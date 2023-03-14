package telran.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.CONFLICT)
public class AccountAlreadyRevokedException extends RuntimeException 
{
	public AccountAlreadyRevokedException()
	{
		super("Account already revoked");
	}
}
