package com.chirkevich.nikola.messagernewref.data.local.pref;

/**
 * Created by Колян on 11.09.2017.
 */

public interface IPreferencesHelper {

    void setUserName(String userName);
    String getUserName();
    void setUserLogin(String userLogin);
    String getUserLogin();
    void setFirstName(String firstName);
    String getFirstName();
    void setLastName(String lastName);

    void setUserId(int userId);
    int getUserId();

    void setSecretTocken(String secretTocken);
    String getSecretTocken();
}
