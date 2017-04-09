package com.rxjavatest.Login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.rxjavatest.R;

public class MainActivity extends AppCompatActivity implements ArticleView {
    private ArticlePresenter mArticlePresenter;
    TextView tv_change ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_change= (TextView)findViewById(R.id.tv_change);
        mArticlePresenter=new ArticlePresenter(this);
        mArticlePresenter.show();
    }

    @Override
    public void showArticle(String mArticles) {
        tv_change.setText(mArticles);
        Log.i("showArticle", "");
    }

    @Override
    public void showLoading() {
        Log.i("showLoading", "");
    }

    @Override
    public void hidingLoading() {
        Log.i("hidingLoading", "");
    }
}
