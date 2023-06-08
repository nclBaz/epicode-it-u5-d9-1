package riccardogulin.u5d9.auth;

import java.io.IOException;

import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class JWTAuthFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// 0. Questo metodo verrà invocato per ogni request
		// 1. Prima di tutto dovrò estrarre il token dall'Authorization Header
		// 2. Verifico che il token non sia stato nè manipolato nè sia scaduto
		// 3. Se OK -> puoi procedere al prossimo blocco della filterChain
		// 4. Se non OK -> 401 ("Per favore effettua di nuovo il login")

	}

}
