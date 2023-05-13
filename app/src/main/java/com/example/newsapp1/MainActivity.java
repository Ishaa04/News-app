package com.example.newsapp1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements CategoryRVAdapter.CategoryClickInterface {

    private RecyclerView newsRV,categoryRV;
    private ProgressBar loadingPB;
    private ArrayList<Articles>articlesArrayList;
    private ArrayList<CategoryRVModal> categoryRVModalArrayList;
    private CategoryRVAdapter categoryRVAdapter;
    private NewsRVAdapter newsRVAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newsRV = findViewById(R.id.idRVNews);
        categoryRV=findViewById(R.id.idRVCategories);
        loadingPB=findViewById(R.id.idPBLoading);
        articlesArrayList=new ArrayList<>();
        categoryRVModalArrayList=new ArrayList<>();
        newsRVAdapter=new NewsRVAdapter(articlesArrayList,this);
        categoryRVAdapter=new CategoryRVAdapter(categoryRVModalArrayList,this,this::onCategoryClick);
        newsRV.setLayoutManager(new LinearLayoutManager(this));
        newsRV.setAdapter(newsRVAdapter);
        categoryRV.setAdapter(categoryRVAdapter);

    }
    private void getCategories(){
        categoryRVModalArrayList.add(new CategoryRVModal("All","https://cdn.pixabay.com/photo/2014/08/24/19/01/apps-426559_960_720.jpg"));
        categoryRVModalArrayList.add(new CategoryRVModal("Technology","https://media.istockphoto.com/id/1408387701/photo/social-media-marketing-digitally-generated-image-engagement.jpg?s=2048x2048&w=is&k=20&c=Gfl47p22O1FSu9KzcJXNLSkZ91W-ML8NTkOG3UkCw2g="));
        categoryRVModalArrayList.add(new CategoryRVModal("Science","https://cdn.pixabay.com/photo/2018/07/15/10/44/dna-3539309_640.jpg"));
        categoryRVModalArrayList.add(new CategoryRVModal("Sports",""));
        categoryRVModalArrayList.add(new CategoryRVModal("General",""));
        categoryRVModalArrayList.add(new CategoryRVModal("Business",""));
        categoryRVModalArrayList.add(new CategoryRVModal("Entertainment",""));
        categoryRVModalArrayList.add(new CategoryRVModal("Health",""));


    }
    @Override
    public void onCategoryClick(int position) {

    }
}