package com.sopromadze.blogapi.payload;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank
    private String phoneOrEmail;

    @NotBlank
    private String password;

    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void findByPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
