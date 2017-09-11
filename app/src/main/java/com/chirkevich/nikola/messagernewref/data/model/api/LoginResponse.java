package com.chirkevich.nikola.messagernewref.data.model.api;

/**
 * Created by Колян on 09.09.2017.
 */

/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by amitshekhar on 07/07/17.
 */

public class LoginResponse {

    @Expose
    @SerializedName("code")
    private String statusCode;

    @Expose
    @SerializedName("responseObject")
    private LoginResponseObject responseObject;




    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public LoginResponseObject getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(LoginResponseObject responseObject) {
        this.responseObject = responseObject;
    }
}

