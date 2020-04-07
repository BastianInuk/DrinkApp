package app.inuk.drinkorderer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_MESSAGE = "app.inuk.drinkorderer.MESSAGE";

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.drinksListButton);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        System.out.println("Button pressed");
        if(v == button) {
            System.out.println("Drinkslist is loading into memory");
            Intent drinkList = new Intent(this, DrinksList.class);
/*
        drinkList.setAction(Intent.ACTION_SEND);
        drinkList.setType("text/plain");
        drinkList.putExtra(Intent.EXTRA_TEXT, "Hello world");
*/
            System.out.println("Drinkslist activating");
            startActivity(drinkList);
        }
    }
}
