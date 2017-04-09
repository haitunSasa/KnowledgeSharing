package com.rxjavatest.Base;

/**
 * Created by liyan on 2017/3/2.
 */

public abstract class BasePresenter<T,E> {
    public T mView;
    public E mModel;
    public void setVM(T v, E m){
        this.mView=v;
        this.mModel=m;
        this.onStart();
    }
    public void onStart(){

    }
    public void onDestroy(){

    }
}
