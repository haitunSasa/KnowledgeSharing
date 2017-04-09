package com.rxjavatest.Base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import butterknife.ButterKnife;

/**
 * Created by liyan on 2017/3/2.
 */

public abstract class BaseActivity<T extends BasePresenter, E extends BaseModel> extends Activity {
    public T mPresenter;
    public E mModel;
    public Context mContext;
    //private final Subject<Object, Object> _bus = new SerializedSubject<>(PublishSubject.create());


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        mContext=this;
    }

    /*************子类需要实现的方法*********************/
    //获取布局文件
    public abstract int getLayoutId() ;
    //初始化视图
    public abstract void initView();
    //初始化Presenter,简单页面无需mvp就不用管此方法即可
    public abstract void initPresenter() ;
}
