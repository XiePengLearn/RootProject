package com.sxjs.jd.composition.login.login;

import com.sxjs.jd.MainDataManager;

import dagger.Module;
import dagger.Provides;

/**
 * @Auther: xp
 * @Date: 2019/9/13 22:17
 * @Description:
 */
@Module
public class LoginPresenterModule {
    private com.sxjs.jd.composition.login.login.LoginContract.View view;

    private MainDataManager mainDataManager;

    public LoginPresenterModule(com.sxjs.jd.composition.login.login.LoginContract.View view, MainDataManager mainDataManager) {
        this.view = view;
        this.mainDataManager = mainDataManager;
    }

    @Provides
    com.sxjs.jd.composition.login.login.LoginContract.View providerMainContractView() {
        return view;
    }

    @Provides
    MainDataManager providerMainDataManager() {
        return mainDataManager;
    }

}
