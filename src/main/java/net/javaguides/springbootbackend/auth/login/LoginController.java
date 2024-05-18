package net.javaguides.springbootbackend.auth.login;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.springbootbackend.model.Stagiaire;

@RestController
@AllArgsConstructor
public class LoginController {
    final private LoginService signUpService;

    @PostMapping("/Login")
    public ResponseEntity<?> login(@RequestBody Stagiaire stagiaire) {
     return   signUpService.login(stagiaire);
    }
    
    
}
