package com.side.sidemillkit.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_tb")
@NoArgsConstructor
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 15)
    private String userName;

    @Column(nullable = false, length = 100)
    private String userPwd;

    @Column(nullable = false, length = 15)
    private String phone;

    @Builder
    public UserEntity(String email, String userName, String userPwd, String phone) {
        this.email = email;
        this.userName = userName;
        this.userPwd = userPwd;
        this.phone = phone;
    }
}
