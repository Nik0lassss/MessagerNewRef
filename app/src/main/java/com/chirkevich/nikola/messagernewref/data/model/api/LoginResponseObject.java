package com.chirkevich.nikola.messagernewref.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Колян on 09.09.2017.
 */

public class LoginResponseObject {

    @Expose
    @SerializedName("user")
    private LoginResponseBody user;

    @Expose
    @SerializedName("secretTokenString")
    private String secretTokenString;

    public LoginResponseBody getUser() {
        return user;
    }

    public void setUser(LoginResponseBody user) {
        this.user = user;
    }

    public String getSecretTokenString() {
        return secretTokenString;
    }

    public void setSecretTokenString(String secretTokenString) {
        this.secretTokenString = secretTokenString;
    }
}
