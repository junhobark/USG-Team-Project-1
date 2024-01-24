package com.example.security_jwt.dto;


import java.time.LocalDateTime;

import com.example.security_jwt.domain.Gender;
import com.example.security_jwt.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class MemberSignUpReqDTO {

    private String email;
    private String nickname;
    private String password;
    private LocalDateTime birth;
    private Gender gender;

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .nickname(nickname)
                .birth(birth)
                .gender(gender)
                .password(password)
                .build();
    }
}
