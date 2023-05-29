package com.side.sidemillkit.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String email;
    private String userName;
    private String userPwd;
    private String phone;

}
