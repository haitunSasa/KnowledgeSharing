package com.rxjavatest.Login;

import android.util.Log;

import com.rxjavatest.Login.ArticleModel;

/**
 * Created by liyan on 2017/3/2.
 */

public class ArticleModelImpl implements ArticleModel {
   private String articles;
    @Override
    public void saveArticle(String articles) {
        this.articles=articles;
        Log.i("saveArticle", this.articles);
    }
}
