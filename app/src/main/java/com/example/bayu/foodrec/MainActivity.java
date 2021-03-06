package com.example.bayu.foodrec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView r1;
    String s1[],s2[];
    int imageResource[]= {R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat,R.drawable.cat};
    MyOwnAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1= (RecyclerView) findViewById(R.id.MyRecycler);
        s1 = getResources().getStringArray(R.array.menu_name);
        s2 = getResources().getStringArray(R.array.menu_from);

        ad= new MyOwnAdapter(this,s1,s2,imageResource);

        r1.setAdapter(ad);
        r1.setLayoutManager(new LinearLayoutManager(this));
    }
}
