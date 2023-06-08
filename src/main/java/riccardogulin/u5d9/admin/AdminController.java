package riccardogulin.u5d9.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("")
	public String test() {
		return "test";
	}
}
