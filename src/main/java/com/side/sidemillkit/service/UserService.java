package com.side.sidemillkit.service;

import com.side.sidemillkit.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    public static boolean isValidUser(String email, String userPwd) {
        return false;
    }
}
