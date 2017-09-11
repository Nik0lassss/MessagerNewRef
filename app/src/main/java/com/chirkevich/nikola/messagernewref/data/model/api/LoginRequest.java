package com.chirkevich.nikola.messagernewref.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Колян on 09.09.2017.
 */

public class LoginRequest {
    private LoginRequest() {
        // This class is not publicly instantiable
    }

    public static class ServerLoginRequest {
        @Expose
        @SerializedName("login")
        private String login;

        @Expose
        @SerializedName("password")
        private String password;

        public ServerLoginRequest(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public String getEmail() {
            return login;
        }

        public void setEmail(String email) {
            this.login = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;

            ServerLoginRequest that = (ServerLoginRequest) object;

            if (login != null ? !login.equals(that.login) : that.login != null) return false;
            return password != null ? password.equals(that.password) : that.password == null;

        }

        @Override
        public int hashCode() {
            int result = login != null ? login.hashCode() : 0;
            result = 31 * result + (password != null ? password.hashCode() : 0);
            return result;
        }
    }

}
