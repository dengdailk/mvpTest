package com.mvp.lk.mvptest.model.impl;

import android.text.TextUtils;

import com.mvp.lk.mvptest.model.LoginModel;
import com.mvp.lk.mvptest.model.entities.User;
import com.mvp.lk.mvptest.presenter.OnLoginFinishedListener;


import android.os.Handler;

public class LoginModelImpl implements LoginModel {

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    @Override
    public void login(User user, final OnLoginFinishedListener listener) {
        final  String username = user.getUsername();
        final String password = user.getPassword();


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                boolean error = false;
                if(TextUtils.isEmpty(username) && !isEmailValid(username)){
                    listener.onUsernameError();
                    error = true;
                }

                if(TextUtils.isEmpty(password) && !isPasswordValid(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if(!error){
                    listener.onSuccess();
                }
            }
        },2000);
    }

}
