package com.chirkevich.nikola.messagernewref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chirkevich.nikola.messagernewref.data.model.api.LoginRequest;
import com.chirkevich.nikola.messagernewref.data.model.api.LoginResponse;
import com.chirkevich.nikola.messagernewref.data.model.remote.AppApiHelper;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    private Button loginBtn;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = (Button) findViewById(R.id.btnLogin);
        resultTextView = (TextView) findViewById(R.id.textViewTest);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppApiHelper appApiHelper = new AppApiHelper();
                appApiHelper.doLoginApiCall(new LoginRequest.ServerLoginRequest("nik", "nik")).subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<LoginResponse>() {
                    @Override
                    public void accept(@NonNull LoginResponse loginResponse) throws Exception {

                        resultTextView.setText(loginResponse.getResponseObject().getSecretTokenString());
                    }
                });
            }
        });


    }
}
