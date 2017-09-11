package com.chirkevich.nikola.messagernewref.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Колян on 09.09.2017.
 */

public class LoginResponseBody {
    @Expose
    @SerializedName("friendRequestId")
    private Long friendRequestId;

    @Expose
    @SerializedName("user_id")
    private Integer user_id;

    @Expose
    @SerializedName("user_login")
    private String user_login;

    @Expose
    @SerializedName("first_name")
    private String first_name;

    @Expose
    @SerializedName("last_name")
    private String last_name;

    @Expose
    @SerializedName("photo_avatar")
    private String photo_avatar;

    @Expose
    @SerializedName("isFriend")
    private Boolean isFriend;

    @Expose
    @SerializedName("isFollower")
    private String isFollower;

    @Expose
    @SerializedName("iFollow")
    private String iFollow;


    public Long getFriendRequestId() {
        return friendRequestId;
    }

    public void setFriendRequestId(Long friendRequestId) {
        this.friendRequestId = friendRequestId;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_login() {
        return user_login;
    }

    public void setUser_login(String user_login) {
        this.user_login = user_login;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhoto_avatar() {
        return photo_avatar;
    }

    public void setPhoto_avatar(String photo_avatar) {
        this.photo_avatar = photo_avatar;
    }

    public Boolean getFriend() {
        return isFriend;
    }

    public void setFriend(Boolean friend) {
        isFriend = friend;
    }

    public String getIsFollower() {
        return isFollower;
    }

    public void setIsFollower(String isFollower) {
        this.isFollower = isFollower;
    }

    public String getiFollow() {
        return iFollow;
    }

    public void setiFollow(String iFollow) {
        this.iFollow = iFollow;
    }
}
