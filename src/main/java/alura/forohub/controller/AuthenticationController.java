package alura.forohub.controller;

import alura.forohub.domain.user.User;
import alura.forohub.domain.user.UserData;
import alura.forohub.infra.security.JWTTokenDetails;
import alura.forohub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity authenticationUser(@RequestBody @Valid UserData data) {

        Authentication authToken = new UsernamePasswordAuthenticationToken(data.username(), data.password());
        var userAuth = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generateToken((User) userAuth.getPrincipal());

        return ResponseEntity.ok(new JWTTokenDetails(JWTtoken));
    }
}
