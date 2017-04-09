package com.rxjavatest.Base;

import android.content.Context;

/**
 * Created by liyan on 2017/3/2.
 */

public abstract class BaseFragment<T extends BasePresenter,E extends BaseModel> {
    public T mPresenter;
    public E mModel;
    public Context mContext;

}
