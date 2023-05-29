package com.side.sidemillkit.dto;

import com.side.sidemillkit.entity.UserEntity;
import lombok.Builder;
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

    @Builder
    public UserDto(String email, String userName, String userPwd, String phone) {
        this.email = email;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phone = phone;
    }

    public UserEntity toEntity() {
        return UserEntity.builder()
                .email(email)
                .userName(userName)
                .userPwd(userPwd)
                .phone(phone)
                .build();
    }



}
