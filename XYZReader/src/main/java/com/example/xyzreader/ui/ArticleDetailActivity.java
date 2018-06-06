package com.example.xyzreader.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.xyzreader.R;
import com.example.xyzreader.data.ItemsContract;

/**
 * An activity representing a single Article detail screen, letting you swipe between articles.
 */
public class ArticleDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_detail);

        if (savedInstanceState == null) {
            if (getIntent() != null && getIntent().getData() != null) {
                long itemId = ItemsContract.Items.getItemId(getIntent().getData());
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.detail_container,
                                ArticleDetailFragment.newInstance(itemId))
                        .commit();
            }
        }
    }
}
