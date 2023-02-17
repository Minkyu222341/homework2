package homework.test.controller;

import homework.test.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @PostMapping
    public void signUp() {
        loginService.signUp();
    }

    @PostMapping
    public void login() {
        loginService.login();
    }

    @GetMapping
    public void getSession() {
        loginService.getSession();
    }
}
