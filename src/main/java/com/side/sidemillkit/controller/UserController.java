package com.side.sidemillkit.controller;

import com.side.sidemillkit.dto.UserDto;
import com.side.sidemillkit.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login-process")
    public String login(UserDto userDto) {
        boolean isValidUser = UserService.isValidUser(userDto.getEmail(), userDto.getUserPwd());
        if (isValidUser)
            return "dashboard";
        return "login";
    }

    @GetMapping("/join")
    public String joinPage() {
        return "join";
    }

}
