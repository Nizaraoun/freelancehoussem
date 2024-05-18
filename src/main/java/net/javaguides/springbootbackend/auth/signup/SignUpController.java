package net.javaguides.springbootbackend.auth.signup;

import org.springframework.http.RequestEntity.BodyBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.javaguides.springbootbackend.model.Stagiaire;

@RestController
@AllArgsConstructor
public class SignUpController {
    final private SignUpService signUpService;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@RequestBody Stagiaire stagiaire) {
      return  signUpService.SignUp(stagiaire);
    }
    
    
}
