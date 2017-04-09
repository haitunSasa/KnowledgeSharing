package com.rxjavatest.Login;

/**
 * Created by liyan on 2017/3/2.
 */

public class ArticlePresenter {
    private ArticleView mArticleView;
    private ArticleModel mArticleModel = new ArticleModelImpl();
    private String article="1234567" ;

    public ArticlePresenter(ArticleView articleView){
        mArticleView=articleView;
    }
    public void show(){
        mArticleModel.saveArticle(article );
        mArticleView.showArticle(article);
    }

}
