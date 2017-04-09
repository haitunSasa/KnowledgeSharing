package com.rxjavatest.Register;

import com.rxjavatest.Base.BaseModel;
import com.rxjavatest.Base.BasePresenter;
import com.rxjavatest.Base.BaseView;

/**
 * Created by liyan on 2017/3/2.
 */

public interface RegisterContract {
    interface View extends BaseView{

    }
    interface Model extends BaseModel{

    }
    abstract class Presenter extends BasePresenter<View, Model>{

    }
}
