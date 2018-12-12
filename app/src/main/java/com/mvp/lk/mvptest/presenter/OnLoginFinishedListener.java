package com.mvp.lk.mvptest.presenter;

public interface OnLoginFinishedListener {
    void onUsernameError();
    void onPasswordError();
    void onSuccess();
}
