package com.mvp.lk.mvptest.model;

import com.mvp.lk.mvptest.model.entities.User;
import com.mvp.lk.mvptest.presenter.OnLoginFinishedListener;

public interface LoginModel {
    void login(User user,OnLoginFinishedListener listener);
}
