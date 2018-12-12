package com.mvp.lk.mvptest.presenter.impl;

import com.mvp.lk.mvptest.model.LoginModel;
import com.mvp.lk.mvptest.model.entities.User;
import com.mvp.lk.mvptest.model.impl.LoginModelImpl;
import com.mvp.lk.mvptest.presenter.LoginPresenter;
import com.mvp.lk.mvptest.presenter.OnLoginFinishedListener;
import com.mvp.lk.mvptest.ui.LoginActivity;
import com.mvp.lk.mvptest.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter,OnLoginFinishedListener {
    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModelImpl();
    }

    @Override
    public void validateCredentials(User user) {
        if(loginView != null){
            loginView.showProgress(true);
        }
        loginModel.login(user,this);
    }

    @Override
    public void onDestroy() {

        loginView = null;
    }

    @Override
    public void onUsernameError() {

        if(loginView != null){
            loginView.setUsernameError();
            loginView.showProgress(false);
        }
    }

    @Override
    public void onPasswordError() {

        if(loginView != null){
            loginView.setPasswordError();
            loginView.showProgress(false);
        }
    }

    @Override
    public void onSuccess() {

        if(loginView != null){
            loginView.showSuccess();
        }
    }
}
