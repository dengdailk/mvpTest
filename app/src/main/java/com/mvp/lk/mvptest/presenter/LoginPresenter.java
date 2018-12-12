package com.mvp.lk.mvptest.presenter;

import com.mvp.lk.mvptest.model.entities.User;

public interface LoginPresenter {
    //登录验证
    void validateCredentials(User user);
    //销毁当前接口
    void onDestroy();
}
