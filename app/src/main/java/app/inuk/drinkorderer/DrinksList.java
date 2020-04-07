package app.inuk.drinkorderer;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

public class DrinksList
        extends AppCompatActivity{

    DrinkListType listType;

    String[] testSet = {"Test1","Test2"};

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("Drinkslist activated");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks_list);
        // Toolbar toolbar = findViewById(R.id.toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.drinksList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new DrinksView(testSet);
        recyclerView.setAdapter(mAdapter);

        //setSupportActionBar(toolbar);
/*
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        listType = DrinkListType.fromString(message);

        setTitle(listType.rawValue);*/
    }

}
