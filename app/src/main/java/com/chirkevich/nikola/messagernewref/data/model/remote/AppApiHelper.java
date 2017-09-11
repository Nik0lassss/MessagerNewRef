package com.chirkevich.nikola.messagernewref.data.model.remote;

import com.chirkevich.nikola.messagernewref.data.model.api.LoginRequest;
import com.chirkevich.nikola.messagernewref.data.model.api.LoginResponse;
import com.rx2androidnetworking.Rx2AndroidNetworking;

import io.reactivex.Observable;

/**
 * Created by Колян on 09.09.2017.
 */

public class AppApiHelper implements ApiHelper {
    @Override
    public Observable<LoginResponse> doLoginApiCall(LoginRequest.ServerLoginRequest request) {
        return Rx2AndroidNetworking.post(ApiEndPoint.ENDPOINT_API_LOGIN).addBodyParameter(request).build().getObjectObservable(LoginResponse.class);
    }
}
