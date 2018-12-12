package com.mvp.lk.mvptest.view;

public interface LoginView {
    //显示和隐藏ProgressBar
    void showProgress(final boolean show);
    //失败处理
    void setUsernameError();
    void setPasswordError();
    //成功处理
    void showSuccess();
}
