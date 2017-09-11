package com.chirkevich.nikola.messagernewref.data.model.remote;

import com.chirkevich.nikola.messagernewref.data.model.api.LoginRequest;
import com.chirkevich.nikola.messagernewref.data.model.api.LoginResponse;

import io.reactivex.Observable;

/**
 * Created by Колян on 09.09.2017.
 */

public interface ApiHelper {

    Observable<LoginResponse> doLoginApiCall(LoginRequest.ServerLoginRequest request);
}
