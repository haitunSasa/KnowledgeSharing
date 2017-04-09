package com.rxjavatest.Base.baseapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;

import java.util.Stack;

/**
 * Created by liyan on 2017/3/2.
 */

public class AppManager {
    public static Stack<Activity> activityStack;
    public volatile static AppManager instance;

    /**
     * 单一实例
     */
    // TODO: 2017/3/2  不理解
    public static AppManager getAppManager(){
        if(instance == null){
            synchronized (AppManager.class){
                if (instance == null){
                    instance = new AppManager();
                    activityStack = new Stack<>();
                }
            }
        }
        return instance;
    }

    /**
     * 将Activity添加到堆栈
     */
    public void addActivity(Activity activity){
        if (activityStack==null){
            activityStack = new Stack<>();
        }
        activityStack.add(activity);
    }

    /**
     * 结束所有Activity
     */
    public void finishAllActivity(){
        for(int i=0; i<activityStack.size();i++){
            if(activityStack.get(i) != null){
                activityStack.get(i).finish();
            }
        }
        activityStack.clear();
    }

    /**
     * 退出程序
     */
    public void appExit(Context context, Boolean isBackground){
        try {
            finishAllActivity();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            activityManager.restartPackage(context.getPackageName());
        }catch (Exception e){

        }finally {
            if (!isBackground){
                System.exit(0);

            }
        }
    }

}
