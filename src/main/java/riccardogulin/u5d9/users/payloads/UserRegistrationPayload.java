package riccardogulin.u5d9.users.payloads;

import lombok.Getter;

@Getter
public class UserRegistrationPayload {
//	@NotNull(message = "Il nome è obbligatorio")
//	@Size(min = 3, max = 30, message = "Nome min 3 caratteri, massimo 30")
	String name;
//	@NotNull(message = "Il cognome è obbligatorio")
	String surname;
//	@Email(message = "Non hai inserito un indirizzo email valido")
	String email;
}
